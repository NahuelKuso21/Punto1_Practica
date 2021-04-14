package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.controller.CalculadoraController;

@SpringBootApplication
public class Punto1PracticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Punto1PracticaApplication.class, args);
		CalculadoraController controlador1 = new CalculadoraController();
		controlador1.operaciones();
	}

}
