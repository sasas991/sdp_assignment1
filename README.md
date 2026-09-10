# Email Builder Pattern
a java implementation of the builder design pattern for creating emails in two different representations

## Classes

- Email - product, represents an immutable email
- EmailBuilder - builder interface that defines the construction steps
- EmailObjectBuilder - concrete builder that creates an email object
- EmailTextBuilder - concrete builder that creates a text representation of an email
- EmailDirector - director that provides predefined email configurations
- App - client that demonstrates both builders

## Run
./gradlew run