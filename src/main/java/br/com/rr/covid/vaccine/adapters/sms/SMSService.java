package br.com.rr.covid.vaccine.adapters.sms;

import br.com.rr.covid.vaccine.entities.Mensagem;
import br.com.rr.covid.vaccine.usecases.MessageService;
import com.google.common.collect.Lists;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SMSService implements MessageService {

    @Value("${twilio.account.sid}")
    private String accountSid;

    @Value("${twilio.auth.token}")
    private String authToken;

    @Value("${twilio.phone.number}")
    private String fromNumber;

    @Override
    public void send(String mensagem) {
        Twilio.init(accountSid, authToken);
        List<String> contatos = Lists.newArrayList("+5511993081373");

        contatos.forEach(contato -> {
            Message message = Message.creator(new PhoneNumber(contato),
                    new PhoneNumber(fromNumber), mensagem)
                    .create();
            System.out.println("here is my id:" + message.getSid());
        });
    }
}
