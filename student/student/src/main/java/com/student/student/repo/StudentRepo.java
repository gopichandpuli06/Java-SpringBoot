package com.student.student.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.student.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Serializable>{

}
