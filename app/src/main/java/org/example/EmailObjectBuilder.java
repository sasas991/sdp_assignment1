package org.example;

public class EmailObjectBuilder implements EmailBuilder {

    private String from;
    private String to;
    private String subject;
    private String body;

    @Override
    public EmailObjectBuilder setFrom(String from) {
        this.from=from;
        return this;
    }

    @Override
    public EmailObjectBuilder setTo(String to) {
        this.to=to;
        return this;
    }

    @Override
    public EmailObjectBuilder setSubject(String subject) {
        this.subject=subject;
        return this;
    }

    @Override
    public EmailObjectBuilder setBody(String body) {
        this.body=body;
        return this;
    }

    public Email getResult() {
        if (from==null || to==null) {
            throw new IllegalStateException("from and to are required");
        }

        return new Email(from, to, subject, body);
    }
}