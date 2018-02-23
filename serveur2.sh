#!/bin/bash

java -Djava.security.manager -Djava.security.policy=chat.policy -Djava.rmi.server.hostname="localhost" -Djava.rmi.server.codebase=file:/Users/VinYarD/Documents/ISTIC/M1/S2/IPR/TP/rmi/target/classes/ -cp target/classes tp.rmi.serveur.ChatServeur
