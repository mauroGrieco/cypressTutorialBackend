package bbw.mg.cyprestutorialbackend.Controller;

import bbw.mg.cyprestutorialbackend.Model.Todo;
import bbw.mg.cyprestutorialbackend.Service.TodoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TodoControllerTest {

    @Mock
    private TodoService todoService;

    @InjectMocks
    private TodoController todoController;

    @Test
    public void testGetAllTodos() {
        Todo todo1 = new Todo();
        Todo todo2 = new Todo();
        List<Todo> todos = Arrays.asList(todo1, todo2);
        when(todoService.getAllTodos()).thenReturn(todos);

        ResponseEntity<List<Todo>> response = todoController.getAllTodos();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(2, response.getBody().size());
        verify(todoService, times(1)).getAllTodos();
    }

    @Test
    public void testCreateTodo() {
        Todo todoToCreate = new Todo();
        when(todoService.createTodo(todoToCreate)).thenReturn(todoToCreate);

        ResponseEntity<Todo> response = todoController.createTodo(todoToCreate);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(todoToCreate, response.getBody());
        verify(todoService, times(1)).createTodo(todoToCreate);
    }

    @Test
    public void testDeleteTodo() {
        Long todoId = 1L;
        doNothing().when(todoService).deleteTodo(todoId);

        ResponseEntity<?> response = todoController.deleteTodo(todoId);

        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
        verify(todoService, times(1)).deleteTodo(todoId);
    }
}