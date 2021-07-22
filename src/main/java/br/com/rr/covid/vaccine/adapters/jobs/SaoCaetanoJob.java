package br.com.rr.covid.vaccine.adapters.jobs;

import br.com.rr.covid.vaccine.adapters.navigator.SaoCaetanoNavigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SaoCaetanoJob {

    @Autowired
    private SaoCaetanoNavigator navigator;

    @Scheduled(fixedRateString = "${periodo.robo}")
    public void navigate() {
        this.navigator.getFaixasEtarias();
    }
}
