package com.sandro.cursomc.cursomc;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sandro.cursomc.cursomc.domain.Categoria;
import com.sandro.cursomc.cursomc.repository.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Categoria cat1 = new Categoria(null, "Informatica");
		//Categoria cat2 = new Categoria(null, "Escritório");
		
		//repo.saveAll(Arrays.asList(cat1, cat2));
	}

}

