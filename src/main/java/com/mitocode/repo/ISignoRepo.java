package com.mitocode.repo;

import com.mitocode.model.Signo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ISignoRepo
 */
@Repository
public interface ISignoRepo extends JpaRepository<Signo,Integer> {

    
}