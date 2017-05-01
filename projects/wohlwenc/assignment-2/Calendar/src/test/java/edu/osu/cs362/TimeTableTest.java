package edu.osu.cs362;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TimeTableTest {

	@SuppressWarnings("serial")
	LinkedList<Appt> Appointments = new LinkedList<Appt>() {{
		add(new Appt(21346, 59, 29, 11, 2015, "title1", "description1"));//0 - invalid
		add(new Appt(23, 59, 29, 11, 2016, "title2", "description2"));//1
		add(new Appt(23, 59, 29, 11, 2016, "title2", "description2"));//2
		add(new Appt(23, 59, 29, 5, 2017, "title3", "description3"));//3
		add(new Appt(23, 59, 25, 11, 2017, "title4", "description4"));//4
		add(new Appt(20, 30, 29, 11, 2017, "title5", "description5"));//5
		add(new Appt(23, 59, 29, 11, 2017, "title5", "description5"));//6
		add(new Appt(0, 0, 1, 1, 2018, "title5", "description5"));//7

	}};
	
	 @Test
	 public void test01()  throws Throwable  {
		 TimeTable table = new TimeTable();
		 LinkedList<CalDay> result = table.getApptRange(Appointments, new GregorianCalendar(2017, 11, 25), new GregorianCalendar(2017, 11, 30));
		 assertTrue(result.get(0).getSizeAppts() == 1);
		 assertEquals(Appointments.get(4), result.get(0).getAppts().get(0));
		 assertTrue(result.get(1).getSizeAppts() == 0);
		 assertTrue(result.get(2).getSizeAppts() == 0);
		 assertTrue(result.get(3).getSizeAppts() == 0);
		 assertTrue(result.get(4).getSizeAppts() == 2);
		 assertEquals(Appointments.get(5), result.get(4).getAppts().get(0));
		 assertEquals(Appointments.get(6), result.get(4).getAppts().get(1));
	 }
	 
	 @Test
	 public void test02()  throws Throwable  {
		 TimeTable table = new TimeTable();
		 try {
			 table.getApptRange(Appointments, new GregorianCalendar(2018, 11, 25), new GregorianCalendar(2017, 11, 30));
		 } catch (IllegalArgumentException e) {
			 assertEquals("Second date specified is not before the first date specified.", e.getMessage());
			 return;
		 }
		 Assert.fail("expected illegal argument exception");
	 }
	 
	 @Test
	 public void test03()  throws Throwable  {
		 TimeTable table = new TimeTable();
		 Appt appt1 = new Appt(23, 59, 29, 5, 2017, "title1", "description1");
		 Appt appt2 = new Appt(23, 59, 25, 11, 2017, "title2", "description2");
		 Appt appt3 = new Appt(20, 30, 29, 11, 2017, "title3", "description3");
		 LinkedList<Appt> list = new LinkedList<Appt>();
		 list.add(appt1);
		 list.add(appt2);
		 list.add(appt3);
		 
		 assertEquals(null, table.deleteAppt(list, null));
		 assertTrue(list.size() == 3);
		 
		 assertEquals(null, table.deleteAppt(null, appt1));
		 
		 List<Appt> result = table.deleteAppt(list, appt1);
		 assertEquals(result, list);
		 assertEquals(appt2, list.get(0));
		 assertEquals(appt3, list.get(1));
	 }

}
