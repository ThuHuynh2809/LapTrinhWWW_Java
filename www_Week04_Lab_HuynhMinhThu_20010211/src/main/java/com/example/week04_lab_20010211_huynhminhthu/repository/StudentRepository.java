package com.example.week04_lab_20010211_huynhminhthu.repository;

import com.example.week04_lab_20010211_huynhminhthu.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
