package com.example.Demo.repository;

import com.example.Demo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}