package com.example.demo.microserviciu.cursuri;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cursuri {
	

	
	@Id
	@Column(name="nume")
	private String nume;
	@Column(name="descriere")
	private String descriere;
	@Column(name="nota")
	private int nota;
	
	public Cursuri() { 
		
	}
	
	public Cursuri(String nume, String descriere, int nota) {
		super();
		this.nume = nume;
		this.descriere = descriere;
		this.nota = nota;
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getDescriere() {
		return descriere;
	}
	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}


	
	
}
