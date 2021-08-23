package com.formacionbdi.microservicios.app.examenes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.microservicios.app.examenes.models.repository.AsignaturarRepository;
import com.formacionbdi.microservicios.app.examenes.models.repository.ExamenRepository;
import com.formacionbdi.microservicios.commons.examenes.models.entity.Asignatura;
import com.formacionbdi.microservicios.commons.examenes.models.entity.Examen;
import com.formaciondbi.microservicios.commons.services.CommonServiceImpl;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements ExamenService {

	@Autowired
	private AsignaturarRepository asignaturarRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Examen> findByNombre(String term){
		return repository.findByNombre(term);
	}
	

	@Override
	@Transactional(readOnly = true)
	public Iterable<Asignatura> findAllAsignaturas(){
		return asignaturarRepository.findAll();
	}
	
	
}
