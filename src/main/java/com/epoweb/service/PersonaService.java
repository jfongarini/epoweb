package com.epoweb.service;

import org.apache.log4j.Logger;

import com.epoweb.model.Persona;
import com.epoweb.repository.PersonaRepository;

public class PersonaService {
	

	final static Logger LOGGER = Logger.getLogger(PersonaService.class);

	private PersonaRepository repository;	
	
	public Integer savePersona(Persona persona) {
		LOGGER.info("Guardando la persona: "+ persona.getNombre());
		return repository.savePersona(persona);
	}	
	
	public void updatePersona(Persona persona) {
		LOGGER.info("Actualizando la persona: "+ persona.getNombre());
		repository.updatePersona(persona);
	}
	
	public Persona getPersonaId(int persona) {
		LOGGER.info("Obteniendo la persona: "+ persona);
		return repository.getPersonaId(persona);
	}
	
		
	
	public PersonaRepository getRepository() {
		return repository;
	}
	public void setRepository(PersonaRepository repository) {
		this.repository = repository;
	}

}