# Quine

Simple Java Quine using String Literals

> A quine is a self-referential program that can, without any external access, output its own source. [Definition](https://rosettacode.org/wiki/Quine)

## Running

```sh
Quine …
➜ java src/Quine.java > Quine2.java &&
➜ diff -s -q src/Quine.java Quine2.java
Files src/Quine.java and Quine2.java are identical
```

## Shortest 

This is the shortest Quine I could make
```java
enum Q{U;{var s="enum Q{U;{var s=%c%s%1$c;System.out.printf(s,34,s);System.exit(0);}}";System.out.printf(s,34,s);System.exit(0);}}
```
It abuses Java class loading

```sh
$ java Main.java > Main2.java && diff Main.java Main2.java -s
Files Main.java and Main2.java are identical
```
