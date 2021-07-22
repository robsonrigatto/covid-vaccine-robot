package br.com.rr.covid.vaccine.usecases.response;

public class EligibilidadeResponse {

    private Boolean veronica;
    private Boolean renato;
    private Boolean rafael;

    public Boolean getVeronica() {
        return veronica;
    }

    public void setVeronica(Boolean veronica) {
        this.veronica = veronica;
    }

    public Boolean getRenato() {
        return renato;
    }

    public void setRenato(Boolean renato) {
        this.renato = renato;
    }

    public Boolean getRafael() {
        return rafael;
    }

    public void setRafael(Boolean rafael) {
        this.rafael = rafael;
    }
}
