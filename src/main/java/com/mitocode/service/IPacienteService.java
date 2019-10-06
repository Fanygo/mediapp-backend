package com.mitocode.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

import com.mitocode.model.Paciente;


public interface IPacienteService extends ICRUD<Paciente>{
	
	Page<Paciente> listarPageable(Pageable pageable);
	Paciente pacienteLastId();
	Paciente findTopByIdPacienteDesc();
}
