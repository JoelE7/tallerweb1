package ar.edu.unlam.tallerweb1.controladoresTest;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.controladores.ControladorSencillo;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;

public class ControladorTest {

	ControladorSencillo controlador;

	ModelAndView mav;

	Integer alla = 0;
	@Before
	public void init() {
		controlador = new ControladorSencillo();
	}

	@Test
	public void queCuandoHagaClickMeLleveAOtraVistaDistinta() {

		mav = whenHagoClickEnIrAPagina();
		thenMeLlevaAUnaVistaDistinta();

	}

	private ModelAndView whenHagoClickEnIrAPagina() {
		return controlador.irAVista();

	}

	private void thenMeLlevaAUnaVistaDistinta() {
		assertThat(mav.getViewName()).isEqualTo("vistaNueva");

	}

}
