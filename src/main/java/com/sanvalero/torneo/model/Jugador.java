package com.sanvalero.torneo.model;

import java.time.LocalDate;

public class Jugador extends Usuario {
	
	private String numeroFicha;
	private LocalDate fechaNacimiento;
	private int goles;
	private int tarjetasRojas;
	private int tarjetasAmarillas;
	private Equipo equipo;
	
	public Jugador(String nombreUsuario, String contraseña, String nombre, String apellidos, String direccion,
			String telefono, String numeroFicha, LocalDate fechaNacimiento, int goles, int tarjetasRojas,
			int tarjetasAmarillas, Equipo equipo) {
		super(nombreUsuario, contraseña, nombre, apellidos, direccion, telefono);
		this.numeroFicha = numeroFicha;
		this.fechaNacimiento = fechaNacimiento;
		this.goles = goles;
		this.tarjetasRojas = tarjetasRojas;
		this.tarjetasAmarillas = tarjetasAmarillas;
		this.equipo = equipo;
	}

	public String getNumeroFicha() {
		return numeroFicha;
	}

	public void setNumeroFicha(String numeroFicha) {
		this.numeroFicha = numeroFicha;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public int getTarjetasRojas() {
		return tarjetasRojas;
	}

	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}

	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}

	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
}
