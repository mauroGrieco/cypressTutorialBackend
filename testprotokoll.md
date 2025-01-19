### Testprotokoll für JUnit-Tests

**Projekt:** CypresTutorialBackend

**Datum:** 19.01.2025

**Testumgebung:**
- Betriebssystem: Windows
- IDE: IntelliJ IDEA 2024.1.2
- Java-Version: 17
- Build-Tool: Maven
- Test-Framework: JUnit 5

**Testfälle:**

| Testfall-ID | Testfallbeschreibung                              | Erwartetes Ergebnis                              | Tatsächliches Ergebnis                           | Status    |
|-----|---------------------------------------------------|--------------------------------------------------|-------------------------------------------------|------------|
| 001 | Kontext lädt korrekt                               | Anwendung startet ohne Fehler                    | Anwendung startet ohne Fehler                    | Bestanden |
| 002 | Alle Todos werden korrekt abgerufen                | Liste aller Todos wird abgerufen                 | Liste aller Todos wird abgerufen                 | Bestanden |
| 003 | Todo-Objekt wird korrekt erstellt                  | Todo-Objekt wird erstellt                        | Todo-Objekt wird erstellt                        | Bestanden |
| 004 | Todo-Objekt wird korrekt gelöscht                  | Todo-Objekt wird gelöscht                        | Todo-Objekt wird gelöscht                        | Bestanden |
| 005 | Todo-Objekt wird korrekt aktualisiert              | Todo-Objekt wird aktualisiert                    | Todo-Objekt wird aktualisiert                    | Bestanden |
| 006 | Todo-Objekt wird korrekt nach ID abgerufen         | Todo-Objekt wird nach ID abgerufen               | Todo-Objekt wird nach ID abgerufen               | Bestanden |
| 007 | Todo-Objekt wird korrekt in der Datenbank erstellt | Todo-Objekt wird in der Datenbank erstellt       | Todo-Objekt wird in der Datenbank erstellt       | Bestanden |
| 008 | Todo-Objekt wird korrekt in der Datenbank gelöscht | Todo-Objekt wird in der Datenbank gelöscht       | Todo-Objekt wird in der Datenbank gelöscht       | Bestanden |
| 009 | Todo-Objekt wird korrekt in der Datenbank aktualisiert | Todo-Objekt wird in der Datenbank aktualisiert   | Todo-Objekt wird in der Datenbank aktualisiert   | Bestanden |
| 010 | Todo-Objekt wird korrekt aus der Datenbank abgerufen | Todo-Objekt wird aus der Datenbank abgerufen     | Todo-Objekt wird aus der Datenbank abgerufen     | Bestanden |

**Zusammenfassung:**
Alle definierten Testfälle wurden erfolgreich ausgeführt und bestanden. Die Anwendung funktioniert wie erwartet.

**Anmerkungen:**
- Die ID-Felder der Todo-Objekte werden automatisch generiert und inkrementiert.
- Alle Tests wurden in der lokalen Entwicklungsumgebung ausgeführt.

**Tester:** Mauro Grieco