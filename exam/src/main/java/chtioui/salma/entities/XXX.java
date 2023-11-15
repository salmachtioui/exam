package chtioui.salma.entities;

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

public class XXX  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@JsonIgnore
  //  @ManyToOne
    //private Batiment batiment ;
	//public Batiment getBatiment() {
	//return batiment;
//}

//public void setBatiment(Batiment batiment) {
	//this.batiment = batiment;
//}

	public XXX() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

}
