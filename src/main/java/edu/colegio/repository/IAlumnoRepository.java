package edu.colegio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.colegio.entities.Alumno;

@Repository
public interface IAlumnoRepository extends JpaRepository<Alumno, Integer>{
	public List<Alumno> findByApellidos(String apellidos);
	public Alumno findByDni(String dni);
}
