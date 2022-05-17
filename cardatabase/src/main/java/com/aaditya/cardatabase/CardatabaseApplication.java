package com.aaditya.cardatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aaditya.cardatabase.domain.Car;
import com.aaditya.cardatabase.domain.CarRepository;
import com.aaditya.cardatabase.domain.Owner;
import com.aaditya.cardatabase.domain.OwnerRepository;

@SpringBootApplication
public class CardatabaseApplication {
	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);
	@Autowired
	private CarRepository repository; 
	@Autowired
	private OwnerRepository ownerRepo;
	public static void main(String[] args) {
		//testing auto reload again
	
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("X marks the spot");
	}
	@Bean
	
	CommandLineRunner runner() {
		return args ->{
			logger.info("Finding the treasure.");
			Owner own1 = new Owner("Aditya", "Deshmukh");
			Owner own2 = new Owner("John", "Doe");
			
			ownerRepo.save(own1);
			ownerRepo.save(own2);
			repository.save(new Car("Honda", "Jazz", "Red", "MH12TK1234", 2021, 5000, own1));
			repository.save(new Car("Maruti", "Baleno", "Blue", "MH12FJ4321", 2020, 4800, own2));
			repository.save(new Car("Renault", "Kiger", "Silver", "MH12GJ1234", 2021, 5100, own2));
			repository.save(new Car("Honda", "Jazz", "Brown", "MH12TK1243", 2021, 5000, own2));
		};
	}

}
