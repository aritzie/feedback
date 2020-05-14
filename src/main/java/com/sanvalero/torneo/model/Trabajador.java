package com.sanvalero.torneo.model;

import java.util.Scanner;

import com.sanvalero.torneo.model.*;

public class Trabajador extends Usuario{
	private String numeroSeguridadSocial;
	private int antiguedad;
	Scanner sc = new Scanner(System.in);
	
	public Trabajador(String nombreUsuario, String contraseña, String nombre, String apellidos, String direccion,
			String telefono, String numeroSeguridadSocial, int antiguedad) {
		super(nombreUsuario, contraseña, nombre, apellidos, direccion, telefono);
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.antiguedad = antiguedad;
	}

	public String getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public void registrarCampo() {
		Campo registroCampo = new Campo(sc.nextLine(),sc.nextLine());
	}
	
	/*public void resgistrarJugador () {
		Jugador registroJugador = new Jugador();
	}
	
	/**public void resgistrarEquipo {
		
	}
	
	public void registrarPartido {
		
	}
	
	public void registrarResultado {
		
	}
	
	public void añadirObservacio {
		
	}**/
}
