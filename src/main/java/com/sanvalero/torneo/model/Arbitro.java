package com.sanvalero.torneo.model;

public class Arbitro extends Usuario {
	private String numeroArbitro;

	public Arbitro(String nombreUsuario, String contraseña, String nombre, String apellidos, String direccion,
			String telefono, String numeroArbitro) {
		super(nombreUsuario, contraseña, nombre, apellidos, direccion, telefono);
		this.numeroArbitro = numeroArbitro;
	}

	public String getNumeroArbitro() {
		return numeroArbitro;
	}

	public void setNumeroArbitro(String numeroArbitro) {
		this.numeroArbitro = numeroArbitro;
	}
	
	
}
