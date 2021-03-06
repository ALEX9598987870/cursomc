package com.sandro.cursomc.cursomc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandro.cursomc.cursomc.domain.Categoria;
import com.sandro.cursomc.cursomc.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public void excluir(Integer id) {
		repo.deleteById(id);
	}

	public List<Categoria> listar() {
		return repo.findAll();
	}

	public void salvar(Categoria categoria) {
		repo.save(categoria);
		
	}
	
}
