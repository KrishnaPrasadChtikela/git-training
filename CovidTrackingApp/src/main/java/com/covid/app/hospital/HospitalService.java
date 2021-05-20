package com.covid.app.hospital;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HospitalService {
	
	@Autowired
	HospitalRepository hospitalrepository;
	
	public List<Hospital> getAllHospitals() {
		return hospitalrepository.findAll();
	}

	public Hospital getHospitalById(Integer hospitalId) {
		return hospitalrepository.findById(hospitalId).get();
	}

	public Hospital createHospital(Hospital hospital) {
		return hospitalrepository.save(hospital);
	}

	public void deleteHospital(Integer hospitalId) {
		hospitalrepository.deleteById(hospitalId);
	}

	public Hospital upadteHospital(Integer hospitalId, Hospital hospital) {
		Optional<Hospital> optional = hospitalrepository.findById(hospitalId);
		if(optional.isPresent()) {
			Hospital hospitalObj = optional.get();
			hospitalObj.setName(hospital.getName());
			hospitalObj.setPlace(hospital.getPlace());
			hospitalObj.setNumberofOxygenBeds(hospital.getNumberofOxygenBeds());
			return hospitalrepository.save(hospitalObj);
		}
		return null;
	}

}
