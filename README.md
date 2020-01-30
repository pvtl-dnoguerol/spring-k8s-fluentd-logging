# spring-k8s-fluentd-logging

A simple example of a Spring Boot application (LogEmitter)
deployed to Kubernetes using a Fluentd sidecar container 
that filters the application logs for forwarding to another 
log sink. 

In this example, Fluentd is configured to only pass DEBUG
and TRACE log entries from the Spring Boot app to its 
(FluentD's) STDOUT. In a real-world scenario, the config 
should store the logs somewhere more useful :-)
