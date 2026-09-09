package org.example;

public class EmailDirector {

    public void makeWelcomeEmail(EmailBuilder builder) {
        builder
                .setFrom("company@example.com")
                .setTo("user@example.com")
                .setSubject("hi")
                .setBody("welcome to our service");
    }

    public void makeNotificationEmail(EmailBuilder builder) {
        builder
                .setFrom("system@example.com")
                .setTo("user@example.com")
                .setSubject("notification")
                .setBody("you have a new notification");
    }
}