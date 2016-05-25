# memschool

Pohjaprojekti muistikoululle. Ei ole pakko forkata tätä pohjaksi, mutta saa jos tuntuu hyvältä ajatukselta.

Wikissä "for dummies by dummy" -ohjeet jvisualvm:n käyttöön.

```
$ mvn clean package
$ java -jar target/memschool-1.0-SNAPSHOT.jar
```

Muistiargumentit saa kätevästi täältä http://jvmmemory.com/

*HUOM!* Muistiargumentit pitää antaa rimpsun alkupäässä, koska muuten ne tarjoillaan ohjelmalle String[] argsina :)

EI NÄIN
```
$ java -jar target/memschool-1.0-SNAPSHOT.jar -XX:MetaspaceSize=1m
```

VAAN NÄIN
```
$ java -XX:MetaspaceSize=1m -jar target/memschool-1.0-SNAPSHOT.jar
```
