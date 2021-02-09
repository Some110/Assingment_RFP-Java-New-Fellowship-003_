package com.BridgeCourse1;

import java.util.Random;



public class EmpWageComp {
	
	public static void main(String args []) {
		
		Random r = new Random();
		int daily_wage=0;
		int wrk_days=0;
		int daily_hrs=0;
		int total_wage=0;
		int total_wrk_hrs=0;
		
		
		while( wrk_days<=20 && total_wrk_hrs <=100 )
		{
		
			int	rand= r.nextInt(3);
		
		
			switch(rand)
			{
		
			case 0:
				
				daily_wage=0;
				daily_hrs=0;
				break;
			
			case 1:
				daily_hrs=8;
				
				daily_wage=daily_hrs*20;
				
				wrk_days=wrk_days+1;
				break;
			
			case 2:
				daily_hrs=4;
				daily_wage=daily_hrs*20;
				wrk_days=wrk_days+1;
				
				break;
			
			}
			
			total_wage=total_wage + daily_wage;
			total_wrk_hrs=total_wrk_hrs + daily_hrs;
		
		}
		
		
		
		
	}

}
