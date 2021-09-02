package com.project.webservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.webservice.entity.City;
import com.project.webservice.repository.CityRepository;
import com.project.webservice.request.CityRequest;
import com.project.webservice.response.CityResponse;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;

	@Override
	public String addNewCity(CityRequest cityRequest) {
		String message = null;
		if (cityRequest != null) {
			City c = new City();
			c.setCityName(cityRequest.getCityName());
			c.setCountry(cityRequest.getCountry());
			c.setState(cityRequest.getState());
			c.setCityDescription(cityRequest.getCityDescription());
			cityRepository.save(c);
			message = "Saved";
		}
		return message;
	}

	@Override
	public List<City> viewAllCity() {
		return (List<City>) cityRepository.findAll();
	}

	@Override
	public String deleteCity(int cityId) {
		String message = null;
		if (cityId <= 0 || cityId > 0) {
			cityRepository.deleteById(cityId);
			message = "Deleted";
		} else {
			message = "Id cannot be null";
		}
		return message;
	}

	@Override
	public String deleteAll() {
		String message = null;
		cityRepository.deleteAll();
		message = "All deleted";
		return message;
	}

	@Override
	public CityResponse editCity(City cityRequest) {
		CityResponse response = new CityResponse();
		City cityUpdate = cityRepository.findById(cityRequest.getCityId()).get();
		cityUpdate.setCityName(cityRequest.getCityName());
		cityUpdate.setCountry(cityRequest.getCountry());
		cityUpdate.setState(cityRequest.getState());
		cityUpdate.setCityDescription(cityRequest.getCityDescription());
		cityRepository.save(cityUpdate);
		response.setMessage("Updated");
		return response;
	}

	@Override
	public City viewCity(int id) {
		City cityView = cityRepository.findById(id).get();
		return cityView;
	}

}
