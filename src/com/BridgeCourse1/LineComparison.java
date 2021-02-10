package com.BridgeCourse1;

import java.util.Scanner;

import java.lang.Math;


public class LineComparison {
	
	public static void main(String args [])
	{
		
		Scanner s1 = new Scanner(System.in);
		
		int x1, x2 , y1, y2,c=1;
		double distance1 , distance2;
	
		while(c>=2) {
			
		
			System.out.println(" Enter X and Y coordinates for 1st point for" + c + "line" );
		
			x1=s1.nextInt();
			y1=s1.nextInt();
		
			System.out.println(" Enter X and Y coordinates for 2nd point for" +c+" line ");
		
		
			x2=s1.nextInt();
			y2=s1.nextInt();
		
		
			 distance1= Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		
			 distance2 = distance1;
			
			
			
			c=c+1;
			
		     }
		
		
		}
	}
