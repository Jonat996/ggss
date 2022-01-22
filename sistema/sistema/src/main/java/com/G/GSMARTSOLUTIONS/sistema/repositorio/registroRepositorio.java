package com.G.GSMARTSOLUTIONS.sistema.repositorio;

import com.G.GSMARTSOLUTIONS.sistema.modelo.Registro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface registroRepositorio extends CrudRepository<Registro,Long> {
}
