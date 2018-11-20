package comp840project;

import java.util.Scanner;

public class SignIn {
	public static void main(String[] args)
	{
		Player p;
		ChooseLevel l;
		boolean signedIn = false;
		Scanner input = new Scanner(System.in);
		String user;

		while (signedIn == false)
		{
		System.out.print("Hello! Please enter in a username: ");
		user = input.nextLine();
		if (user.length() < 3) {
			System.out.print("Please pick a username that is at least 3 characters long. ");
			signedIn = false;
		}
			else {
				signedIn = true;
				System.out.print("Welcome " + user + " enjoy the game!");
		}
		}
		while (signedIn == true) {
			ChooseLevel.getInstance();
			return;
		}
		}

	}
