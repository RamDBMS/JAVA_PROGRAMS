package com.student.SMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.SMS.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
