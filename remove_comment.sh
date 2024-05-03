#!/usr/bin/env bash
find . -type f -name '*.java' -exec sed -i 's_/\*\*\|^\ \*.*__' {} \;
find . -type f -name '*.java' -exec sed -zir 's_;[\n]*@_;\n\n@_' {} \;
find . -type f -name '*.java' -exec sed -zir 's_;[\n]*public_;\n\npublic_' {} \;
rm *.javar
find . -type f -exec sed -i 's/com.packt.modern/dev.nj/' {} \;
