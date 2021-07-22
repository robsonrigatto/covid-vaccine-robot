package br.com.rr.covid.vaccine.entities;

public class FaixaEtaria {

    private final Integer idade;
    private final Integer dose;

    public FaixaEtaria(Integer idade, Integer dose) {
        this.idade = idade;
        this.dose = dose;
    }

    public Integer getIdade() {
        return idade;
    }

    public Integer getDose() {
        return dose;
    }
}
