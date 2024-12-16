package bbw.mg.cyprestutorialbackend.Service;

import bbw.mg.cyprestutorialbackend.Model.Todo;
import bbw.mg.cyprestutorialbackend.Repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TodoServiceTest {

    @Mock
    private TodoRepository todoRepository;

    @InjectMocks
    private TodoService todoService;

    @Test
    public void testGetAllTodos() {
        Todo todo1 = new Todo();
        Todo todo2 = new Todo();
        List<Todo> todos = Arrays.asList(todo1, todo2);
        when(todoRepository.findAll()).thenReturn(todos);

        List<Todo> result = todoService.getAllTodos();

        assertEquals(2, result.size());
        verify(todoRepository, times(1)).findAll();
    }

    @Test
    public void testCreateTodo() {
        Todo todoToCreate = new Todo();
        when(todoRepository.save(todoToCreate)).thenReturn(todoToCreate);

        Todo result = todoService.createTodo(todoToCreate);

        assertEquals(todoToCreate, result);
        verify(todoRepository, times(1)).save(todoToCreate);
    }

    @Test
    public void testDeleteTodo() {
        Long todoId = 1L;
        doNothing().when(todoRepository).deleteById(todoId);

        todoService.deleteTodo(todoId);

        verify(todoRepository, times(1)).deleteById(todoId);
    }
}