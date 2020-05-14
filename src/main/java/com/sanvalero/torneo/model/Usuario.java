/**
 * 
 */
package com.sanvalero.torneo.model;

/**
 * @author aritz
 *
 */
public class Usuario {
	
	private String nombreUsuario;
	private String contraseña;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
	
	public Usuario(String nombreUsuario, String contraseña, String nombre, String apellidos, String direccion,
			String telefono) {
		super();
		this.nombreUsuario = "usuario";
		this.contraseña = "1234";
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public Usuario() {
		super();
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
