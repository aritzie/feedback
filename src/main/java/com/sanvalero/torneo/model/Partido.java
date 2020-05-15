package com.sanvalero.torneo.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Partido {
	
	private LocalDate fecha = null;
	private LocalTime hora = null;
	private String resultado = " ";
	private String observaciones =" ";
	private Arbitro arbitro = null;
	private Campo campo = null;
	private Equipo equipo1 = null;
	private Equipo equipo2 = null;
	
	public Partido(LocalDate fecha, LocalTime hora, String resultado, String observaciones, Arbitro arbitro,
			Campo campo, Equipo equipo1, Equipo equipo2) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.resultado = resultado;
		this.observaciones = observaciones;
		this.arbitro = arbitro;
		this.campo = campo;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}
	
	public Partido() {
		super();
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



	public Equipo getEquipo1() {
		return equipo1;
	}



	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}



	public Equipo getEquipo2() {
		return equipo2;
	}



	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	
	
}
