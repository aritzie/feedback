package com.sanvalero.torneo.model;

import java.util.ArrayList;
import java.util.List;

public class Calendario {
	
	
	private List<Partido> partidos;

	public Calendario() {
		super();
		partidos = new ArrayList<>();
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
	
	
}
