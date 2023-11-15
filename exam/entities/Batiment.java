package com.example.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@Entity
public class Batiment  {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private int batimentNo;
private String adresse;
@JsonIgnore
@OneToMany(mappedBy = "batiment")
private Set<Ascenseur> ascenseurs;
public Set<Ascenseur> getAscenseurs() {
	return ascenseurs;
}

public void setAscenseurs(Set<Ascenseur> ascenseurs) {
	this.ascenseurs = ascenseurs;
}

public Set<Escalier> getEscaliers() {
	return escaliers;
}

public void setEscaliers(Set<Escalier> escaliers) {
	this.escaliers = escaliers;
}

public Set<Etage> getEtages() {
	return etages;
}

public void setEtages(Set<Etage> etages) {
	this.etages = etages;
}

@OneToMany(mappedBy = "batiment")
private Set<Escalier> escaliers;
@OneToMany(mappedBy = "batiment")
private Set<Etage> etages;
public Batiment(int batimentNo, String adresse) {
	super();
	this.batimentNo = batimentNo;
	this.adresse = adresse;
}

public Batiment() {
	super();
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getBatimentNo() {
	return batimentNo;
}

public void setBatimentNo(int batimentNo) {
	this.batimentNo = batimentNo;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

@Override
public String toString() {
	return "Batiment [id=" + id + ", batimentNo=" + batimentNo + ", adresse=" + adresse + "]";
}

}
