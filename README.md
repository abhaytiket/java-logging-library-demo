# java-logging-library-demo
A demo application for showing how to use java logging library in tiket. As this project already supports using devcontainers so you can easily open this project on [VSCode](https://code.visualstudio.com) and choose the option to `Rebuild and Reopen in container`. It will automatically setup local environment for the project. Make sure that you have [Docker](https://www.docker.com/) installed on your machine and it is running.

On running the application following output should be displayed on the console

```

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.8)

{"sdc":{"key":"value"},"err":null,"level":"WARN","x_request_id":"12345","source":"com.example.demo.DemoApplication.lambda$0:DemoApplication.java:28","thread":"1","message":"This is a warn message","timestamp":"2024-07-30T06:20:19.953969055Z"}
{"sdc":{"key":"value"},"err":"Error details","level":"ERROR","x_request_id":"12345","source":"com.example.demo.DemoApplication.lambda$0:DemoApplication.java:29","thread":"1","message":"This is an error message","timestamp":"2024-07-30T06:20:19.968786346Z"}
```
