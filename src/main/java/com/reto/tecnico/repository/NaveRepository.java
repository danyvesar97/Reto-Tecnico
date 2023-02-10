package com.reto.tecnico.repository;
import static com.reto.tecnico.util.Constantes.CONSULTA_GENERAL;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reto.tecnico.entities.Nave;

public interface NaveRepository extends JpaRepository<Nave, Long>{
	@Query(CONSULTA_GENERAL)
	public List<Nave> findAll(String palabraClave);
}
