package chtioui.salma.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "chtioui.salma.entities")
@EnableJpaRepositories(basePackages = "chtioui.salma.repositories")
@ComponentScan(basePackages = {"chtioui.salma.services", "chtioui.salma.controller"})
public class ExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}

}
