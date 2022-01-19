# java-template-api
web-api

Возможные траблы:
- закоментить `data-locations: classpath*:db/02 populateDB.sql` в application.yml, иначе коллизия ключей при записи
- `POST /clients` первые разы не отрабатывает, траблы с генерацией ключей, есть решение,  пока не вникал и не копипастил

---
HOWTO docker:
1. накатить в докер постгрю
   см. https://dev.to/shree_j/how-to-install-and-run-psql-using-docker-41j2 

TL;DR:
- `docker create -v /var/lib/postgresql/data --name PostgresData alpine`
- `docker run -p 5432:5432 --name postgres -e POSTGRES_PASSWORD=postgres -d --volumes-from PostgresData postgres`
2. в терминале `docker ps`, чекаешь что раскатилось
3. чекни ip на котором захостилась постгря
`docker inspect postgres | grep 'IPAddress'`
и переопредели `db.host` в `application.yml`
4. чтобы доступ был нужно вроде в postgresql.conf поправить `listen_addresses = '*'` чтобы постгрес слушал все адреса
* внутри контейнера (открыть терминал в контейнере`docker exec -it -u 0 d5ba8252abc0 bash`, где d5ba8252abc0 это CONTAINER ID)  
* у меня был путь в контейнере /var/lib/postgresql/data
* открываешь любым редактором postgresql.conf и правишь listen_addresses, сохраняешь
* рестартишл контейнер
5. `./gradlew build` - сгенерит контейнер из `Dockerfile` и `docker-compose.yml` 
6. `docker-compose up` - для запуска апишки в докере (`docker-compose up --build` чтобы без `./gradlew build` запускать)
7. ...
8. PROFIT и вы восхитительны