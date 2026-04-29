package Student.Record.System.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class StudentInputDTO {

    @NotBlank(message = "Name must not be blank")
    private String name;

    @NotBlank(message = "Email must not be blank")
    @Email(message = "Invalid format")
    private String email;

    @NotNull(message = "Age must not be null")
    @Min(value = 16, message = "Age must be bigger than 16")
    private Integer age;

}
