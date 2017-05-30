package edu.osu.cs362;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.Random;

import org.junit.Test;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

    /**
     * Generate Random Tests that tests Appt Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =10;//System.currentTimeMillis();
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				TimeTable table = new TimeTable();
				
				for (int i = 0; i < NUM_TESTS; i++) {
					
					int numElems = ValuesGenerator.getRandomIntBetween(random, -1, 15);
					LinkedList<Appt> appts = new LinkedList<Appt>();
					Appt appt = ValuesGenerator.getRandomAppt(random);
					if(numElems == -1) {
						appts = null;
					} 
					else {
						for(int j = 0; j < numElems; j++) {
							int numDuplicates = ValuesGenerator.getRandomIntBetween(random, 1, 3);
							Appt a = ValuesGenerator.getRandomAppt(random, false);
							for(int k = 0; k < numDuplicates; k++) {
								appts.add(a);
							}
							if(ValuesGenerator.getBoolean(0.1f, random)) {
								appt = a;
							}
						}	
					}
					
					table.deleteAppt(appts, appt);
				}
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
	 
	 
		 System.out.println("Done testing...");
	 }

	
}
