package com.maine.BackEnd.Experiencia;

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

public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    private String puesto;
    private String descripcion;
}
