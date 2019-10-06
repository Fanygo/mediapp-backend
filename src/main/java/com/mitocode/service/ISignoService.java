package com.mitocode.service;

import com.mitocode.model.Signo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
/**
 * ISignoService
 */

 
public interface ISignoService extends ICRUD<Signo> {
    Page<Signo> listarPageable(Pageable pageable);
}