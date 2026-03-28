package com.example.ioc_eac2_web.servidor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

	@GetMapping("/")
	public String index() {
		return "<html><body>" + "<h1>Dobla el valor </h1>" + "<form action=\"/dobla\" method=\"GET\">"
				+ "<h3>Introdueix l'enter</h3>" + "<input type=\"text\" name=\"enter\"/>" + "</form>"
				+ "</body></html>";
	}

	@GetMapping("/dobla")
	public String resultat(String enter) {// public String resultat(@RequestParam("enter") String enter)
		try {
			int result = Integer.parseInt(enter) * 2;
			return "<html><body>" + "<h1>Dobla el valor </h1>" + "<strong>Resultat: " + result
					+ "</strong></body></html>";
		} catch (NumberFormatException e) {
			return "<html><body>" + "<h1>El valor introdu&iuml;t no &eacute;s un enter</h1>" + "</body></html>";
		}

	}

}
