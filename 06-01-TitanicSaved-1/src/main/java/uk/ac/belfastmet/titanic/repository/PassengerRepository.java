package uk.ac.belfastmet.titanic.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanic.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

	Iterable<Passenger> findByOrderByName();	
	

	Iterable<Passenger> findBySurvived(Integer integer);	
	Iterable<Passenger> findByParch(Integer integer);	

}
