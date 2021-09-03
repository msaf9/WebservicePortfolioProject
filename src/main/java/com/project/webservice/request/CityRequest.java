package com.project.webservice.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ApiModel(description = "City Request model")
@Setter
@Getter
@NoArgsConstructor
public class CityRequest {
	
	@ApiModelProperty(notes = "Name of the City", name = "city name", required = true, value = "Boston")
	private String cityName;
	
	@ApiModelProperty(notes = "Description of the City", name = "city Description", required = true, value = "Boston description")
	private String cityDescription;
	
	@ApiModelProperty(notes = "State of the City located", name = "state", required = true, value = "MAS")
	private String state;
	
	@ApiModelProperty(notes = "Country of the State located", name = "country", required = true, value = "USA")
	private String country;
}
