package bbw.mg.cyprestutorialbackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Todo {
    @Id
    private Long id;

    private String title;

    private String category;

    private String priority;

    private boolean completed;
}
