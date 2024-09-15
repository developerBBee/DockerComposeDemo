# Docker compose demo app

### Quick start

- Build and launch app. (To run in the background, add -d option.)
```shell
$ docker compose up --build
```

- Request GET API to localhost.
```
http://localhost:8080/api/hello?lang=ja
```

- Stop the application.
```shell
$ docker compose stop
```

- Delete containers.
```shell
$ docker compose down
```