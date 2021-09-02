package com.project.webservice.endpoints;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.webservice.entity.City;
import com.project.webservice.request.CityRequest;
import com.project.webservice.services.CityService;

@RestController
@RequestMapping(path = "/city")
public class CityEndpointV1 {

	@Autowired
	private CityService cityService;

	@PostMapping(path = "/add")
	public String addNewCity(@RequestBody CityRequest cityRequest) {
		return cityService.addNewCity(cityRequest);
	}

	@GetMapping(path = "/all")
	public List<City> viewAllCity() {
		return cityService.viewAllCity();
	}

	@DeleteMapping(path = "delete")
	public String deleteCity(int cityId) {
		return cityService.deleteCity(cityId);
	}

	@DeleteMapping(path = "/deleteAll" )
	public String deleteAll() {
		return cityService.deleteAll();
	}
	
	@PutMapping(path = "/update")
	public String editCity(@RequestBody City cityRequest) {
		return cityService.editCity(cityRequest);
	}
	
	@GetMapping(path = "/city/{id}")
	public City viewCity(int id) {
		return cityService.viewCity(id);
	}
}
