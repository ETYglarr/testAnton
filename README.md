Для переключения среды выполнения на docker:
    1) в классе Config переключить local на false
    2) в терминале выполнить следующие команды
        1. docker network create selenoid (создаем сеть)
        2. docker-compose up (запускаем контейнеры)
        3. запускаем необходимые тесты

selenoid_iu - http://localhost:8080/
selenoid status - http://localhost:4444/status