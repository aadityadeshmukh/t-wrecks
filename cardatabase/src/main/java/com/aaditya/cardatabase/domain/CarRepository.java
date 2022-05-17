package com.aaditya.cardatabase.domain;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car,Long> {
	public Iterable<Car> findAll();
}
