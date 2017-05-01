package edu.osu.cs362;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=3;
		 int startMinute=23;
		 int startDay=4;
		 int startMonth=1;
		 int startYear=1992;
		 String startTitle="Birthday Party";
		 String startDescription="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          startTitle,
		         startDescription);
	// assertions
		  assertTrue(appt.getValid());
		 assertEquals(startHour, appt.getStartHour());
		 assertEquals(startMinute, appt.getStartMinute());
		 assertEquals(startDay, appt.getStartDay());
		 assertEquals(startMonth, appt.getStartMonth());
		 assertEquals(startYear, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());   
	
	// change values
		 // invalid results
		 int newHour=25;
		 int newMinute=-1;
		 int newDay=32;
		 int newMonth=32;
		 int newYear=1253;
		 String newTitle=null;
		 String newDescription=null;
		 appt.setDescription(newDescription);
		 assertTrue(appt.getValid());
		 // check if its valid after each mutation.
		 appt.setTitle(newTitle);
		 assertTrue(appt.getValid());
		 
		 appt.setStartYear(newYear);
		 assertTrue(appt.getValid());
		 
		 appt.setStartMonth(newMonth);
		 assertFalse(appt.getValid());
		 
		 appt.setStartDay(newDay);
		 assertFalse(appt.getValid());
		 
		 appt.setStartMinute(newMinute);
		 assertFalse(appt.getValid());
		 
		 appt.setStartHour(newHour);
		 
		 assertFalse(appt.getValid());
		 assertEquals(newHour, appt.getStartHour());
		 assertEquals(newMinute, appt.getStartMinute());
		 assertEquals(newDay, appt.getStartDay());
		 assertEquals(newMonth, appt.getStartMonth());
		 assertEquals(newYear, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());
 
	 }
	 
	 @Test
	  public void test03()  throws Throwable  {
		 //Invalid
		 int startHour=25;
		 int startMinute=23;
		 int startDay=4;
		 int startMonth=1;
		 int startYear=1992;
		 String startTitle="Birthday Party";
		 String startDescription="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          startTitle,
		         startDescription);
	// assertions
		 String toStringResult = appt.toString();
		 assertEquals(null, toStringResult);
	 }
	 
	 @Test
	  public void test04()  throws Throwable  {
		 //Invalid
		 int startHour=21;
		 int startMinute=29;
		 int startDay=8;
		 int startMonth=2;
		 int startYear=1977;
		 String startTitle="Party";
		 String startDescription="This is my party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          startTitle,
		         startDescription);
	// assertions
		 String toStringResult = appt.toString();
		 assertEquals("	2/8/1977 at 9:29pm ,Party, This is my party.\n", toStringResult);
	 }
	 
	 @Test
	  public void test05()  throws Throwable  {
		 //Invalid
		 int startHour=0;
		 int startMinute=14;
		 int startDay=2;
		 int startMonth=6;
		 int startYear=2030;
		 String startTitle="dance";
		 String startDescription="we must dance.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          startTitle,
		         startDescription);
	// assertions
		 String toStringResult = appt.toString();
		 assertEquals("	6/2/2030 at 12:14am ,dance, we must dance.\n", toStringResult);
	 }
}
