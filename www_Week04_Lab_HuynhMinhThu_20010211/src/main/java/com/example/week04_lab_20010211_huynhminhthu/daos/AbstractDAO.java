package com.example.week04_lab_20010211_huynhminhthu.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public abstract class AbstractDAO<T,Id>{
    private DataSource dataSource;
    protected JdbcTemplate jdbcTemplate;

    public AbstractDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public AbstractDAO(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

//    public AbstractDAO() {
//        jdbcTemplate = new JdbcTemplate(dataSource);
//    }
    public abstract void insert(T entity);
    public abstract T getById(Id id);
    public abstract List<T> getAllTList();

}
