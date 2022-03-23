package com.project.webservice.endpoints;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.webservice.entity.City;
import com.project.webservice.repository.CityRepository;
import com.project.webservice.request.CityRequest;
import com.project.webservice.response.CityResponse;
import com.project.webservice.services.CityService;
import com.project.webservice.services.CityServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TestCityEndpointV1 {

	@InjectMocks
	public CityEndpointV1 cityEndpointV1;

//	@Mock
//	public CityService cityService;

	@Mock
	public CityRepository cityRepository;

	@Mock
	CityServiceImpl cityServiceImpl;

	@Test
	public void testAddNewCity() {
		CityRequest cityRequest = new CityRequest();
		cityRequest.setCityName("Boston");
		cityRequest.setState("Mas");
		cityRequest.setCountry("USA");
		cityRequest.setCityDescription("Some Boston description");
		CityResponse cityResponse = new CityResponse();
		cityResponse.setMessage("Saved");
		City c = new City();
//		when(cityService.addNewCity(cityRequest)).thenReturn(cityResponse);
		when(cityServiceImpl.addNewCity(cityRequest)).thenReturn(cityResponse);
		when(cityRepository.save(c)).thenReturn(c);
		assertEquals("Saved", cityResponse.getMessage());
	}
}
