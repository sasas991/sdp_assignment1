package org.example;

public class App {

    public static void main(String[] args) {

        EmailDirector director=new EmailDirector();

        EmailObjectBuilder objectBuilder=new EmailObjectBuilder();
        director.makeWelcomeEmail(objectBuilder);

        Email email=objectBuilder.getResult();
        System.out.println("email object:");
        System.out.println(email);

        EmailTextBuilder textBuilder=new EmailTextBuilder();
        director.makeWelcomeEmail(textBuilder);

        String text=textBuilder.getResult();

        System.out.println("\nemail text:");
        System.out.println(text);
    }
}