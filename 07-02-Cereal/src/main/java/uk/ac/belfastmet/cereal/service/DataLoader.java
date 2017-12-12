package uk.ac.belfastmet.cereal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.belfastmet.cereal.repository.CerealRepository;




@Service
public class DataLoader {

	@Autowired
 CerealRepository  cerealRepository;


	public DataLoader(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}



	public void loadData() {
		
	
	}
	
	
}
