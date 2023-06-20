package com.example.SUZA.COMPLAIN.Repository;

import com.example.SUZA.COMPLAIN.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
