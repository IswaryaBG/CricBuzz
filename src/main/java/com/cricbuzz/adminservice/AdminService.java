//$Id$
package com.cricbuzz.adminservice;

import com.cricbuzz.data.Data;
import com.cricbuzz.model.Match;
import com.cricbuzz.model.Player;
import com.cricbuzz.model.Series;
import com.cricbuzz.model.Team;

public class AdminService implements Admin{

	public void addPlayer(Player player) {
		Data.playerMap.put(player.getName(), player);
		
	}

	public void addTeam(Team team) {
		Data.teamMap.put(team.getTeamName(), team);
		
	}

	public void addSeries(Series series) {
		Data.seriesMap.put(series.getSeriesName() ,series);
		
	}

	public void addMatch(Match match) {
		Data.matchMap.put(match.getVenue(), match);
		
	}
	
    
}
