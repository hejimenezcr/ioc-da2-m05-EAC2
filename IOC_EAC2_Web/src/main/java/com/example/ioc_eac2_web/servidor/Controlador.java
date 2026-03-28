package com.example.ioc_eac2_web.servidor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

	@GetMapping("/")
	public String index() {
		return "<html><body>" 
                + "<h1>El quintuple del valor</h1>"
                + "<p>DNI 47902221Y</p>"
                + "<form action=\"/quintuple\" method=\"GET\">"
                + "<h3>Introdueix l'enter</h3>" 
                + "<input type=\"text\" name=\"enter\"/>" 
                + "<input type=\"submit\" value=\"Calcular\"/>" // He añadido el botón de enviar
                + "</form>"
                + "</body></html>";
	}

	@GetMapping("/quintuple")
	// Añadimos @RequestParam para vincular el input "enter" del formulario con la variable
    public String resultat(@RequestParam(name = "enter", required = false) String enter) {
        if (enter == null || enter.trim().isEmpty()) {
            return "<html><body><h1>Error: No s'ha introduït cap valor</h1><a href='/'>Tornar</a></body></html>";
        }
        
        try {
            int result = Integer.parseInt(enter) * 5;
            return "<html><body>" 
                    + "<h1>El quintuple del valor</h1>" 
                    + "<p>DNI 47902221Y</p>"
                    + "<strong>Resultat: " + result + "</strong>"
                    + "<br><br><a href='/'>Tornar enrere</a>"
                    + "</body></html>";
        } catch (NumberFormatException e) {
            return "<html><body>" 
                    + "<h1>El valor introduït no és un enter</h1>" 
                    + "<p>DNI 47902221Y</p>"
                    + "<a href='/'>Tornar a intentar</a>"
                    + "</body></html>";
        }
    }

}
