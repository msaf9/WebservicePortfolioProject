package com.project.webservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int cityId;
	
	private String cityName;
	private String cityDescription;
	private String state;
	private String country;

}
