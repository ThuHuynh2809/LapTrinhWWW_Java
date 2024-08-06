package com.example.week04_lab_20010211_huynhminhthu.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "class")
@Setter
@Getter
@NoArgsConstructor
public class Clazz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Long id;
    private String name;

    @OneToMany(mappedBy = "clazz")
    private List<Student> studentList;
    public Clazz(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}