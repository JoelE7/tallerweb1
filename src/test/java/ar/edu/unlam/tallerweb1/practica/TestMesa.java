package ar.edu.unlam.tallerweb1.practica;

import org.junit.Test;

import ar.edu.unlam.tallerweb1.modelo.Mesa;

import static org.assertj.core.api.Assertions.*;


public class TestMesa {

	
	@Test
	public void queSePuedaCrearUnaMesaYseLeAsigneUnId() {
		
		//si existe 
		Mesa mesa = givenCreaUnaMesaConCapacidadPorDefecto();
		
		//entonces 
	//	System.out.println("mesa test1: " + mesa.getIdMesa());
		thenSeleAsignaUnIdAutomatico(mesa.getIdMesa());
	}
	
	@Test
	public void queCuandoUnaMesaSeCreeSeEncuentreDesocupada() {
		
		Mesa mesa = givenCreaUnaMesaConCapacidadPorDefecto();

		Boolean estaOcupada = whenConsultoSuEstado(mesa);
		
		thenEstaLibre(estaOcupada);
		//System.out.println("mesa test2: " + mesa.getIdMesa());
		
		
	}
	
	@Test 
	public void queCuandoSeCreeUnaMesaLosNumerosDeOcupantesSeanCero() {
		
		Mesa mesa = givenCreaUnaMesaConCapacidadPorDefecto();
		
		Integer ocupantes = whenConsultoLaCantidadDeOcupantes(mesa);
		
		thenLaCantidadEsCero(ocupantes);
		System.out.println("mesa test3: " + mesa.getIdMesa());

	
		
	}
	
	@Test 
	public void queCuandoSeCreeUnaMesaSePuedaDecidirLaCapacidadDeOcupantesSinoPorDefectoQueSea4() {
		
		//dada cierta cosa
		Mesa mesa = givenCreaUnaMesaConCapacidadPorDefecto();
		Mesa mesa2 = givenCreoUnaMesaConCapacidadPasada();

		//when 
		Integer capacidadMaximaPorDefecto= whenConsultoLaCapacidadMaxima(mesa);
		
		//
		thenLaCapacidaMaximaPorDefectoEs4(capacidadMaximaPorDefecto);
	}

	
	
	private Mesa givenCreoUnaMesaConCapacidadPasada() {
		return new Mesa(8);
	}

	private Integer whenConsultoLaCapacidadMaxima(Mesa mesa) {
		return mesa.getCapacidad();
	}

	private void thenLaCapacidaMaximaPorDefectoEs4(Integer capacidadMaxima) {
		assertThat(capacidadMaxima).isEqualTo(4);
		
	}

	private Integer whenConsultoLaCantidadDeOcupantes(Mesa mesaAConsultar) {
		return mesaAConsultar.getCantidadOcupantes();
	}

	private void thenLaCantidadEsCero(Integer ocupantes) {
		assertThat(ocupantes).isEqualTo(0);
		
	}

	private Boolean whenConsultoSuEstado(Mesa mesa) {
		return mesa.getOcupado();
		
	}
	
	private void thenEstaLibre(Boolean estaOcupada) {
		assertThat(estaOcupada).isFalse();
		
	}

	private Mesa givenCreaUnaMesaConCapacidadPorDefecto() {
		return new Mesa();
		
	}

	private void thenSeleAsignaUnIdAutomatico(Integer id_mesa) {
		assertThat(id_mesa).isEqualTo(1);
		
	}
	
	
	
}
