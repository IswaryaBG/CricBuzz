//$Id$
package com.cricbuzz.model;

import java.util.ArrayList;
import java.util.List;

public class Match {
	
	private Venue venue;
	private List<Team> teams;
	private String dateTime;
	
	
	public Match(Venue venue, String dateTime) {
		this.venue = venue;
		this.dateTime = dateTime;
		teams = new ArrayList<Team>();
	}

	public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	public List<Team> getTeams() {
		return teams;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}

