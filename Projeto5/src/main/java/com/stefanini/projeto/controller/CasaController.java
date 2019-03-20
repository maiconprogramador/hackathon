package com.stefanini.projeto.controller;

import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Casa;
import com.stefanini.projeto.model.Porta;
import com.stefanini.projeto.service.CasaService;

@CrossOrigin
@Controller
@RequestMapping(value = "/")
public class CasaController {

	
	@Autowired
	private CasaService service;
	
	@RequestMapping(value="casa",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Casa> findAll() throws TreinaException {
		return service.findAll();
	}
	
	//recupe dados recebido do front end via POST
	@RequestMapping(value="salvar",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<Casa> salvar (@RequestBody Casa casa){
		casa =   service.salvar(casa);
		return new ResponseEntity<Casa>(casa ,HttpStatus.OK);
	}
	//recupe dados recebido do front end via POST
	@RequestMapping(value="salvar",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<Porta> salvar (@RequestBody Porta porta){
		porta = service.salvarPorta(porta);
		return new ResponseEntity<Porta>(porta ,HttpStatus.OK);
	}
	
	//deletar
	@RequestMapping(value="excluir",method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void excluir (@RequestBody("id") String id) throws TreinaException {
		service.delete(id);
	}
}