package com.maine.BackEnd.Proyectos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProyectosRepository extends JpaRepository<Proyectos, Integer> {

}
