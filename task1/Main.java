public class Main {
	public static void main(String[] args){
		Team myTeam = new Team("Dream Team");
		myTeam.setRank(1);
		System.out.printf("Team: " + myTeam.getName() + "%nRank: " + myTeam.getRank());
	}
}