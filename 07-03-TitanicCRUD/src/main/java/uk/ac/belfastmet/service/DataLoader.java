package uk.ac.belfastmet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.titanic.repository.PassengerRepository;



@Service
public class DataLoader {

	@Autowired
 PassengerRepository  passengerRepository;


	public DataLoader(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}



	public void loadData() {
		
	
	}
	
	
}
