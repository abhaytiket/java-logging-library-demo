# Base image
FROM debian:12.5
WORKDIR /app
RUN apt-get update && apt-get install -y git curl unzip zip && apt-get clean
RUN curl -s "https://get.sdkman.io" | bash
SHELL ["/bin/bash", "-c"]
RUN source "$HOME/.sdkman/bin/sdkman-init.sh" && sdk install java 21-librca && sdk default java 21-librca

    