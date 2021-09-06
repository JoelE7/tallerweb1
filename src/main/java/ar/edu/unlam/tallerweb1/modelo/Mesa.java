package ar.edu.unlam.tallerweb1.modelo;

public class Mesa {

	private static Integer id_generado = 0;
	private Integer idMesa;
	private Boolean ocupado;
	private Integer cantidadOcupantes;
	private Integer capacidad;

	
	public Mesa() {
		this.idMesa = ++Mesa.id_generado;
		this.ocupado = false;
		this.cantidadOcupantes = 0;
		this.capacidad = 4;
	}

	public Mesa(int cap) {
		// TODO Auto-generated constructor stub
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public Integer getCantidadOcupantes() {
		return cantidadOcupantes;
	}

	public void setCantidadOcupantes(Integer cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	public Boolean getOcupado() {
		return ocupado;
	}

	public void setOcupado(Boolean ocupado) {
		this.ocupado = ocupado;
	}

	public Integer getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(Integer idMesa) {
		this.idMesa = idMesa;
	}

}
