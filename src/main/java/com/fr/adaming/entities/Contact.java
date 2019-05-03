package com.fr.adaming.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Contact implements Serializable{

	@Id @GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String email;
	private String tel;
	private String imageUrl;
}
