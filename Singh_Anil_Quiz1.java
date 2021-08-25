package cs212;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		char [] correct = {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
		char [] SAnswers = null;
		int [] IAnswers = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int RAnswers = 0;
		int WAnswers = 0;{
		for(int i=1; i < 21; i++) {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter your answer for " + i + ":");
			SAnswers = keyboard.next().toCharArray();
		}
		for(int j=0; j<correct.length;j++) {
			if (SAnswers[j]==correct[j]) RAnswers++;//#of Right answers
			if (SAnswers[j]!=correct[j]) {
				WAnswers++; //# of Wrong answers
				IAnswers[j]=j; //array for which questions are incorrect
		}
		}
		if (RAnswers>=15) { // pass or fail
			System.out.println("You Passed");
		} else {
			System.out.println("You did not Pass");
		System.out.print(RAnswers); // print # of correct answers
		System.out.print(WAnswers);
		for (int i=0; i<21;i++) {
			if (IAnswers[i]!=0) {
				System.out.print(IAnswers[i]); // Print which answers are incorrect
			}
		}
	}
	}
	}
}
