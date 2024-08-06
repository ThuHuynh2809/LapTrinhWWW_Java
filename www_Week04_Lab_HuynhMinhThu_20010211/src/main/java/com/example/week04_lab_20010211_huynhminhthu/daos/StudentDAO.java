package com.example.week04_lab_20010211_huynhminhthu.daos;

import com.example.week04_lab_20010211_huynhminhthu.entities.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public class StudentDAO extends AbstractDAO<Student, Long>{
    public StudentDAO(DataSource dataSource){
        super(dataSource);
    }
    @Override
    public void insert(Student entity) {
        String sql = "insert into student values(?,?)";
        jdbcTemplate.update(sql,entity.getId(),entity.getName());
    }

    @Override
    public Student getById(Long id) {
        String sql = "select * from student where id=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Student.class),id);

    }

    @Override
    public List<Student> getAllTList() {
        String sql = "select * from student";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
    }
}
