package fr.iris.services;

import fr.iris.controller.RequestBody;
import fr.iris.dto.ComputerDto;
import fr.iris.jpaRepository.ComputerRepository;
import fr.iris.model.ComputerModele;

@Service
public class ComputerService {
	@Autowired
	private ComputerRepository computerRepository;

	public String getHelloWorld() {
		return "NB Computers : " + computerRepository.count();
	}

	public ComputerModele toModele(ComputerDto dto) {
		ComputerModele modele = new ComputerModele();
		modele.setStatus(dto.getStatus());
		modele.setReleaseDate(dto.getReleaseDate());
		modele.setBrand(dto.getBrand());
		modele.setId(dto.getId());
		modele.setName(dto.getName());
		modele.setSerialNumber(dto.getSerialNumber());
		return modele;
	}

	public ComputerDto toDto(ComputerModele modele) {
		ComputerDto dto = new ComputerDto();
		dto.setStatus(modele.getStatus());
		dto.setReleaseDate(modele.getReleaseDate());
		dto.setBrand(modele.getBrand());
		dto.setId(modele.getId());
		dto.setName(modele.getName());
		dto.setSerialNumber(modele.getSerialNumber());
		return dto;
	}

	public String count() {
		return "NB Computers : " + computerRepository.count();
	}

	public ComputerDto createComputer(@RequestBody ComputerDto computerDto) {
		ComputerModele inModele = toModele(computerDto);
		ComputerModele outModele = computerRepository.save(inModele);
		return toDto(outModele);
	}

}
