package com.example.Springboot_Crud_Opreation;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
public interface PasangerRepository extends JpaRepository<Pasanger,Integer>
{
	
List<Pasanger>findByName(String name);
List<Pasanger>findByCity(String city);
List<Pasanger>findByBirthNumber(int birthNumber);
}
