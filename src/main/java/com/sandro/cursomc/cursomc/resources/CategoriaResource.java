package com.sandro.cursomc.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandro.cursomc.cursomc.domain.Categoria;
import com.sandro.cursomc.cursomc.service.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;

	@GetMapping(value="/{id}")
	private ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@DeleteMapping(value="/{id}")
	private void exclui(@PathVariable Integer id) {
		service.excluir(id);
	}
	
	@GetMapping()
	private List<Categoria> listar() {
		return service.listar();
	}
	
	@PostMapping("/salvar")
	private void salvar(@RequestBody Categoria categoria) {
		service.salvar(categoria);
	}
	
	
	
}
