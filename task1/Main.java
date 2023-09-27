public class Main {
	public static void main(String[] args){
		
		Team myTeam = new Team("De Uovervindelige");
		Team aTeam = new Team("Super Dupers");
		Team bTeam = new Team("McLovers");
		Team cTeam = new Team("HitnRun");
		Team dTeam = new Team("Coding4ever");

		myTeam.setRank(1);
		aTeam.setRank(5);
		bTeam.setRank(3);
		cTeam.setRank(2);
		dTeam.setRank(4);

		System.out.println(myTeam);
		System.out.println(aTeam);
		System.out.println(bTeam);
		System.out.println(cTeam);
		System.out.println(dTeam);
	}
}