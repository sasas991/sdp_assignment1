package org.example;

public class EmailDirector {

    private static final String COMPANY_EMAIL="company@example.com";
    private static final String SYSTEM_EMAIL="system@example.com";
    private static final String USER_EMAIL="user@example.com";

    private static final String WELCOME_SUBJECT="hi";
    private static final String WELCOME_BODY="welcome to our service";
    private static final String NOTIFICATION_SUBJECT="notification";
    private static final String NOTIFICATION_BODY="you have a new notification";

    public void makeWelcomeEmail(EmailBuilder builder) {
        builder
                .setFrom(COMPANY_EMAIL)
                .setTo(USER_EMAIL)
                .setSubject(WELCOME_SUBJECT)
                .setBody(WELCOME_BODY);
    }

    public void makeNotificationEmail(EmailBuilder builder) {
        builder
                .setFrom(SYSTEM_EMAIL)
                .setTo(USER_EMAIL)
                .setSubject(NOTIFICATION_SUBJECT)
                .setBody(NOTIFICATION_BODY);
    }
}