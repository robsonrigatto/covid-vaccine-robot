package br.com.rr.covid.vaccine.adapters.navigator;

import br.com.rr.covid.vaccine.entities.Mensagem;
import br.com.rr.covid.vaccine.usecases.MessageService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SaoCaetanoNavigator {

    @Autowired
    private MessageService messageService;

    public Boolean getFaixasEtarias() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://portais.saocaetanodosul.sp.gov.br/sesaud-agendamentos");
        List<WebElement> boxes = driver.findElements(By.cssSelector(".card-body.text-center > div"));

        boxes.forEach(b -> {
            WebElement barraStatus = b.findElement(By.cssSelector("i.fas:nth-child(1)"));
            String classes = barraStatus.getAttribute("class");
            boolean disponivel = classes.contains("fa-check");
            String textoIdade = b.findElement(By.tagName("h6")).getText().replace("#Vacina São Caetano", "").trim();

            System.out.printf("Faixa etaria: %s, Disponivel: %s%n", textoIdade, disponivel ? "Sim" : "Nao");

            if(textoIdade.contains("30 anos") && disponivel) {
                messageService.send("Chegou a hora da vacina da Veronica!!!");
            }
        });

        driver.quit();
        return false;
    }
}
