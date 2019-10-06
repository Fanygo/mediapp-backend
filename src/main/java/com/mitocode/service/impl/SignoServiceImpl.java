package com.mitocode.service.impl;

import java.util.List;

import com.mitocode.model.Signo;
import com.mitocode.repo.ISignoRepo;
import com.mitocode.service.ISignoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * SignoServiceImpl
 */
@Service
public class SignoServiceImpl implements ISignoService {
    @Autowired
    private ISignoRepo repo;

    @Override
    public Signo registrar(Signo signo) {
        return repo.save(signo);
    }

    @Override
    public Signo modificar(Signo signo) {
        return repo.save(signo);
    }

    @Override
    public Signo leerPorId(Integer id) {
        return repo.findOne(id);
    }

    @Override
    public List<Signo> listar() {
        return repo.findAll();
    }

    @Override
    public void eliminar(Integer id) {
        repo.delete(id);
    }

    @Override
    public Page<Signo> listarPageable(Pageable pageable) {
        return repo.findAll(pageable);
    }

    
}