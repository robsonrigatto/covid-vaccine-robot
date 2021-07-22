package br.com.rr.covid.vaccine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CovidVaccineRobotApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		SpringApplication.run(CovidVaccineRobotApplication.class, args);
	}

}
