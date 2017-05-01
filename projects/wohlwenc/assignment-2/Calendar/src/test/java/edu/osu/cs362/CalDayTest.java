package edu.osu.cs362;
import static org.junit.Assert.*;

import java.util.GregorianCalendar;
import java.util.Iterator;

import org.junit.Test;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		 CalDay day = new CalDay();
		 assertFalse(day.isValid());
		 assertEquals(null, day.iterator());
		 String expected = "";
		 String actual = day.toString();
		 assertEquals(expected, actual);
	  }
	
	 @Test
	 public void test02() throws Throwable {
		 CalDay day = new CalDay(new GregorianCalendar(2000, 11, 5));
		 assertEquals(5, day.getDay());
		 assertEquals(11, day.getMonth());
		 assertEquals(2000, day.getYear());
		 
		 Appt appt = new Appt(12, 12, 2, 9, 2000, "bday", "my bday");
		 day.addAppt(appt);
		 assertEquals(appt, day.getAppts().get(0));
	 }
	 
	 @Test
	 public void test03() throws Throwable {
		 CalDay day = new CalDay(new GregorianCalendar(1998, 11, 7));
		 assertEquals(7, day.getDay());
		 assertEquals(11, day.getMonth());
		 assertEquals(1998, day.getYear());
		 
		 // shouln't accept invlaid apptments.
		 day.addAppt(new Appt(133, 133, 1333, 133, 133, null, null));
		 assertTrue(day.getSizeAppts() == 0);
		 
		 Appt appt = new Appt(12, 12, 2, 9, 2000, "bday", "my bday");
		 day.addAppt(appt);
		 Appt appt2 = new Appt(10, 50, 23, 10, 2442, null, null);
		 day.addAppt(appt2);
		 Appt appt3 = new Appt(13, 34, 13, 2, 2422, null, null);
		 day.addAppt(appt3);
		 
		 Iterator<?> iter = day.iterator();
		 assertEquals(appt2, iter.next());
		 assertEquals(appt, iter.next());
		 assertEquals(appt3, iter.next());
		 
		 String expected = "	 --- 11/7/1998 --- \n" +
				 		   " --- -------- Appointments ------------ --- \n" +
				 		   "	10/23/2442 at 10:50am ,, \n" +
				 		   " 	9/2/2000 at 12:12pm ,bday, my bday\n" +
				 		   " 	2/13/2422 at 1:34pm ,, \n \n";
		 String actual = day.toString();
		 
		 assertEquals(expected, actual);
		 
	 }
}
