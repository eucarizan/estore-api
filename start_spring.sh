#!/usr/bin/env bash
if [[ ! -a estore-api.zip ]]; then
  curl https://start.spring.io/starter.zip -d dependencies=web \
	  -d bootVersion=3.2.4 -d type=gradle-project \
	  -d javaVersion=17 -d packaging=jar \
	  -d groupId=dev.nj -d artifactId=estore-api \
	  -d name=estore-api -d packageName=dev.nj.api \
	  -d description="Sample ecommerce app API" \
	  -o estore-api.zip 
  unzip estore-api.zip
  # mkdir src/main/resources/api
  # cp openapi.yaml config.json .openapi-generator-ignore src/main/resources/api/
fi
