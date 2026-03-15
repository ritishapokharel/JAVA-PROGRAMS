#!/bin/bash
JAR="lib/mysql-connector-j-9.6.0.jar"
javac -cp ".:$JAR" "$1.java"
java -cp ".:$JAR" "$1"