//$Id$
package com.cricbuzz.model;

import java.util.ArrayList;
import java.util.List;

public class Series extends Match{
	private String seriesName;
	private List<Match> matches;
	
	public Series(Venue venue, String dateTime, String seriesName) {
		super(venue, dateTime);
		this.seriesName = seriesName;
		matches=new ArrayList<Match>();
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

}

