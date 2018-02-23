#!/bin/bash

java -Djava.security.manager -Djava.security.policy=chat.policy -Djava.rmi.server.hostname="localhost" -cp target/classes tp.rmi.serveur.ChatServeur
