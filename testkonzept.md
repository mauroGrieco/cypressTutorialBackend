### Testkonzept für das Backend

#### 1. Unit Tests
- **Service Layer**: Testen Sie die Geschäftslogik unabhängig von der Datenbank.
  - Testfall 1: `testGetTodoById` - Überprüfen, ob ein Todo anhand der ID korrekt zurückgegeben wird.
  - Testfall 2: `testCreateTodo` - Überprüfen, ob ein neues Todo korrekt erstellt wird.
  - Testfall 3: `testUpdateTodo` - Überprüfen, ob die Todo-Informationen korrekt aktualisiert werden.
  - Testfall 4: `testDeleteTodo` - Überprüfen, ob ein Todo korrekt gelöscht wird.

- **Controller Layer**: Testen Sie die Endpunkte und deren Rückgabewerte.
  - Testfall 1: `testGetAllTodos` - Überprüfen, ob alle Todos korrekt zurückgegeben werden.
  - Testfall 2: `testGetTodoById` - Überprüfen, ob ein Todo anhand der ID korrekt zurückgegeben wird.
  - Testfall 3: `testCreateTodo` - Überprüfen, ob ein neues Todo korrekt erstellt wird.
  - Testfall 4: `testUpdateTodo` - Überprüfen, ob die Todo-Informationen korrekt aktualisiert werden.
  - Testfall 5: `testDeleteTodo` - Überprüfen, ob ein Todo korrekt gelöscht wird.

#### 2. Integration Tests
- **Service Layer**: Testen Sie die Interaktion zwischen Service und Repository.
  - Testfall 1: `testCreateTodo` - Überprüfen, ob ein neues Todo korrekt in der Datenbank erstellt wird.
  - Testfall 2: `testGetTodoById` - Überprüfen, ob ein Todo anhand der ID korrekt aus der Datenbank abgerufen wird.
  - Testfall 3: `testUpdateTodo` - Überprüfen, ob die Todo-Informationen korrekt in der Datenbank aktualisiert werden.
  - Testfall 4: `testDeleteTodo` - Überprüfen, ob ein Todo korrekt aus der Datenbank gelöscht wird.

- **Controller Layer**: Testen Sie die Endpunkte in Kombination mit der Datenbank.
  - Testfall 1: `testGetAllTodos` - Überprüfen, ob alle Todos korrekt aus der Datenbank abgerufen und zurückgegeben werden.
  - Testfall 2: `testGetTodoById` - Überprüfen, ob ein Todo anhand der ID korrekt aus der Datenbank abgerufen und zurückgegeben wird.
  - Testfall 3: `testCreateTodo` - Überprüfen, ob ein neues Todo korrekt erstellt und in der Datenbank gespeichert wird.
  - Testfall 4: `testUpdateTodo` - Überprüfen, ob die Todo-Informationen korrekt aktualisiert und in der Datenbank gespeichert werden.
  - Testfall 5: `testDeleteTodo` - Überprüfen, ob ein Todo korrekt gelöscht und aus der Datenbank entfernt wird.