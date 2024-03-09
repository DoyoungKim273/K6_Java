package com.ruby.java.ch04;

import java.util.Random;

public class Test37 {
	public static void main(String[] args) {
		//int[] score = {90, 85, 78, 100, 98} ;
		
		Random rnd = new Random();
				int[] score = new int [20];
		for(int i = 0; i < score.length; i++) {
			score [i] = rnd.nextInt(20);
			
			int sum = 0;
			double avg = 0.0;
			int max = 0;
			int min = 999;
		}
		
		for(int num : score) {
			System.out.println(num);
		
			
	   // for(int i = 0; i < score.length; i++) {
			
			/*sum += score[i];
			if(max < score[i])
				max = score[i];
			if(min > score[i])
				min = score[i]; 
		}
		// }
		avg = (double)(sum / score.length);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		System.out.println("max : " + max);
		System.out.println("min : " + min); */
	}
}
}
