package com.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@JsonSerialize
@Entity
public class Porte  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int porteNo;
	@JsonIgnore
    @ManyToOne
    private Piece piece;
    
	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public Porte() {
		super();
	}

	public Porte(int porteNo) {
		super();
		this.porteNo = porteNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPorteNo() {
		return porteNo;
	}

	public void setPorteNo(int porteNo) {
		this.porteNo = porteNo;
	}

	@Override
	public String toString() {
		return "Porte [id=" + id + ", porteNo=" + porteNo + "]";
	}

}
