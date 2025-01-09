package fr.iris.jpaRepository;


import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.iris.dto.ComputerDto;
import fr.iris.model.ComputerModele;
 

public interface ComputerRepository extends JpaRepository{



	ComputerModele save(ComputerModele inModele);

	String count();

	Collection<ComputerDto> findAll();

	
}