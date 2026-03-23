#!/usr/bin/env bash


./mvnw flyway:migrate -Dflyway.url=jdbc:postgresql://localhost:5432/learnjavadb -Dflyway.user=learnjavauser -Dflyway.password=password
./mvnw spring-boot:run

