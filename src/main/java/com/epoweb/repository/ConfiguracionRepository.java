package com.epoweb.repository;

import java.util.List;

import org.apache.log4j.Logger;

import com.epoweb.model.Categoria;
import com.epoweb.model.Inversion;
import com.epoweb.model.Persona;
import com.epoweb.model.Tarjeta;

@SuppressWarnings("unchecked")
public class ConfiguracionRepository extends AbstractRepository {

	final static Logger LOGGER = Logger.getLogger(ConfiguracionRepository.class);

	
	//Categoria
	public List<Categoria> getCategoriasIngreso() {
		return getCurrentSession().createQuery("from Categoria where isGasto=false and vigente=true").list();
	}
	
	public List<Categoria> getCategoriasGasto() {
		return getCurrentSession().createQuery("from Categoria where isGasto=true and vigente=true").list();
	}
	
	public Integer saveCategoria(Categoria categoria) {
		return (Integer) getCurrentSession().save(categoria);
	}
	
	public Categoria getCategoria(int id){
		return getCurrentSession().get(Categoria.class, id);
	}
	
	//Inversion
	public Integer saveInversion (Inversion inversion) {
		return (Integer) getCurrentSession().save(inversion); 
	}
		
	public List<Inversion> getInversiones() {
		return getCurrentSession().createQuery("from Inversion where vigente=true").list();
	}
	
	public Inversion getInversion(int id){
		return getCurrentSession().get(Inversion.class, id);
	}
	
	
	//Persona
	public Integer savePersona(Persona persona) {
		return (Integer) getCurrentSession().save(persona);
	}

	public List<Persona> getPersonas() {
		return getCurrentSession().createQuery("from Persona where vigente=true").list();
	}
	
	public Persona getPersona(int id){
		return getCurrentSession().get(Persona.class, id);
	}
	
	
	//Tarjeta
	public Integer saveTarjeta(Tarjeta tarjeta) {
		return (Integer) getCurrentSession().save(tarjeta);
	}
	
	public List<Tarjeta> getTarjetas() {
		return getCurrentSession().createQuery("from Tarjeta where vigente=true").list();
	}
	
	public Tarjeta getTarjeta(int id){
		return getCurrentSession().get(Tarjeta.class, id);
	}

	
}
