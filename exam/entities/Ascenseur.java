package com.example.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@JsonSerialize
@Entity
public class Ascenseur  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int ascenseurNo;
	@JsonIgnore
@ManyToOne
private Batiment batiment ;
	public Batiment getBatiment() {
	return batiment;
}

public void setBatiment(Batiment batiment) {
	this.batiment = batiment;
}

	public Ascenseur() {
		super();
	}

	@Override
	public String toString() {
		return "Ascenseur [id=" + id + ", ascenseurNo=" + ascenseurNo + "]";
	}

	public Ascenseur(int ascenseurNo) {
		super();
		this.ascenseurNo = ascenseurNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAscenseurNo() {
		return ascenseurNo;
	}

	public void setAscenseurNo(int ascenseurNo) {
		this.ascenseurNo = ascenseurNo;
	}

}
