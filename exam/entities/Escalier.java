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
public class Escalier  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int etageNo;
	@JsonIgnore
@ManyToOne
private Batiment batiment;
	public Batiment getBatiment() {
	return batiment;
}

public void setBatiment(Batiment batiment) {
	this.batiment = batiment;
}

	@Override
	public String toString() {
		return "Escalier [id=" + id + ", etageNo=" + etageNo + "]";
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

	public Escalier(int etageNo) {
		super();
		this.etageNo = etageNo;
	}

	public Escalier() {
		super();
	}
}
