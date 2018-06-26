package publisherservice.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import publisherservice.service.CityService;


@Controller
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	private final Logger logger = LoggerFactory.getLogger(CityController.class);
	
	@RequestMapping("/{cityName}")
	   public String rediretionToCitiesList(@PathVariable("cityName") String cityName) {
		
	      return "redirect:/cities/{cityName}";
	   }
	
	@RequestMapping(value = "/cities/{cityName}", method = RequestMethod.GET)
	public String listAllCities(Model model, @PathVariable("cityName") String cityName) throws IOException {
		logger.debug("listAllCities()");
		model.addAttribute("cities", cityService.getAllCities(cityName));
		return "cityinfo";

	}

}
