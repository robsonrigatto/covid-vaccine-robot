package br.com.rr.covid.vaccine.entities;

public class Mensagem {

    private String to;
    private String message;

    public Mensagem() {
        this(null, null);
    }

    public Mensagem(String to, String message) {
        this.to = to;
        this.message = message;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "to='" + to + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
