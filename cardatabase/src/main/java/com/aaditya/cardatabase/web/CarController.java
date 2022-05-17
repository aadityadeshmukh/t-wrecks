package com.aaditya.cardatabase.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aaditya.cardatabase.domain.Car;
import com.aaditya.cardatabase.domain.CarRepository;

@RestController
public class CarController {
	@Autowired
	private CarRepository carRepo;
	@RequestMapping("/cars")
	public Iterable<Car> getCars(){
		return carRepo.findAll();
	}
}
