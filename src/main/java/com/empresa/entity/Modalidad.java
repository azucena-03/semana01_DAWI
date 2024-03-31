package com.empresa.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name =  "modalidad")
public class Modalidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idModalidad;
	private String nombre;
	private int numMujeres;
	private int numHombres;
	private int edadMaxima;
	private int edadMinima;
	private String sede;
	
	@ManyToOne
	@JoinColumn(name = "idDeporte")
	private Deporte deporte;
	
	private int estado;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRegistro;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaActualizacion;
	
}