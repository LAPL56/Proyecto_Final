package com.registro_estudiantes.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.registro_estudiantes.model.Country;
@Service
public interface CountryRepository extends JpaRepository<Country,Long> {

}
