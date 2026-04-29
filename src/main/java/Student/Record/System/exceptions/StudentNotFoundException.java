package Student.Record.System.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(Long id){
        super("Student with id: " + id + " not found.");
    }

}

