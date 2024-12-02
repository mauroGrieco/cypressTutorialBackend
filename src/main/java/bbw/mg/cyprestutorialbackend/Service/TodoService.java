package bbw.mg.cyprestutorialbackend.Service;

import bbw.mg.cyprestutorialbackend.Model.Todo;
import bbw.mg.cyprestutorialbackend.Repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {

    @Autowired
    public TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo createTodo(Todo todoToCreate) {
        return todoRepository.save(todoToCreate);
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);

    }
}
