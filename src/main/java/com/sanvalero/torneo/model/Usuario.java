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
	private String contrase�a;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
	
	public Usuario(String nombreUsuario, String contrase�a, String nombre, String apellidos, String direccion,
			String telefono) {
		super();
		this.nombreUsuario = "usuario";
		this.contrase�a = "1234";
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
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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
