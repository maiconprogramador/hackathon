package com.stefanini.projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Casa;
import com.stefanini.projeto.repository.CasaRepository;

@Service
public class CasaService {

	@Autowired
	private CasaRepository repository;
	
	public List<Casa> findAll() throws TreinaException {
		return (List<Casa>) repository.findAll();
	}
	public Casa salvar(Casa casa){
		return repository.save(casa);
		
	}
	public Optional<Casa> filtroPorNome(Long id) throws TreinaException{
		return repository.findById(id);
	}
	public void delete(Long id) throws TreinaException{
		repository.deleteById(id);
	}
	public Optional<Casa> buscarPorId(Long id) throws TreinaException{
		return repository.findById(id);
	}
	public void salvarPorta(Porta porta) {
		repository.save(porta);
	}

}