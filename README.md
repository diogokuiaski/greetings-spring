### Iniciando o docker do Postgres

```
$ docker-compose up -d
```

### Finalizando o docker do Posrgres

```
$ docker-compose down
```

### Apagando o Volume do DB (caso haja a necessidade de refazer a inicialização)

```
$ docker volume rm greetings-spring_postgres_data
```

### Build da solução

```
./gradlew build
```

### Iniciando a solução

```
./gradlew bootRun
```

### Build and Run

```
./gradlew build bootRun
```

### API

Endpoint REST será criado na porta **8090**!

#### /api/translate/{originalLanguage}/{translatedLanguage}/{original}

Traduz `original` de `originalLanguage` para `translatedLanguage`.

```
GET http://localhost:8090/api/translate/pt-br/en-us/oi

hi
```