package com.G.GSMARTSOLUTIONS.sistema.modelo;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "registroequipos")
@ToString
@EqualsAndHashCode
public class Registro {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    @javax.persistence.Id
    private long Id;
    @Getter @Setter @Column(name = "nombre")
    private String Nombre;
    @Getter @Setter @Column(name = "tipo")
    private String Tipo;
    @Getter @Setter @Column(name = "descripcion")
    private String Descripcion;
    @Getter @Setter @Column(name = "fecha")
    private Date FechaIngreso;
    @Getter @Setter @Column(name = "numero")
    private int Numero;
    @Getter @Setter @Column(name = "detalle")
    private String Detalle;
    @Getter @Setter @Column(name = "estado")
    private String Estado;
}
