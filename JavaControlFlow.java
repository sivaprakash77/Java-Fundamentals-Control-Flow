package javaControlFlow;

import java.util.*;

public class JavaControlFlow {

	public static void main(String[] args) {
		
		Scanner Object = new Scanner(System.in);
		
		//Getting the number from User
		System.out.println("Please Enter a Number : ");
		int input = Object.nextInt();
		
		//Check if the Number is positive or not
		if(input>0) 
			System.out.println("The given number is Positive Number");
		else if(input<0)
			System.out.println("The given number is Negative Number");
		else
			System.out.println("The given number is zero");
		
		//Weekbased on the number
		switch(input) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturay");
			break;
		default:
			System.out.println("Hey! There is only 7 days in a week");
	    }
		
		//Print the numbers from 1 to Given Number
		if(input<0) {
			int negative = input;
			int i=-1;
			while(i!=negative-1) {
				System.out.print(i+" ");
				i--;
			}
		}
		for(int i=1;i<=input;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//Print the numbers as down from the user's Number
		int num = input;
		  if(num>0) {
		    while(num!=0) {
			  System.out.print(num+" ");
			num--;
		    }
		  }
		  else {
			  int j=input;
			  while(j!=0) {
				  System.out.print(j+" ");
				  j++;
			  }
		  }
		
		System.out.println();
		
		//Printing Numbers from 1 to 3 using Do While
		int a=0;
		do {
			a=a+1;
			System.out.print(a+" ");
		}
		while(a<3);
	}

}
