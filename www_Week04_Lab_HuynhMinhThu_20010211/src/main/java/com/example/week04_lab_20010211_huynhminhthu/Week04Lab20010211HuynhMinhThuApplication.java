package com.example.week04_lab_20010211_huynhminhthu;

import com.example.week04_lab_20010211_huynhminhthu.daos.StudentDAO;
import com.example.week04_lab_20010211_huynhminhthu.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week04Lab20010211HuynhMinhThuApplication {
@Autowired
	private StudentDAO studentDAO;
	public static void main(String[] args) {
		SpringApplication.run(Week04Lab20010211HuynhMinhThuApplication.class, args);
	}
	@Bean
	CommandLineRunner test_1(){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				for (int i = 0; i < 10; i++) {
					Student student = new Student(i, "name #"+i);
					studentDAO.insert(student);
				}
				studentDAO.getAllTList().forEach(System.out::println);
			}
		};
	}
}
