package com.example.week04_lab_20010211_huynhminhthu.repository;

import com.example.week04_lab_20010211_huynhminhthu.entities.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClazzRepository extends JpaRepository<Clazz,Long> {
}
