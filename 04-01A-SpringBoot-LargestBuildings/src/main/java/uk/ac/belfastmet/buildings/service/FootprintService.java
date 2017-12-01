package uk.ac.belfastmet.buildings.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.buildings.domain.FloorArea;
import uk.ac.belfastmet.buildings.domain.Footprint;


public class FootprintService {
	
	public FootprintService(){
		super();
	}
	
	
	public ArrayList<Footprint> getfootprint() {
	ArrayList<Footprint> buildings = new ArrayList<Footprint>();
	
	
	Footprint namehere = new Footprint("1", "New Century Global Center","China","Chengdu","18,900,000 sqft", "ncgc.jpg");
	buildings.add(namehere);
	
	return buildings;
}

}