package org.example;

public class EmailTextBuilder implements EmailBuilder {

    private final StringBuilder text=new StringBuilder();

    @Override
    public EmailTextBuilder setFrom(String from) {
        text.append("From: ").append(from).append("\n");
        return this;
    }

    @Override
    public EmailTextBuilder setTo(String to) {
        text.append("To: ").append(to).append("\n");
        return this;
    }

    @Override
    public EmailTextBuilder setSubject(String subject) {
        text.append("Subject: ").append(subject).append("\n");
        return this;
    }

    @Override
    public EmailTextBuilder setBody(String body) {
        text.append("\n").append(body).append("\n");
        return this;
    }

    public String getResult() {
        return text.toString();
    }
}