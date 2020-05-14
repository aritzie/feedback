package com.sanvalero.torneo.model;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

		private String nombreEquipo;
		private String patrocinador;
		private String camisetaPrimera;
		private String camisetaSegunda;
		private String categoria;
		private List<Jugador> jugadores;
		
		public Equipo(String nombreEquipo, String patrocinador, String camisetaPrimera, String camisetaSegunda,
				String categoria) {
			super();
			this.nombreEquipo = nombreEquipo;
			this.patrocinador = patrocinador;
			this.camisetaPrimera = camisetaPrimera;
			this.camisetaSegunda = camisetaSegunda;
			this.categoria = categoria;
			jugadores = new ArrayList<>();
		}

		public String getNombreEquipo() {
			return nombreEquipo;
		}

		public void setNombreEquipo(String nombreEquipo) {
			this.nombreEquipo = nombreEquipo;
		}

		public String getPatrocinador() {
			return patrocinador;
		}

		public void setPatrocinador(String patrocinador) {
			this.patrocinador = patrocinador;
		}

		public String getCamisetaPrimera() {
			return camisetaPrimera;
		}

		public void setCamisetaPrimera(String camisetaPrimera) {
			this.camisetaPrimera = camisetaPrimera;
		}

		public String getCamisetaSegunda() {
			return camisetaSegunda;
		}

		public void setCamisetaSegunda(String camisetaSegunda) {
			this.camisetaSegunda = camisetaSegunda;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public List<Jugador> getJugadores() {
			return jugadores;
		}

		public void setJugadores(List<Jugador> jugadores) {
			this.jugadores = jugadores;
		}
		
		
		
}
