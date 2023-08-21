#FROM maven:3.6.3-jdk-11 — базовый образ с предустановленным mvn 3.6.3 и jdk11
FROM maven:3.6.3-jdk-11
#RUN mkdir -p /usr/src/app — создание каталога /usr/src/app в контейнере
RUN mkdir -p /usr/src/app
#WORKDIR /usr/src/app — задаёт рабочую директорию для следующей инструкции.
WORKDIR /usr/src/app
#ADD . /usr/src/app — копирование файлов в директорию. см. ADD or COPY: https://docs.docker.com/develop/develop-images/dockerfile_best-practices/
ADD . /usr/src/app
# RUN mvn clean test — выполняет команду и создаёт слой образа. Используется для установки в контейнер пакетов.
RUN mvn clean test