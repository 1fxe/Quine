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