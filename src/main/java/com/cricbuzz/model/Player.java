//$Id$
package com.cricbuzz.model;

public class Player extends Person {
    
    private Integer iccRankings;
	private TeamName teamName;
	private Role role;
	private BattingStyle battingStyle;
	private BowlingStyle bowlingStyle;

	public Player(String name, String dob, Integer age, String birthPlace, Integer iccRankings, TeamName teamName, Role role, BattingStyle battingStyle, BowlingStyle bowlingStyle) 
	{
		super(name, dob, age, birthPlace);
		this.iccRankings = iccRankings;
		this.teamName = teamName;
		this.role = role;
		this.battingStyle = battingStyle;
		this.bowlingStyle = bowlingStyle;
	}

	public Integer getIccRankings() {
		return iccRankings;
	}

	public void setIccRankings(Integer iccRankings) {
		this.iccRankings = iccRankings;
	}

	public TeamName getTeamName() {
		return teamName;
	}

	public void setTeamName(TeamName teamName) {
		this.teamName = teamName;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public BattingStyle getBattingStyle() {
		return battingStyle;
	}

	public void setBattingStyle(BattingStyle battingStyle) {
		this.battingStyle = battingStyle;
	}

	public BowlingStyle getBowlingStyle() {
		return bowlingStyle;
	}

	public void setBowlingStyle(BowlingStyle bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}
	
}



