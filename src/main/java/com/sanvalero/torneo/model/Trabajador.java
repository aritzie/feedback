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
	
	
	public void resgistrarJugador() {
		Scanner sc = new Scanner(System.in);
		Jugador nuevoJugador = new Jugador();
		System.out.println("Introduce el nombre del jugador: ");
		nuevoJugador.setNombre(sc.nextLine());
		System.out.println("Introduce los apellidos del jugador: ");
		nuevoJugador.setApellidos(sc.nextLine());
		System.out.println("Introduce la direccion del jugador: ");
		nuevoJugador.setDireccion(sc.nextLine());
		System.out.println("Introduce el telefono del jugador: ");
		nuevoJugador.setTelefono(sc.nextLine());
		System.out.println("Introduce el nº de ficha del jugador: ");
		nuevoJugador.setNumeroFicha(sc.nextLine());
		
	}
	
	public void resgistrarEquipo() {
		Scanner sc = new Scanner(System.in);
		Equipo nuevoEquipo = new Equipo();
		System.out.println("Introduce el nombre del equipo: ");
		nuevoEquipo.setNombreEquipo(sc.nextLine());
		System.out.println("Introduce el nombre del patrocinador: ");
		nuevoEquipo.setPatrocinador(sc.nextLine());
		System.out.println("Introduce el color de la primera equipación: ");
		nuevoEquipo.setCamisetaPrimera(sc.nextLine());
		System.out.println("Introduce el color de la segunda equipación: ");
		nuevoEquipo.setCamisetaSegunda(sc.nextLine());
		System.out.println("Introduce la categoría: ");
		nuevoEquipo.setCategoria(sc.nextLine());
	}
	
	public void registrarPartido() {
		Partido nuevoPartido = new Partido();
	}
	
	public void registrarResultado(Partido partido) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el resultado: ");
		partido.setResultado(sc.nextLine());
	}
	
	public void añadirObservacion(Partido partido) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el resultado: ");
		partido.setObservaciones(sc.nextLine());
	}
}
