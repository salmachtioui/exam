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
public class Piece  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int pieceNo;
	private int nbOccupants;
	@JsonIgnore
   @ManyToOne
   private Etage etage ;
  
   public Set<Porte> getPortes() {
	return porte;
}

public void setPortes(Set<Porte> porte) {
	this.porte = porte;
}
@JsonIgnore
@OneToMany(mappedBy = "piece")
   private Set<Porte> porte;
@JsonIgnore
@OneToMany (mappedBy = "piece")

	private Set<Piece> pieces;
@ManyToOne
private Piece piece ;

	public Piece getPiece() {
	return piece;
}

public void setPiece(Piece piece) {
	this.piece = piece;
}

	public Set<Piece> getPieces() {
	return pieces;
}

public void setPieces(Set<Piece> pieces) {
	this.pieces = pieces;
}

	public Etage getEtage() {
		return etage;
	}

	public void setEtage(Etage etage) {
		this.etage = etage;
	}

	

	
	
	public Piece(int pieceNo, int nbOccupants, int nbFenetres) {
		super();
		this.pieceNo = pieceNo;
		this.nbOccupants = nbOccupants;
		this.nbFenetres = nbFenetres;
	}

	@Override
	public String toString() {
		return "Piece [id=" + id + ", pieceNo=" + pieceNo + ", nbOccupants=" + nbOccupants + ", nbFenetres="
				+ nbFenetres + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPieceNo() {
		return pieceNo;
	}

	public void setPieceNo(int pieceNo) {
		this.pieceNo = pieceNo;
	}

	public int getNbOccupants() {
		return nbOccupants;
	}

	public void setNbOccupants(int nbOccupants) {
		this.nbOccupants = nbOccupants;
	}

	public int getNbFenetres() {
		return nbFenetres;
	}

	public void setNbFenetres(int nbFenetres) {
		this.nbFenetres = nbFenetres;
	}

	public Piece() {
		super();
	}

	private int nbFenetres;
}
