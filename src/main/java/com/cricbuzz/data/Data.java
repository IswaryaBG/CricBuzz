//$Id$
package com.cricbuzz.data;

import java.util.HashMap;
import java.util.Map;

import com.cricbuzz.model.Match;
import com.cricbuzz.model.Player;
import com.cricbuzz.model.Series;
import com.cricbuzz.model.Team;
import com.cricbuzz.model.TeamName;
import com.cricbuzz.model.Venue;

public class Data {
	public static Map<String, Series> seriesMap = new HashMap<String, Series>();
    public static Map<Venue, Match> matchMap = new HashMap<Venue, Match>();
    public static Map<TeamName, Team> teamMap = new HashMap<TeamName, Team>();
    public static Map<String, Player> playerMap = new HashMap<String, Player>();

}
