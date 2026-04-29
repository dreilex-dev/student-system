package Student.Record.System.mapper;

import Student.Record.System.Entity.Student;
import Student.Record.System.dto.StudentInputDTO;
import Student.Record.System.dto.StudentOutputDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface StudentMapper {

    StudentOutputDTO toDTO(Student student);

    Student toEntity(StudentInputDTO dto);

}

