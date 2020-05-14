package com.sanvalero.torneo.model;

public class Arbitro extends Usuario {
	private String numeroArbitro;

	public Arbitro(String nombreUsuario, String contrase�a, String nombre, String apellidos, String direccion,
			String telefono, String numeroArbitro) {
		super(nombreUsuario, contrase�a, nombre, apellidos, direccion, telefono);
		this.numeroArbitro = numeroArbitro;
	}

	public String getNumeroArbitro() {
		return numeroArbitro;
	}

	public void setNumeroArbitro(String numeroArbitro) {
		this.numeroArbitro = numeroArbitro;
	}
	
	
}
