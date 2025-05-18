# Power-Outage
**Stromausfall - Information der Notrufzentralen**

Meldungen über einen Stromausfall werden zur Zeit meist via Bürger gemeldet. Die Notrufzentralen erhalten nur von Energie Wasser Bern (EWB) eine automatische Meldung via E-Mail über Netzausfälle. Mobilfunkantennen verfügen nur für eine beschränkte Zeit (ca. 45-60 Min) über Notstrom. Bürger können im Notfall je nach Meldezeit des Ausfalls nicht mehr informiert werden, da das Mobilfunknetz bereits ausgefallen ist.

## Ziel

- Erstellung einer aktuellen Lagekarte des Kantons Bern mit den Stromausfällen sämtlicher Stromversorger.
- Bei einer Störung mit Folgen für die Bevölkerung soll umgehend (1-2 Minuten) eine Meldung via E-Mail an die Notrufzentralen erfolgen.
- Bereitstellen einer Schnittstelle (SOAP, …) für die Datenanlieferung der Netzbetreiber.

Weitere Details: [Hack Data Hackdays BE Projekt](https://hack.data-hackdays-be.ch/project/55)

## Beispiel React Client

- [React Client Repository](https://github.com/idabbaghi2/power-outage-react-client)

## Anleitung für Deployment Local mit Docker

### Docker Compose

1. Installiere und starte Docker Desktop.
2. Klone das Projekt.
3. Navigiere im Root-Verzeichnis des Projekts und führe den folgenden Befehl aus:  
   `docker compose up`
4. Swagger sollte nun unter folgender URL erreichbar sein:  
   [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

### Docker mit Kubernetes

1. Installiere und starte Docker Desktop.
2. Aktiviere Kubernetes in den Docker Desktop Einstellungen.
3. Installiere `kubectl`.
4. Führe folgenden Befehl aus, um den Docker Desktop Kontext zu setzen:  
   `kubectl config use-context docker-desktop`
5. Im Projektverzeichnis führe den folgenden Befehl aus:  
   `kubectl apply -f src/main/resources/k8s/deployment.yaml`
6. Finde den Port heraus, indem du diesen Befehl ausführst:  
   `kubectl get service | grep 80`
7. Swagger sollte nun unter folgender URL erreichbar sein:  
   [http://localhost:<port>/swagger-ui/index.html](http://localhost:<port>/swagger-ui/index.html)

