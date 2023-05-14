package com.maine.BackEnd.Preparacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PreparacionRepository extends JpaRepository<Preparacion, Integer> {

}
