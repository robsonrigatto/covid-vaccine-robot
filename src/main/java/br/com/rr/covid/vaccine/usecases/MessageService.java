package br.com.rr.covid.vaccine.usecases;

import br.com.rr.covid.vaccine.entities.Mensagem;

public interface MessageService {

    void send(String mensagem);
}
