package com.covid.app.hospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospitals")
public class HospitalController {

	@Autowired
	HospitalService hospitalservice;

	@GetMapping
	public List<Hospital> getAllHospitals() {
		return hospitalservice.getAllHospitals();
	}
	
	@GetMapping("/{hospitalId}")
	public Hospital getHospital(@PathVariable Integer hospitalId) {
		return hospitalservice.getHospitalById(hospitalId);
	}
	
	@PostMapping
	public Hospital createHospital(@RequestBody Hospital hospital) {
		return hospitalservice.createHospital(hospital);
	}
	
	@DeleteMapping("/{hospitalId}")
	public void deleteHospital(@PathVariable Integer hospitalId) {
		hospitalservice.deleteHospital(hospitalId);
	}
	
	@PutMapping("/{hospitalId}")
	public Hospital updateHospital(@PathVariable Integer hospitalId, @RequestBody Hospital hospital) {
		return hospitalservice.upadteHospital(hospitalId,hospital);
	}

}
