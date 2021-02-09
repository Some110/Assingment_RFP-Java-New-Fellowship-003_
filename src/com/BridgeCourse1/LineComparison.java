package com.BridgeCourse1;

import java.util.Scanner;

import java.lang.Math;


public class LineComparison {
	
	public static void main(String args []) {
		
		Scanner s = new Scanner(System.in);
		
		int x1, x2 , y1, y2; 
		
		System.out.println(" Enter X and Y coordinates for 1st point");
		
		x1=s.nextInt();
		y1=s.nextInt();
		
		System.out.println(" Enter X and Y coordinates for 2st point");
		
		
		x2=s.nextInt();
		y2=s.nextInt();
		
		
		double distance= Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		
		
	}

}
