package comp840project;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MediumLevel {

	private static String[] MEDIUM_WORD_DATABASE = new String[]
			{ "monster","elephant","computer","program","stranger","flower"};

	public void startMedium() {
		String originalWord = selectRandomWord();
		String shuffled = getShuffledWord(originalWord);
		boolean playing = true;

		while(playing) {
			System.out.println("Your word is: " + shuffled + "\n");
			String guess = getUserGuess();
			if(originalWord.equals(guess)) {
				System.out.println("Congratulations! You found the word: " + originalWord + "\n");
				playing = false;
			}else {
				System.out.println("Sorry, try again");
			}

		}
	}

	public String getUserGuess() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Please type in the original word: " + "\n");
		return sn.nextLine();
	}

	public String selectRandomWord() {
		int rPos = ThreadLocalRandom.current().nextInt(0, MEDIUM_WORD_DATABASE.length);
		return MEDIUM_WORD_DATABASE[rPos];
	}

	public String getShuffledWord(String originalWord) {
		String shuffledWord = originalWord;
		int wordSize = originalWord.length();
		int shuffleCount = 10;

		for(int i=0;i<shuffleCount;i++) {
			int position1 = ThreadLocalRandom.current().nextInt(0, wordSize);
			int position2 = ThreadLocalRandom.current().nextInt(0, wordSize);

			shuffledWord = swapCharacters(shuffledWord,position1,position2);
		}
		return shuffledWord;
	}

	private String swapCharacters(String shuffledWord, int position1, int position2) {
		char[] charArray = shuffledWord.toCharArray();
		char temp = charArray[position1];
		charArray[position1] = charArray[position2];
		charArray[position2] = temp;

		return new String(charArray);
	}

}
