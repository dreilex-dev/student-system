package Student.Record.System.service;

import Student.Record.System.Entity.Student;
import Student.Record.System.dto.StudentInputDTO;
import Student.Record.System.dto.StudentOutputDTO;
import Student.Record.System.exceptions.EmailAlreadyExistsException;
import Student.Record.System.mapper.StudentMapper;
import Student.Record.System.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;
    private final StudentMapper mapper;

    public StudentService(StudentRepository repository, StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public StudentOutputDTO create(StudentInputDTO dto) {
        if (repository.existsByEmail(dto.getEmail())) {
            throw new EmailAlreadyExistsException(dto.getEmail());
        }
        Student entity = mapper.toEntity(dto);
        Student saved = repository.save(entity);
        return mapper.toDTO(saved);
    }

    public List<StudentOutputDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO).toList();

    }

}
