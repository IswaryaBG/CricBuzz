//$Id$
package com.cricbuzz.model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private TeamName teamName;
    private List<Player> players;
    

    public Team(TeamName teamName) {
        this.teamName = teamName;
        players = new ArrayList<Player>();
    }
	public TeamName getTeamName() {
		return teamName;
	}

	public void setTeamName(TeamName teamName) {
		this.teamName = teamName;
	}

	public List<Player> getPlayers() {
		return players;
	}
	
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
    
}



