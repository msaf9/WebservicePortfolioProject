package com.project.webservice.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CityRequest {
	
	private String cityName;
	private String cityDescription;
	private String state;
	private String country;
}
