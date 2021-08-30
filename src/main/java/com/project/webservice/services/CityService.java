package com.project.webservice.services;

import java.util.List;

import com.project.webservice.entity.City;
import com.project.webservice.request.CityRequest;

public interface CityService {

	String addNewCity(CityRequest cityRequest);

	List<City> viewAllCity();

	String deleteCity(int cityId);

	String deleteAll();

}
