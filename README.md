# spring-boot-circuit-breaker
Spring Boot Circuit Breaker

1 tudo ligado
    curl http://localhost:8000/actuator/health/circuitBreakers
    curl http://localhost:8000/api/loans-retry?type=personal

2 rate desligado
mostrar logs no actuator
    http://localhost:8000/actuator/health
    curl http://localhost:8000/actuator/health/circuitBreakers

    curl http://localhost:8000/api/loans-circuit?type=personal
    ligar rate após 5 segundos

http://localhost:8000/h2-console
http://localhost:9000/h2-console
