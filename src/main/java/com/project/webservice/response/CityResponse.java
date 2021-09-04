package com.project.webservice.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ApiModel(description = "City Response model")
@Getter
@Setter
@NoArgsConstructor
public class CityResponse {
	
	@ApiModelProperty(notes = "message", name = "message", required = true, value = "Deleted")
	private String message;

}
