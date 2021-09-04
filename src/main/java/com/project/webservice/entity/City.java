package com.project.webservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ApiModel(description = "City Entity model")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class City {

	@ApiModelProperty(notes = "City id", name = "city id", required = true, value = "1")
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int cityId;
	
	@ApiModelProperty(notes = "Name of the City", name = "city name", required = true, value = "Boston")
	private String cityName;
	
	@ApiModelProperty(notes = "Description of the City", name = "city Description", required = true, value = "Boston description")
	private String cityDescription;
	
	@ApiModelProperty(notes = "State of the City located", name = "state", required = true, value = "MAS")
	private String state;
	
	@ApiModelProperty(notes = "Country of the State located", name = "country", required = true, value = "USA")
	private String country;

}
