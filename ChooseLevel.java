package comp830730project;

import java.util.Scanner;

public class ChooseLevel {

	public static void main(String[] args)
	{
		//Player p = new Player();

		Scanner scanner = new Scanner(System.in);
		boolean signedIn = true;

		while (signedIn= true) {
			System.out.println("Choose a level: Easy, Medium, Hard");
			String input = scanner.nextLine();
			String[] words = input.split(" ");

			switch(words[0]) {
			case "Easy":
				break;
			case "Medium":
				break;
			case "Hard":
				break;

			default:
				System.out.println("Command not recognised");

			}
		}
		scanner.close();
	}
}
