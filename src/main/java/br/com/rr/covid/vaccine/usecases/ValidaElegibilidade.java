package br.com.rr.covid.vaccine.usecases;

import br.com.rr.covid.vaccine.entities.FaixaEtaria;
import br.com.rr.covid.vaccine.usecases.response.EligibilidadeResponse;

import java.util.List;

public class ValidaElegibilidade {

    public EligibilidadeResponse faixaValida(List<FaixaEtaria> faixaEtarias) {
        return new EligibilidadeResponse();
    }

}
