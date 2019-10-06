package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.mitocode.model.Paciente;

//@Repository
public interface IPacienteRepo extends JpaRepository<Paciente, Integer>{
    @Query(value = "SELECT * FROM paciente ORDER BY paciente.id_paciente DESC LIMIT 1",nativeQuery = true)
    Paciente pacienteLastId();
    Paciente findTopByOrderByIdPacienteDesc();
}
