package com.G.GSMARTSOLUTIONS.sistema.controlador;

import com.G.GSMARTSOLUTIONS.sistema.modelo.Registro;
import com.G.GSMARTSOLUTIONS.sistema.servicio.registroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/registro")
public class registroControlador  {
@Autowired
    registroServicio registroService;

@GetMapping("/all")
    public ArrayList<Registro> obtenerRegistro(){
    return registroService.obtenerRegistros();
}
@PostMapping("/send")
    public Registro guardarRegistro(@RequestBody Registro registro){
    return this.registroService.guardarRegistro(registro);
}
}
