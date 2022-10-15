package teosprint.todo.domain.todo.data.dto.req;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class UpdateTodoReq {
    private Integer id;
    private Integer categoryId;
    private Integer goalId;
    private String text;
    private Integer importance; // 0~2
    private LocalDate endDate;
}
