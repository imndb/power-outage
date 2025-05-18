# power-outage
Stromausfall - Information der Notrufzentralen


Meldungen über einen Stromausfall werden zur Zeit meist via Bürger gemeldet. Die Notrufzentralen erhalten nur von Energie Wasser Bern (EWB) eine automatische Meldung via E-Mail über Netzausfälle. Mobilfunkantennen verfügen nur für eine beschränkte Zeit (ca. 45-60 Min) über Notstrom. Bürger können im Notfall je nach Meldezeit des Ausfalls nicht mehr informiert werden, da das Mobilfunknetz bereits ausgefallen ist.

Ziel:

Erstellung einer aktuellen Lagekarte des Kantons Bern mit den Stromausfällen sämtlicher Stromversorger
Bei einer Störung mit Folgen für die Bevölkerung soll umgehend (1-2 Minuten) eine Meldung via E-Mail an die Notrufzentralen erfolgen
Bereitstellen einer Schnittstelle (SOAP, …) für die Datenanlieferung der Netzbetreiber


https://hack.data-hackdays-be.ch/project/55


Beispiel React Client: 

https://github.com/idabbaghi2/power-outage-react-client


Anleitung Deployment Local mit docker -> docker-compose.yaml:

1- Docker-Desktop installieren und starten
2- Projekt clonen
3- im root vom Projekt: docker compose up
4- swagger soll so verfügbar sein: http://localhost:8080/swagger-ui/index.html



Anleitung Deployment Local mit docker -> kubernetes:

1- Docker Desktop Installieren und starten
2- in Settings Kubernetes aktivieren
3- kubectl installieren 
4- kubectl config use-context docker-desktop
5- im Project diesen Befehl ausführen: kubectl apply -f src/main/resources/k8s/deployment.yaml
6- port herausfinden, steht hier nach 80:   kubectl get service | grep 80:
7- swagger soll so verfügbar sein: http://localhost:port/swagger-ui/index.html
