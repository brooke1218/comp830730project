package comp840project;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Player p;
		String user;
		boolean signedIn = false;
		Scanner signIn = new Scanner(System.in);
		Scanner level = new Scanner(System.in);

		Scanner scanner = new Scanner(System.in);

		while (signedIn == false)
		{
		System.out.print("Hello! Please enter in a username: ");
		user = signIn.nextLine();
		if (user.length() < 3) {
			System.out.print("Please pick a username that is at least 3 characters long. ");
			signedIn = false;
		}
			else {
				signedIn = true;
				System.out.print("Welcome " + user + " enjoy the game!");
		}
		}

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
