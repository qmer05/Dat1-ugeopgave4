class Team{
	private String teamName;
	private int teamRank;
	private String playerName;

	public Team(String teamName){
		this.teamName = teamName;
	}

	public void setRank(int teamRank){
		this.teamRank = teamRank;
	}

	public int getRank(){
		return this.teamRank;
	}

	public String getName(){
		return this.teamName;
	}

	public String toString(){
		return String.format("Hold: De Uovervindelige Rang: 2");
	}
}