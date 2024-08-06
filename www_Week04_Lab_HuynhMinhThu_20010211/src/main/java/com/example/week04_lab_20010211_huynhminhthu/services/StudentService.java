package com.example.week04_lab_20010211_huynhminhthu.services;

import com.example.week04_lab_20010211_huynhminhthu.entities.Student;
import com.example.week04_lab_20010211_huynhminhthu.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository bookRepository;

    public List<Student> list() {
        return bookRepository.findAll();
    }
}