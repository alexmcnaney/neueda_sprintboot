package uk.ac.belfastmet.buildings.service;

import java.util.ArrayList;

import uk.ac.belfastmet.buildings.domain.Footprint;
import uk.ac.belfastmet.buildings.domain.UsableVolume;

public class UsableVolumeService {
	
	public UsableVolumeService(){
		super();
	}
	
	
	public ArrayList<UsableVolume> getuseableVolume() {
	ArrayList<UsableVolume> buildings = new ArrayList<UsableVolume>();
	
	
	UsableVolume namehere = new UsableVolume("1", "New Century Global Center","China","Chengdu","18,900,000 sqft", "ncgc.jpg");
	buildings.add(namehere);
	
	return buildings;
}


}
