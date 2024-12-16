package bbw.mg.cyprestutorialbackend.Controller;

import bbw.mg.cyprestutorialbackend.Model.Todo;
import bbw.mg.cyprestutorialbackend.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
@CrossOrigin(origins = "*")
public class TodoController {

    @Autowired
    public TodoService todoService;

    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodos() {
        return ResponseEntity.ok().body(todoService.getAllTodos());
    }

    @PostMapping
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(todoService.createTodo(todo));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/update")
    public ResponseEntity<Todo> updateTodo(@RequestBody Todo todo) {
        return ResponseEntity.ok().body(todoService.createTodo(todo));
    }

}
