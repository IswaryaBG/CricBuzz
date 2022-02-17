//$Id$
package com.cricbuzz.adminservice;

import com.cricbuzz.model.Match;
import com.cricbuzz.model.Player;
import com.cricbuzz.model.Series;
import com.cricbuzz.model.Team;

public interface Admin {
	
	void addPlayer(Player player);
	void addTeam(Team team);
	void addSeries(Series series);
	void addMatch(Match match);

}
