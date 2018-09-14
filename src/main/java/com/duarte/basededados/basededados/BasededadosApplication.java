package com.duarte.basededados.basededados;

import javax.persistence.Table;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "com.duarte.basededados.entidade" })
@Table(name = "Funcionarios")
@EnableJpaRepositories(basePackages = { "com.duarte.basededados.repository" })
@ComponentScan(basePackages = { "com.duarte.basededados.controller" })
public class BasededadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasededadosApplication.class, args);
	}
}
