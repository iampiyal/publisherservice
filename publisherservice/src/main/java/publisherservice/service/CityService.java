package publisherservice.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import publisherservice.model.City;

@Service
public interface CityService {
	
	public List<City> getAllCities(String cityName) throws IOException;

}
