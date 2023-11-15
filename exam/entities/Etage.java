package com.example.entities;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@JsonSerialize
@Entity
public class Etage  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int etageNo;
	@JsonIgnore
@ManyToOne
private Batiment batiment;
	@JsonIgnore
@OneToMany(mappedBy = "etage")
private Set<Piece> pieces;
	public Set<Piece> getPieces() {
	return pieces;
}

public void setPieces(Set<Piece> pieces) {
	this.pieces = pieces;
}

	public Batiment getBatiment() {
	return batiment;
}

public void setBatiment(Batiment batiment) {
	this.batiment = batiment;
}

	@Override
	public String toString() {
		return "Etage [id=" + id + ", etageNo=" + etageNo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEtageNo() {
		return etageNo;
	}

	public void setEtageNo(int etageNo) {
		this.etageNo = etageNo;
	}

	public Etage(int etageNo) {
		super();
		this.etageNo = etageNo;
	}

	public Etage() {
		super();
	}
}
