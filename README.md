# java-template-api
web-api

Возможные траблы:
- закоментить `data-locations: classpath*:db/02 populateDB.sql` в application.yml, иначе коллизия ключей при записи
- `POST /clients` первые разы не отрабатывает, траблы с генерацией ключей, есть решение,  пока не вникал и не копипастил