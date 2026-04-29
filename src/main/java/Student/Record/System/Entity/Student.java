package Student.Record.System.Entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="students")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Student{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String name;

        @Column(nullable = false, unique = true)
        private String email;

        @Column(nullable = false)
        private Integer age;
}

