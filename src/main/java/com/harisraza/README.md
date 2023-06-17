# Why No Main Class?
in Quarkus, the main application class is not required or explicitly defined in the same way as in Spring Boot. Quarkus applications are built using a combination of extensions and dependencies, and they often consist of multiple classes working together. The entry point for a Quarkus application is typically defined by the dependencies and extensions you include in your project, rather than a single main application class.

Quarkus applications are generally configured using application.properties or application.yml files, similar to Spring Boot's configuration files. These files define various properties and settings for the Quarkus application.

To get started with a Quarkus application, you typically define the necessary dependencies and extensions in your build configuration file (such as pom.xml for Maven or build.gradle for Gradle), and then write your application logic using various Quarkus APIs and annotations.
