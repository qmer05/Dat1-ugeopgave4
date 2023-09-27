public class Main {
	public static void main(String[] args){
		
		Team myTeam = new Team("De Uovervindelige", 1);

		myTeam.setRank(1);

		System.out.printf("Hold: " + myTeam.getName() + "%nRang: " + myTeam.getRank());
	}
}