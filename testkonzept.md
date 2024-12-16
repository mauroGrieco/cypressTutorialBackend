### Testkonzept für das Backend

#### 1. Unit Tests
- **Service Layer**: Testen Sie die Geschäftslogik unabhängig von der Datenbank.
    - Testfall 1: `testGetUserById` - Überprüfen, ob ein Benutzer anhand der ID korrekt zurückgegeben wird.
    - Testfall 2: `testCreateUser` - Überprüfen, ob ein neuer Benutzer korrekt erstellt wird.
    - Testfall 3: `testUpdateUser` - Überprüfen, ob die Benutzerinformationen korrekt aktualisiert werden.
    - Testfall 4: `testDeleteUser` - Überprüfen, ob ein Benutzer korrekt gelöscht wird.

- **Controller Layer**: Testen Sie die Endpunkte und deren Rückgabewerte.
    - Testfall 1: `testGetAllUsers` - Überprüfen, ob alle Benutzer korrekt zurückgegeben werden.
    - Testfall 2: `testGetUserById` - Überprüfen, ob ein Benutzer anhand der ID korrekt zurückgegeben wird.
    - Testfall 3: `testCreateUser` - Überprüfen, ob ein neuer Benutzer korrekt erstellt wird.
    - Testfall 4: `testUpdateUser` - Überprüfen, ob die Benutzerinformationen korrekt aktualisiert werden.
    - Testfall 5: `testDeleteUser` - Überprüfen, ob ein Benutzer korrekt gelöscht wird.

#### 2. Integration Tests
- **Service Layer**: Testen Sie die Interaktion zwischen Service und Repository.
    - Testfall 1: `testCreateUser` - Überprüfen, ob ein neuer Benutzer korrekt in der Datenbank erstellt wird.
    - Testfall 2: `testGetUserById` - Überprüfen, ob ein Benutzer anhand der ID korrekt aus der Datenbank abgerufen wird.
    - Testfall 3: `testUpdateUser` - Überprüfen, ob die Benutzerinformationen korrekt in der Datenbank aktualisiert werden.
    - Testfall 4: `testDeleteUser` - Überprüfen, ob ein Benutzer korrekt aus der Datenbank gelöscht wird.

- **Controller Layer**: Testen Sie die Endpunkte in Kombination mit der Datenbank.
    - Testfall 1: `testGetAllUsers` - Überprüfen, ob alle Benutzer korrekt aus der Datenbank abgerufen und zurückgegeben werden.
    - Testfall 2: `testGetUserById` - Überprüfen, ob ein Benutzer anhand der ID korrekt aus der Datenbank abgerufen und zurückgegeben wird.
    - Testfall 3: `testCreateUser` - Überprüfen, ob ein neuer Benutzer korrekt erstellt und in der Datenbank gespeichert wird.
    - Testfall 4: `testUpdateUser` - Überprüfen, ob die Benutzerinformationen korrekt aktualisiert und in der Datenbank gespeichert werden.
    - Testfall 5: `testDeleteUser` - Überprüfen, ob ein Benutzer korrekt gelöscht und aus der Datenbank entfernt wird.