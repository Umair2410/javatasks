package com.qa.helloworld;

public class BlackJack {

	public static int A;
	public static int B;

	public static void main(String[] args) {
		System.out.println(blackJackNum(15, 18));

	}

	public static int blackJackNum(int A, int B) {
		if (A > B && A <= 21) {
			return A;
			}
			if (A > B && A > 21 && B <= 21) {
				return B;
			} else {
				return 0;
			}

		 if (B > A && B <= 21){
			return B;
			}
			if (B > A && B > 21 && A =< 21){
				return A;
			}
			else{
				
			}
			}
		
	}}}

//play(A, B)

//if A > B && A =< 21, print A
//if A > B && A > 21 && B =< 21, print B
//if B > A && B =< 21, print B
//if B > A && B > 21 && A =< 21, print A
//if B > 21 && A > 21, print 0

public static int blackjack(int A, int B){
	if (A > B) {
		if (A <= 21) {
			System.out.println(A);
			if (A > 21) {
				if (B <= 21)
				System.out.println(B);
				} else {
					System.out.println(0);
				}
			}
	} else {
		if (B > A) {
			if (B <= 21) {
				System.out.println(B);
				if (B > 21) {
					if (A <= 21)
					System.out.println(A);
					} else {
						System.out.println(0);
					}
			}
		}
	}
}
