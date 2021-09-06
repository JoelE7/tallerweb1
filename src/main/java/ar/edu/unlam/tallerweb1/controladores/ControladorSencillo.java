package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("controladorSencillo")
public class ControladorSencillo {

	
	@RequestMapping("/vista")
	public ModelAndView irAVista() {
		ModelMap modelo = new ModelMap();
		modelo.put("mensaje", "este es un mensaje del modelo");
		return new ModelAndView("vistaNueva",modelo);
		
	}
	
	

	
	
	
	
	
	
}
