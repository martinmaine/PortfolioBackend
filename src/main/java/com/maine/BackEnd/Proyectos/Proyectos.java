package com.maine.BackEnd.Proyectos;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // crea los Getter y Setter
@AllArgsConstructor // genera el constructor con todos los argumentos
@NoArgsConstructor // genera el constructor vacío
@Entity

public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Basic
    private String nombre;
    private String descripcion;
    private String urlImg;
    private String enlace;
}
