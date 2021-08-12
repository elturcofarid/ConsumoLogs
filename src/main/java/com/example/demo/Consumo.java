package com.example.demo;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Consumo {
	
	
	@GetMapping
	public String consumo() {
		
		Logger log = LoggerFactory.getLogger(Consumo.class);
		log.info("fido este es nuevo");
		log.debug("debud");
		log.error("Error");
		
		return "si hace algo  Otra instancia";
	}

}
