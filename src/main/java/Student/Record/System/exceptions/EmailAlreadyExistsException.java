package Student.Record.System.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class EmailAlreadyExistsException extends RuntimeException {

    public EmailAlreadyExistsException(String email){
        super("Student with email " + email + " already exists.");
    }

}

