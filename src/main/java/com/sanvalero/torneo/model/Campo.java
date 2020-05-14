package com.sanvalero.torneo.model;

public class Campo {
	private String nombreCampo;
	private String direccionCampo;
	
	public Campo(String nombreCampo, String direccionCampo) {
		super();
		this.nombreCampo = nombreCampo;
		this.direccionCampo = direccionCampo;
	}
	public String getNombreCampo() {
		return nombreCampo;
	}
	public void setNombreCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}
	public String getDireccionCampo() {
		return direccionCampo;
	}
	public void setDireccionCampo(String direccionCampo) {
		this.direccionCampo = direccionCampo;
	}
	
	
}
