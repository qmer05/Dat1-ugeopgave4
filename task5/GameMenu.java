import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu{

	private ArrayList<String> actions = new ArrayList();

	public GameMenu(ArrayList<String> actions){
		this.actions = actions;
	}

	public String getAction(){
	System.out.println("Type a number to choose an action ");
		for (String i : actions){
			System.out.println(i);
		}
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		return choice;
	}
}