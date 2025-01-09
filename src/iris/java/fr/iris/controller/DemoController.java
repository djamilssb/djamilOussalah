package fr.iris.controller;

import fr.iris.dto.ComputerDto;
import fr.iris.services.ComputerService;

@RestController()
@RequestMapping("iris")
public class DemoController {
	
	@Autowired
	private ComputerService computerService;

	@GetMapping()
	public String getHelloWorld() {
		return computerService.getHelloWorld();
	}
	
	@PostMapping()

	public ComputerDto createComputer(@RequestBody ComputerDto computerDto) {
		return computerService.createComputer(computerDto);
	}

}
