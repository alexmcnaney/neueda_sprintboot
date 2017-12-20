package uk.ac.belfastmet.belfastevents.domain;

import java.util.ArrayList;

public class BelfastEvents {
	
private ArrayList<Event> allEvents = new ArrayList<Event>();


public BelfastEvents() {
super();
}

public BelfastEvents(ArrayList<Event> allEvents)
{
	this.allEvents = allEvents;
}

public ArrayList<Event> getAllEvents() {
	return allEvents;
}

public void setAllEvents(ArrayList<Event> allEvents) {
	this.allEvents = allEvents;
}


}
