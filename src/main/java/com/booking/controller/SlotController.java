package com.booking.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="/slot")
public class SlotController {
	
	
	@RequestMapping(value="/sample")
	@ResponseBody
	public String sample() {
		
		return "Sample!";
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Map<String, Object>> Createsection(@RequestBody String data)
			throws IOException, ParseException {
		System.out.println("insert-as service is Calling !.");
//		AsData estimate = new AsData();
//		try {
//			estimate = new ObjectMapper().readValue(data, AsData.class);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("entered");
		// AsData fecthed = asdataRepo.save(estimate);
		System.out.println("Checking sewer  method");

		// map.put("Data", fecthed);
		map.put("message", "AS-Data Created Successfully. !.");
		map.put("status", true);
		return ResponseEntity.ok().body(map);
	}

	@RequestMapping(value = "/find-by-division", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Map<String, Object>> findbydivision(@RequestParam long id)
			throws IOException, ParseException {
		System.out.println("find-all-estimates  Service is Calling !!!!");
		// List<AsData> fecthed = asdataRepo.findbydivisionId(id);
		Map<String, Object> map = new HashMap<String, Object>();
		// map.put("Data", fecthed);
		map.put("message", "Successfully Retrieved data");
		map.put("status", true);
		return ResponseEntity.ok().body(map);
	}

}
