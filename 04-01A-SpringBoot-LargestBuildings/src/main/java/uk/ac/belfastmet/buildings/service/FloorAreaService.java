package uk.ac.belfastmet.buildings.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.buildings.domain.FloorArea;

@Service
public class FloorAreaService {

	public FloorAreaService() {
		super();
		}
	
	public ArrayList<FloorArea> getfloorArea() {
		ArrayList<FloorArea> buildings = new ArrayList<FloorArea>();
		
		FloorArea ncgc = new FloorArea("1", "New Century Global Center","China","Chengdu","18,900,000 sqft", "ncgc.jpg");
		buildings.add(ncgc);
		FloorArea diat3 = new FloorArea("2", "Dubai International Airport Terminal 3","United Arab Emirates","Dubai","18,440,000 sqft", "diat.jpg");
		buildings.add(diat3);
		FloorArea ajb = new FloorArea("3", "Abraj Al-Bait","Saudi Arabia","Mecca","16,961,930 sqft", "aab.jpg");
		buildings.add(ajb);
		FloorArea cw = new FloorArea("4", "	CentralWorld","Thailand","Bangkok","11,020,000sqft", "cw.jpg");
		buildings.add(cw);
		FloorArea afa = new FloorArea("5", "Aalsmeer Flower Auction","Netherlands","Aalsmeer","10,700,000 sqft", "afa.jpeg");
		buildings.add(afa);		
		FloorArea bcia = new FloorArea("6", "Beijing Capital International Airport Terminal 3","China","Beijing","10,610,000 sqft", "bcia.jpg");
		buildings.add(bcia);		
		FloorArea tvm = new FloorArea("7", "The Venetian Macao","Macau","Macau","10,500,000 sqft", "tvm.jpg");
		buildings.add(tvm);		
		FloorArea scc = new FloorArea("8", "Sands Cotai Centrali","Macau","Macau","9,600,000 sqft", "scc.jpg");
		buildings.add(scc);
		FloorArea cws = new FloorArea("9", "Ciputra World Surabaya","Indonesia","Surabaya","8,100,000 sqft", "cws.jpg");
		buildings.add(cws);		
		FloorArea bts = new FloorArea("10", "Berjaya Times Square","Malaysia","Kuala Lumpur","7,500,000 sqft", "bts.jpg");
		buildings.add(bts);
		
	
		
		return buildings;
		
	}
	
	
	
}
