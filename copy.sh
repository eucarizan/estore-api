#!/usr/bin/env bash
mkdir /mnt/c/engg/packt/estore-api/copy
mkdir /mnt/c/engg/packt/estore-api/src/main/resources/api

cd /mnt/c/engg/trials/estore-api/github/Chapter04
cp build.gradle src/main/resources/api/openapi.yaml src/main/resources/api/.openapi-generator-ignore src/main/resources/api/config.json src/main/resources/application.properties src/main/resources/db/migration/V1.0.0__Init.sql /mnt/c/engg/packt/estore-api/copy/

cd /mnt/c/engg/packt/estore-api
mkdir src/main/resources/db
mkdir src/main/resources/db/migration
rm src/main/resources/application.properties
rm build.gradle
mv copy/openapi.yaml src/main/resources/api/
mv copy/.openapi-generator-ignore src/main/resources/api/
mv copy/config.json src/main/resources/api/
mv copy/V1.0.0__Init.sql src/main/resources/db/migration/
mv copy/application.properties src/main/resources/
mv copy/build.gradle .

cd src/main/java/dev/nj/api
mkdir controller
mkdir entity
mkdir exception
cd /mnt/c/engg/trials/estore-api/github/Chapter04/src/main/java/com/packt/modern/api
cp controller/CartsController.java /mnt/c/engg/packt/estore-api/src/main/java/dev/nj/api/controller/
cp exception/Error.java /mnt/c/engg/packt/estore-api/src/main/java/dev/nj/api/exception/
cp exception/ErrorCode.java /mnt/c/engg/packt/estore-api/src/main/java/dev/nj/api/exception/
cp exception/ErrorUtils.java /mnt/c/engg/packt/estore-api/src/main/java/dev/nj/api/exception/
cp exception/RestApiErrorHandler.java /mnt/c/engg/packt/estore-api/src/main/java/dev/nj/api/exception/
cp exception/ResourceNotFoundException.java /mnt/c/engg/packt/estore-api/src/main/java/dev/nj/api/exception/
cp exception/CustomerNotFoundException.java /mnt/c/engg/packt/estore-api/src/main/java/dev/nj/api/exception/
cp exception/ItemNotFoundException.java /mnt/c/engg/packt/estore-api/src/main/java/dev/nj/api/exception/
cp exception/GenericAlreadyExistsException.java /mnt/c/engg/packt/estore-api/src/main/java/dev/nj/api/exception/
cp entity/* /mnt/c/engg/packt/estore-api/src/main/java/dev/nj/api/entity/

rm -r copy/

cd /mnt/c/engg/packt/estore-api/src/main/java/dev/nj/api
find . -type f -exec sed -i 's/com.packt.modern/dev.nj/' {} \;
cd /mnt/c/engg/packt/estore-api/src/main/resources
find . -type f -exec sed -i 's/com.packt.modern/dev.nj/' {} \;

cd /mnt/c/engg/packt/estore-api
sed -i '8d' build.gradle
sed -i "8i group = 'dev.nj'" build.gradle
sed -i '1s/Chapter04/estore-api/' src/main/resources/application.properties
sed -i '7d' src/main/resources/api/openapi.yaml
sed -i '7i \ \ termsOfService: https://github.com/eucarizan/estore-api/blob/main/LICENSE' src/main/resources/api/openapi.yaml
sed -i '10d' src/main/resources/api/openapi.yaml
sed -i '10i \ \ \ \ url: https://github.com/eucarizan/estore-api/blob/main/LICENSE' src/main/resources/api/openapi.yaml

