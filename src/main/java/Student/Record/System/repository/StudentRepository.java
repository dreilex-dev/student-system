package Student.Record.System.repository;

import Student.Record.System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    boolean existsByEmail(String email);
    List<Student> findByNameContaining(String text);
    List<Student> findByEmail(String email);
    List<Student> findByAgeGreaterThan(Integer age);

}