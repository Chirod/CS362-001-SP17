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
		 Appt appt3 = new Appt(1, 34, 1, 2, 2422, null, null);
		 day.addAppt(appt3);
		 Appt appt6 = new Appt(4, 34, 4, 2, 2422, null, null);
		 day.addAppt(appt6);
		 Appt appt4 = new Appt(2, 34, 2, 2, 2422, null, null);
		 day.addAppt(appt4);
		 Appt appt8 = new Appt(6, 34, 6, 2, 2422, null, null);
		 day.addAppt(appt8);
		 Appt appt5 = new Appt(3, 34, 3, 2, 2422, null, null);
		 day.addAppt(appt5);
		 Appt appt7 = new Appt(5, 34, 5, 2, 2422, null, null);
		 day.addAppt(appt7);

		 
		 Iterator<?> iter = day.iterator();
		 assertEquals(appt3, iter.next());
		 assertEquals(appt4, iter.next());
		 assertEquals(appt5, iter.next());
		 assertEquals(appt6, iter.next());
		 assertEquals(appt7, iter.next());
		 assertEquals(appt8, iter.next());
		 assertEquals(appt2, iter.next());
		 assertEquals(appt, iter.next());
		 
		 String expected = "	 --- 11/7/1998 --- \n" +
				 		   " --- -------- Appointments ------------ --- \n" +
				 		   "	2/1/2422 at 1:34am ,, \n" +
				 		   " 	2/2/2422 at 2:34am ,, \n" +
				 		   " 	2/3/2422 at 3:34am ,, \n" +
				 		   " 	2/4/2422 at 4:34am ,, \n" +
				 		   " 	2/5/2422 at 5:34am ,, \n" +
				 		   " 	2/6/2422 at 6:34am ,, \n" +
				 		   " 	10/23/2442 at 10:50am ,, \n" +
				 		   " 	9/2/2000 at 12:12pm ,bday, my bday\n \n";
		 
		 String actual = day.toString();
		 assertEquals(expected, actual);
		 
	 }
	 
	 @Test
	 public void test04() throws Throwable {
		 CalDay day = new CalDay(new GregorianCalendar(1998, 11, 7));
		 assertEquals(7, day.getDay());
		 assertEquals(11, day.getMonth());
		 assertEquals(1998, day.getYear());
		 
		 Appt appt1 = new Appt(1, 0, 1, 1, 0, null, null);
		 day.addAppt(appt1);
		 Appt appt2 = new Appt(3, 0, 1, 1, 0, null, null);
		 day.addAppt(appt2);
		 Appt appt3 = new Appt(2, 0, 1, 1, 0, null, null);
		 day.addAppt(appt3);
		 Appt appt4 = new Appt(5, 0, 1, 1, 0, null, null);
		 day.addAppt(appt4);
		 Appt appt5 = new Appt(3, 0, 1, 1, 0, null, null);
		 day.addAppt(appt5);
		 Appt appt6 = new Appt(8, 0, 1, 1, 0, null, null);
		 day.addAppt(appt6);
		 Appt appt7 = new Appt(9, 0, 1, 1, 0, null, null);
		 day.addAppt(appt7);
		 Appt appt8 = new Appt(10, 0, 1, 1, 0, null, null);
		 day.addAppt(appt8);
		 Appt appt9 = new Appt(23, 0, 1, 1, 0, null, null);
		 day.addAppt(appt9);
		 Appt appt10 = new Appt(22, 0, 1, 1, 0, null, null);
		 day.addAppt(appt10);
		 Appt appt11 = new Appt(21, 0, 1, 1, 0, null, null);
		 day.addAppt(appt11);
		 Appt appt12 = new Appt(20, 0, 1, 1, 0, null, null);
		 day.addAppt(appt12);
		 Appt appt13 = new Appt(19, 0, 1, 1, 0, null, null);
		 day.addAppt(appt13);
		 Appt appt14 = new Appt(15, 0, 1, 1, 0, null, null);
		 day.addAppt(appt14);
		 Appt appt15 = new Appt(14, 0, 1, 1, 0, null, null);
		 day.addAppt(appt15);
		 Appt appt16 = new Appt(13, 0, 1, 1, 0, null, null);
		 day.addAppt(appt16);
		 Appt appt17 = new Appt(12, 0, 1, 1, 0, null, null);
		 day.addAppt(appt17);
		 Appt appt18 = new Appt(4, 0, 1, 1, 0, null, null);
		 day.addAppt(appt18);
		 Appt appt19 = new Appt(6, 0, 1, 1, 0, null, null);
		 day.addAppt(appt19);
		 Appt appt20 = new Appt(7, 0, 1, 1, 0, null, null);
		 day.addAppt(appt20);
		 Appt appt21 = new Appt(8, 0, 1, 1, 0, null, null);
		 day.addAppt(appt21);
		 Appt appt22 = new Appt(9, 0, 1, 1, 0, null, null);
		 day.addAppt(appt22);
		 Appt appt23 = new Appt(11, 0, 1, 1, 0, null, null);
		 day.addAppt(appt23);
		 
		 Iterator<Appt> iter = (Iterator<Appt>) day.iterator();
		 assertEquals(1, iter.next().getStartHour());
		 assertEquals(2, iter.next().getStartHour());
		 assertEquals(3, iter.next().getStartHour());
		 assertEquals(3, iter.next().getStartHour());
		 assertEquals(4, iter.next().getStartHour());
		 assertEquals(5, iter.next().getStartHour());
		 assertEquals(6, iter.next().getStartHour());
		 assertEquals(7, iter.next().getStartHour());
		 assertEquals(8, iter.next().getStartHour());
		 assertEquals(8, iter.next().getStartHour());
		 assertEquals(9, iter.next().getStartHour());
		 assertEquals(9, iter.next().getStartHour());
		 assertEquals(10, iter.next().getStartHour());
		 assertEquals(11, iter.next().getStartHour());
		 assertEquals(12, iter.next().getStartHour());
		 assertEquals(13, iter.next().getStartHour());
		 assertEquals(14, iter.next().getStartHour());
		 assertEquals(15, iter.next().getStartHour());
		 assertEquals(19, iter.next().getStartHour());
		 assertEquals(20, iter.next().getStartHour());
		 assertEquals(21, iter.next().getStartHour());
		 assertEquals(22, iter.next().getStartHour());
		 assertEquals(23, iter.next().getStartHour());

		
	 }
	 
}
