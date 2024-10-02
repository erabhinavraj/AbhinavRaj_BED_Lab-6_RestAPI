package com.abhi.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.studentManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
