package edu.osu.cs362;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.util.GregorianCalendar gregorianCalendar0 = null;
        try {
            CalDay calDay1 = new CalDay(gregorianCalendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        TimeTable timeTable0 = new TimeTable();
        Appt appt8 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array17 = new Appt[] { appt8, appt16 };
        java.util.LinkedList<Appt> linkedlist_appt18 = new java.util.LinkedList<Appt>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt18, appt_array17);
        Appt appt20 = null;
        java.util.LinkedList<Appt> linkedlist_appt21 = timeTable0.deleteAppt(linkedlist_appt18, appt20);
        TimeTable timeTable22 = new TimeTable();
        Appt appt30 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt38 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array39 = new Appt[] { appt30, appt38 };
        java.util.LinkedList<Appt> linkedlist_appt40 = new java.util.LinkedList<Appt>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt40, appt_array39);
        Appt appt42 = null;
        java.util.LinkedList<Appt> linkedlist_appt43 = timeTable22.deleteAppt(linkedlist_appt40, appt42);
        java.util.GregorianCalendar gregorianCalendar44 = null;
        java.util.GregorianCalendar gregorianCalendar45 = null;
        try {
            java.util.LinkedList<CalDay> linkedlist_calDay46 = timeTable0.getApptRange(linkedlist_appt40, gregorianCalendar44, gregorianCalendar45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(appt_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(linkedlist_appt21);
        org.junit.Assert.assertNotNull(appt_array39);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(linkedlist_appt43);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        boolean b43 = appt36.getValid();
        java.lang.String str44 = appt36.getDescription();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartMonth(0);
        int i13 = appt7.getStartHour();
        boolean b14 = appt7.getValid();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        TimeTable timeTable0 = new TimeTable();
        Appt appt8 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt8.setTitle("hi!");
        boolean b11 = appt8.getValid();
        int i12 = appt8.getStartDay();
        int i13 = appt8.getStartHour();
        Appt appt21 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt21.setTitle("hi!");
        boolean b24 = appt21.getValid();
        int i25 = appt21.getStartDay();
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        java.lang.String str38 = appt33.getTitle();
        appt33.setStartDay((int) (byte) 10);
        Appt appt48 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt48.setTitle("hi!");
        appt48.setTitle("");
        java.lang.String str53 = appt48.getTitle();
        appt48.setStartDay((int) (byte) 10);
        Appt[] appt_array56 = new Appt[] { appt8, appt21, appt33, appt48 };
        java.util.LinkedList<Appt> linkedlist_appt57 = new java.util.LinkedList<Appt>();
        boolean b58 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt57, appt_array56);
        java.util.GregorianCalendar gregorianCalendar59 = null;
        java.util.GregorianCalendar gregorianCalendar60 = null;
        try {
            java.util.LinkedList<CalDay> linkedlist_calDay61 = timeTable0.getApptRange(linkedlist_appt57, gregorianCalendar59, gregorianCalendar60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        org.junit.Assert.assertNotNull(appt_array56);
        org.junit.Assert.assertTrue(b58 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        CalDay calDay0 = new CalDay();
        calDay0.year = (short) 10;
        calDay0.month = (short) 10;
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        int i16 = appt12.getStartYear();
        int i17 = appt12.getStartMonth();
        int i18 = appt12.getStartMinute();
        java.lang.String str19 = appt12.getTitle();
        int i20 = appt12.getStartDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue(i17 == 100);
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setStartMonth((int) (short) 1);
        appt7.setStartMinute((-1));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartHour();
        int i32 = appt23.getStartHour();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(i32 == (-1));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        appt7.setTitle("");
        int i12 = appt7.getStartHour();
        appt7.setDescription("");
        int i15 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 100);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        appt36.setStartMinute((int) (short) -1);
        appt36.setStartDay((int) '#');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.getDay();
        boolean b9 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        int i7 = calDay0.getDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i7 == 10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartYear((int) '#');
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        appt36.setDescription("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        TimeTable timeTable0 = new TimeTable();
        TimeTable timeTable1 = new TimeTable();
        Appt appt9 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array18 = new Appt[] { appt9, appt17 };
        java.util.LinkedList<Appt> linkedlist_appt19 = new java.util.LinkedList<Appt>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt19, appt_array18);
        Appt appt21 = null;
        java.util.LinkedList<Appt> linkedlist_appt22 = timeTable1.deleteAppt(linkedlist_appt19, appt21);
        java.util.GregorianCalendar gregorianCalendar23 = null;
        java.util.GregorianCalendar gregorianCalendar24 = null;
        try {
            java.util.LinkedList<CalDay> linkedlist_calDay25 = timeTable0.getApptRange(linkedlist_appt19, gregorianCalendar23, gregorianCalendar24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(appt_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(linkedlist_appt22);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartYear();
        boolean b32 = appt23.getValid();
        int i33 = appt23.getStartDay();
        appt23.setStartMinute((int) (byte) 10);
        java.lang.String str36 = appt23.getTitle();
        int i37 = appt23.getStartHour();
        int i38 = appt23.getStartYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue(i38 == 100);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        calDay0.year = (byte) 100;
        calDay0.year = (short) 100;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.month;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Appt appt7 = new Appt(0, (int) (byte) -1, 1, (int) (short) -1, (int) (short) -1, "", "hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Appt appt7 = new Appt((int) '#', (int) 'a', (int) (byte) -1, (int) (short) 0, (-1), "hi!", "");
        int i8 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.day;
        java.lang.String str5 = calDay0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        TimeTable timeTable0 = new TimeTable();
        TimeTable timeTable1 = new TimeTable();
        Appt appt9 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array18 = new Appt[] { appt9, appt17 };
        java.util.LinkedList<Appt> linkedlist_appt19 = new java.util.LinkedList<Appt>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt19, appt_array18);
        Appt appt21 = null;
        java.util.LinkedList<Appt> linkedlist_appt22 = timeTable1.deleteAppt(linkedlist_appt19, appt21);
        CalDay calDay23 = new CalDay();
        java.lang.String str24 = calDay23.toString();
        calDay23.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt27 = calDay23.getAppts();
        Appt appt35 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt35.setTitle("hi!");
        calDay23.addAppt(appt35);
        int i39 = appt35.getStartYear();
        int i40 = appt35.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt41 = timeTable0.deleteAppt(linkedlist_appt19, appt35);
        TimeTable timeTable42 = new TimeTable();
        TimeTable timeTable43 = new TimeTable();
        Appt appt51 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt59 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array60 = new Appt[] { appt51, appt59 };
        java.util.LinkedList<Appt> linkedlist_appt61 = new java.util.LinkedList<Appt>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt61, appt_array60);
        Appt appt63 = null;
        java.util.LinkedList<Appt> linkedlist_appt64 = timeTable43.deleteAppt(linkedlist_appt61, appt63);
        CalDay calDay65 = new CalDay();
        java.lang.String str66 = calDay65.toString();
        calDay65.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt69 = calDay65.getAppts();
        Appt appt77 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt77.setTitle("hi!");
        calDay65.addAppt(appt77);
        int i81 = appt77.getStartYear();
        int i82 = appt77.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt83 = timeTable42.deleteAppt(linkedlist_appt61, appt77);
        Appt appt91 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt91.setTitle("hi!");
        appt91.setTitle("");
        java.lang.String str96 = appt91.getTitle();
        appt91.setStartDay((int) (byte) 10);
        java.util.LinkedList<Appt> linkedlist_appt99 = timeTable0.deleteAppt(linkedlist_appt83, appt91);
        org.junit.Assert.assertNotNull(appt_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt27);
        org.junit.Assert.assertTrue(i39 == 100);
        org.junit.Assert.assertTrue(i40 == 100);
        org.junit.Assert.assertNull(linkedlist_appt41);
        org.junit.Assert.assertNotNull(appt_array60);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNull(linkedlist_appt64);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt69);
        org.junit.Assert.assertTrue(i81 == 100);
        org.junit.Assert.assertTrue(i82 == 100);
        org.junit.Assert.assertNull(linkedlist_appt83);
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "" + "'", str96.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt99);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        CalDay calDay0 = new CalDay();
        calDay0.year = (short) 10;
        int i3 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertNull(iterator_wildcard4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        int i9 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard10 = calDay0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(iterator_wildcard10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        calDay0.day = (byte) 10;
        int i6 = calDay0.getDay();
        boolean b7 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.valid = true;
        int i6 = calDay0.day;
        calDay0.month = '4';
        int i9 = calDay0.getDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i9 == 10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        calDay0.month = '#';
        boolean b8 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        java.lang.String str4 = calDay0.toString();
        int i5 = calDay0.getDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        java.lang.String str11 = appt7.getTitle();
        int i12 = appt7.getStartMinute();
        java.lang.String str13 = appt7.toString();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == 52);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        TimeTable timeTable0 = new TimeTable();
        TimeTable timeTable1 = new TimeTable();
        TimeTable timeTable2 = new TimeTable();
        TimeTable timeTable3 = new TimeTable();
        Appt appt11 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt19 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array20 = new Appt[] { appt11, appt19 };
        java.util.LinkedList<Appt> linkedlist_appt21 = new java.util.LinkedList<Appt>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt21, appt_array20);
        Appt appt23 = null;
        java.util.LinkedList<Appt> linkedlist_appt24 = timeTable3.deleteAppt(linkedlist_appt21, appt23);
        CalDay calDay25 = new CalDay();
        java.lang.String str26 = calDay25.toString();
        calDay25.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt29 = calDay25.getAppts();
        Appt appt37 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt37.setTitle("hi!");
        calDay25.addAppt(appt37);
        int i41 = appt37.getStartYear();
        int i42 = appt37.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt43 = timeTable2.deleteAppt(linkedlist_appt21, appt37);
        CalDay calDay44 = new CalDay();
        java.lang.String str45 = calDay44.toString();
        calDay44.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt48 = calDay44.getAppts();
        Appt appt56 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt56.setTitle("hi!");
        calDay44.addAppt(appt56);
        Appt appt67 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt67.setTitle("hi!");
        appt67.setTitle("");
        calDay44.addAppt(appt67);
        appt67.setTitle("");
        int i75 = appt67.getStartYear();
        boolean b76 = appt67.getValid();
        int i77 = appt67.getStartDay();
        appt67.setStartMinute((int) (byte) 10);
        java.lang.String str80 = appt67.getTitle();
        int i81 = appt67.getStartHour();
        java.util.LinkedList<Appt> linkedlist_appt82 = timeTable1.deleteAppt(linkedlist_appt21, appt67);
        java.util.GregorianCalendar gregorianCalendar83 = null;
        java.util.GregorianCalendar gregorianCalendar84 = null;
        try {
            java.util.LinkedList<CalDay> linkedlist_calDay85 = timeTable0.getApptRange(linkedlist_appt21, gregorianCalendar83, gregorianCalendar84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(appt_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(linkedlist_appt24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt29);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(i42 == 100);
        org.junit.Assert.assertNull(linkedlist_appt43);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt48);
        org.junit.Assert.assertTrue(i75 == 100);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        org.junit.Assert.assertTrue(i81 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt82);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        int i36 = appt27.getStartMonth();
        appt27.setTitle("");
        int i39 = appt27.getStartHour();
        int i40 = appt27.getStartMinute();
        int i41 = appt27.getStartMinute();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i36 == 100);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(i40 == 52);
        org.junit.Assert.assertTrue(i41 == 52);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        Appt appt40 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt40.setTitle("hi!");
        boolean b43 = appt40.getValid();
        appt40.setStartMonth(0);
        calDay4.addAppt(appt40);
        boolean b47 = appt40.getValid();
        calDay0.addAppt(appt40);
        CalDay calDay49 = new CalDay();
        java.lang.String str50 = calDay49.toString();
        calDay49.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt53 = calDay49.getAppts();
        Appt appt61 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt61.setTitle("hi!");
        calDay49.addAppt(appt61);
        Appt appt72 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt72.setTitle("hi!");
        appt72.setTitle("");
        calDay49.addAppt(appt72);
        appt72.setTitle("");
        int i80 = appt72.getStartHour();
        appt72.setStartMonth((int) (byte) 100);
        int i83 = appt72.getStartMonth();
        int i84 = appt72.getStartYear();
        calDay0.addAppt(appt72);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt53);
        org.junit.Assert.assertTrue(i80 == (-1));
        org.junit.Assert.assertTrue(i83 == 100);
        org.junit.Assert.assertTrue(i84 == 100);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        CalDay calDay0 = new CalDay();
        java.util.LinkedList<Appt> linkedlist_appt1 = calDay0.getAppts();
        org.junit.Assert.assertNull(linkedlist_appt1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.day;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        int i11 = appt7.getStartYear();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 100);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Appt appt7 = new Appt((int) (short) 0, (int) '#', (int) (short) 100, (int) (short) -1, 52, "", "");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        calDay0.month = 0;
        calDay0.year = ' ';
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        int i4 = calDay0.month;
        java.util.LinkedList<Appt> linkedlist_appt5 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(linkedlist_appt5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        calDay0.valid = false;
        java.util.LinkedList<Appt> linkedlist_appt45 = calDay0.getAppts();
        calDay0.year = 1;
        java.lang.String str48 = calDay0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(linkedlist_appt45);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        int i36 = appt27.getStartMonth();
        appt27.setTitle("");
        int i39 = appt27.getStartHour();
        appt27.setStartHour(1);
        appt27.setStartDay((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i36 == 100);
        org.junit.Assert.assertTrue(i39 == (-1));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        int i16 = appt12.getStartYear();
        int i17 = appt12.getStartMonth();
        int i18 = appt12.getStartMonth();
        int i19 = appt12.getStartYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue(i17 == 100);
        org.junit.Assert.assertTrue(i18 == 100);
        org.junit.Assert.assertTrue(i19 == 100);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        int i36 = appt27.getStartMonth();
        appt27.setStartDay((int) '#');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i36 == 100);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        calDay0.month = '#';
        boolean b6 = calDay0.valid;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartMonth(0);
        int i13 = appt7.getStartHour();
        appt7.setStartMinute(52);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        int i43 = calDay0.getDay();
        CalDay calDay44 = new CalDay();
        java.lang.String str45 = calDay44.toString();
        calDay44.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt48 = calDay44.appts;
        calDay44.month = (byte) 100;
        CalDay calDay51 = new CalDay();
        java.lang.String str52 = calDay51.toString();
        calDay51.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt55 = calDay51.getAppts();
        Appt appt63 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt63.setTitle("hi!");
        calDay51.addAppt(appt63);
        int i67 = appt63.getStartYear();
        int i68 = appt63.getStartMonth();
        calDay44.addAppt(appt63);
        calDay0.addAppt(appt63);
        int i71 = appt63.getStartHour();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i43 == 10);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt48);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt55);
        org.junit.Assert.assertTrue(i67 == 100);
        org.junit.Assert.assertTrue(i68 == 100);
        org.junit.Assert.assertTrue(i71 == (-1));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        appt12.setStartMonth(35);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.month = (byte) -1;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        boolean b43 = appt36.getValid();
        int i44 = appt36.getStartDay();
        int i45 = appt36.getStartHour();
        appt36.setDescription("");
        int i48 = appt36.getStartHour();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertTrue(i48 == (-1));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        calDay0.month = 0;
        int i45 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i45 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        TimeTable timeTable0 = new TimeTable();
        Appt appt8 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array17 = new Appt[] { appt8, appt16 };
        java.util.LinkedList<Appt> linkedlist_appt18 = new java.util.LinkedList<Appt>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt18, appt_array17);
        Appt appt20 = null;
        java.util.LinkedList<Appt> linkedlist_appt21 = timeTable0.deleteAppt(linkedlist_appt18, appt20);
        TimeTable timeTable22 = new TimeTable();
        TimeTable timeTable23 = new TimeTable();
        Appt appt31 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt39 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array40 = new Appt[] { appt31, appt39 };
        java.util.LinkedList<Appt> linkedlist_appt41 = new java.util.LinkedList<Appt>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt41, appt_array40);
        Appt appt43 = null;
        java.util.LinkedList<Appt> linkedlist_appt44 = timeTable23.deleteAppt(linkedlist_appt41, appt43);
        CalDay calDay45 = new CalDay();
        java.lang.String str46 = calDay45.toString();
        calDay45.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt49 = calDay45.getAppts();
        Appt appt57 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt57.setTitle("hi!");
        calDay45.addAppt(appt57);
        int i61 = appt57.getStartYear();
        int i62 = appt57.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt63 = timeTable22.deleteAppt(linkedlist_appt41, appt57);
        java.util.GregorianCalendar gregorianCalendar64 = null;
        java.util.GregorianCalendar gregorianCalendar65 = null;
        try {
            java.util.LinkedList<CalDay> linkedlist_calDay66 = timeTable0.getApptRange(linkedlist_appt63, gregorianCalendar64, gregorianCalendar65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(appt_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(linkedlist_appt21);
        org.junit.Assert.assertNotNull(appt_array40);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(linkedlist_appt44);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt49);
        org.junit.Assert.assertTrue(i61 == 100);
        org.junit.Assert.assertTrue(i62 == 100);
        org.junit.Assert.assertNull(linkedlist_appt63);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.year = (short) 1;
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        int i36 = appt27.getStartMonth();
        appt27.setTitle("");
        int i39 = appt27.getStartHour();
        appt27.setStartHour(1);
        boolean b42 = appt27.getValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i36 == 100);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.year = (short) 1;
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        int i6 = calDay0.getDay();
        CalDay calDay7 = new CalDay();
        java.lang.String str8 = calDay7.toString();
        calDay7.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt11 = calDay7.getAppts();
        Appt appt19 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt19.setTitle("hi!");
        calDay7.addAppt(appt19);
        Appt appt30 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt30.setTitle("hi!");
        appt30.setTitle("");
        calDay7.addAppt(appt30);
        appt30.setTitle("");
        int i38 = appt30.getStartYear();
        boolean b39 = appt30.getValid();
        int i40 = appt30.getStartDay();
        appt30.setStartMinute((int) (byte) 10);
        java.lang.String str43 = appt30.getTitle();
        int i44 = appt30.getStartHour();
        calDay0.addAppt(appt30);
        int i46 = appt30.getStartMonth();
        int i47 = appt30.getStartMinute();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt11);
        org.junit.Assert.assertTrue(i38 == 100);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        org.junit.Assert.assertTrue(i44 == (-1));
        org.junit.Assert.assertTrue(i46 == 100);
        org.junit.Assert.assertTrue(i47 == 10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        java.lang.String str11 = appt7.getTitle();
        int i12 = appt7.getStartMinute();
        appt7.setStartMinute(1);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == 52);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        TimeTable timeTable0 = new TimeTable();
        TimeTable timeTable1 = new TimeTable();
        Appt appt9 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array18 = new Appt[] { appt9, appt17 };
        java.util.LinkedList<Appt> linkedlist_appt19 = new java.util.LinkedList<Appt>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt19, appt_array18);
        Appt appt21 = null;
        java.util.LinkedList<Appt> linkedlist_appt22 = timeTable1.deleteAppt(linkedlist_appt19, appt21);
        CalDay calDay23 = new CalDay();
        java.lang.String str24 = calDay23.toString();
        calDay23.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt27 = calDay23.getAppts();
        Appt appt35 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt35.setTitle("hi!");
        calDay23.addAppt(appt35);
        int i39 = appt35.getStartYear();
        int i40 = appt35.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt41 = timeTable0.deleteAppt(linkedlist_appt19, appt35);
        TimeTable timeTable42 = new TimeTable();
        Appt appt50 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt58 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array59 = new Appt[] { appt50, appt58 };
        java.util.LinkedList<Appt> linkedlist_appt60 = new java.util.LinkedList<Appt>();
        boolean b61 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt60, appt_array59);
        Appt appt62 = null;
        java.util.LinkedList<Appt> linkedlist_appt63 = timeTable42.deleteAppt(linkedlist_appt60, appt62);
        java.util.GregorianCalendar gregorianCalendar64 = null;
        java.util.GregorianCalendar gregorianCalendar65 = null;
        try {
            java.util.LinkedList<CalDay> linkedlist_calDay66 = timeTable0.getApptRange(linkedlist_appt63, gregorianCalendar64, gregorianCalendar65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(appt_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt27);
        org.junit.Assert.assertTrue(i39 == 100);
        org.junit.Assert.assertTrue(i40 == 100);
        org.junit.Assert.assertNull(linkedlist_appt41);
        org.junit.Assert.assertNotNull(appt_array59);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNull(linkedlist_appt63);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        int i11 = appt7.getStartDay();
        int i12 = appt7.getStartHour();
        boolean b13 = appt7.getValid();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        appt7.setTitle("");
        java.lang.String str12 = appt7.getTitle();
        java.lang.String str13 = appt7.getDescription();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.getYear();
        CalDay calDay5 = new CalDay();
        java.lang.String str6 = calDay5.toString();
        calDay5.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay5.getAppts();
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt17.setTitle("hi!");
        calDay5.addAppt(appt17);
        Appt appt28 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt28.setTitle("hi!");
        appt28.setTitle("");
        calDay5.addAppt(appt28);
        appt28.setTitle("");
        appt28.setTitle("");
        calDay0.addAppt(appt28);
        appt28.setStartMinute((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        java.lang.String str30 = appt23.getTitle();
        appt23.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.valid = true;
        calDay0.valid = false;
        java.util.Iterator<?> iterator_wildcard8 = calDay0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        int i41 = appt33.getStartYear();
        boolean b42 = appt33.getValid();
        appt33.setStartMonth((int) (short) -1);
        calDay0.addAppt(appt33);
        int i46 = appt33.getStartMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i46 == (-1));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        boolean b43 = appt36.getValid();
        appt36.setStartMinute((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        int i16 = appt12.getStartYear();
        int i17 = appt12.getStartMonth();
        int i18 = appt12.getStartMinute();
        int i19 = appt12.getStartHour();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue(i17 == 100);
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        calDay0.month = (byte) 100;
        int i7 = calDay0.getYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        appt23.setTitle("");
        int i33 = appt23.getStartYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i33 == 100);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        int i36 = appt27.getStartMonth();
        appt27.setTitle("");
        int i39 = appt27.getStartHour();
        appt27.setStartMonth((int) (short) 100);
        int i42 = appt27.getStartHour();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i36 == 100);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(i42 == (-1));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        TimeTable timeTable0 = new TimeTable();
        TimeTable timeTable1 = new TimeTable();
        Appt appt9 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array18 = new Appt[] { appt9, appt17 };
        java.util.LinkedList<Appt> linkedlist_appt19 = new java.util.LinkedList<Appt>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt19, appt_array18);
        Appt appt21 = null;
        java.util.LinkedList<Appt> linkedlist_appt22 = timeTable1.deleteAppt(linkedlist_appt19, appt21);
        CalDay calDay23 = new CalDay();
        java.lang.String str24 = calDay23.toString();
        calDay23.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt27 = calDay23.getAppts();
        Appt appt35 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt35.setTitle("hi!");
        calDay23.addAppt(appt35);
        int i39 = appt35.getStartYear();
        int i40 = appt35.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt41 = timeTable0.deleteAppt(linkedlist_appt19, appt35);
        TimeTable timeTable42 = new TimeTable();
        TimeTable timeTable43 = new TimeTable();
        Appt appt51 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt59 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array60 = new Appt[] { appt51, appt59 };
        java.util.LinkedList<Appt> linkedlist_appt61 = new java.util.LinkedList<Appt>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt61, appt_array60);
        Appt appt63 = null;
        java.util.LinkedList<Appt> linkedlist_appt64 = timeTable43.deleteAppt(linkedlist_appt61, appt63);
        CalDay calDay65 = new CalDay();
        java.lang.String str66 = calDay65.toString();
        calDay65.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt69 = calDay65.getAppts();
        Appt appt77 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt77.setTitle("hi!");
        calDay65.addAppt(appt77);
        int i81 = appt77.getStartYear();
        int i82 = appt77.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt83 = timeTable42.deleteAppt(linkedlist_appt61, appt77);
        java.util.GregorianCalendar gregorianCalendar84 = null;
        java.util.GregorianCalendar gregorianCalendar85 = null;
        try {
            java.util.LinkedList<CalDay> linkedlist_calDay86 = timeTable0.getApptRange(linkedlist_appt61, gregorianCalendar84, gregorianCalendar85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(appt_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt27);
        org.junit.Assert.assertTrue(i39 == 100);
        org.junit.Assert.assertTrue(i40 == 100);
        org.junit.Assert.assertNull(linkedlist_appt41);
        org.junit.Assert.assertNotNull(appt_array60);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNull(linkedlist_appt64);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt69);
        org.junit.Assert.assertTrue(i81 == 100);
        org.junit.Assert.assertTrue(i82 == 100);
        org.junit.Assert.assertNull(linkedlist_appt83);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.valid = true;
        calDay0.month = (short) -1;
        boolean b8 = calDay0.isValid();
        int i9 = calDay0.month;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        appt7.setTitle("");
        int i12 = appt7.getStartHour();
        java.lang.String str13 = appt7.getDescription();
        appt7.setStartMonth((int) (byte) 100);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        int i11 = appt7.getStartDay();
        int i12 = appt7.getStartHour();
        appt7.setDescription("");
        int i15 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.valid = true;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        int i5 = calDay0.year;
        int i6 = calDay0.day;
        calDay0.valid = true;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartHour();
        appt7.setStartMonth((-1));
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setDescription("");
        appt7.setDescription("");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        boolean b31 = appt23.getValid();
        appt23.setStartDay((int) (byte) 1);
        int i34 = appt23.getStartDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        calDay0.month = (byte) 100;
        CalDay calDay7 = new CalDay();
        java.lang.String str8 = calDay7.toString();
        calDay7.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt11 = calDay7.getAppts();
        Appt appt19 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt19.setTitle("hi!");
        calDay7.addAppt(appt19);
        int i23 = appt19.getStartYear();
        int i24 = appt19.getStartMonth();
        calDay0.addAppt(appt19);
        java.lang.String str26 = appt19.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt11);
        org.junit.Assert.assertTrue(i23 == 100);
        org.junit.Assert.assertTrue(i24 == 100);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.year = (byte) 1;
        int i5 = calDay0.year;
        calDay0.month = 52;
        int i8 = calDay0.getDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.getDay();
        calDay0.day = 10;
        CalDay calDay11 = new CalDay();
        java.lang.String str12 = calDay11.toString();
        calDay11.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt15 = calDay11.getAppts();
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        calDay11.addAppt(appt23);
        Appt appt34 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt34.setTitle("hi!");
        appt34.setTitle("");
        calDay11.addAppt(appt34);
        Appt appt47 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt47.setTitle("hi!");
        boolean b50 = appt47.getValid();
        appt47.setStartMonth(0);
        calDay11.addAppt(appt47);
        calDay0.addAppt(appt47);
        int i55 = appt47.getStartMonth();
        appt47.setDescription("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt15);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i55 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.year = (byte) 1;
        calDay0.month = (byte) 1;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        appt7.setTitle("");
        java.lang.String str12 = appt7.getTitle();
        appt7.setStartDay((int) (short) 1);
        int i15 = appt7.getStartMonth();
        appt7.setDescription("");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(i15 == 100);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        int i30 = appt23.getStartYear();
        boolean b31 = appt23.getValid();
        appt23.setStartHour((int) (byte) -1);
        appt23.setTitle("hi!");
        appt23.setTitle("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(i30 == 100);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.year = (short) 1;
        int i5 = calDay0.getYear();
        java.lang.String str6 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt7 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        boolean b43 = appt36.getValid();
        int i44 = appt36.getStartDay();
        int i45 = appt36.getStartHour();
        int i46 = appt36.getStartHour();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertTrue(i46 == (-1));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        int i16 = appt12.getStartYear();
        int i17 = appt12.getStartMonth();
        int i18 = appt12.getStartMonth();
        java.lang.String str19 = appt12.getDescription();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue(i17 == 100);
        org.junit.Assert.assertTrue(i18 == 100);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        int i8 = calDay0.month;
        calDay0.month = (short) 1;
        int i11 = calDay0.getYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        appt7.setTitle("");
        appt7.setStartYear((int) (byte) 10);
        int i14 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i14 == (-1));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        calDay0.year = (short) 1;
        java.util.LinkedList<Appt> linkedlist_appt11 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertNull(linkedlist_appt11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        calDay0.year = (byte) 100;
        boolean b6 = calDay0.valid;
        java.util.LinkedList<Appt> linkedlist_appt7 = calDay0.appts;
        int i8 = calDay0.month;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(linkedlist_appt7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        TimeTable timeTable0 = new TimeTable();
        TimeTable timeTable1 = new TimeTable();
        TimeTable timeTable2 = new TimeTable();
        Appt appt10 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt18 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array19 = new Appt[] { appt10, appt18 };
        java.util.LinkedList<Appt> linkedlist_appt20 = new java.util.LinkedList<Appt>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt20, appt_array19);
        Appt appt22 = null;
        java.util.LinkedList<Appt> linkedlist_appt23 = timeTable2.deleteAppt(linkedlist_appt20, appt22);
        CalDay calDay24 = new CalDay();
        java.lang.String str25 = calDay24.toString();
        calDay24.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt28 = calDay24.getAppts();
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        calDay24.addAppt(appt36);
        int i40 = appt36.getStartYear();
        int i41 = appt36.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt42 = timeTable1.deleteAppt(linkedlist_appt20, appt36);
        CalDay calDay43 = new CalDay();
        java.lang.String str44 = calDay43.toString();
        calDay43.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt47 = calDay43.getAppts();
        Appt appt55 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt55.setTitle("hi!");
        calDay43.addAppt(appt55);
        Appt appt66 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt66.setTitle("hi!");
        appt66.setTitle("");
        calDay43.addAppt(appt66);
        appt66.setTitle("");
        int i74 = appt66.getStartYear();
        boolean b75 = appt66.getValid();
        int i76 = appt66.getStartDay();
        appt66.setStartMinute((int) (byte) 10);
        java.lang.String str79 = appt66.getTitle();
        int i80 = appt66.getStartHour();
        java.util.LinkedList<Appt> linkedlist_appt81 = timeTable0.deleteAppt(linkedlist_appt20, appt66);
        java.util.LinkedList<Appt> linkedlist_appt82 = null;
        java.util.GregorianCalendar gregorianCalendar83 = null;
        java.util.GregorianCalendar gregorianCalendar84 = null;
        try {
            java.util.LinkedList<CalDay> linkedlist_calDay85 = timeTable0.getApptRange(linkedlist_appt82, gregorianCalendar83, gregorianCalendar84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(appt_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(linkedlist_appt23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt28);
        org.junit.Assert.assertTrue(i40 == 100);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertNull(linkedlist_appt42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt47);
        org.junit.Assert.assertTrue(i74 == 100);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "" + "'", str79.equals(""));
        org.junit.Assert.assertTrue(i80 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt81);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartHour();
        java.lang.String str9 = appt7.getTitle();
        int i10 = appt7.getStartMinute();
        int i11 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i11 == 100);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        calDay0.month = (byte) -1;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        int i36 = appt27.getStartMonth();
        appt27.setTitle("");
        int i39 = appt27.getStartHour();
        appt27.setStartMonth((int) (short) 100);
        appt27.setStartHour((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i36 == 100);
        org.junit.Assert.assertTrue(i39 == (-1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.valid = true;
        int i6 = calDay0.day;
        int i7 = calDay0.month;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        int i9 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartYear();
        boolean b32 = appt23.getValid();
        int i33 = appt23.getStartHour();
        appt23.setDescription("hi!");
        appt23.setStartYear((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == (-1));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.getDay();
        calDay0.day = 10;
        CalDay calDay11 = new CalDay();
        java.lang.String str12 = calDay11.toString();
        calDay11.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt15 = calDay11.getAppts();
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        calDay11.addAppt(appt23);
        Appt appt34 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt34.setTitle("hi!");
        appt34.setTitle("");
        calDay11.addAppt(appt34);
        Appt appt47 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt47.setTitle("hi!");
        boolean b50 = appt47.getValid();
        appt47.setStartMonth(0);
        calDay11.addAppt(appt47);
        calDay0.addAppt(appt47);
        boolean b55 = appt47.getValid();
        java.lang.String str56 = appt47.getTitle();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt15);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!" + "'", str56.equals("hi!"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartYear();
        appt23.setTitle("");
        int i34 = appt23.getStartMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(i34 == 100);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        int i6 = calDay0.getDay();
        int i7 = calDay0.year;
        calDay0.year = (byte) 100;
        calDay0.day = (byte) 0;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.valid = true;
        calDay0.valid = false;
        calDay0.month = 100;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        TimeTable timeTable0 = new TimeTable();
        TimeTable timeTable1 = new TimeTable();
        TimeTable timeTable2 = new TimeTable();
        Appt appt10 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt18 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array19 = new Appt[] { appt10, appt18 };
        java.util.LinkedList<Appt> linkedlist_appt20 = new java.util.LinkedList<Appt>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt20, appt_array19);
        Appt appt22 = null;
        java.util.LinkedList<Appt> linkedlist_appt23 = timeTable2.deleteAppt(linkedlist_appt20, appt22);
        CalDay calDay24 = new CalDay();
        java.lang.String str25 = calDay24.toString();
        calDay24.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt28 = calDay24.getAppts();
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        calDay24.addAppt(appt36);
        int i40 = appt36.getStartYear();
        int i41 = appt36.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt42 = timeTable1.deleteAppt(linkedlist_appt20, appt36);
        java.util.GregorianCalendar gregorianCalendar43 = null;
        java.util.GregorianCalendar gregorianCalendar44 = null;
        try {
            java.util.LinkedList<CalDay> linkedlist_calDay45 = timeTable0.getApptRange(linkedlist_appt20, gregorianCalendar43, gregorianCalendar44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(appt_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(linkedlist_appt23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt28);
        org.junit.Assert.assertTrue(i40 == 100);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertNull(linkedlist_appt42);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.getDay();
        int i9 = calDay0.day;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(i9 == 10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        int i16 = appt12.getStartYear();
        int i17 = appt12.getStartMonth();
        int i18 = appt12.getStartMonth();
        boolean b19 = appt12.getValid();
        appt12.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue(i17 == 100);
        org.junit.Assert.assertTrue(i18 == 100);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Appt appt7 = new Appt(1, (int) ' ', (int) 'a', (int) ' ', 10, "hi!", "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        int i16 = appt12.getStartYear();
        java.lang.String str17 = appt12.getDescription();
        int i18 = appt12.getStartYear();
        appt12.setStartYear((int) (short) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == 100);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertNull(iterator_wildcard5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        int i9 = calDay0.month;
        int i10 = calDay0.year;
        int i11 = calDay0.getDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        int i16 = appt12.getStartYear();
        java.lang.String str17 = appt12.getDescription();
        appt12.setStartYear(0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        calDay0.month = '#';
        int i8 = calDay0.year;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        java.lang.String str30 = appt23.toString();
        int i31 = appt23.getStartMonth();
        int i32 = appt23.getStartMonth();
        appt23.setStartMinute((int) '#');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(i32 == 100);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        int i4 = calDay0.month;
        java.util.LinkedList<Appt> linkedlist_appt5 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(linkedlist_appt5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        boolean b43 = appt36.getValid();
        appt36.setDescription("");
        appt36.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.year = (byte) 1;
        calDay0.year = (short) 10;
        java.util.LinkedList<Appt> linkedlist_appt7 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        CalDay calDay0 = new CalDay();
        Appt appt8 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i9 = appt8.getStartHour();
        appt8.setStartDay((int) (byte) 10);
        int i12 = appt8.getStartMonth();
        calDay0.addAppt(appt8);
        int i14 = calDay0.getDay();
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        appt7.setTitle("");
        appt7.setStartYear((int) (byte) 10);
        java.lang.String str14 = appt7.toString();
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        calDay0.month = (byte) 100;
        CalDay calDay7 = new CalDay();
        java.lang.String str8 = calDay7.toString();
        calDay7.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt11 = calDay7.getAppts();
        Appt appt19 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt19.setTitle("hi!");
        calDay7.addAppt(appt19);
        int i23 = appt19.getStartYear();
        int i24 = appt19.getStartMonth();
        calDay0.addAppt(appt19);
        java.util.LinkedList<Appt> linkedlist_appt26 = calDay0.getAppts();
        java.util.LinkedList<Appt> linkedlist_appt27 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt11);
        org.junit.Assert.assertTrue(i23 == 100);
        org.junit.Assert.assertTrue(i24 == 100);
        org.junit.Assert.assertNull(linkedlist_appt26);
        org.junit.Assert.assertNull(linkedlist_appt27);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.getYear();
        CalDay calDay5 = new CalDay();
        java.lang.String str6 = calDay5.toString();
        calDay5.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay5.getAppts();
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt17.setTitle("hi!");
        calDay5.addAppt(appt17);
        Appt appt28 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt28.setTitle("hi!");
        appt28.setTitle("");
        calDay5.addAppt(appt28);
        appt28.setTitle("");
        appt28.setTitle("");
        calDay0.addAppt(appt28);
        java.lang.String str39 = calDay0.toString();
        calDay0.day = ' ';
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        java.lang.String str16 = appt12.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        int i6 = calDay0.getDay();
        int i7 = calDay0.year;
        int i8 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartHour();
        appt7.setStartDay((int) (byte) 10);
        appt7.setStartYear((int) (short) 10);
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        calDay0.year = (byte) 100;
        int i6 = calDay0.day;
        int i7 = calDay0.getYear();
        calDay0.year = (byte) -1;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 100);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        int i41 = appt33.getStartYear();
        boolean b42 = appt33.getValid();
        appt33.setStartMonth((int) (short) -1);
        calDay0.addAppt(appt33);
        int i46 = appt33.getStartDay();
        int i47 = appt33.getStartYear();
        appt33.setStartYear(35);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i47 == 100);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.year = (short) 1;
        TimeTable timeTable5 = new TimeTable();
        TimeTable timeTable6 = new TimeTable();
        TimeTable timeTable7 = new TimeTable();
        Appt appt15 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array24 = new Appt[] { appt15, appt23 };
        java.util.LinkedList<Appt> linkedlist_appt25 = new java.util.LinkedList<Appt>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt25, appt_array24);
        Appt appt27 = null;
        java.util.LinkedList<Appt> linkedlist_appt28 = timeTable7.deleteAppt(linkedlist_appt25, appt27);
        CalDay calDay29 = new CalDay();
        java.lang.String str30 = calDay29.toString();
        calDay29.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt33 = calDay29.getAppts();
        Appt appt41 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt41.setTitle("hi!");
        calDay29.addAppt(appt41);
        int i45 = appt41.getStartYear();
        int i46 = appt41.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt47 = timeTable6.deleteAppt(linkedlist_appt25, appt41);
        CalDay calDay48 = new CalDay();
        java.lang.String str49 = calDay48.toString();
        calDay48.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt52 = calDay48.getAppts();
        Appt appt60 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt60.setTitle("hi!");
        calDay48.addAppt(appt60);
        Appt appt71 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt71.setTitle("hi!");
        appt71.setTitle("");
        calDay48.addAppt(appt71);
        appt71.setTitle("");
        int i79 = appt71.getStartYear();
        boolean b80 = appt71.getValid();
        int i81 = appt71.getStartDay();
        appt71.setStartMinute((int) (byte) 10);
        java.lang.String str84 = appt71.getTitle();
        int i85 = appt71.getStartHour();
        java.util.LinkedList<Appt> linkedlist_appt86 = timeTable5.deleteAppt(linkedlist_appt25, appt71);
        calDay0.appts = linkedlist_appt86;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertNotNull(appt_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(linkedlist_appt28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt33);
        org.junit.Assert.assertTrue(i45 == 100);
        org.junit.Assert.assertTrue(i46 == 100);
        org.junit.Assert.assertNull(linkedlist_appt47);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt52);
        org.junit.Assert.assertTrue(i79 == 100);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
        org.junit.Assert.assertTrue(i85 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt86);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Appt appt7 = new Appt((int) '4', 1, (int) '4', 1, (int) (byte) -1, "hi!", "");
        appt7.setStartHour((-1));
        int i10 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        int i11 = appt7.getStartDay();
        int i12 = appt7.getStartHour();
        appt7.setStartHour((int) (byte) -1);
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.getTitle();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        boolean b43 = appt36.getValid();
        int i44 = appt36.getStartDay();
        boolean b45 = appt36.getValid();
        int i46 = appt36.getStartYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == 100);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.valid = false;
        calDay0.valid = false;
        boolean b7 = calDay0.valid;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartHour();
        int i32 = appt23.getStartMonth();
        appt23.setTitle("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(i32 == 100);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        calDay0.month = 1;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        int i36 = calDay0.getYear();
        calDay0.year = (short) 1;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.day = '#';
        int i5 = calDay0.day;
        calDay0.year = (short) 10;
        int i8 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 35);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Appt appt7 = new Appt(52, (int) ' ', 0, 35, 1, "", "hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        calDay0.month = (byte) 100;
        int i7 = calDay0.year;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartMonth();
        int i9 = appt7.getStartMinute();
        int i10 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartMonth(0);
        int i13 = appt7.getStartHour();
        appt7.setDescription("hi!");
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Appt appt7 = new Appt((int) (short) -1, (int) (short) -1, (int) '#', 35, (int) (byte) 0, "", "hi!");
        java.lang.String str8 = appt7.toString();
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        java.lang.String str30 = appt23.getTitle();
        java.lang.String str31 = appt23.getTitle();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.getDay();
        calDay0.day = 10;
        CalDay calDay11 = new CalDay();
        java.lang.String str12 = calDay11.toString();
        calDay11.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt15 = calDay11.getAppts();
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        calDay11.addAppt(appt23);
        Appt appt34 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt34.setTitle("hi!");
        appt34.setTitle("");
        calDay11.addAppt(appt34);
        Appt appt47 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt47.setTitle("hi!");
        boolean b50 = appt47.getValid();
        appt47.setStartMonth(0);
        calDay11.addAppt(appt47);
        calDay0.addAppt(appt47);
        int i55 = appt47.getStartMonth();
        appt47.setStartHour((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt15);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i55 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.year = (short) 1;
        int i5 = calDay0.getYear();
        java.lang.String str6 = calDay0.toString();
        Appt appt14 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i15 = appt14.getStartHour();
        java.lang.String str16 = appt14.getTitle();
        int i17 = appt14.getStartMinute();
        calDay0.addAppt(appt14);
        java.util.LinkedList<Appt> linkedlist_appt19 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertNull(linkedlist_appt19);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        int i30 = appt23.getStartYear();
        appt23.setStartDay((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(i30 == 100);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        int i41 = appt33.getStartYear();
        boolean b42 = appt33.getValid();
        appt33.setStartMonth((int) (short) -1);
        calDay0.addAppt(appt33);
        int i46 = appt33.getStartMinute();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i46 == 52);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        calDay0.month = (byte) 100;
        CalDay calDay7 = new CalDay();
        java.lang.String str8 = calDay7.toString();
        calDay7.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt11 = calDay7.getAppts();
        Appt appt19 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt19.setTitle("hi!");
        calDay7.addAppt(appt19);
        int i23 = appt19.getStartYear();
        int i24 = appt19.getStartMonth();
        calDay0.addAppt(appt19);
        int i26 = calDay0.day;
        int i27 = calDay0.day;
        int i28 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt11);
        org.junit.Assert.assertTrue(i23 == 100);
        org.junit.Assert.assertTrue(i24 == 100);
        org.junit.Assert.assertTrue(i26 == 10);
        org.junit.Assert.assertTrue(i27 == 10);
        org.junit.Assert.assertTrue(i28 == 100);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        int i16 = appt12.getStartYear();
        java.lang.String str17 = appt12.getDescription();
        int i18 = appt12.getStartYear();
        int i19 = appt12.getStartMonth();
        appt12.setStartMonth((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == 100);
        org.junit.Assert.assertTrue(i19 == 100);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        int i43 = calDay0.getDay();
        CalDay calDay44 = new CalDay();
        java.lang.String str45 = calDay44.toString();
        calDay44.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt48 = calDay44.appts;
        calDay44.month = (byte) 100;
        CalDay calDay51 = new CalDay();
        java.lang.String str52 = calDay51.toString();
        calDay51.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt55 = calDay51.getAppts();
        Appt appt63 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt63.setTitle("hi!");
        calDay51.addAppt(appt63);
        int i67 = appt63.getStartYear();
        int i68 = appt63.getStartMonth();
        calDay44.addAppt(appt63);
        calDay0.addAppt(appt63);
        int i71 = appt63.getStartMinute();
        appt63.setStartYear(52);
        int i74 = appt63.getStartDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i43 == 10);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt48);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt55);
        org.junit.Assert.assertTrue(i67 == 100);
        org.junit.Assert.assertTrue(i68 == 100);
        org.junit.Assert.assertTrue(i71 == 52);
        org.junit.Assert.assertTrue(i74 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.year = (byte) 1;
        int i5 = calDay0.year;
        int i6 = calDay0.getYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.year = (byte) 1;
        int i5 = calDay0.year;
        calDay0.month = 52;
        calDay0.valid = false;
        int i10 = calDay0.day;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        int i10 = calDay0.getDay();
        calDay0.day = 0;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        calDay0.month = 'a';
        int i31 = calDay0.getMonth();
        boolean b32 = calDay0.valid;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 97);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.getYear();
        CalDay calDay5 = new CalDay();
        java.lang.String str6 = calDay5.toString();
        calDay5.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay5.getAppts();
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt17.setTitle("hi!");
        calDay5.addAppt(appt17);
        Appt appt28 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt28.setTitle("hi!");
        appt28.setTitle("");
        calDay5.addAppt(appt28);
        appt28.setTitle("");
        appt28.setTitle("");
        calDay0.addAppt(appt28);
        java.lang.String str39 = calDay0.toString();
        boolean b40 = calDay0.isValid();
        int i41 = calDay0.getDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        calDay0.month = 'a';
        int i31 = calDay0.month;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 97);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        java.lang.String str30 = appt23.toString();
        int i31 = appt23.getStartMonth();
        appt23.setDescription("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(i31 == 100);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.valid = false;
        calDay0.day = (short) -1;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        int i5 = calDay0.getMonth();
        CalDay calDay6 = new CalDay();
        java.lang.String str7 = calDay6.toString();
        calDay6.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt10 = calDay6.getAppts();
        Appt appt18 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt18.setTitle("hi!");
        calDay6.addAppt(appt18);
        Appt appt29 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt29.setTitle("hi!");
        appt29.setTitle("");
        calDay6.addAppt(appt29);
        Appt appt42 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt42.setTitle("hi!");
        calDay6.addAppt(appt42);
        TimeTable timeTable46 = new TimeTable();
        TimeTable timeTable47 = new TimeTable();
        Appt appt55 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt63 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array64 = new Appt[] { appt55, appt63 };
        java.util.LinkedList<Appt> linkedlist_appt65 = new java.util.LinkedList<Appt>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt65, appt_array64);
        Appt appt67 = null;
        java.util.LinkedList<Appt> linkedlist_appt68 = timeTable47.deleteAppt(linkedlist_appt65, appt67);
        CalDay calDay69 = new CalDay();
        java.lang.String str70 = calDay69.toString();
        calDay69.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt73 = calDay69.getAppts();
        Appt appt81 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt81.setTitle("hi!");
        calDay69.addAppt(appt81);
        int i85 = appt81.getStartYear();
        int i86 = appt81.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt87 = timeTable46.deleteAppt(linkedlist_appt65, appt81);
        calDay6.appts = linkedlist_appt65;
        calDay0.appts = linkedlist_appt65;
        int i90 = calDay0.getMonth();
        boolean b91 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt10);
        org.junit.Assert.assertNotNull(appt_array64);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNull(linkedlist_appt68);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt73);
        org.junit.Assert.assertTrue(i85 == 100);
        org.junit.Assert.assertTrue(i86 == 100);
        org.junit.Assert.assertNull(linkedlist_appt87);
        org.junit.Assert.assertTrue(i90 == 0);
        org.junit.Assert.assertTrue(b91 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        calDay0.valid = false;
        calDay0.year = 52;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.year = (byte) 1;
        int i5 = calDay0.getYear();
        int i6 = calDay0.getDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        calDay0.addAppt(appt36);
        int i40 = appt36.getStartDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i40 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.month;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        int i9 = calDay0.getYear();
        calDay0.month = 0;
        int i12 = calDay0.year;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartMonth(0);
        appt7.setTitle("hi!");
        java.lang.String str15 = appt7.getTitle();
        appt7.setStartDay((int) (short) 100);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        calDay0.valid = false;
        int i7 = calDay0.year;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartHour();
        appt23.setStartMonth((int) (byte) 100);
        boolean b34 = appt23.getValid();
        int i35 = appt23.getStartDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setDescription("");
        java.lang.String str10 = appt7.getDescription();
        int i11 = appt7.getStartMinute();
        int i12 = appt7.getStartMonth();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue(i12 == 100);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        Appt appt40 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt40.setTitle("hi!");
        boolean b43 = appt40.getValid();
        appt40.setStartMonth(0);
        calDay4.addAppt(appt40);
        boolean b47 = appt40.getValid();
        calDay0.addAppt(appt40);
        java.util.Iterator<?> iterator_wildcard49 = calDay0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(iterator_wildcard49);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.year = (byte) 1;
        int i5 = calDay0.year;
        calDay0.month = 52;
        calDay0.valid = false;
        boolean b10 = calDay0.valid;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.valid = true;
        int i6 = calDay0.day;
        calDay0.month = '4';
        int i9 = calDay0.month;
        boolean b10 = calDay0.isValid();
        java.util.LinkedList<Appt> linkedlist_appt11 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(linkedlist_appt11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartYear();
        boolean b32 = appt23.getValid();
        int i33 = appt23.getStartDay();
        appt23.setStartHour((int) (short) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartYear();
        boolean b32 = appt23.getValid();
        int i33 = appt23.getStartDay();
        appt23.setStartMinute((int) (byte) 10);
        int i36 = appt23.getStartMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i36 == 100);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartMonth(0);
        appt7.setTitle("hi!");
        java.lang.String str15 = appt7.getTitle();
        int i16 = appt7.getStartDay();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        int i9 = calDay0.year;
        boolean b10 = calDay0.valid;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        calDay0.valid = false;
        java.util.LinkedList<Appt> linkedlist_appt45 = calDay0.getAppts();
        calDay0.month = 100;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(linkedlist_appt45);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.valid = false;
        calDay0.valid = false;
        java.util.LinkedList<Appt> linkedlist_appt7 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        TimeTable timeTable0 = new TimeTable();
        TimeTable timeTable1 = new TimeTable();
        TimeTable timeTable2 = new TimeTable();
        Appt appt10 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt18 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array19 = new Appt[] { appt10, appt18 };
        java.util.LinkedList<Appt> linkedlist_appt20 = new java.util.LinkedList<Appt>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt20, appt_array19);
        Appt appt22 = null;
        java.util.LinkedList<Appt> linkedlist_appt23 = timeTable2.deleteAppt(linkedlist_appt20, appt22);
        CalDay calDay24 = new CalDay();
        java.lang.String str25 = calDay24.toString();
        calDay24.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt28 = calDay24.getAppts();
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        calDay24.addAppt(appt36);
        int i40 = appt36.getStartYear();
        int i41 = appt36.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt42 = timeTable1.deleteAppt(linkedlist_appt20, appt36);
        CalDay calDay43 = new CalDay();
        java.lang.String str44 = calDay43.toString();
        calDay43.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt47 = calDay43.getAppts();
        Appt appt55 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt55.setTitle("hi!");
        calDay43.addAppt(appt55);
        Appt appt66 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt66.setTitle("hi!");
        appt66.setTitle("");
        calDay43.addAppt(appt66);
        appt66.setTitle("");
        int i74 = appt66.getStartYear();
        boolean b75 = appt66.getValid();
        int i76 = appt66.getStartDay();
        appt66.setStartMinute((int) (byte) 10);
        java.lang.String str79 = appt66.getTitle();
        int i80 = appt66.getStartHour();
        java.util.LinkedList<Appt> linkedlist_appt81 = timeTable0.deleteAppt(linkedlist_appt20, appt66);
        int i82 = appt66.getStartDay();
        org.junit.Assert.assertNotNull(appt_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(linkedlist_appt23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt28);
        org.junit.Assert.assertTrue(i40 == 100);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertNull(linkedlist_appt42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt47);
        org.junit.Assert.assertTrue(i74 == 100);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "" + "'", str79.equals(""));
        org.junit.Assert.assertTrue(i80 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt81);
        org.junit.Assert.assertTrue(i82 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartMonth(0);
        int i13 = appt7.getStartHour();
        appt7.setStartYear((int) (short) 10);
        int i16 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        boolean b16 = calDay0.isValid();
        CalDay calDay17 = new CalDay();
        java.lang.String str18 = calDay17.toString();
        calDay17.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt21 = calDay17.getAppts();
        Appt appt29 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt29.setTitle("hi!");
        calDay17.addAppt(appt29);
        Appt appt40 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt40.setTitle("hi!");
        appt40.setTitle("");
        calDay17.addAppt(appt40);
        appt40.setTitle("");
        int i48 = appt40.getStartYear();
        boolean b49 = appt40.getValid();
        int i50 = appt40.getStartDay();
        appt40.setStartMinute((int) (byte) 10);
        appt40.setStartHour(100);
        calDay0.addAppt(appt40);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt21);
        org.junit.Assert.assertTrue(i48 == 100);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i50 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        int i16 = appt12.getStartYear();
        int i17 = appt12.getStartMinute();
        int i18 = appt12.getStartMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertTrue(i18 == 100);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = calDay0.day;
        int i30 = calDay0.year;
        int i31 = calDay0.getMonth();
        java.util.LinkedList<Appt> linkedlist_appt32 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == 10);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNull(linkedlist_appt32);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = calDay0.month;
        int i30 = calDay0.month;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartMonth();
        appt7.setStartHour((int) (byte) 0);
        org.junit.Assert.assertTrue(i8 == 100);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        int i41 = appt33.getStartYear();
        boolean b42 = appt33.getValid();
        appt33.setStartMonth((int) (short) -1);
        calDay0.addAppt(appt33);
        int i46 = calDay0.getMonth();
        calDay0.day = 35;
        boolean b49 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Appt appt7 = new Appt((int) (byte) 1, (int) (short) 1, (int) (byte) 1, 1, (int) (byte) -1, "hi!", "hi!");
        int i8 = appt7.getStartMinute();
        appt7.setStartDay(52);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        CalDay calDay6 = new CalDay();
        java.lang.String str7 = calDay6.toString();
        calDay6.day = (byte) 10;
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        calDay6.addAppt(appt33);
        int i42 = appt33.getStartMonth();
        appt33.setTitle("");
        int i45 = appt33.getStartHour();
        int i46 = appt33.getStartYear();
        calDay0.addAppt(appt33);
        java.lang.String str48 = appt33.toString();
        appt33.setStartHour((int) '#');
        appt33.setStartDay((int) 'a');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i42 == 100);
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertTrue(i46 == 100);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        calDay0.year = 'a';
        calDay0.day = 0;
        CalDay calDay12 = new CalDay();
        java.lang.String str13 = calDay12.toString();
        calDay12.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt16 = calDay12.getAppts();
        Appt appt24 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt24.setTitle("hi!");
        calDay12.addAppt(appt24);
        Appt appt35 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt35.setTitle("hi!");
        appt35.setTitle("");
        calDay12.addAppt(appt35);
        appt35.setTitle("");
        int i43 = appt35.getStartYear();
        boolean b44 = appt35.getValid();
        int i45 = appt35.getStartDay();
        appt35.setStartMinute((int) (byte) 10);
        appt35.setStartDay((int) (short) 10);
        calDay0.addAppt(appt35);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt16);
        org.junit.Assert.assertTrue(i43 == 100);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        Appt appt40 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt40.setTitle("hi!");
        boolean b43 = appt40.getValid();
        appt40.setStartMonth(0);
        calDay4.addAppt(appt40);
        boolean b47 = appt40.getValid();
        calDay0.addAppt(appt40);
        calDay0.valid = false;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        int i9 = calDay0.month;
        int i10 = calDay0.getMonth();
        int i11 = calDay0.day;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 10);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        int i41 = appt33.getStartYear();
        boolean b42 = appt33.getValid();
        appt33.setStartMonth((int) (short) -1);
        calDay0.addAppt(appt33);
        int i46 = appt33.getStartDay();
        int i47 = appt33.getStartYear();
        java.lang.String str48 = appt33.getDescription();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i47 == 100);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        calDay0.month = '#';
        int i8 = calDay0.getYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        appt23.setStartDay((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.year;
        calDay0.valid = false;
        java.util.Iterator<?> iterator_wildcard8 = calDay0.iterator();
        calDay0.valid = false;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(iterator_wildcard8);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartHour(1);
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == 100);
        org.junit.Assert.assertTrue(i14 == 52);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartHour();
        appt7.setStartDay((int) (byte) 10);
        int i11 = appt7.getStartMonth();
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(i11 == 100);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.getDay();
        calDay0.day = 10;
        boolean b11 = calDay0.valid;
        CalDay calDay12 = new CalDay();
        java.lang.String str13 = calDay12.toString();
        calDay12.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt16 = calDay12.getAppts();
        Appt appt24 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt24.setTitle("hi!");
        calDay12.addAppt(appt24);
        Appt appt35 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt35.setTitle("hi!");
        appt35.setTitle("");
        calDay12.addAppt(appt35);
        Appt appt48 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt48.setTitle("hi!");
        calDay12.addAppt(appt48);
        TimeTable timeTable52 = new TimeTable();
        TimeTable timeTable53 = new TimeTable();
        Appt appt61 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt69 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array70 = new Appt[] { appt61, appt69 };
        java.util.LinkedList<Appt> linkedlist_appt71 = new java.util.LinkedList<Appt>();
        boolean b72 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt71, appt_array70);
        Appt appt73 = null;
        java.util.LinkedList<Appt> linkedlist_appt74 = timeTable53.deleteAppt(linkedlist_appt71, appt73);
        CalDay calDay75 = new CalDay();
        java.lang.String str76 = calDay75.toString();
        calDay75.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt79 = calDay75.getAppts();
        Appt appt87 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt87.setTitle("hi!");
        calDay75.addAppt(appt87);
        int i91 = appt87.getStartYear();
        int i92 = appt87.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt93 = timeTable52.deleteAppt(linkedlist_appt71, appt87);
        calDay12.appts = linkedlist_appt71;
        calDay0.appts = linkedlist_appt71;
        java.util.LinkedList<Appt> linkedlist_appt96 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt16);
        org.junit.Assert.assertNotNull(appt_array70);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNull(linkedlist_appt74);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt79);
        org.junit.Assert.assertTrue(i91 == 100);
        org.junit.Assert.assertTrue(i92 == 100);
        org.junit.Assert.assertNull(linkedlist_appt93);
        org.junit.Assert.assertNotNull(linkedlist_appt96);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Appt appt7 = new Appt((-1), (int) ' ', (-1), 52, 0, "hi!", "hi!");
        int i8 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i8 == 32);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Appt appt7 = new Appt((int) (short) -1, (int) (short) -1, (int) '#', 35, (int) (byte) 0, "", "hi!");
        appt7.setTitle("hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        calDay0.year = (byte) 100;
        int i6 = calDay0.day;
        int i7 = calDay0.getYear();
        TimeTable timeTable8 = new TimeTable();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt24 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array25 = new Appt[] { appt16, appt24 };
        java.util.LinkedList<Appt> linkedlist_appt26 = new java.util.LinkedList<Appt>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt26, appt_array25);
        Appt appt28 = null;
        java.util.LinkedList<Appt> linkedlist_appt29 = timeTable8.deleteAppt(linkedlist_appt26, appt28);
        calDay0.appts = linkedlist_appt26;
        int i31 = calDay0.year;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertNotNull(appt_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(linkedlist_appt29);
        org.junit.Assert.assertTrue(i31 == 100);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        int i41 = appt33.getStartYear();
        boolean b42 = appt33.getValid();
        appt33.setStartMonth((int) (short) -1);
        calDay0.addAppt(appt33);
        appt33.setStartMonth(10);
        java.lang.String str48 = appt33.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Appt appt7 = new Appt((int) ' ', (int) (short) 10, 97, (int) (byte) 10, (-1), "", "");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        CalDay calDay6 = new CalDay();
        java.lang.String str7 = calDay6.toString();
        calDay6.day = (byte) 10;
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        calDay6.addAppt(appt33);
        int i42 = appt33.getStartMonth();
        appt33.setTitle("");
        int i45 = appt33.getStartHour();
        int i46 = appt33.getStartYear();
        calDay0.addAppt(appt33);
        java.lang.String str48 = appt33.toString();
        appt33.setStartYear(0);
        java.lang.String str51 = appt33.getTitle();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i42 == 100);
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertTrue(i46 == 100);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        int i41 = appt33.getStartYear();
        boolean b42 = appt33.getValid();
        appt33.setStartMonth((int) (short) -1);
        calDay0.addAppt(appt33);
        int i46 = appt33.getStartDay();
        java.lang.String str47 = appt33.toString();
        java.lang.String str48 = appt33.getDescription();
        appt33.setStartMonth((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        java.lang.String str30 = appt23.toString();
        int i31 = appt23.getStartMonth();
        int i32 = appt23.getStartMinute();
        appt23.setTitle("hi!");
        boolean b35 = appt23.getValid();
        appt23.setStartHour((-1));
        int i38 = appt23.getStartMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(i32 == 52);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i38 == 100);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        int i36 = appt27.getStartMonth();
        appt27.setTitle("");
        int i39 = appt27.getStartHour();
        appt27.setStartHour(1);
        appt27.setDescription("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i36 == 100);
        org.junit.Assert.assertTrue(i39 == (-1));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        CalDay calDay0 = new CalDay();
        calDay0.year = (short) 10;
        java.lang.String str3 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        int i30 = appt23.getStartYear();
        boolean b31 = appt23.getValid();
        int i32 = appt23.getStartDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(i30 == 100);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        int i10 = calDay0.getDay();
        calDay0.valid = false;
        java.util.LinkedList<Appt> linkedlist_appt13 = calDay0.getAppts();
        calDay0.year = (short) 100;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertNull(linkedlist_appt13);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Appt appt7 = new Appt(0, (int) (byte) 0, (int) (short) 0, (-1), 32, "", "hi!");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        boolean b5 = calDay0.valid;
        int i6 = calDay0.month;
        int i7 = calDay0.getDay();
        int i8 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        int i10 = calDay0.month;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.valid = true;
        int i4 = calDay0.getYear();
        calDay0.valid = false;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.getYear();
        CalDay calDay5 = new CalDay();
        java.lang.String str6 = calDay5.toString();
        calDay5.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay5.getAppts();
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt17.setTitle("hi!");
        calDay5.addAppt(appt17);
        Appt appt28 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt28.setTitle("hi!");
        appt28.setTitle("");
        calDay5.addAppt(appt28);
        appt28.setTitle("");
        appt28.setTitle("");
        calDay0.addAppt(appt28);
        java.util.LinkedList<Appt> linkedlist_appt39 = calDay0.getAppts();
        calDay0.valid = false;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertNull(linkedlist_appt39);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Appt appt7 = new Appt((int) (short) -1, 97, (int) '#', 52, 0, "hi!", "");
        appt7.setStartMinute((int) 'a');
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        int i30 = appt23.getStartYear();
        boolean b31 = appt23.getValid();
        appt23.setStartHour((int) (byte) -1);
        int i34 = appt23.getStartYear();
        int i35 = appt23.getStartHour();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(i30 == 100);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 100);
        org.junit.Assert.assertTrue(i35 == (-1));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        calDay0.addAppt(appt36);
        appt36.setStartMonth(2);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        int i11 = appt7.getStartDay();
        int i12 = appt7.getStartHour();
        appt7.setDescription("");
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.getDescription();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Appt appt7 = new Appt(32, (int) 'a', (int) (short) 10, (int) 'a', (int) 'a', "", "");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        TimeTable timeTable0 = new TimeTable();
        TimeTable timeTable1 = new TimeTable();
        TimeTable timeTable2 = new TimeTable();
        TimeTable timeTable3 = new TimeTable();
        Appt appt11 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt19 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array20 = new Appt[] { appt11, appt19 };
        java.util.LinkedList<Appt> linkedlist_appt21 = new java.util.LinkedList<Appt>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt21, appt_array20);
        Appt appt23 = null;
        java.util.LinkedList<Appt> linkedlist_appt24 = timeTable3.deleteAppt(linkedlist_appt21, appt23);
        CalDay calDay25 = new CalDay();
        java.lang.String str26 = calDay25.toString();
        calDay25.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt29 = calDay25.getAppts();
        Appt appt37 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt37.setTitle("hi!");
        calDay25.addAppt(appt37);
        int i41 = appt37.getStartYear();
        int i42 = appt37.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt43 = timeTable2.deleteAppt(linkedlist_appt21, appt37);
        CalDay calDay44 = new CalDay();
        java.lang.String str45 = calDay44.toString();
        calDay44.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt48 = calDay44.getAppts();
        Appt appt56 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt56.setTitle("hi!");
        calDay44.addAppt(appt56);
        Appt appt67 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt67.setTitle("hi!");
        appt67.setTitle("");
        calDay44.addAppt(appt67);
        appt67.setTitle("");
        int i75 = appt67.getStartYear();
        boolean b76 = appt67.getValid();
        int i77 = appt67.getStartDay();
        appt67.setStartMinute((int) (byte) 10);
        java.lang.String str80 = appt67.getTitle();
        int i81 = appt67.getStartHour();
        java.util.LinkedList<Appt> linkedlist_appt82 = timeTable1.deleteAppt(linkedlist_appt21, appt67);
        Appt appt90 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt90.setTitle("hi!");
        appt90.setTitle("");
        java.lang.String str95 = appt90.getTitle();
        appt90.setStartDay((int) (byte) 10);
        java.util.LinkedList<Appt> linkedlist_appt98 = timeTable0.deleteAppt(linkedlist_appt21, appt90);
        int i99 = appt90.getStartDay();
        org.junit.Assert.assertNotNull(appt_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(linkedlist_appt24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt29);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(i42 == 100);
        org.junit.Assert.assertNull(linkedlist_appt43);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt48);
        org.junit.Assert.assertTrue(i75 == 100);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        org.junit.Assert.assertTrue(i81 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt82);
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "" + "'", str95.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt98);
        org.junit.Assert.assertTrue(i99 == 10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        boolean b43 = appt36.getValid();
        int i44 = appt36.getStartDay();
        int i45 = appt36.getStartHour();
        int i46 = appt36.getStartMinute();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertTrue(i46 == 52);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setStartMonth((int) (short) 1);
        java.lang.String str10 = appt7.getDescription();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        CalDay calDay0 = new CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        calDay0.year = 1;
        boolean b4 = calDay0.isValid();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        CalDay calDay6 = new CalDay();
        java.lang.String str7 = calDay6.toString();
        calDay6.day = (byte) 10;
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        calDay6.addAppt(appt33);
        int i42 = appt33.getStartMonth();
        appt33.setTitle("");
        int i45 = appt33.getStartHour();
        int i46 = appt33.getStartYear();
        calDay0.addAppt(appt33);
        calDay0.month = 35;
        java.util.LinkedList<Appt> linkedlist_appt50 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i42 == 100);
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertTrue(i46 == 100);
        org.junit.Assert.assertNull(linkedlist_appt50);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.getYear();
        CalDay calDay5 = new CalDay();
        java.lang.String str6 = calDay5.toString();
        calDay5.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay5.getAppts();
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt17.setTitle("hi!");
        calDay5.addAppt(appt17);
        Appt appt28 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt28.setTitle("hi!");
        appt28.setTitle("");
        calDay5.addAppt(appt28);
        appt28.setTitle("");
        appt28.setTitle("");
        calDay0.addAppt(appt28);
        int i39 = appt28.getStartHour();
        appt28.setStartHour(35);
        appt28.setStartDay((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue(i39 == (-1));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        calDay0.valid = true;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertNull(linkedlist_appt4);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setDescription("");
        java.lang.String str10 = appt7.getDescription();
        int i11 = appt7.getStartMinute();
        int i12 = appt7.getStartDay();
        int i13 = appt7.getStartMinute();
        java.lang.String str14 = appt7.getDescription();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 52);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartMonth();
        int i9 = appt7.getStartMinute();
        int i10 = appt7.getStartDay();
        int i11 = appt7.getStartHour();
        int i12 = appt7.getStartHour();
        appt7.setStartHour(1);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        TimeTable timeTable0 = new TimeTable();
        Appt appt8 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array17 = new Appt[] { appt8, appt16 };
        java.util.LinkedList<Appt> linkedlist_appt18 = new java.util.LinkedList<Appt>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt18, appt_array17);
        Appt appt20 = null;
        java.util.LinkedList<Appt> linkedlist_appt21 = timeTable0.deleteAppt(linkedlist_appt18, appt20);
        java.util.LinkedList<Appt> linkedlist_appt22 = null;
        Appt appt30 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt30.setTitle("hi!");
        boolean b33 = appt30.getValid();
        appt30.setDescription("hi!");
        java.util.LinkedList<Appt> linkedlist_appt36 = timeTable0.deleteAppt(linkedlist_appt22, appt30);
        appt30.setStartMinute((int) (byte) 10);
        org.junit.Assert.assertNotNull(appt_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(linkedlist_appt21);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(linkedlist_appt36);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.valid = true;
        int i6 = calDay0.day;
        calDay0.month = '4';
        int i9 = calDay0.getMonth();
        calDay0.valid = false;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i9 == 52);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        appt27.setStartMonth(0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.valid = true;
        calDay0.valid = false;
        int i8 = calDay0.year;
        int i9 = calDay0.getDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        calDay0.valid = false;
        Appt appt7 = null;
        try {
            calDay0.addAppt(appt7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertNull(linkedlist_appt4);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.getDay();
        calDay0.day = 10;
        boolean b11 = calDay0.valid;
        int i12 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        CalDay calDay0 = new CalDay();
        calDay0.year = (short) 10;
        calDay0.valid = false;
        boolean b5 = calDay0.valid;
        Appt appt13 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt13.setTitle("hi!");
        boolean b16 = appt13.getValid();
        java.lang.String str17 = appt13.getTitle();
        int i18 = appt13.getStartMinute();
        int i19 = appt13.getStartDay();
        calDay0.addAppt(appt13);
        java.lang.String str21 = appt13.getTitle();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.valid = true;
        int i6 = calDay0.day;
        calDay0.month = '4';
        int i9 = calDay0.month;
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        int i26 = appt22.getStartYear();
        java.lang.String str27 = appt22.getDescription();
        int i28 = appt22.getStartYear();
        calDay0.addAppt(appt22);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i26 == 100);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue(i28 == 100);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Appt appt7 = new Appt((int) (byte) -1, 10, (int) (short) 0, (int) (short) 1, 100, "hi!", "");
        appt7.setTitle("hi!");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        int i6 = calDay0.getDay();
        int i7 = calDay0.year;
        calDay0.day = (byte) 100;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        calDay0.valid = false;
        java.util.LinkedList<Appt> linkedlist_appt45 = calDay0.getAppts();
        calDay0.year = 1;
        calDay0.day = (byte) 0;
        boolean b50 = calDay0.isValid();
        java.util.LinkedList<Appt> linkedlist_appt51 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(linkedlist_appt45);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(linkedlist_appt51);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        int i30 = appt23.getStartYear();
        boolean b31 = appt23.getValid();
        appt23.setStartHour((int) (byte) -1);
        int i34 = appt23.getStartYear();
        int i35 = appt23.getStartMinute();
        int i36 = appt23.getStartYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(i30 == 100);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 100);
        org.junit.Assert.assertTrue(i35 == 52);
        org.junit.Assert.assertTrue(i36 == 100);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.getYear();
        CalDay calDay5 = new CalDay();
        java.lang.String str6 = calDay5.toString();
        calDay5.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay5.getAppts();
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt17.setTitle("hi!");
        calDay5.addAppt(appt17);
        Appt appt28 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt28.setTitle("hi!");
        appt28.setTitle("");
        calDay5.addAppt(appt28);
        appt28.setTitle("");
        appt28.setTitle("");
        calDay0.addAppt(appt28);
        int i39 = appt28.getStartHour();
        appt28.setStartHour(35);
        java.lang.String str42 = appt28.getTitle();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        int i41 = appt33.getStartYear();
        boolean b42 = appt33.getValid();
        appt33.setStartMonth((int) (short) -1);
        calDay0.addAppt(appt33);
        appt33.setStartMonth(10);
        int i48 = appt33.getStartDay();
        appt33.setStartYear(0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i48 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        int i9 = calDay0.year;
        boolean b10 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        java.lang.String str4 = calDay0.toString();
        int i5 = calDay0.getYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        TimeTable timeTable0 = new TimeTable();
        TimeTable timeTable1 = new TimeTable();
        TimeTable timeTable2 = new TimeTable();
        TimeTable timeTable3 = new TimeTable();
        Appt appt11 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt19 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array20 = new Appt[] { appt11, appt19 };
        java.util.LinkedList<Appt> linkedlist_appt21 = new java.util.LinkedList<Appt>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt21, appt_array20);
        Appt appt23 = null;
        java.util.LinkedList<Appt> linkedlist_appt24 = timeTable3.deleteAppt(linkedlist_appt21, appt23);
        CalDay calDay25 = new CalDay();
        java.lang.String str26 = calDay25.toString();
        calDay25.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt29 = calDay25.getAppts();
        Appt appt37 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt37.setTitle("hi!");
        calDay25.addAppt(appt37);
        int i41 = appt37.getStartYear();
        int i42 = appt37.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt43 = timeTable2.deleteAppt(linkedlist_appt21, appt37);
        CalDay calDay44 = new CalDay();
        java.lang.String str45 = calDay44.toString();
        calDay44.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt48 = calDay44.getAppts();
        Appt appt56 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt56.setTitle("hi!");
        calDay44.addAppt(appt56);
        Appt appt67 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt67.setTitle("hi!");
        appt67.setTitle("");
        calDay44.addAppt(appt67);
        appt67.setTitle("");
        int i75 = appt67.getStartYear();
        boolean b76 = appt67.getValid();
        int i77 = appt67.getStartDay();
        appt67.setStartMinute((int) (byte) 10);
        java.lang.String str80 = appt67.getTitle();
        int i81 = appt67.getStartHour();
        java.util.LinkedList<Appt> linkedlist_appt82 = timeTable1.deleteAppt(linkedlist_appt21, appt67);
        Appt appt90 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt90.setTitle("hi!");
        appt90.setTitle("");
        java.lang.String str95 = appt90.getTitle();
        appt90.setStartDay((int) (byte) 10);
        java.util.LinkedList<Appt> linkedlist_appt98 = timeTable0.deleteAppt(linkedlist_appt21, appt90);
        int i99 = appt90.getStartYear();
        org.junit.Assert.assertNotNull(appt_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(linkedlist_appt24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt29);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(i42 == 100);
        org.junit.Assert.assertNull(linkedlist_appt43);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt48);
        org.junit.Assert.assertTrue(i75 == 100);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        org.junit.Assert.assertTrue(i81 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt82);
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "" + "'", str95.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt98);
        org.junit.Assert.assertTrue(i99 == 100);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        appt7.setTitle("");
        int i12 = appt7.getStartHour();
        java.lang.String str13 = appt7.getDescription();
        java.lang.String str14 = appt7.getTitle();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.getYear();
        CalDay calDay5 = new CalDay();
        java.lang.String str6 = calDay5.toString();
        calDay5.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay5.getAppts();
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt17.setTitle("hi!");
        calDay5.addAppt(appt17);
        Appt appt28 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt28.setTitle("hi!");
        appt28.setTitle("");
        calDay5.addAppt(appt28);
        appt28.setTitle("");
        appt28.setTitle("");
        calDay0.addAppt(appt28);
        int i39 = calDay0.getYear();
        java.lang.String str40 = calDay0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        int i36 = appt27.getStartMonth();
        appt27.setTitle("");
        int i39 = appt27.getStartHour();
        int i40 = appt27.getStartMinute();
        appt27.setStartMinute((int) (short) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i36 == 100);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(i40 == 52);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartHour();
        boolean b9 = appt7.getValid();
        int i10 = appt7.getStartMinute();
        appt7.setStartMonth((int) ' ');
        int i13 = appt7.getStartYear();
        appt7.setTitle("");
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i13 == 100);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        CalDay calDay6 = new CalDay();
        java.lang.String str7 = calDay6.toString();
        calDay6.day = (byte) 10;
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        calDay6.addAppt(appt33);
        int i42 = appt33.getStartMonth();
        appt33.setTitle("");
        int i45 = appt33.getStartHour();
        int i46 = appt33.getStartYear();
        calDay0.addAppt(appt33);
        java.util.LinkedList<Appt> linkedlist_appt48 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i42 == 100);
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertTrue(i46 == 100);
        org.junit.Assert.assertNull(linkedlist_appt48);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        int i16 = appt12.getStartYear();
        int i17 = appt12.getStartMonth();
        int i18 = appt12.getStartMinute();
        int i19 = appt12.getStartDay();
        java.lang.String str20 = appt12.getTitle();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue(i17 == 100);
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        appt7.setTitle("");
        int i12 = appt7.getStartHour();
        appt7.setDescription("");
        appt7.setStartDay((int) (byte) 10);
        java.lang.String str17 = appt7.getTitle();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Appt appt7 = new Appt((int) '4', (int) (short) -1, (int) (short) 10, (int) (byte) 1, (-1), "", "hi!");
        int i8 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i8 == 52);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        appt36.setStartMinute((int) (short) -1);
        appt36.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartYear();
        appt23.setStartMinute((-1));
        int i34 = appt23.getStartMinute();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(i34 == (-1));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Appt appt7 = new Appt((int) 'a', 10, 32, (int) (byte) 1, (-1), "", "");
        java.lang.String str8 = appt7.getTitle();
        int i9 = appt7.getStartMinute();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        int i10 = calDay0.getMonth();
        calDay0.valid = false;
        int i13 = calDay0.year;
        boolean b14 = calDay0.valid;
        int i15 = calDay0.year;
        int i16 = calDay0.day;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        TimeTable timeTable0 = new TimeTable();
        Appt appt8 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array17 = new Appt[] { appt8, appt16 };
        java.util.LinkedList<Appt> linkedlist_appt18 = new java.util.LinkedList<Appt>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt18, appt_array17);
        Appt appt20 = null;
        java.util.LinkedList<Appt> linkedlist_appt21 = timeTable0.deleteAppt(linkedlist_appt18, appt20);
        CalDay calDay22 = new CalDay();
        java.lang.String str23 = calDay22.toString();
        int i24 = calDay22.day;
        int i25 = calDay22.getYear();
        int i26 = calDay22.getYear();
        TimeTable timeTable27 = new TimeTable();
        Appt appt35 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt43 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array44 = new Appt[] { appt35, appt43 };
        java.util.LinkedList<Appt> linkedlist_appt45 = new java.util.LinkedList<Appt>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt45, appt_array44);
        Appt appt47 = null;
        java.util.LinkedList<Appt> linkedlist_appt48 = timeTable27.deleteAppt(linkedlist_appt45, appt47);
        calDay22.appts = linkedlist_appt45;
        CalDay calDay50 = new CalDay();
        java.lang.String str51 = calDay50.toString();
        calDay50.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt54 = calDay50.getAppts();
        Appt appt62 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt62.setTitle("hi!");
        calDay50.addAppt(appt62);
        Appt appt73 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt73.setTitle("hi!");
        appt73.setTitle("");
        calDay50.addAppt(appt73);
        int i79 = appt73.getStartHour();
        java.lang.String str80 = appt73.toString();
        appt73.setTitle("");
        java.util.LinkedList<Appt> linkedlist_appt83 = timeTable0.deleteAppt(linkedlist_appt45, appt73);
        java.lang.String str84 = appt73.toString();
        org.junit.Assert.assertNotNull(appt_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(linkedlist_appt21);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(appt_array44);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNull(linkedlist_appt48);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt54);
        org.junit.Assert.assertTrue(i79 == (-1));
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(linkedlist_appt83);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartYear();
        boolean b32 = appt23.getValid();
        int i33 = appt23.getStartMinute();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 52);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        appt7.setTitle("");
        int i12 = appt7.getStartHour();
        appt7.setDescription("");
        appt7.setDescription("hi!");
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        int i41 = appt33.getStartYear();
        boolean b42 = appt33.getValid();
        appt33.setStartMonth((int) (short) -1);
        calDay0.addAppt(appt33);
        java.lang.String str46 = appt33.toString();
        int i47 = appt33.getStartYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue(i47 == 100);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Appt appt7 = new Appt((int) '4', 1, (int) '4', 1, (int) (byte) -1, "hi!", "");
        int i8 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        Appt appt40 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt40.setTitle("hi!");
        boolean b43 = appt40.getValid();
        appt40.setStartMonth(0);
        calDay4.addAppt(appt40);
        boolean b47 = appt40.getValid();
        calDay0.addAppt(appt40);
        int i49 = calDay0.getDay();
        java.util.Iterator<?> iterator_wildcard50 = calDay0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNull(iterator_wildcard50);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        CalDay calDay0 = new CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        calDay0.year = 1;
        int i4 = calDay0.day;
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        CalDay calDay6 = new CalDay();
        java.lang.String str7 = calDay6.toString();
        calDay6.day = (byte) 10;
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        calDay6.addAppt(appt33);
        int i42 = appt33.getStartMonth();
        appt33.setTitle("");
        int i45 = appt33.getStartHour();
        int i46 = appt33.getStartYear();
        calDay0.addAppt(appt33);
        java.lang.String str48 = appt33.toString();
        appt33.setStartHour((int) '#');
        appt33.setStartDay(1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i42 == 100);
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertTrue(i46 == 100);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Appt appt7 = new Appt((int) 'a', (int) '#', (int) ' ', 10, (int) (short) 10, "", "");
        boolean b8 = appt7.getValid();
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.valid = true;
        int i6 = calDay0.day;
        boolean b7 = calDay0.isValid();
        calDay0.month = 32;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        int i41 = appt33.getStartYear();
        boolean b42 = appt33.getValid();
        appt33.setStartMonth((int) (short) -1);
        calDay0.addAppt(appt33);
        appt33.setStartMonth(10);
        appt33.setDescription("hi!");
        appt33.setDescription("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt6 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertNull(linkedlist_appt6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        calDay0.year = (byte) 100;
        boolean b6 = calDay0.valid;
        int i7 = calDay0.year;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 100);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        int i5 = calDay0.getMonth();
        CalDay calDay6 = new CalDay();
        java.lang.String str7 = calDay6.toString();
        calDay6.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt10 = calDay6.getAppts();
        Appt appt18 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt18.setTitle("hi!");
        calDay6.addAppt(appt18);
        Appt appt29 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt29.setTitle("hi!");
        appt29.setTitle("");
        calDay6.addAppt(appt29);
        Appt appt42 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt42.setTitle("hi!");
        calDay6.addAppt(appt42);
        TimeTable timeTable46 = new TimeTable();
        TimeTable timeTable47 = new TimeTable();
        Appt appt55 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt63 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array64 = new Appt[] { appt55, appt63 };
        java.util.LinkedList<Appt> linkedlist_appt65 = new java.util.LinkedList<Appt>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt65, appt_array64);
        Appt appt67 = null;
        java.util.LinkedList<Appt> linkedlist_appt68 = timeTable47.deleteAppt(linkedlist_appt65, appt67);
        CalDay calDay69 = new CalDay();
        java.lang.String str70 = calDay69.toString();
        calDay69.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt73 = calDay69.getAppts();
        Appt appt81 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt81.setTitle("hi!");
        calDay69.addAppt(appt81);
        int i85 = appt81.getStartYear();
        int i86 = appt81.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt87 = timeTable46.deleteAppt(linkedlist_appt65, appt81);
        calDay6.appts = linkedlist_appt65;
        calDay0.appts = linkedlist_appt65;
        calDay0.month = 'a';
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt10);
        org.junit.Assert.assertNotNull(appt_array64);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNull(linkedlist_appt68);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt73);
        org.junit.Assert.assertTrue(i85 == 100);
        org.junit.Assert.assertTrue(i86 == 100);
        org.junit.Assert.assertNull(linkedlist_appt87);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartMonth(0);
        int i13 = appt7.getStartHour();
        appt7.setStartYear((int) (short) 10);
        java.lang.String str16 = appt7.toString();
        int i17 = appt7.getStartDay();
        int i18 = appt7.getStartDay();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.valid = true;
        int i6 = calDay0.day;
        int i7 = calDay0.month;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertNull(linkedlist_appt9);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartMonth(0);
        int i13 = appt7.getStartHour();
        appt7.setStartYear((int) (short) 10);
        java.lang.String str16 = appt7.toString();
        appt7.setStartDay(100);
        appt7.setStartMinute((int) (byte) -1);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        boolean b30 = appt23.getValid();
        boolean b31 = appt23.getValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        TimeTable timeTable0 = new TimeTable();
        Appt appt8 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array17 = new Appt[] { appt8, appt16 };
        java.util.LinkedList<Appt> linkedlist_appt18 = new java.util.LinkedList<Appt>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt18, appt_array17);
        Appt appt20 = null;
        java.util.LinkedList<Appt> linkedlist_appt21 = timeTable0.deleteAppt(linkedlist_appt18, appt20);
        CalDay calDay22 = new CalDay();
        java.lang.String str23 = calDay22.toString();
        calDay22.year = (byte) 1;
        calDay22.year = (byte) 100;
        int i28 = calDay22.day;
        int i29 = calDay22.getYear();
        TimeTable timeTable30 = new TimeTable();
        Appt appt38 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt46 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array47 = new Appt[] { appt38, appt46 };
        java.util.LinkedList<Appt> linkedlist_appt48 = new java.util.LinkedList<Appt>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt48, appt_array47);
        Appt appt50 = null;
        java.util.LinkedList<Appt> linkedlist_appt51 = timeTable30.deleteAppt(linkedlist_appt48, appt50);
        calDay22.appts = linkedlist_appt48;
        java.util.LinkedList<Appt> linkedlist_appt53 = calDay22.getAppts();
        java.util.GregorianCalendar gregorianCalendar54 = null;
        java.util.GregorianCalendar gregorianCalendar55 = null;
        try {
            java.util.LinkedList<CalDay> linkedlist_calDay56 = timeTable0.getApptRange(linkedlist_appt53, gregorianCalendar54, gregorianCalendar55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(appt_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(linkedlist_appt21);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i29 == 100);
        org.junit.Assert.assertNotNull(appt_array47);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(linkedlist_appt51);
        org.junit.Assert.assertNotNull(linkedlist_appt53);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        calDay0.valid = true;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getDay();
        Appt appt13 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i14 = appt13.getStartMonth();
        int i15 = appt13.getStartMinute();
        int i16 = appt13.getStartYear();
        calDay0.addAppt(appt13);
        int i18 = calDay0.day;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i14 == 100);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        CalDay calDay0 = new CalDay();
        calDay0.year = (short) 10;
        int i3 = calDay0.getYear();
        calDay0.year = 'a';
        boolean b6 = calDay0.valid;
        java.lang.String str7 = calDay0.toString();
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.year = (byte) 1;
        calDay0.day = (short) 1;
        boolean b7 = calDay0.valid;
        boolean b8 = calDay0.valid;
        calDay0.valid = false;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.getYear();
        CalDay calDay5 = new CalDay();
        java.lang.String str6 = calDay5.toString();
        calDay5.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay5.getAppts();
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt17.setTitle("hi!");
        calDay5.addAppt(appt17);
        Appt appt28 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt28.setTitle("hi!");
        appt28.setTitle("");
        calDay5.addAppt(appt28);
        appt28.setTitle("");
        appt28.setTitle("");
        calDay0.addAppt(appt28);
        int i39 = calDay0.month;
        boolean b40 = calDay0.valid;
        int i41 = calDay0.month;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        boolean b43 = appt36.getValid();
        int i44 = appt36.getStartDay();
        boolean b45 = appt36.getValid();
        appt36.setStartDay((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.getMonth();
        calDay0.day = (short) -1;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartMonth(0);
        int i13 = appt7.getStartHour();
        int i14 = appt7.getStartYear();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == 100);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        int i16 = appt12.getStartYear();
        java.lang.String str17 = appt12.getDescription();
        appt12.setStartYear((int) ' ');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        int i8 = calDay0.month;
        int i9 = calDay0.month;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getDay();
        boolean b6 = calDay0.valid;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        int i10 = calDay0.getMonth();
        Appt appt18 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        calDay0.addAppt(appt18);
        int i20 = calDay0.month;
        java.util.LinkedList<Appt> linkedlist_appt21 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(linkedlist_appt21);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.year = (byte) 1;
        calDay0.year = (short) 10;
        calDay0.year = (short) -1;
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt9);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        calDay0.day = (byte) 10;
        int i6 = calDay0.getDay();
        java.util.LinkedList<Appt> linkedlist_appt7 = calDay0.appts;
        java.util.Iterator<?> iterator_wildcard8 = calDay0.iterator();
        TimeTable timeTable9 = new TimeTable();
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt25 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array26 = new Appt[] { appt17, appt25 };
        java.util.LinkedList<Appt> linkedlist_appt27 = new java.util.LinkedList<Appt>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt27, appt_array26);
        Appt appt29 = null;
        java.util.LinkedList<Appt> linkedlist_appt30 = timeTable9.deleteAppt(linkedlist_appt27, appt29);
        java.util.LinkedList<Appt> linkedlist_appt31 = null;
        Appt appt39 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt39.setTitle("hi!");
        boolean b42 = appt39.getValid();
        appt39.setDescription("hi!");
        java.util.LinkedList<Appt> linkedlist_appt45 = timeTable9.deleteAppt(linkedlist_appt31, appt39);
        CalDay calDay46 = new CalDay();
        java.lang.String str47 = calDay46.toString();
        calDay46.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt50 = calDay46.appts;
        boolean b51 = calDay46.valid;
        calDay46.year = '4';
        java.util.LinkedList<Appt> linkedlist_appt54 = calDay46.appts;
        CalDay calDay55 = new CalDay();
        java.lang.String str56 = calDay55.toString();
        int i57 = calDay55.day;
        int i58 = calDay55.getYear();
        int i59 = calDay55.getYear();
        TimeTable timeTable60 = new TimeTable();
        Appt appt68 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt76 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array77 = new Appt[] { appt68, appt76 };
        java.util.LinkedList<Appt> linkedlist_appt78 = new java.util.LinkedList<Appt>();
        boolean b79 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt78, appt_array77);
        Appt appt80 = null;
        java.util.LinkedList<Appt> linkedlist_appt81 = timeTable60.deleteAppt(linkedlist_appt78, appt80);
        calDay55.appts = linkedlist_appt78;
        calDay46.appts = linkedlist_appt78;
        Appt appt91 = new Appt((int) '#', (int) 'a', (int) (byte) -1, (int) (short) 0, (-1), "hi!", "");
        appt91.setStartMonth((int) '4');
        java.util.LinkedList<Appt> linkedlist_appt94 = timeTable9.deleteAppt(linkedlist_appt78, appt91);
        calDay0.appts = linkedlist_appt94;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(linkedlist_appt7);
        org.junit.Assert.assertNull(iterator_wildcard8);
        org.junit.Assert.assertNotNull(appt_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(linkedlist_appt30);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(linkedlist_appt45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(linkedlist_appt54);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(appt_array77);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNull(linkedlist_appt81);
        org.junit.Assert.assertNull(linkedlist_appt94);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartMonth();
        int i9 = appt7.getStartMinute();
        int i10 = appt7.getStartDay();
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        calDay0.valid = false;
        boolean b7 = calDay0.valid;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        Appt appt7 = new Appt((int) (byte) 1, (int) 'a', 1, (int) '#', (int) (short) 1, "hi!", "");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.day = '#';
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        int i36 = appt27.getStartMonth();
        appt27.setTitle("");
        int i39 = appt27.getStartHour();
        java.lang.String str40 = appt27.getTitle();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i36 == 100);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        java.lang.String str30 = appt23.toString();
        int i31 = appt23.getStartMonth();
        int i32 = appt23.getStartMonth();
        appt23.setStartHour((int) (short) -1);
        int i35 = appt23.getStartHour();
        appt23.setStartMonth((int) (short) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(i32 == 100);
        org.junit.Assert.assertTrue(i35 == (-1));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        int i4 = calDay0.month;
        int i5 = calDay0.day;
        boolean b6 = calDay0.valid;
        int i7 = calDay0.month;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartYear();
        boolean b32 = appt23.getValid();
        int i33 = appt23.getStartDay();
        appt23.setStartMinute((int) (byte) 10);
        java.lang.String str36 = appt23.getTitle();
        int i37 = appt23.getStartMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertTrue(i37 == 100);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        int i9 = calDay0.year;
        calDay0.day = (byte) 100;
        java.lang.String str12 = calDay0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        calDay0.month = 'a';
        calDay0.year = (byte) 10;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.getDay();
        calDay0.day = 10;
        boolean b11 = calDay0.valid;
        CalDay calDay12 = new CalDay();
        java.lang.String str13 = calDay12.toString();
        calDay12.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt16 = calDay12.getAppts();
        Appt appt24 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt24.setTitle("hi!");
        calDay12.addAppt(appt24);
        Appt appt35 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt35.setTitle("hi!");
        appt35.setTitle("");
        calDay12.addAppt(appt35);
        Appt appt48 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt48.setTitle("hi!");
        calDay12.addAppt(appt48);
        TimeTable timeTable52 = new TimeTable();
        TimeTable timeTable53 = new TimeTable();
        Appt appt61 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt69 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array70 = new Appt[] { appt61, appt69 };
        java.util.LinkedList<Appt> linkedlist_appt71 = new java.util.LinkedList<Appt>();
        boolean b72 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt71, appt_array70);
        Appt appt73 = null;
        java.util.LinkedList<Appt> linkedlist_appt74 = timeTable53.deleteAppt(linkedlist_appt71, appt73);
        CalDay calDay75 = new CalDay();
        java.lang.String str76 = calDay75.toString();
        calDay75.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt79 = calDay75.getAppts();
        Appt appt87 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt87.setTitle("hi!");
        calDay75.addAppt(appt87);
        int i91 = appt87.getStartYear();
        int i92 = appt87.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt93 = timeTable52.deleteAppt(linkedlist_appt71, appt87);
        calDay12.appts = linkedlist_appt71;
        calDay0.appts = linkedlist_appt71;
        int i96 = calDay0.day;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt16);
        org.junit.Assert.assertNotNull(appt_array70);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNull(linkedlist_appt74);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt79);
        org.junit.Assert.assertTrue(i91 == 100);
        org.junit.Assert.assertTrue(i92 == 100);
        org.junit.Assert.assertNull(linkedlist_appt93);
        org.junit.Assert.assertTrue(i96 == 10);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.year = (byte) 1;
        int i5 = calDay0.year;
        calDay0.month = 52;
        calDay0.valid = false;
        int i10 = calDay0.year;
        int i11 = calDay0.getYear();
        calDay0.day = 32;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        int i36 = appt27.getStartYear();
        java.lang.String str37 = appt27.getTitle();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i36 == 100);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.getDay();
        calDay0.day = 10;
        int i11 = calDay0.getYear();
        boolean b12 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        Appt appt7 = new Appt(0, 35, 0, (int) (byte) 0, (int) (short) 0, "hi!", "");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setStartMonth(52);
        int i10 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i10 == 52);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        int i8 = calDay0.month;
        calDay0.month = (short) 1;
        java.lang.String str11 = calDay0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        int i43 = calDay0.getDay();
        CalDay calDay44 = new CalDay();
        java.lang.String str45 = calDay44.toString();
        calDay44.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt48 = calDay44.appts;
        calDay44.month = (byte) 100;
        CalDay calDay51 = new CalDay();
        java.lang.String str52 = calDay51.toString();
        calDay51.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt55 = calDay51.getAppts();
        Appt appt63 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt63.setTitle("hi!");
        calDay51.addAppt(appt63);
        int i67 = appt63.getStartYear();
        int i68 = appt63.getStartMonth();
        calDay44.addAppt(appt63);
        calDay0.addAppt(appt63);
        int i71 = calDay0.getDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i43 == 10);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt48);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt55);
        org.junit.Assert.assertTrue(i67 == 100);
        org.junit.Assert.assertTrue(i68 == 100);
        org.junit.Assert.assertTrue(i71 == 10);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        calDay0.year = 'a';
        int i10 = calDay0.getYear();
        java.lang.String str11 = calDay0.toString();
        java.lang.String str12 = calDay0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        Appt appt7 = new Appt((int) 'a', (int) '#', (int) ' ', 10, (int) (short) 10, "", "");
        appt7.setStartDay(100);
        java.lang.String str10 = appt7.toString();
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.year = (byte) 1;
        calDay0.year = (short) 10;
        calDay0.year = (short) -1;
        calDay0.day = (short) 100;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        Appt appt7 = new Appt((int) (byte) 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0, 0, "hi!", "");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        boolean b5 = calDay0.valid;
        int i6 = calDay0.month;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        calDay0.day = 10;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(iterator_wildcard7);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        calDay0.day = 35;
        boolean b7 = calDay0.valid;
        int i8 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        CalDay calDay0 = new CalDay();
        int i1 = calDay0.getMonth();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNull(linkedlist_appt2);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        calDay0.month = 'a';
        java.util.LinkedList<Appt> linkedlist_appt31 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertNull(linkedlist_appt31);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        appt7.setTitle("");
        int i12 = appt7.getStartHour();
        appt7.setStartMonth(0);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        int i6 = calDay0.getDay();
        int i7 = calDay0.year;
        Appt appt15 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i16 = appt15.getStartHour();
        boolean b17 = appt15.getValid();
        int i18 = appt15.getStartMinute();
        calDay0.addAppt(appt15);
        java.util.LinkedList<Appt> linkedlist_appt20 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertNull(linkedlist_appt20);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.day;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        Appt appt7 = new Appt(35, 0, (-1), (int) (byte) -1, 100, "hi!", "hi!");
        appt7.setStartMonth((int) (byte) 10);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        calDay0.valid = true;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        java.lang.String str11 = appt7.getTitle();
        int i12 = appt7.getStartMinute();
        appt7.setStartMonth((int) (short) -1);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == 52);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        Appt appt7 = new Appt(1, 97, (int) (byte) 100, (int) (short) 0, 2, "", "hi!");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartYear();
        boolean b32 = appt23.getValid();
        int i33 = appt23.getStartHour();
        appt23.setDescription("hi!");
        appt23.setStartDay((int) (short) 100);
        appt23.setStartYear((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == (-1));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        int i43 = calDay0.getDay();
        CalDay calDay44 = new CalDay();
        java.lang.String str45 = calDay44.toString();
        calDay44.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt48 = calDay44.appts;
        calDay44.month = (byte) 100;
        CalDay calDay51 = new CalDay();
        java.lang.String str52 = calDay51.toString();
        calDay51.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt55 = calDay51.getAppts();
        Appt appt63 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt63.setTitle("hi!");
        calDay51.addAppt(appt63);
        int i67 = appt63.getStartYear();
        int i68 = appt63.getStartMonth();
        calDay44.addAppt(appt63);
        calDay0.addAppt(appt63);
        int i71 = appt63.getStartMinute();
        appt63.setStartYear(52);
        int i74 = appt63.getStartMinute();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i43 == 10);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt48);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt55);
        org.junit.Assert.assertTrue(i67 == 100);
        org.junit.Assert.assertTrue(i68 == 100);
        org.junit.Assert.assertTrue(i71 == 52);
        org.junit.Assert.assertTrue(i74 == 52);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.valid = true;
        calDay0.month = (short) -1;
        boolean b8 = calDay0.valid;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setStartMonth((int) (short) 1);
        int i10 = appt7.getStartDay();
        appt7.setStartMinute((int) (byte) 1);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.getDay();
        calDay0.day = 10;
        boolean b11 = calDay0.valid;
        int i12 = calDay0.month;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartHour();
        boolean b9 = appt7.getValid();
        int i10 = appt7.getStartMinute();
        int i11 = appt7.getStartDay();
        java.lang.String str12 = appt7.getDescription();
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.getYear();
        CalDay calDay5 = new CalDay();
        java.lang.String str6 = calDay5.toString();
        calDay5.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay5.getAppts();
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt17.setTitle("hi!");
        calDay5.addAppt(appt17);
        Appt appt28 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt28.setTitle("hi!");
        appt28.setTitle("");
        calDay5.addAppt(appt28);
        appt28.setTitle("");
        appt28.setTitle("");
        calDay0.addAppt(appt28);
        java.lang.String str39 = calDay0.toString();
        boolean b40 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard41 = calDay0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(iterator_wildcard41);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        Appt appt7 = new Appt((int) (byte) -1, (int) (byte) -1, (int) (short) 100, 100, (int) (short) 10, "hi!", "hi!");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        int i41 = appt33.getStartYear();
        boolean b42 = appt33.getValid();
        appt33.setStartMonth((int) (short) -1);
        calDay0.addAppt(appt33);
        int i46 = calDay0.getMonth();
        int i47 = calDay0.getDay();
        int i48 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i47 == 10);
        org.junit.Assert.assertTrue(i48 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartMonth();
        int i9 = appt7.getStartMinute();
        boolean b10 = appt7.getValid();
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setDescription("");
        java.lang.String str10 = appt7.getDescription();
        int i11 = appt7.getStartMinute();
        appt7.setStartYear(97);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 52);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        appt7.setTitle("");
        java.lang.String str12 = appt7.getTitle();
        appt7.setStartDay((int) (short) 1);
        int i15 = appt7.getStartMonth();
        int i16 = appt7.getStartDay();
        java.lang.String str17 = appt7.getTitle();
        java.lang.String str18 = appt7.getTitle();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(i15 == 100);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        int i10 = calDay0.getMonth();
        java.util.LinkedList<Appt> linkedlist_appt11 = calDay0.appts;
        Appt appt19 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt19.setTitle("hi!");
        appt19.setTitle("");
        calDay0.addAppt(appt19);
        appt19.setStartYear(1);
        appt19.setStartMonth(0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(linkedlist_appt11);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        TimeTable timeTable0 = new TimeTable();
        TimeTable timeTable1 = new TimeTable();
        Appt appt9 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array18 = new Appt[] { appt9, appt17 };
        java.util.LinkedList<Appt> linkedlist_appt19 = new java.util.LinkedList<Appt>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt19, appt_array18);
        Appt appt21 = null;
        java.util.LinkedList<Appt> linkedlist_appt22 = timeTable1.deleteAppt(linkedlist_appt19, appt21);
        CalDay calDay23 = new CalDay();
        java.lang.String str24 = calDay23.toString();
        calDay23.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt27 = calDay23.getAppts();
        Appt appt35 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt35.setTitle("hi!");
        calDay23.addAppt(appt35);
        int i39 = appt35.getStartYear();
        int i40 = appt35.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt41 = timeTable0.deleteAppt(linkedlist_appt19, appt35);
        CalDay calDay42 = new CalDay();
        java.lang.String str43 = calDay42.toString();
        calDay42.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt46 = calDay42.appts;
        boolean b47 = calDay42.valid;
        calDay42.year = '4';
        java.util.LinkedList<Appt> linkedlist_appt50 = calDay42.appts;
        CalDay calDay51 = new CalDay();
        java.lang.String str52 = calDay51.toString();
        int i53 = calDay51.day;
        int i54 = calDay51.getYear();
        int i55 = calDay51.getYear();
        TimeTable timeTable56 = new TimeTable();
        Appt appt64 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt72 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array73 = new Appt[] { appt64, appt72 };
        java.util.LinkedList<Appt> linkedlist_appt74 = new java.util.LinkedList<Appt>();
        boolean b75 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt74, appt_array73);
        Appt appt76 = null;
        java.util.LinkedList<Appt> linkedlist_appt77 = timeTable56.deleteAppt(linkedlist_appt74, appt76);
        calDay51.appts = linkedlist_appt74;
        calDay42.appts = linkedlist_appt74;
        java.util.GregorianCalendar gregorianCalendar80 = null;
        java.util.GregorianCalendar gregorianCalendar81 = null;
        try {
            java.util.LinkedList<CalDay> linkedlist_calDay82 = timeTable0.getApptRange(linkedlist_appt74, gregorianCalendar80, gregorianCalendar81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(appt_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt27);
        org.junit.Assert.assertTrue(i39 == 100);
        org.junit.Assert.assertTrue(i40 == 100);
        org.junit.Assert.assertNull(linkedlist_appt41);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(linkedlist_appt50);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNotNull(appt_array73);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNull(linkedlist_appt77);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.year = (short) 1;
        int i5 = calDay0.getYear();
        java.lang.String str6 = calDay0.toString();
        Appt appt14 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i15 = appt14.getStartHour();
        java.lang.String str16 = appt14.getTitle();
        int i17 = appt14.getStartMinute();
        calDay0.addAppt(appt14);
        calDay0.day = (byte) 10;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i17 == 52);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        int i9 = calDay0.month;
        calDay0.year = 97;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        Appt appt7 = new Appt(52, (int) (short) -1, (int) (byte) 1, 10, (int) (short) 1, "", "hi!");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = calDay0.day;
        int i30 = calDay0.year;
        int i31 = calDay0.getMonth();
        int i32 = calDay0.getYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == 10);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        Appt appt7 = new Appt(0, (int) '#', 0, (int) (byte) 1, (int) (short) 1, "hi!", "hi!");
        int i8 = appt7.getStartYear();
        int i9 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.year = (short) 1;
        java.lang.String str5 = calDay0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        Appt appt7 = new Appt((int) 'a', 10, 32, (int) (byte) 1, (-1), "", "");
        int i8 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartHour();
        appt23.setStartMonth((int) (byte) 100);
        int i34 = appt23.getStartMonth();
        int i35 = appt23.getStartDay();
        java.lang.String str36 = appt23.getDescription();
        boolean b37 = appt23.getValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(i34 == 100);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        calDay0.year = 'a';
        int i10 = calDay0.getYear();
        int i11 = calDay0.getYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 97);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        appt7.setTitle("");
        java.lang.String str12 = appt7.getTitle();
        appt7.setStartDay((int) (byte) 10);
        int i15 = appt7.getStartHour();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setDescription("hi!");
        java.lang.String str13 = appt7.toString();
        boolean b14 = appt7.getValid();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        java.lang.String str30 = appt23.toString();
        int i31 = appt23.getStartMonth();
        int i32 = appt23.getStartMinute();
        int i33 = appt23.getStartDay();
        appt23.setStartMonth(10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(i32 == 52);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        int i36 = appt27.getStartYear();
        boolean b37 = appt27.getValid();
        int i38 = appt27.getStartHour();
        java.lang.String str39 = appt27.getTitle();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i36 == 100);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        calDay0.month = (short) 100;
        calDay0.day = (byte) 10;
        TimeTable timeTable40 = new TimeTable();
        TimeTable timeTable41 = new TimeTable();
        Appt appt49 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt57 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array58 = new Appt[] { appt49, appt57 };
        java.util.LinkedList<Appt> linkedlist_appt59 = new java.util.LinkedList<Appt>();
        boolean b60 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt59, appt_array58);
        Appt appt61 = null;
        java.util.LinkedList<Appt> linkedlist_appt62 = timeTable41.deleteAppt(linkedlist_appt59, appt61);
        CalDay calDay63 = new CalDay();
        java.lang.String str64 = calDay63.toString();
        calDay63.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt67 = calDay63.getAppts();
        Appt appt75 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt75.setTitle("hi!");
        calDay63.addAppt(appt75);
        int i79 = appt75.getStartYear();
        int i80 = appt75.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt81 = timeTable40.deleteAppt(linkedlist_appt59, appt75);
        calDay0.appts = linkedlist_appt59;
        java.util.LinkedList<Appt> linkedlist_appt83 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertNotNull(appt_array58);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(linkedlist_appt62);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt67);
        org.junit.Assert.assertTrue(i79 == 100);
        org.junit.Assert.assertTrue(i80 == 100);
        org.junit.Assert.assertNull(linkedlist_appt81);
        org.junit.Assert.assertNotNull(linkedlist_appt83);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        int i30 = appt23.getStartYear();
        boolean b31 = appt23.getValid();
        appt23.setStartMinute(1);
        java.lang.String str34 = appt23.getTitle();
        int i35 = appt23.getStartMinute();
        appt23.setStartMinute((int) '4');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(i30 == 100);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue(i35 == 1);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        CalDay calDay0 = new CalDay();
        calDay0.year = (short) 10;
        calDay0.valid = false;
        boolean b5 = calDay0.valid;
        Appt appt13 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt13.setTitle("hi!");
        boolean b16 = appt13.getValid();
        java.lang.String str17 = appt13.getTitle();
        int i18 = appt13.getStartMinute();
        int i19 = appt13.getStartDay();
        calDay0.addAppt(appt13);
        appt13.setStartMonth((int) (short) 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        CalDay calDay0 = new CalDay();
        calDay0.year = (short) 10;
        int i3 = calDay0.getYear();
        calDay0.year = 'a';
        int i6 = calDay0.getMonth();
        CalDay calDay7 = new CalDay();
        java.lang.String str8 = calDay7.toString();
        calDay7.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt11 = calDay7.getAppts();
        Appt appt19 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt19.setTitle("hi!");
        calDay7.addAppt(appt19);
        Appt appt30 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt30.setTitle("hi!");
        appt30.setTitle("");
        calDay7.addAppt(appt30);
        int i36 = appt30.getStartHour();
        appt30.setStartYear((int) (byte) 100);
        java.lang.String str39 = appt30.getTitle();
        calDay0.addAppt(appt30);
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt11);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setDescription("");
        java.lang.String str10 = appt7.getDescription();
        appt7.setStartMonth((int) '#');
        java.lang.String str13 = appt7.getDescription();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        TimeTable timeTable0 = new TimeTable();
        TimeTable timeTable1 = new TimeTable();
        Appt appt9 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array18 = new Appt[] { appt9, appt17 };
        java.util.LinkedList<Appt> linkedlist_appt19 = new java.util.LinkedList<Appt>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt19, appt_array18);
        Appt appt21 = null;
        java.util.LinkedList<Appt> linkedlist_appt22 = timeTable1.deleteAppt(linkedlist_appt19, appt21);
        CalDay calDay23 = new CalDay();
        java.lang.String str24 = calDay23.toString();
        calDay23.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt27 = calDay23.getAppts();
        Appt appt35 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt35.setTitle("hi!");
        calDay23.addAppt(appt35);
        int i39 = appt35.getStartYear();
        int i40 = appt35.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt41 = timeTable0.deleteAppt(linkedlist_appt19, appt35);
        CalDay calDay42 = new CalDay();
        java.lang.String str43 = calDay42.toString();
        calDay42.year = (byte) 1;
        calDay42.year = (byte) 100;
        int i48 = calDay42.day;
        int i49 = calDay42.getYear();
        TimeTable timeTable50 = new TimeTable();
        Appt appt58 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt66 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array67 = new Appt[] { appt58, appt66 };
        java.util.LinkedList<Appt> linkedlist_appt68 = new java.util.LinkedList<Appt>();
        boolean b69 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt68, appt_array67);
        Appt appt70 = null;
        java.util.LinkedList<Appt> linkedlist_appt71 = timeTable50.deleteAppt(linkedlist_appt68, appt70);
        calDay42.appts = linkedlist_appt68;
        java.util.LinkedList<Appt> linkedlist_appt73 = calDay42.getAppts();
        java.util.GregorianCalendar gregorianCalendar74 = null;
        java.util.GregorianCalendar gregorianCalendar75 = null;
        try {
            java.util.LinkedList<CalDay> linkedlist_calDay76 = timeTable0.getApptRange(linkedlist_appt73, gregorianCalendar74, gregorianCalendar75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(appt_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt27);
        org.junit.Assert.assertTrue(i39 == 100);
        org.junit.Assert.assertTrue(i40 == 100);
        org.junit.Assert.assertNull(linkedlist_appt41);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(i49 == 100);
        org.junit.Assert.assertNotNull(appt_array67);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNull(linkedlist_appt71);
        org.junit.Assert.assertNotNull(linkedlist_appt73);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        calDay0.month = (short) 100;
        calDay0.year = (byte) 100;
        calDay0.day = (short) 0;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        int i16 = appt12.getStartYear();
        int i17 = appt12.getStartMonth();
        int i18 = appt12.getStartYear();
        int i19 = appt12.getStartMonth();
        int i20 = appt12.getStartMinute();
        appt12.setStartDay((int) '#');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue(i17 == 100);
        org.junit.Assert.assertTrue(i18 == 100);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(i20 == 52);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        TimeTable timeTable0 = new TimeTable();
        TimeTable timeTable1 = new TimeTable();
        CalDay calDay2 = new CalDay();
        java.lang.String str3 = calDay2.toString();
        calDay2.year = (byte) 1;
        calDay2.year = (byte) 100;
        int i8 = calDay2.day;
        int i9 = calDay2.getYear();
        TimeTable timeTable10 = new TimeTable();
        Appt appt18 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt26 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array27 = new Appt[] { appt18, appt26 };
        java.util.LinkedList<Appt> linkedlist_appt28 = new java.util.LinkedList<Appt>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt28, appt_array27);
        Appt appt30 = null;
        java.util.LinkedList<Appt> linkedlist_appt31 = timeTable10.deleteAppt(linkedlist_appt28, appt30);
        calDay2.appts = linkedlist_appt28;
        java.util.LinkedList<Appt> linkedlist_appt33 = calDay2.getAppts();
        CalDay calDay34 = new CalDay();
        java.lang.String str35 = calDay34.toString();
        int i36 = calDay34.day;
        int i37 = calDay34.getYear();
        int i38 = calDay34.getYear();
        CalDay calDay39 = new CalDay();
        java.lang.String str40 = calDay39.toString();
        calDay39.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt43 = calDay39.getAppts();
        Appt appt51 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt51.setTitle("hi!");
        calDay39.addAppt(appt51);
        Appt appt62 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt62.setTitle("hi!");
        appt62.setTitle("");
        calDay39.addAppt(appt62);
        appt62.setTitle("");
        appt62.setTitle("");
        calDay34.addAppt(appt62);
        appt62.setTitle("hi!");
        java.util.LinkedList<Appt> linkedlist_appt75 = timeTable1.deleteAppt(linkedlist_appt33, appt62);
        java.util.GregorianCalendar gregorianCalendar76 = null;
        java.util.GregorianCalendar gregorianCalendar77 = null;
        try {
            java.util.LinkedList<CalDay> linkedlist_calDay78 = timeTable0.getApptRange(linkedlist_appt33, gregorianCalendar76, gregorianCalendar77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 100);
        org.junit.Assert.assertNotNull(appt_array27);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(linkedlist_appt31);
        org.junit.Assert.assertNotNull(linkedlist_appt33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt43);
        org.junit.Assert.assertNull(linkedlist_appt75);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.valid = false;
        calDay0.day = (short) -1;
        calDay0.year = '#';
        int i9 = calDay0.getDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        Appt appt7 = new Appt(35, 0, (-1), (int) (byte) -1, 100, "hi!", "hi!");
        appt7.setTitle("");
        int i10 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        int i16 = appt12.getStartYear();
        int i17 = appt12.getStartMonth();
        int i18 = appt12.getStartYear();
        int i19 = appt12.getStartHour();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue(i17 == 100);
        org.junit.Assert.assertTrue(i18 == 100);
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartYear();
        boolean b32 = appt23.getValid();
        int i33 = appt23.getStartDay();
        appt23.setStartMinute((int) (byte) 10);
        java.lang.String str36 = appt23.getTitle();
        int i37 = appt23.getStartHour();
        appt23.setTitle("");
        int i40 = appt23.getStartDay();
        int i41 = appt23.getStartHour();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i41 == (-1));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        java.lang.String str11 = appt7.getTitle();
        int i12 = appt7.getStartMinute();
        appt7.setStartYear(10);
        java.lang.String str15 = appt7.getTitle();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == 52);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        calDay0.year = (byte) 100;
        int i6 = calDay0.day;
        int i7 = calDay0.getYear();
        TimeTable timeTable8 = new TimeTable();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt24 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array25 = new Appt[] { appt16, appt24 };
        java.util.LinkedList<Appt> linkedlist_appt26 = new java.util.LinkedList<Appt>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt26, appt_array25);
        Appt appt28 = null;
        java.util.LinkedList<Appt> linkedlist_appt29 = timeTable8.deleteAppt(linkedlist_appt26, appt28);
        calDay0.appts = linkedlist_appt26;
        java.util.LinkedList<Appt> linkedlist_appt31 = calDay0.getAppts();
        int i32 = calDay0.getYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertNotNull(appt_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(linkedlist_appt29);
        org.junit.Assert.assertNotNull(linkedlist_appt31);
        org.junit.Assert.assertTrue(i32 == 100);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.valid = true;
        calDay0.valid = false;
        int i8 = calDay0.year;
        java.util.Iterator<?> iterator_wildcard9 = calDay0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(iterator_wildcard9);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        TimeTable timeTable0 = new TimeTable();
        Appt appt8 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array17 = new Appt[] { appt8, appt16 };
        java.util.LinkedList<Appt> linkedlist_appt18 = new java.util.LinkedList<Appt>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt18, appt_array17);
        Appt appt20 = null;
        java.util.LinkedList<Appt> linkedlist_appt21 = timeTable0.deleteAppt(linkedlist_appt18, appt20);
        java.util.LinkedList<Appt> linkedlist_appt22 = null;
        Appt appt30 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt30.setTitle("hi!");
        boolean b33 = appt30.getValid();
        appt30.setDescription("hi!");
        java.util.LinkedList<Appt> linkedlist_appt36 = timeTable0.deleteAppt(linkedlist_appt22, appt30);
        appt30.setStartHour(52);
        int i39 = appt30.getStartDay();
        org.junit.Assert.assertNotNull(appt_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(linkedlist_appt21);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(linkedlist_appt36);
        org.junit.Assert.assertTrue(i39 == 0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        Appt appt7 = new Appt((-1), (int) ' ', (-1), 52, 0, "hi!", "hi!");
        boolean b8 = appt7.getValid();
        appt7.setStartMinute((int) (short) 10);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        int i6 = calDay0.getDay();
        boolean b7 = calDay0.isValid();
        calDay0.year = 'a';
        java.util.Iterator<?> iterator_wildcard10 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard11 = calDay0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(iterator_wildcard10);
        org.junit.Assert.assertNull(iterator_wildcard11);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        calDay0.year = (byte) 100;
        calDay0.day = (short) 10;
        int i8 = calDay0.year;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i8 == 100);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.valid = true;
        int i6 = calDay0.day;
        boolean b7 = calDay0.isValid();
        int i8 = calDay0.month;
        int i9 = calDay0.getDay();
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        int i41 = appt33.getStartYear();
        boolean b42 = appt33.getValid();
        int i43 = appt33.getStartDay();
        appt33.setStartMinute((int) (byte) 10);
        java.lang.String str46 = appt33.getTitle();
        int i47 = appt33.getStartHour();
        appt33.setStartMonth((int) (byte) 0);
        java.lang.String str50 = appt33.getDescription();
        java.lang.String str51 = appt33.toString();
        calDay0.addAppt(appt33);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertTrue(i47 == (-1));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.year = (short) 1;
        int i5 = calDay0.getYear();
        boolean b6 = calDay0.valid;
        java.lang.String str7 = calDay0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        calDay0.month = (short) 100;
        calDay0.year = (byte) 100;
        int i40 = calDay0.getYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i40 == 100);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        int i30 = appt23.getStartYear();
        boolean b31 = appt23.getValid();
        appt23.setStartHour((int) (byte) -1);
        int i34 = appt23.getStartYear();
        boolean b35 = appt23.getValid();
        appt23.setDescription("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(i30 == 100);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 100);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.year = (byte) 1;
        calDay0.year = (short) 10;
        calDay0.year = (short) -1;
        int i9 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = calDay0.day;
        int i30 = calDay0.year;
        int i31 = calDay0.getMonth();
        int i32 = calDay0.year;
        calDay0.day = 'a';
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == 10);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        calDay0.month = 'a';
        java.lang.String str10 = calDay0.toString();
        CalDay calDay11 = new CalDay();
        java.lang.String str12 = calDay11.toString();
        calDay11.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt15 = calDay11.appts;
        boolean b16 = calDay11.valid;
        calDay11.year = '4';
        java.util.LinkedList<Appt> linkedlist_appt19 = calDay11.appts;
        CalDay calDay20 = new CalDay();
        java.lang.String str21 = calDay20.toString();
        int i22 = calDay20.day;
        int i23 = calDay20.getYear();
        int i24 = calDay20.getYear();
        TimeTable timeTable25 = new TimeTable();
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt41 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array42 = new Appt[] { appt33, appt41 };
        java.util.LinkedList<Appt> linkedlist_appt43 = new java.util.LinkedList<Appt>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt43, appt_array42);
        Appt appt45 = null;
        java.util.LinkedList<Appt> linkedlist_appt46 = timeTable25.deleteAppt(linkedlist_appt43, appt45);
        calDay20.appts = linkedlist_appt43;
        calDay11.appts = linkedlist_appt43;
        calDay0.appts = linkedlist_appt43;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(linkedlist_appt19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(appt_array42);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNull(linkedlist_appt46);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        int i5 = calDay0.month;
        int i6 = calDay0.year;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        calDay0.year = '4';
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.appts;
        CalDay calDay9 = new CalDay();
        java.lang.String str10 = calDay9.toString();
        int i11 = calDay9.day;
        int i12 = calDay9.getYear();
        int i13 = calDay9.getYear();
        TimeTable timeTable14 = new TimeTable();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt30 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array31 = new Appt[] { appt22, appt30 };
        java.util.LinkedList<Appt> linkedlist_appt32 = new java.util.LinkedList<Appt>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt32, appt_array31);
        Appt appt34 = null;
        java.util.LinkedList<Appt> linkedlist_appt35 = timeTable14.deleteAppt(linkedlist_appt32, appt34);
        calDay9.appts = linkedlist_appt32;
        calDay0.appts = linkedlist_appt32;
        calDay0.valid = false;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(appt_array31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(linkedlist_appt35);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        int i10 = calDay0.getMonth();
        java.util.LinkedList<Appt> linkedlist_appt11 = calDay0.appts;
        Appt appt19 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt19.setTitle("hi!");
        appt19.setTitle("");
        calDay0.addAppt(appt19);
        java.lang.String str25 = appt19.getDescription();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(linkedlist_appt11);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        int i10 = calDay0.getMonth();
        calDay0.valid = false;
        int i13 = calDay0.year;
        boolean b14 = calDay0.valid;
        int i15 = calDay0.year;
        java.util.LinkedList<Appt> linkedlist_appt16 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(linkedlist_appt16);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        appt7.setTitle("");
        java.lang.String str12 = appt7.getTitle();
        appt7.setStartDay((int) (byte) 10);
        appt7.setStartMinute(32);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        boolean b6 = calDay0.valid;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.getDay();
        calDay0.day = 10;
        CalDay calDay11 = new CalDay();
        java.lang.String str12 = calDay11.toString();
        calDay11.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt15 = calDay11.getAppts();
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        calDay11.addAppt(appt23);
        Appt appt34 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt34.setTitle("hi!");
        appt34.setTitle("");
        calDay11.addAppt(appt34);
        Appt appt47 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt47.setTitle("hi!");
        boolean b50 = appt47.getValid();
        appt47.setStartMonth(0);
        calDay11.addAppt(appt47);
        calDay0.addAppt(appt47);
        appt47.setTitle("");
        int i57 = appt47.getStartMonth();
        appt47.setStartHour((int) (short) 100);
        java.lang.String str60 = appt47.getTitle();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt15);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        Appt appt7 = new Appt((int) (short) 100, (int) (byte) 100, (int) '4', (int) (byte) -1, 0, "", "");
        java.lang.String str8 = appt7.getTitle();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        boolean b31 = appt23.getValid();
        appt23.setStartMonth(97);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        calDay0.year = (byte) 100;
        boolean b6 = calDay0.valid;
        java.util.LinkedList<Appt> linkedlist_appt7 = calDay0.appts;
        Appt appt15 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt15.setTitle("hi!");
        appt15.setTitle("");
        int i20 = appt15.getStartHour();
        java.lang.String str21 = appt15.getDescription();
        java.lang.String str22 = appt15.getDescription();
        calDay0.addAppt(appt15);
        java.util.LinkedList<Appt> linkedlist_appt24 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(linkedlist_appt7);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt24);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        int i9 = calDay0.getYear();
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.year = (byte) 1;
        calDay10.year = (byte) 100;
        int i16 = calDay10.day;
        int i17 = calDay10.getYear();
        TimeTable timeTable18 = new TimeTable();
        Appt appt26 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt34 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array35 = new Appt[] { appt26, appt34 };
        java.util.LinkedList<Appt> linkedlist_appt36 = new java.util.LinkedList<Appt>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt36, appt_array35);
        Appt appt38 = null;
        java.util.LinkedList<Appt> linkedlist_appt39 = timeTable18.deleteAppt(linkedlist_appt36, appt38);
        calDay10.appts = linkedlist_appt36;
        java.util.LinkedList<Appt> linkedlist_appt41 = calDay10.getAppts();
        calDay0.appts = linkedlist_appt41;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(i17 == 100);
        org.junit.Assert.assertNotNull(appt_array35);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(linkedlist_appt39);
        org.junit.Assert.assertNotNull(linkedlist_appt41);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        boolean b5 = calDay0.isValid();
        java.util.LinkedList<Appt> linkedlist_appt6 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(linkedlist_appt6);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        int i10 = calDay0.getMonth();
        CalDay calDay11 = new CalDay();
        java.lang.String str12 = calDay11.toString();
        java.util.LinkedList<Appt> linkedlist_appt13 = calDay11.getAppts();
        calDay11.year = (short) 1;
        java.util.Iterator<?> iterator_wildcard16 = calDay11.iterator();
        int i17 = calDay11.getDay();
        CalDay calDay18 = new CalDay();
        java.lang.String str19 = calDay18.toString();
        calDay18.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt22 = calDay18.getAppts();
        Appt appt30 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt30.setTitle("hi!");
        calDay18.addAppt(appt30);
        Appt appt41 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt41.setTitle("hi!");
        appt41.setTitle("");
        calDay18.addAppt(appt41);
        appt41.setTitle("");
        int i49 = appt41.getStartYear();
        boolean b50 = appt41.getValid();
        int i51 = appt41.getStartDay();
        appt41.setStartMinute((int) (byte) 10);
        java.lang.String str54 = appt41.getTitle();
        int i55 = appt41.getStartHour();
        calDay11.addAppt(appt41);
        CalDay calDay57 = new CalDay();
        java.lang.String str58 = calDay57.toString();
        calDay57.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt61 = calDay57.appts;
        boolean b62 = calDay57.valid;
        calDay57.year = '4';
        java.util.LinkedList<Appt> linkedlist_appt65 = calDay57.appts;
        CalDay calDay66 = new CalDay();
        java.lang.String str67 = calDay66.toString();
        int i68 = calDay66.day;
        int i69 = calDay66.getYear();
        int i70 = calDay66.getYear();
        TimeTable timeTable71 = new TimeTable();
        Appt appt79 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt87 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array88 = new Appt[] { appt79, appt87 };
        java.util.LinkedList<Appt> linkedlist_appt89 = new java.util.LinkedList<Appt>();
        boolean b90 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt89, appt_array88);
        Appt appt91 = null;
        java.util.LinkedList<Appt> linkedlist_appt92 = timeTable71.deleteAppt(linkedlist_appt89, appt91);
        calDay66.appts = linkedlist_appt89;
        calDay57.appts = linkedlist_appt89;
        calDay11.appts = linkedlist_appt89;
        java.util.LinkedList<Appt> linkedlist_appt96 = calDay11.appts;
        calDay0.appts = linkedlist_appt96;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt13);
        org.junit.Assert.assertNull(iterator_wildcard16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(i49 == 100);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        org.junit.Assert.assertTrue(i55 == (-1));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(linkedlist_appt65);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertNotNull(appt_array88);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertNull(linkedlist_appt92);
        org.junit.Assert.assertNotNull(linkedlist_appt96);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        int i41 = appt33.getStartYear();
        boolean b42 = appt33.getValid();
        appt33.setStartMonth((int) (short) -1);
        calDay0.addAppt(appt33);
        java.lang.String str46 = appt33.toString();
        appt33.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartHour();
        java.lang.String str9 = appt7.getTitle();
        java.lang.String str10 = appt7.getDescription();
        appt7.setStartMinute(0);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = calDay0.day;
        int i30 = calDay0.year;
        int i31 = calDay0.getMonth();
        int i32 = calDay0.getMonth();
        boolean b33 = calDay0.isValid();
        int i34 = calDay0.getDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == 10);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 10);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartHour(1);
        appt7.setStartDay(52);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        calDay0.year = '4';
        int i8 = calDay0.getDay();
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertNull(linkedlist_appt9);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        Appt appt7 = new Appt((int) (short) 100, (int) 'a', (int) (byte) 100, (int) '#', (int) (short) 100, "hi!", "hi!");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        CalDay calDay0 = new CalDay();
        calDay0.year = (short) 10;
        int i3 = calDay0.getYear();
        calDay0.year = 'a';
        boolean b6 = calDay0.valid;
        CalDay calDay7 = new CalDay();
        java.lang.String str8 = calDay7.toString();
        calDay7.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt11 = calDay7.getAppts();
        Appt appt19 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt19.setTitle("hi!");
        calDay7.addAppt(appt19);
        Appt appt30 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt30.setTitle("hi!");
        appt30.setTitle("");
        calDay7.addAppt(appt30);
        appt30.setTitle("");
        int i38 = appt30.getStartYear();
        boolean b39 = appt30.getValid();
        int i40 = appt30.getStartHour();
        calDay0.addAppt(appt30);
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt11);
        org.junit.Assert.assertTrue(i38 == 100);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == (-1));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.day;
        java.util.LinkedList<Appt> linkedlist_appt5 = calDay0.appts;
        int i6 = calDay0.month;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(linkedlist_appt5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        int i41 = appt33.getStartYear();
        boolean b42 = appt33.getValid();
        appt33.setStartMonth((int) (short) -1);
        calDay0.addAppt(appt33);
        int i46 = appt33.getStartDay();
        java.lang.String str47 = appt33.toString();
        java.lang.String str48 = appt33.getDescription();
        int i49 = appt33.getStartHour();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue(i49 == (-1));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.valid = true;
        calDay0.valid = false;
        int i8 = calDay0.year;
        java.lang.String str9 = calDay0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.getMonth();
        calDay0.day = 35;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setStartMonth((int) (short) 1);
        appt7.setStartYear(52);
        int i12 = appt7.getStartMonth();
        java.lang.String str13 = appt7.getDescription();
        int i14 = appt7.getStartHour();
        int i15 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        calDay0.year = (short) 10;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartHour();
        java.lang.String str9 = appt7.getTitle();
        java.lang.String str10 = appt7.getDescription();
        appt7.setStartMinute(2);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        int i10 = calDay0.getMonth();
        Appt appt18 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        calDay0.addAppt(appt18);
        int i20 = appt18.getStartMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i20 == 100);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        appt27.setTitle("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartHour();
        appt7.setStartDay((int) (byte) 10);
        appt7.setStartHour((int) (byte) 10);
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        calDay0.valid = false;
        int i45 = calDay0.getYear();
        int i46 = calDay0.year;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(i46 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        CalDay calDay0 = new CalDay();
        calDay0.year = (short) 10;
        calDay0.valid = false;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.year;
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.year = (short) 1;
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        java.lang.String str6 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt7 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt7);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = calDay0.day;
        int i30 = calDay0.year;
        calDay0.year = 10;
        int i33 = calDay0.getMonth();
        calDay0.month = (short) 0;
        int i36 = calDay0.year;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == 10);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i36 == 10);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        CalDay calDay0 = new CalDay();
        Appt appt8 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i9 = appt8.getStartHour();
        appt8.setStartDay((int) (byte) 10);
        int i12 = appt8.getStartMonth();
        calDay0.addAppt(appt8);
        appt8.setStartDay(10);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(i12 == 100);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        boolean b43 = appt36.getValid();
        int i44 = appt36.getStartMonth();
        java.lang.String str45 = appt36.getTitle();
        int i46 = appt36.getStartHour();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertTrue(i46 == (-1));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        int i16 = appt12.getStartYear();
        int i17 = appt12.getStartMonth();
        int i18 = appt12.getStartYear();
        int i19 = appt12.getStartMonth();
        int i20 = appt12.getStartMinute();
        int i21 = appt12.getStartHour();
        appt12.setStartMinute((int) ' ');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue(i17 == 100);
        org.junit.Assert.assertTrue(i18 == 100);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(i20 == 52);
        org.junit.Assert.assertTrue(i21 == (-1));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        boolean b43 = appt36.getValid();
        int i44 = appt36.getStartDay();
        boolean b45 = appt36.getValid();
        appt36.setStartHour((int) '#');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        calDay0.year = '4';
        int i8 = calDay0.getDay();
        int i9 = calDay0.year;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(i9 == 52);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.valid = true;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        calDay0.month = 32;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        calDay0.day = (byte) 10;
        int i6 = calDay0.getDay();
        java.util.LinkedList<Appt> linkedlist_appt7 = calDay0.appts;
        java.util.Iterator<?> iterator_wildcard8 = calDay0.iterator();
        int i9 = calDay0.getYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(linkedlist_appt7);
        org.junit.Assert.assertNull(iterator_wildcard8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        java.lang.String str30 = appt23.toString();
        int i31 = appt23.getStartMonth();
        int i32 = appt23.getStartDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.getYear();
        TimeTable timeTable5 = new TimeTable();
        Appt appt13 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt21 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array22 = new Appt[] { appt13, appt21 };
        java.util.LinkedList<Appt> linkedlist_appt23 = new java.util.LinkedList<Appt>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt23, appt_array22);
        Appt appt25 = null;
        java.util.LinkedList<Appt> linkedlist_appt26 = timeTable5.deleteAppt(linkedlist_appt23, appt25);
        calDay0.appts = linkedlist_appt23;
        int i28 = calDay0.day;
        java.lang.String str29 = calDay0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(appt_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(linkedlist_appt26);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        boolean b31 = appt23.getValid();
        appt23.setDescription("");
        boolean b34 = appt23.getValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartMonth(0);
        int i13 = appt7.getStartHour();
        appt7.setStartYear((int) (short) 10);
        java.lang.String str16 = appt7.toString();
        int i17 = appt7.getStartDay();
        boolean b18 = appt7.getValid();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartHour();
        int i9 = appt7.getStartYear();
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.getDescription();
        appt7.setStartDay(97);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(i9 == 100);
        org.junit.Assert.assertTrue(i10 == 100);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        appt7.setTitle("");
        java.lang.String str12 = appt7.getTitle();
        appt7.setStartDay((int) (byte) 10);
        appt7.setStartYear((int) (short) 0);
        int i17 = appt7.getStartMinute();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(i17 == 52);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        boolean b9 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.year = (short) 1;
        int i5 = calDay0.getMonth();
        java.util.LinkedList<Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.year;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        calDay0.year = (byte) 100;
        boolean b6 = calDay0.valid;
        java.util.LinkedList<Appt> linkedlist_appt7 = calDay0.appts;
        Appt appt15 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt15.setTitle("hi!");
        appt15.setTitle("");
        int i20 = appt15.getStartHour();
        java.lang.String str21 = appt15.getDescription();
        java.lang.String str22 = appt15.getDescription();
        calDay0.addAppt(appt15);
        appt15.setStartMonth((int) (byte) -1);
        int i26 = appt15.getStartHour();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(linkedlist_appt7);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i26 == (-1));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        int i5 = calDay0.month;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        boolean b5 = calDay0.valid;
        int i6 = calDay0.month;
        java.lang.String str7 = calDay0.toString();
        calDay0.valid = false;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setStartMonth((int) (short) 1);
        appt7.setStartYear(52);
        int i12 = appt7.getStartMonth();
        java.lang.String str13 = appt7.getDescription();
        int i14 = appt7.getStartYear();
        appt7.setTitle("");
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 52);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        calDay0.month = 'a';
        int i31 = calDay0.day;
        java.util.LinkedList<Appt> linkedlist_appt32 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 10);
        org.junit.Assert.assertNull(linkedlist_appt32);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.day;
        java.util.LinkedList<Appt> linkedlist_appt5 = calDay0.appts;
        TimeTable timeTable6 = new TimeTable();
        TimeTable timeTable7 = new TimeTable();
        Appt appt15 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array24 = new Appt[] { appt15, appt23 };
        java.util.LinkedList<Appt> linkedlist_appt25 = new java.util.LinkedList<Appt>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt25, appt_array24);
        Appt appt27 = null;
        java.util.LinkedList<Appt> linkedlist_appt28 = timeTable7.deleteAppt(linkedlist_appt25, appt27);
        CalDay calDay29 = new CalDay();
        java.lang.String str30 = calDay29.toString();
        calDay29.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt33 = calDay29.getAppts();
        Appt appt41 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt41.setTitle("hi!");
        calDay29.addAppt(appt41);
        int i45 = appt41.getStartYear();
        int i46 = appt41.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt47 = timeTable6.deleteAppt(linkedlist_appt25, appt41);
        calDay0.appts = linkedlist_appt47;
        int i49 = calDay0.year;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(linkedlist_appt5);
        org.junit.Assert.assertNotNull(appt_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(linkedlist_appt28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt33);
        org.junit.Assert.assertTrue(i45 == 100);
        org.junit.Assert.assertTrue(i46 == 100);
        org.junit.Assert.assertNull(linkedlist_appt47);
        org.junit.Assert.assertTrue(i49 == 0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        boolean b43 = appt36.getValid();
        appt36.setStartHour(10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.getYear();
        CalDay calDay5 = new CalDay();
        java.lang.String str6 = calDay5.toString();
        calDay5.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay5.getAppts();
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt17.setTitle("hi!");
        calDay5.addAppt(appt17);
        Appt appt28 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt28.setTitle("hi!");
        appt28.setTitle("");
        calDay5.addAppt(appt28);
        appt28.setTitle("");
        appt28.setTitle("");
        calDay0.addAppt(appt28);
        int i39 = calDay0.month;
        Appt appt47 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt47.setStartMonth((int) (short) 1);
        int i50 = appt47.getStartYear();
        calDay0.addAppt(appt47);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(i50 == 100);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        java.lang.String str30 = appt23.toString();
        int i31 = appt23.getStartMonth();
        int i32 = appt23.getStartMinute();
        appt23.setTitle("hi!");
        boolean b35 = appt23.getValid();
        appt23.setStartHour((-1));
        appt23.setStartYear((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(i32 == 52);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        Appt appt7 = new Appt((int) (short) 0, (int) (short) 100, (-1), 0, 0, "hi!", "");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.valid = true;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        int i5 = calDay0.year;
        calDay0.year = (byte) 10;
        CalDay calDay8 = new CalDay();
        java.lang.String str9 = calDay8.toString();
        calDay8.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt12 = calDay8.appts;
        boolean b13 = calDay8.valid;
        int i14 = calDay8.day;
        java.util.Iterator<?> iterator_wildcard15 = calDay8.iterator();
        java.util.LinkedList<Appt> linkedlist_appt16 = calDay8.getAppts();
        java.lang.String str17 = calDay8.toString();
        int i18 = calDay8.getDay();
        int i19 = calDay8.getDay();
        CalDay calDay20 = new CalDay();
        java.lang.String str21 = calDay20.toString();
        calDay20.day = (byte) 10;
        CalDay calDay24 = new CalDay();
        java.lang.String str25 = calDay24.toString();
        calDay24.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt28 = calDay24.getAppts();
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        calDay24.addAppt(appt36);
        Appt appt47 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt47.setTitle("hi!");
        appt47.setTitle("");
        calDay24.addAppt(appt47);
        appt47.setTitle("");
        calDay20.addAppt(appt47);
        int i56 = appt47.getStartMonth();
        appt47.setTitle("");
        int i59 = appt47.getStartHour();
        int i60 = appt47.getStartYear();
        calDay8.addAppt(appt47);
        calDay0.addAppt(appt47);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertNull(iterator_wildcard15);
        org.junit.Assert.assertNull(linkedlist_appt16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == 10);
        org.junit.Assert.assertTrue(i19 == 10);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt28);
        org.junit.Assert.assertTrue(i56 == 100);
        org.junit.Assert.assertTrue(i59 == (-1));
        org.junit.Assert.assertTrue(i60 == 100);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        calDay0.month = (byte) 100;
        CalDay calDay7 = new CalDay();
        java.lang.String str8 = calDay7.toString();
        calDay7.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt11 = calDay7.getAppts();
        Appt appt19 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt19.setTitle("hi!");
        calDay7.addAppt(appt19);
        int i23 = appt19.getStartYear();
        int i24 = appt19.getStartMonth();
        calDay0.addAppt(appt19);
        int i26 = calDay0.day;
        int i27 = calDay0.getDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt11);
        org.junit.Assert.assertTrue(i23 == 100);
        org.junit.Assert.assertTrue(i24 == 100);
        org.junit.Assert.assertTrue(i26 == 10);
        org.junit.Assert.assertTrue(i27 == 10);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getDay();
        int i6 = calDay0.year;
        java.util.LinkedList<Appt> linkedlist_appt7 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(linkedlist_appt7);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        java.lang.String str30 = appt23.toString();
        int i31 = appt23.getStartMonth();
        int i32 = appt23.getStartMinute();
        java.lang.String str33 = appt23.getDescription();
        int i34 = appt23.getStartMinute();
        int i35 = appt23.getStartYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(i32 == 52);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue(i34 == 52);
        org.junit.Assert.assertTrue(i35 == 100);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartYear();
        java.lang.String str32 = appt23.getTitle();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.month = 0;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.year = (short) 1;
        int i5 = calDay0.day;
        CalDay calDay6 = new CalDay();
        java.lang.String str7 = calDay6.toString();
        calDay6.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt10 = calDay6.getAppts();
        int i11 = calDay6.getMonth();
        CalDay calDay12 = new CalDay();
        java.lang.String str13 = calDay12.toString();
        calDay12.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt16 = calDay12.getAppts();
        Appt appt24 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt24.setTitle("hi!");
        calDay12.addAppt(appt24);
        Appt appt35 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt35.setTitle("hi!");
        appt35.setTitle("");
        calDay12.addAppt(appt35);
        Appt appt48 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt48.setTitle("hi!");
        calDay12.addAppt(appt48);
        TimeTable timeTable52 = new TimeTable();
        TimeTable timeTable53 = new TimeTable();
        Appt appt61 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt69 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array70 = new Appt[] { appt61, appt69 };
        java.util.LinkedList<Appt> linkedlist_appt71 = new java.util.LinkedList<Appt>();
        boolean b72 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt71, appt_array70);
        Appt appt73 = null;
        java.util.LinkedList<Appt> linkedlist_appt74 = timeTable53.deleteAppt(linkedlist_appt71, appt73);
        CalDay calDay75 = new CalDay();
        java.lang.String str76 = calDay75.toString();
        calDay75.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt79 = calDay75.getAppts();
        Appt appt87 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt87.setTitle("hi!");
        calDay75.addAppt(appt87);
        int i91 = appt87.getStartYear();
        int i92 = appt87.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt93 = timeTable52.deleteAppt(linkedlist_appt71, appt87);
        calDay12.appts = linkedlist_appt71;
        calDay6.appts = linkedlist_appt71;
        calDay0.appts = linkedlist_appt71;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt16);
        org.junit.Assert.assertNotNull(appt_array70);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNull(linkedlist_appt74);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt79);
        org.junit.Assert.assertTrue(i91 == 100);
        org.junit.Assert.assertTrue(i92 == 100);
        org.junit.Assert.assertNull(linkedlist_appt93);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        calDay0.valid = true;
        int i6 = calDay0.day;
        int i7 = calDay0.month;
        int i8 = calDay0.getMonth();
        boolean b9 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        int i41 = appt33.getStartYear();
        boolean b42 = appt33.getValid();
        appt33.setStartMonth((int) (short) -1);
        calDay0.addAppt(appt33);
        int i46 = appt33.getStartDay();
        int i47 = appt33.getStartHour();
        java.lang.String str48 = appt33.getDescription();
        int i49 = appt33.getStartMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i47 == (-1));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue(i49 == (-1));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        int i30 = appt23.getStartYear();
        boolean b31 = appt23.getValid();
        appt23.setStartMinute(1);
        appt23.setStartHour(0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(i30 == 100);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartHour();
        boolean b9 = appt7.getValid();
        int i10 = appt7.getStartMinute();
        boolean b11 = appt7.getValid();
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        CalDay calDay0 = new CalDay();
        calDay0.year = (short) 10;
        int i3 = calDay0.getYear();
        calDay0.year = 'a';
        boolean b6 = calDay0.valid;
        int i7 = calDay0.getDay();
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.getYear();
        CalDay calDay5 = new CalDay();
        java.lang.String str6 = calDay5.toString();
        calDay5.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay5.getAppts();
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt17.setTitle("hi!");
        calDay5.addAppt(appt17);
        Appt appt28 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt28.setTitle("hi!");
        appt28.setTitle("");
        calDay5.addAppt(appt28);
        appt28.setTitle("");
        appt28.setTitle("");
        calDay0.addAppt(appt28);
        int i39 = appt28.getStartHour();
        int i40 = appt28.getStartDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(i40 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.valid = false;
        calDay0.day = (short) -1;
        java.lang.String str7 = calDay0.toString();
        int i8 = calDay0.getYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartYear();
        boolean b32 = appt23.getValid();
        int i33 = appt23.getStartDay();
        appt23.setStartDay((int) (short) 10);
        java.lang.String str36 = appt23.getDescription();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.getYear();
        CalDay calDay5 = new CalDay();
        java.lang.String str6 = calDay5.toString();
        calDay5.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay5.getAppts();
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt17.setTitle("hi!");
        calDay5.addAppt(appt17);
        Appt appt28 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt28.setTitle("hi!");
        appt28.setTitle("");
        calDay5.addAppt(appt28);
        appt28.setTitle("");
        appt28.setTitle("");
        calDay0.addAppt(appt28);
        calDay0.day = 10;
        java.util.LinkedList<Appt> linkedlist_appt41 = calDay0.appts;
        calDay0.valid = true;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertNull(linkedlist_appt41);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.valid = false;
        calDay0.day = (short) -1;
        java.lang.String str7 = calDay0.toString();
        int i8 = calDay0.getMonth();
        java.lang.String str9 = calDay0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        java.lang.String str30 = appt23.toString();
        int i31 = appt23.getStartMonth();
        int i32 = appt23.getStartMonth();
        appt23.setStartMinute((int) (short) 10);
        int i35 = appt23.getStartMinute();
        boolean b36 = appt23.getValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(i32 == 100);
        org.junit.Assert.assertTrue(i35 == 10);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        CalDay calDay0 = new CalDay();
        Appt appt8 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i9 = appt8.getStartHour();
        appt8.setStartDay((int) (byte) 10);
        int i12 = appt8.getStartMonth();
        calDay0.addAppt(appt8);
        calDay0.month = (byte) 100;
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(i12 == 100);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        boolean b5 = calDay0.valid;
        int i6 = calDay0.month;
        boolean b7 = calDay0.isValid();
        calDay0.year = 2;
        calDay0.day = 100;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        calDay0.month = (byte) 100;
        calDay0.day = (-1);
        int i9 = calDay0.month;
        calDay0.day = (byte) -1;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i9 == 100);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        Appt appt7 = new Appt(0, (int) (short) 100, 32, (int) (byte) -1, (int) (short) 1, "hi!", "hi!");
        boolean b8 = appt7.getValid();
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.year = (byte) 1;
        int i5 = calDay0.year;
        calDay0.month = 52;
        calDay0.valid = false;
        int i10 = calDay0.year;
        int i11 = calDay0.getYear();
        calDay0.month = (short) -1;
        int i14 = calDay0.getYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartHour();
        java.lang.String str32 = appt23.getDescription();
        appt23.setStartMinute(0);
        appt23.setStartYear((int) (short) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        int i30 = appt23.getStartYear();
        boolean b31 = appt23.getValid();
        appt23.setStartHour((int) (byte) -1);
        int i34 = appt23.getStartYear();
        boolean b35 = appt23.getValid();
        boolean b36 = appt23.getValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(i30 == 100);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 100);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.getDay();
        calDay0.year = 100;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        boolean b31 = appt23.getValid();
        appt23.setStartYear(32);
        java.lang.String str34 = appt23.getDescription();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartYear();
        boolean b32 = appt23.getValid();
        int i33 = appt23.getStartDay();
        java.lang.String str34 = appt23.getTitle();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        int i30 = appt23.getStartYear();
        boolean b31 = appt23.getValid();
        appt23.setStartDay((int) (short) 100);
        appt23.setDescription("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(i30 == 100);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.getYear();
        CalDay calDay5 = new CalDay();
        java.lang.String str6 = calDay5.toString();
        calDay5.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay5.getAppts();
        Appt appt17 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt17.setTitle("hi!");
        calDay5.addAppt(appt17);
        Appt appt28 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt28.setTitle("hi!");
        appt28.setTitle("");
        calDay5.addAppt(appt28);
        appt28.setTitle("");
        appt28.setTitle("");
        calDay0.addAppt(appt28);
        java.util.LinkedList<Appt> linkedlist_appt39 = calDay0.getAppts();
        int i40 = calDay0.day;
        int i41 = calDay0.getDay();
        java.util.Iterator<?> iterator_wildcard42 = calDay0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertNull(linkedlist_appt39);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(iterator_wildcard42);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        appt23.setStartYear((int) (byte) 100);
        appt23.setStartYear((int) 'a');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setDescription("hi!");
        java.lang.String str13 = appt7.toString();
        appt7.setDescription("");
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        calDay0.day = (byte) 10;
        int i6 = calDay0.getDay();
        java.util.LinkedList<Appt> linkedlist_appt7 = calDay0.appts;
        boolean b8 = calDay0.valid;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(linkedlist_appt7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.valid = false;
        calDay0.day = (short) -1;
        calDay0.year = '#';
        CalDay calDay9 = new CalDay();
        java.lang.String str10 = calDay9.toString();
        calDay9.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt13 = calDay9.getAppts();
        Appt appt21 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt21.setTitle("hi!");
        calDay9.addAppt(appt21);
        Appt appt32 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt32.setTitle("hi!");
        appt32.setTitle("");
        calDay9.addAppt(appt32);
        appt32.setTitle("");
        int i40 = appt32.getStartHour();
        appt32.setStartDay((int) '4');
        appt32.setDescription("");
        appt32.setStartMonth((int) (byte) 10);
        calDay0.addAppt(appt32);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt13);
        org.junit.Assert.assertTrue(i40 == (-1));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        calDay0.year = (byte) 100;
        calDay0.valid = true;
        int i8 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartMonth(0);
        appt7.setTitle("hi!");
        appt7.setStartDay((int) (byte) 10);
        java.lang.String str17 = appt7.getTitle();
        appt7.setStartHour(0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        Appt appt40 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt40.setTitle("hi!");
        boolean b43 = appt40.getValid();
        appt40.setStartMonth(0);
        calDay4.addAppt(appt40);
        boolean b47 = appt40.getValid();
        calDay0.addAppt(appt40);
        int i49 = calDay0.getDay();
        calDay0.valid = true;
        java.util.LinkedList<Appt> linkedlist_appt52 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNull(linkedlist_appt52);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        int i6 = calDay0.getDay();
        int i7 = calDay0.year;
        Appt appt15 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i16 = appt15.getStartHour();
        boolean b17 = appt15.getValid();
        int i18 = appt15.getStartMinute();
        calDay0.addAppt(appt15);
        int i20 = calDay0.getDay();
        java.util.LinkedList<Appt> linkedlist_appt21 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(linkedlist_appt21);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        boolean b3 = calDay0.valid;
        int i4 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        CalDay calDay0 = new CalDay();
        calDay0.year = (short) 10;
        int i3 = calDay0.getYear();
        calDay0.day = 1;
        calDay0.year = 2;
        calDay0.day = (byte) 100;
        org.junit.Assert.assertTrue(i3 == 10);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        CalDay calDay6 = new CalDay();
        java.lang.String str7 = calDay6.toString();
        calDay6.day = (byte) 10;
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        calDay10.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay10.getAppts();
        Appt appt22 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt22.setTitle("hi!");
        calDay10.addAppt(appt22);
        Appt appt33 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt33.setTitle("hi!");
        appt33.setTitle("");
        calDay10.addAppt(appt33);
        appt33.setTitle("");
        calDay6.addAppt(appt33);
        int i42 = appt33.getStartMonth();
        appt33.setTitle("");
        int i45 = appt33.getStartHour();
        int i46 = appt33.getStartYear();
        calDay0.addAppt(appt33);
        java.lang.String str48 = appt33.toString();
        appt33.setStartHour((int) '#');
        appt33.setStartHour((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i42 == 100);
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertTrue(i46 == 100);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        Appt appt7 = new Appt((int) ' ', 52, 35, 2, 10, "hi!", "hi!");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartHour();
        appt23.setStartMonth((int) (byte) 100);
        java.lang.String str34 = appt23.getTitle();
        appt23.setStartYear((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        int i5 = calDay0.getMonth();
        boolean b6 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        java.lang.String str30 = appt23.toString();
        appt23.setTitle("");
        appt23.setTitle("hi!");
        appt23.setDescription("");
        appt23.setStartMinute((int) '4');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        calDay0.valid = false;
        java.util.LinkedList<Appt> linkedlist_appt7 = calDay0.appts;
        calDay0.day = 'a';
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertNull(linkedlist_appt7);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        boolean b43 = appt36.getValid();
        int i44 = appt36.getStartDay();
        int i45 = appt36.getStartMonth();
        java.lang.String str46 = appt36.getDescription();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setDescription("");
        java.lang.String str10 = appt7.getDescription();
        int i11 = appt7.getStartMinute();
        int i12 = appt7.getStartDay();
        appt7.setStartHour((int) ' ');
        appt7.setStartMonth((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        Appt appt7 = new Appt(52, 52, (int) '4', 32, (int) '4', "", "hi!");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.year = (short) 1;
        int i5 = calDay0.getMonth();
        java.util.LinkedList<Appt> linkedlist_appt6 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertNull(iterator_wildcard7);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        calDay0.addAppt(appt36);
        TimeTable timeTable40 = new TimeTable();
        TimeTable timeTable41 = new TimeTable();
        Appt appt49 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt57 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array58 = new Appt[] { appt49, appt57 };
        java.util.LinkedList<Appt> linkedlist_appt59 = new java.util.LinkedList<Appt>();
        boolean b60 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt59, appt_array58);
        Appt appt61 = null;
        java.util.LinkedList<Appt> linkedlist_appt62 = timeTable41.deleteAppt(linkedlist_appt59, appt61);
        CalDay calDay63 = new CalDay();
        java.lang.String str64 = calDay63.toString();
        calDay63.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt67 = calDay63.getAppts();
        Appt appt75 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt75.setTitle("hi!");
        calDay63.addAppt(appt75);
        int i79 = appt75.getStartYear();
        int i80 = appt75.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt81 = timeTable40.deleteAppt(linkedlist_appt59, appt75);
        calDay0.appts = linkedlist_appt59;
        int i83 = calDay0.getMonth();
        calDay0.valid = false;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertNotNull(appt_array58);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(linkedlist_appt62);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt67);
        org.junit.Assert.assertTrue(i79 == 100);
        org.junit.Assert.assertTrue(i80 == 100);
        org.junit.Assert.assertNull(linkedlist_appt81);
        org.junit.Assert.assertTrue(i83 == 0);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        CalDay calDay4 = new CalDay();
        java.lang.String str5 = calDay4.toString();
        calDay4.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay4.getAppts();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt16.setTitle("hi!");
        calDay4.addAppt(appt16);
        Appt appt27 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt27.setTitle("hi!");
        appt27.setTitle("");
        calDay4.addAppt(appt27);
        appt27.setTitle("");
        calDay0.addAppt(appt27);
        int i36 = appt27.getStartMonth();
        java.lang.String str37 = appt27.getDescription();
        java.lang.String str38 = appt27.getDescription();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i36 == 100);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.year = (byte) 1;
        int i5 = calDay0.year;
        calDay0.month = 52;
        calDay0.valid = false;
        int i10 = calDay0.year;
        boolean b11 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        int i6 = calDay0.getDay();
        calDay0.year = (byte) 1;
        calDay0.month = (short) 10;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartHour();
        int i9 = appt7.getStartYear();
        int i10 = appt7.getStartYear();
        appt7.setStartYear((int) (byte) 100);
        int i13 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(i9 == 100);
        org.junit.Assert.assertTrue(i10 == 100);
        org.junit.Assert.assertTrue(i13 == 100);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        int i6 = calDay0.getDay();
        int i7 = calDay0.year;
        Appt appt15 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i16 = appt15.getStartHour();
        boolean b17 = appt15.getValid();
        int i18 = appt15.getStartMinute();
        calDay0.addAppt(appt15);
        java.lang.String str20 = calDay0.toString();
        int i21 = calDay0.year;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        calDay0.year = (byte) 100;
        int i6 = calDay0.day;
        int i7 = calDay0.getYear();
        TimeTable timeTable8 = new TimeTable();
        Appt appt16 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt24 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array25 = new Appt[] { appt16, appt24 };
        java.util.LinkedList<Appt> linkedlist_appt26 = new java.util.LinkedList<Appt>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt26, appt_array25);
        Appt appt28 = null;
        java.util.LinkedList<Appt> linkedlist_appt29 = timeTable8.deleteAppt(linkedlist_appt26, appt28);
        calDay0.appts = linkedlist_appt26;
        int i31 = calDay0.getSizeAppts();
        int i32 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertNotNull(appt_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(linkedlist_appt29);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard30 = calDay0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == 10);
        org.junit.Assert.assertNull(iterator_wildcard30);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        Appt appt7 = new Appt((int) (byte) 1, (int) (byte) 0, (int) (short) 1, (int) (byte) -1, (-1), "", "");
        int i8 = appt7.getStartMonth();
        int i9 = appt7.getStartDay();
        appt7.setStartMinute((int) '4');
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        appt23.setTitle("");
        int i31 = appt23.getStartHour();
        appt23.setStartMonth((int) (byte) 100);
        int i34 = appt23.getStartMonth();
        appt23.setStartDay((-1));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(i34 == 100);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        Appt appt7 = new Appt(100, 1, (int) (short) -1, (int) (byte) 100, (int) (byte) 0, "hi!", "");
        int i8 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == 100);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        int i29 = appt23.getStartHour();
        int i30 = appt23.getStartYear();
        boolean b31 = appt23.getValid();
        appt23.setStartHour((int) (byte) -1);
        int i34 = appt23.getStartHour();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(i30 == 100);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == (-1));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        calDay0.day = (byte) 10;
        int i6 = calDay0.getDay();
        calDay0.year = 100;
        java.lang.String str9 = calDay0.toString();
        int i10 = calDay0.getYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 100);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        boolean b43 = appt36.getValid();
        int i44 = appt36.getStartDay();
        appt36.setStartHour((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 0);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.appts;
        int i3 = calDay0.month;
        calDay0.day = (-1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        int i43 = calDay0.year;
        int i44 = calDay0.getMonth();
        Appt appt52 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i53 = appt52.getStartHour();
        java.lang.String str54 = appt52.getTitle();
        int i55 = appt52.getStartMinute();
        int i56 = appt52.getStartHour();
        calDay0.addAppt(appt52);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i53 == (-1));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        org.junit.Assert.assertTrue(i55 == 52);
        org.junit.Assert.assertTrue(i56 == (-1));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt23.setTitle("hi!");
        appt23.setTitle("");
        calDay0.addAppt(appt23);
        Appt appt36 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt36.setTitle("hi!");
        boolean b39 = appt36.getValid();
        appt36.setStartMonth(0);
        calDay0.addAppt(appt36);
        int i43 = calDay0.getDay();
        CalDay calDay44 = new CalDay();
        java.lang.String str45 = calDay44.toString();
        calDay44.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt48 = calDay44.appts;
        calDay44.month = (byte) 100;
        CalDay calDay51 = new CalDay();
        java.lang.String str52 = calDay51.toString();
        calDay51.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt55 = calDay51.getAppts();
        Appt appt63 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt63.setTitle("hi!");
        calDay51.addAppt(appt63);
        int i67 = appt63.getStartYear();
        int i68 = appt63.getStartMonth();
        calDay44.addAppt(appt63);
        calDay0.addAppt(appt63);
        int i71 = appt63.getStartMinute();
        appt63.setStartYear(52);
        java.lang.String str74 = appt63.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i43 == 10);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt48);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt55);
        org.junit.Assert.assertTrue(i67 == 100);
        org.junit.Assert.assertTrue(i68 == 100);
        org.junit.Assert.assertTrue(i71 == 52);
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.valid = false;
        calDay0.day = (short) -1;
        java.lang.String str7 = calDay0.toString();
        int i8 = calDay0.getMonth();
        int i9 = calDay0.year;
        int i10 = calDay0.day;
        boolean b11 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        calDay0.year = 'a';
        calDay0.day = 0;
        calDay0.valid = false;
        java.util.LinkedList<Appt> linkedlist_appt14 = calDay0.getAppts();
        boolean b15 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.day;
        int i5 = calDay0.getYear();
        calDay0.month = 100;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        CalDay calDay0 = new CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        int i2 = calDay0.getYear();
        int i3 = calDay0.getMonth();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
    }
}

