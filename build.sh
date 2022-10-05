#!/bin/bash

## Directories

TOPDIR=src
PARSER=${TOPDIR}/parser


## Build parser

java -jar /usr/local/lib/antlr-4.11.1-complete.jar -visitor ${PARSER}/Q.g4
javac ${PARSER}/Q*.java
