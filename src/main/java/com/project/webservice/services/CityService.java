package com.project.webservice.services;

import java.util.List;

import com.project.webservice.entity.City;
import com.project.webservice.request.CityRequest;
import com.project.webservice.response.CityResponse;

public interface CityService {

	String addNewCity(CityRequest cityRequest);

	List<City> viewAllCity();

	String deleteCity(int cityId);

	String deleteAll();

	CityResponse editCity(City cityRequest);

	City viewCity(int id);

}
