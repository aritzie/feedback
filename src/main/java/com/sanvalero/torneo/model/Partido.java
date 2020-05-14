package com.sanvalero.torneo.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Partido {
	
	private LocalDate fecha;
	private LocalTime hora;
	private String resultado;
	private String observaciones;
	private Arbitro arbitro;
	private Campo campo;
	
	public Partido(LocalDate fecha, LocalTime hora, String resultado, String observaciones, Arbitro arbitro,
			Campo campo) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.resultado = resultado;
		this.observaciones = observaciones;
		this.arbitro = arbitro;
		this.campo = campo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Arbitro getArbitro() {
		return arbitro;
	}

	public void setArbitro(Arbitro arbitro) {
		this.arbitro = arbitro;
	}

	public Campo getCampo() {
		return campo;
	}

	public void setCampo(Campo campo) {
		this.campo = campo;
	}
	
}
