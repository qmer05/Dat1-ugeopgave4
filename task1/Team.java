class Team{
	private String teamName;
	private int teamRank;
	private String playerName;

	public Team(String teamName, int teamRank){
		this.teamName = teamName;
		this.teamRank = teamRank;
	}

	public void setRank(int teamRank){
		this.teamRank = teamRank;
	}

	public String toString(){
		return teamName+ " " + teamRank;
	}
	public int getRank(){
		return this.teamRank;
	}

	public String getName(){
		return this.teamName;
	}
}