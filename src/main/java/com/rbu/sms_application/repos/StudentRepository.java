package com.rbu.sms_application.repos;

import com.rbu.sms_application.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
