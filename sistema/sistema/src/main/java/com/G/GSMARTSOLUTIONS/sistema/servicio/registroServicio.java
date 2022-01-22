package com.G.GSMARTSOLUTIONS.sistema.servicio;

import com.G.GSMARTSOLUTIONS.sistema.modelo.Registro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class registroServicio {
@Autowired
com.G.GSMARTSOLUTIONS.sistema.repositorio.registroRepositorio registroRepositorio;

public ArrayList<Registro> obtenerRegistros(){
    return (ArrayList<Registro>) registroRepositorio.findAll();
}
public Registro guardarRegistro(Registro registro){
    return registroRepositorio.save(registro);
}
}
