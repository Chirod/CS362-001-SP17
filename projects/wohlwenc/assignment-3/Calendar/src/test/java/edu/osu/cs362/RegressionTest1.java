package edu.osu.cs362;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
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
        int i34 = appt23.getStartMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(i32 == 52);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue(i34 == 100);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        CalDay calDay0 = new CalDay();
        calDay0.year = (short) 10;
        int i3 = calDay0.getYear();
        calDay0.year = 'a';
        java.util.LinkedList<Appt> linkedlist_appt6 = calDay0.appts;
        java.util.LinkedList<Appt> linkedlist_appt7 = calDay0.appts;
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertNull(linkedlist_appt7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        calDay0.year = (byte) 100;
        boolean b6 = calDay0.valid;
        calDay0.year = (byte) 0;
        int i9 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
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
        java.util.LinkedList<Appt> linkedlist_appt37 = null;
        java.util.GregorianCalendar gregorianCalendar38 = null;
        java.util.GregorianCalendar gregorianCalendar39 = null;
        try {
            java.util.LinkedList<CalDay> linkedlist_calDay40 = timeTable0.getApptRange(linkedlist_appt37, gregorianCalendar38, gregorianCalendar39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(appt_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(linkedlist_appt21);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(linkedlist_appt36);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        Appt appt7 = new Appt(97, 0, 35, 97, 32, "", "");
        int i8 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == 97);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        Appt appt7 = new Appt(32, 0, 35, (int) (short) 1, 2, "hi!", "hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
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
        appt23.setStartHour(100);
        int i38 = appt23.getStartHour();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i38 == 100);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        appt7.setTitle("");
        java.lang.String str12 = appt7.getTitle();
        appt7.setStartDay((int) (short) 1);
        int i15 = appt7.getStartMonth();
        int i16 = appt7.getStartDay();
        java.lang.String str17 = appt7.getTitle();
        appt7.setStartHour(2);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(i15 == 100);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        calDay0.day = (byte) 10;
        int i6 = calDay0.getDay();
        calDay0.year = 100;
        java.lang.String str9 = calDay0.toString();
        java.lang.String str10 = calDay0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        appt7.setTitle("");
        java.lang.String str12 = appt7.getTitle();
        appt7.setStartDay((int) (short) 1);
        appt7.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
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
        calDay0.appts = linkedlist_appt78;
        java.util.Iterator<?> iterator_wildcard85 = calDay0.iterator();
        calDay0.day = (byte) 100;
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
        org.junit.Assert.assertNull(iterator_wildcard85);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        calDay0.year = (byte) 100;
        calDay0.day = (short) 10;
        calDay0.month = (short) 0;
        java.util.Iterator<?> iterator_wildcard10 = calDay0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
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
        int i42 = appt28.getStartMonth();
        int i43 = appt28.getStartMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(i42 == 100);
        org.junit.Assert.assertTrue(i43 == 100);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        boolean b3 = calDay0.valid;
        int i4 = calDay0.getDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
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
        int i36 = appt23.getStartDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == (-1));
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
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
        java.util.Iterator<?> iterator_wildcard42 = calDay0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertNull(linkedlist_appt41);
        org.junit.Assert.assertNull(iterator_wildcard42);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
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
        java.util.Iterator<?> iterator_wildcard11 = calDay0.iterator();
        boolean b12 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(iterator_wildcard11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        java.lang.String str11 = appt7.getTitle();
        int i12 = appt7.getStartDay();
        appt7.setStartDay((int) (byte) -1);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setStartMonth((int) (short) 1);
        appt7.setStartYear(52);
        int i12 = appt7.getStartMonth();
        java.lang.String str13 = appt7.getDescription();
        int i14 = appt7.getStartYear();
        appt7.setStartDay((int) (byte) 0);
        int i17 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 52);
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        calDay0.year = 'a';
        int i10 = calDay0.year;
        int i11 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        Appt appt7 = new Appt(10, 100, 32, (int) '#', 0, "", "hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
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
        java.util.LinkedList<Appt> linkedlist_appt37 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(linkedlist_appt37);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        calDay0.month = 'a';
        calDay0.valid = true;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartMonth(0);
        int i13 = appt7.getStartHour();
        appt7.setStartDay(0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
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
        int i21 = calDay0.year;
        int i22 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
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
        appt23.setStartMinute((int) ' ');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(i30 == 100);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
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
        appt15.setDescription("hi!");
        int i28 = appt15.getStartMonth();
        appt15.setStartYear(1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(linkedlist_appt7);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i28 == (-1));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
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
        java.lang.String str40 = appt28.getTitle();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        int i6 = calDay0.getDay();
        java.util.LinkedList<Appt> linkedlist_appt7 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(linkedlist_appt7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
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
        calDay0.month = (byte) 10;
        boolean b93 = calDay0.valid;
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
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        calDay0.year = (byte) 100;
        int i6 = calDay0.getYear();
        int i7 = calDay0.getYear();
        calDay0.day = 1;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i7 == 100);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.year;
        calDay0.valid = false;
        java.util.Iterator<?> iterator_wildcard8 = calDay0.iterator();
        java.lang.String str9 = calDay0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(iterator_wildcard8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
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
        int i46 = appt30.getStartHour();
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
        org.junit.Assert.assertTrue(i46 == (-1));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.lang.String str7 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        int i9 = calDay0.month;
        java.lang.String str10 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt11 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt11);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        CalDay calDay0 = new CalDay();
        calDay0.year = (short) 10;
        int i3 = calDay0.getYear();
        calDay0.day = 1;
        calDay0.year = 2;
        CalDay calDay8 = new CalDay();
        java.lang.String str9 = calDay8.toString();
        calDay8.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt12 = calDay8.getAppts();
        Appt appt20 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt20.setTitle("hi!");
        calDay8.addAppt(appt20);
        int i24 = appt20.getStartYear();
        int i25 = appt20.getStartMonth();
        int i26 = appt20.getStartYear();
        calDay0.addAppt(appt20);
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt12);
        org.junit.Assert.assertTrue(i24 == 100);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertTrue(i26 == 100);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartHour();
        boolean b9 = appt7.getValid();
        int i10 = appt7.getStartMinute();
        appt7.setStartMonth((int) ' ');
        int i13 = appt7.getStartHour();
        appt7.setStartDay(0);
        appt7.setStartDay((int) (short) 1);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        CalDay calDay0 = new CalDay();
        calDay0.year = (short) 10;
        calDay0.valid = false;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.month;
        int i7 = calDay0.year;
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
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
        int i82 = appt66.getStartYear();
        int i83 = appt66.getStartMonth();
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
        org.junit.Assert.assertTrue(i82 == 100);
        org.junit.Assert.assertTrue(i83 == 100);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.day;
        int i5 = calDay0.day;
        calDay0.day = 32;
        int i8 = calDay0.year;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        TimeTable timeTable0 = new TimeTable();
        CalDay calDay1 = new CalDay();
        java.lang.String str2 = calDay1.toString();
        calDay1.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt5 = calDay1.appts;
        boolean b6 = calDay1.valid;
        calDay1.year = '4';
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay1.appts;
        CalDay calDay10 = new CalDay();
        java.lang.String str11 = calDay10.toString();
        int i12 = calDay10.day;
        int i13 = calDay10.getYear();
        int i14 = calDay10.getYear();
        TimeTable timeTable15 = new TimeTable();
        Appt appt23 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt31 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array32 = new Appt[] { appt23, appt31 };
        java.util.LinkedList<Appt> linkedlist_appt33 = new java.util.LinkedList<Appt>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt33, appt_array32);
        Appt appt35 = null;
        java.util.LinkedList<Appt> linkedlist_appt36 = timeTable15.deleteAppt(linkedlist_appt33, appt35);
        calDay10.appts = linkedlist_appt33;
        calDay1.appts = linkedlist_appt33;
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
        Appt appt75 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt75.setTitle("hi!");
        boolean b78 = appt75.getValid();
        appt75.setStartMonth(0);
        calDay39.addAppt(appt75);
        boolean b82 = appt75.getValid();
        int i83 = appt75.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt84 = timeTable0.deleteAppt(linkedlist_appt33, appt75);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(appt_array32);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(linkedlist_appt36);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt43);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertNull(linkedlist_appt84);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        int i16 = calDay0.day;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i16 == 10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
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
        java.util.LinkedList<Appt> linkedlist_appt40 = calDay0.getAppts();
        int i41 = calDay0.getDay();
        int i42 = calDay0.getDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNull(linkedlist_appt40);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(i42 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartMonth(0);
        appt7.setTitle("hi!");
        appt7.setStartDay((int) (byte) 10);
        java.lang.String str17 = appt7.getTitle();
        java.lang.String str18 = appt7.getTitle();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        boolean b16 = calDay0.isValid();
        boolean b17 = calDay0.isValid();
        java.util.LinkedList<Appt> linkedlist_appt18 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(linkedlist_appt18);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
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
        int i19 = calDay17.day;
        int i20 = calDay17.getYear();
        int i21 = calDay17.getYear();
        CalDay calDay22 = new CalDay();
        java.lang.String str23 = calDay22.toString();
        calDay22.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt26 = calDay22.getAppts();
        Appt appt34 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt34.setTitle("hi!");
        calDay22.addAppt(appt34);
        Appt appt45 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt45.setTitle("hi!");
        appt45.setTitle("");
        calDay22.addAppt(appt45);
        appt45.setTitle("");
        appt45.setTitle("");
        calDay17.addAppt(appt45);
        appt45.setStartMonth((int) (short) 1);
        appt45.setStartMonth((int) '#');
        calDay0.addAppt(appt45);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt26);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
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
        TimeTable timeTable32 = new TimeTable();
        TimeTable timeTable33 = new TimeTable();
        Appt appt41 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt49 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array50 = new Appt[] { appt41, appt49 };
        java.util.LinkedList<Appt> linkedlist_appt51 = new java.util.LinkedList<Appt>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt51, appt_array50);
        Appt appt53 = null;
        java.util.LinkedList<Appt> linkedlist_appt54 = timeTable33.deleteAppt(linkedlist_appt51, appt53);
        CalDay calDay55 = new CalDay();
        java.lang.String str56 = calDay55.toString();
        calDay55.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt59 = calDay55.getAppts();
        Appt appt67 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt67.setTitle("hi!");
        calDay55.addAppt(appt67);
        int i71 = appt67.getStartYear();
        int i72 = appt67.getStartMonth();
        java.util.LinkedList<Appt> linkedlist_appt73 = timeTable32.deleteAppt(linkedlist_appt51, appt67);
        appt67.setStartMonth(0);
        calDay0.addAppt(appt67);
        java.lang.String str77 = appt67.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertNotNull(appt_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(linkedlist_appt29);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertNotNull(appt_array50);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(linkedlist_appt54);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt59);
        org.junit.Assert.assertTrue(i71 == 100);
        org.junit.Assert.assertTrue(i72 == 100);
        org.junit.Assert.assertNull(linkedlist_appt73);
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
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
        java.util.Iterator<?> iterator_wildcard48 = calDay0.iterator();
        TimeTable timeTable49 = new TimeTable();
        Appt appt57 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt65 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array66 = new Appt[] { appt57, appt65 };
        java.util.LinkedList<Appt> linkedlist_appt67 = new java.util.LinkedList<Appt>();
        boolean b68 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt67, appt_array66);
        Appt appt69 = null;
        java.util.LinkedList<Appt> linkedlist_appt70 = timeTable49.deleteAppt(linkedlist_appt67, appt69);
        calDay0.appts = linkedlist_appt70;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(linkedlist_appt45);
        org.junit.Assert.assertNull(iterator_wildcard48);
        org.junit.Assert.assertNotNull(appt_array66);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNull(linkedlist_appt70);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        Appt appt7 = new Appt((int) 'a', (int) '#', (int) ' ', 10, (int) (short) 10, "", "");
        appt7.setStartMonth(97);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
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
        appt33.setStartDay((int) ' ');
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
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        CalDay calDay0 = new CalDay();
        calDay0.day = (byte) 0;
        java.util.LinkedList<Appt> linkedlist_appt3 = calDay0.appts;
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertNull(iterator_wildcard4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        Appt appt7 = new Appt((int) (short) 0, 0, (int) (byte) 100, (int) ' ', 0, "hi!", "");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setDescription("");
        java.lang.String str10 = appt7.getDescription();
        int i11 = appt7.getStartMinute();
        int i12 = appt7.getStartDay();
        boolean b13 = appt7.getValid();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartHour();
        int i9 = appt7.getStartYear();
        int i10 = appt7.getStartYear();
        appt7.setStartYear((int) (byte) 100);
        int i13 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(i9 == 100);
        org.junit.Assert.assertTrue(i10 == 100);
        org.junit.Assert.assertTrue(i13 == 52);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        CalDay calDay0 = new CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        calDay0.year = '4';
        calDay0.year = 35;
        org.junit.Assert.assertNull(iterator_wildcard1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
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
        boolean b27 = calDay0.valid;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt11);
        org.junit.Assert.assertTrue(i23 == 100);
        org.junit.Assert.assertTrue(i24 == 100);
        org.junit.Assert.assertNull(linkedlist_appt26);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        Appt appt7 = new Appt((int) (byte) 1, (int) (short) 10, (int) (byte) 1, 32, (int) (byte) 10, "", "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        int i11 = appt7.getStartDay();
        int i12 = appt7.getStartHour();
        appt7.setDescription("");
        int i15 = appt7.getStartDay();
        boolean b16 = appt7.getValid();
        int i17 = appt7.getStartDay();
        int i18 = appt7.getStartDay();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.appts;
        int i3 = calDay0.month;
        int i4 = calDay0.getYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setTitle("hi!");
        boolean b10 = appt7.getValid();
        appt7.setStartMonth(0);
        int i13 = appt7.getStartHour();
        appt7.setStartYear((int) (short) 10);
        java.lang.String str16 = appt7.toString();
        int i17 = appt7.getStartDay();
        java.lang.String str18 = appt7.getTitle();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        int i4 = calDay0.month;
        int i5 = calDay0.day;
        int i6 = calDay0.getMonth();
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(iterator_wildcard7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        boolean b5 = calDay0.isValid();
        boolean b6 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        java.util.LinkedList<Appt> linkedlist_appt16 = calDay0.getAppts();
        Appt appt24 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt24.setTitle("hi!");
        appt24.setTitle("");
        int i29 = appt24.getStartHour();
        appt24.setDescription("");
        appt24.setStartMinute((-1));
        calDay0.addAppt(appt24);
        calDay0.month = (byte) 0;
        int i37 = calDay0.month;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertNull(linkedlist_appt16);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
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
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        int i5 = calDay0.getYear();
        int i6 = calDay0.year;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        Appt appt7 = new Appt((int) (short) 10, (int) (byte) 100, (-1), 100, (int) '#', "hi!", "");
        appt7.setTitle("hi!");
        appt7.setStartDay(1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartMonth();
        int i9 = appt7.getStartMinute();
        int i10 = appt7.getStartDay();
        appt7.setStartYear(10);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        Appt appt7 = new Appt((int) '4', 1, (int) (short) 0, 0, (int) (short) 0, "hi!", "");
        java.lang.String str8 = appt7.getDescription();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.year = (short) 1;
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        java.lang.String str6 = calDay0.toString();
        calDay0.valid = true;
        int i9 = calDay0.getYear();
        calDay0.year = (short) 10;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
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
        calDay0.month = 1;
        calDay0.valid = true;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
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
        int i18 = appt13.getStartHour();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i14 == 100);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.day = '#';
        int i5 = calDay0.day;
        calDay0.year = (short) 10;
        calDay0.day = (short) 100;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 35);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
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
        java.lang.String str35 = appt23.getTitle();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
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
        java.util.LinkedList<Appt> linkedlist_appt40 = calDay0.getAppts();
        int i41 = calDay0.day;
        calDay0.year = 52;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNull(linkedlist_appt40);
        org.junit.Assert.assertTrue(i41 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        int i6 = calDay0.getDay();
        calDay0.day = (byte) 0;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartMonth();
        int i9 = appt7.getStartMinute();
        int i10 = appt7.getStartDay();
        int i11 = appt7.getStartHour();
        int i12 = appt7.getStartHour();
        appt7.setDescription("");
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
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
        int i31 = appt23.getStartDay();
        appt23.setStartDay((int) (short) -1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
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
        int i56 = appt47.getStartYear();
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
        org.junit.Assert.assertTrue(i56 == 100);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        int i6 = calDay0.getDay();
        boolean b7 = calDay0.isValid();
        calDay0.year = 'a';
        calDay0.valid = true;
        java.util.LinkedList<Appt> linkedlist_appt12 = calDay0.appts;
        int i13 = calDay0.getDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(linkedlist_appt12);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
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
        int i46 = calDay0.getMonth();
        java.lang.String str47 = calDay0.toString();
        int i48 = calDay0.getYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(linkedlist_appt45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue(i48 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.year;
        java.util.LinkedList<Appt> linkedlist_appt9 = calDay0.appts;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(linkedlist_appt9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
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
        appt23.setStartMinute(0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
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
        CalDay calDay41 = new CalDay();
        java.lang.String str42 = calDay41.toString();
        calDay41.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt45 = calDay41.getAppts();
        Appt appt53 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt53.setTitle("hi!");
        calDay41.addAppt(appt53);
        int i57 = appt53.getStartYear();
        int i58 = appt53.getStartMonth();
        int i59 = appt53.getStartMinute();
        appt53.setStartMinute(100);
        calDay0.addAppt(appt53);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt45);
        org.junit.Assert.assertTrue(i57 == 100);
        org.junit.Assert.assertTrue(i58 == 100);
        org.junit.Assert.assertTrue(i59 == 52);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
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
        int i35 = appt23.getStartMonth();
        java.lang.String str36 = appt23.getDescription();
        java.lang.String str37 = appt23.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue(i35 == 100);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        int i5 = calDay0.month;
        boolean b6 = calDay0.valid;
        int i7 = calDay0.getYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
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
        int i11 = calDay0.getDay();
        CalDay calDay12 = new CalDay();
        java.lang.String str13 = calDay12.toString();
        calDay12.day = (byte) 10;
        CalDay calDay16 = new CalDay();
        java.lang.String str17 = calDay16.toString();
        calDay16.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt20 = calDay16.getAppts();
        Appt appt28 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt28.setTitle("hi!");
        calDay16.addAppt(appt28);
        Appt appt39 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt39.setTitle("hi!");
        appt39.setTitle("");
        calDay16.addAppt(appt39);
        appt39.setTitle("");
        calDay12.addAppt(appt39);
        int i48 = appt39.getStartMonth();
        appt39.setTitle("");
        int i51 = appt39.getStartHour();
        int i52 = appt39.getStartYear();
        calDay0.addAppt(appt39);
        calDay0.valid = false;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertTrue(i11 == 10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt20);
        org.junit.Assert.assertTrue(i48 == 100);
        org.junit.Assert.assertTrue(i51 == (-1));
        org.junit.Assert.assertTrue(i52 == 100);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
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
        boolean b32 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertNotNull(appt_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(linkedlist_appt29);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.getAppts();
        Appt appt12 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt12.setTitle("hi!");
        calDay0.addAppt(appt12);
        java.util.LinkedList<Appt> linkedlist_appt16 = calDay0.getAppts();
        Appt appt24 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt24.setTitle("hi!");
        appt24.setTitle("");
        int i29 = appt24.getStartHour();
        appt24.setDescription("");
        appt24.setStartMinute((-1));
        calDay0.addAppt(appt24);
        int i35 = appt24.getStartYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertNull(linkedlist_appt16);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(i35 == 100);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
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
        appt23.setStartDay((int) ' ');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
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
        appt23.setStartMonth((int) (byte) -1);
        int i36 = appt23.getStartMinute();
        java.lang.String str37 = appt23.getDescription();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(i32 == 52);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i36 == 52);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.getDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
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
        calDay0.year = (byte) -1;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertNull(linkedlist_appt39);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        CalDay calDay0 = new CalDay();
        Appt appt8 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i9 = appt8.getStartHour();
        appt8.setStartDay((int) (byte) 10);
        int i12 = appt8.getStartMonth();
        calDay0.addAppt(appt8);
        int i14 = appt8.getStartHour();
        int i15 = appt8.getStartMinute();
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        appt7.setDescription("");
        boolean b10 = appt7.getValid();
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        int i8 = appt7.getStartHour();
        boolean b9 = appt7.getValid();
        int i10 = appt7.getStartMinute();
        int i11 = appt7.getStartDay();
        appt7.setStartDay(10);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
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
        calDay0.day = (byte) 100;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
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
        appt36.setStartHour((int) ' ');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        calDay0.valid = false;
        calDay0.day = (short) -1;
        java.lang.String str7 = calDay0.toString();
        int i8 = calDay0.getMonth();
        calDay0.valid = true;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        int i2 = calDay0.day;
        int i3 = calDay0.getYear();
        int i4 = calDay0.day;
        int i5 = calDay0.day;
        int i6 = calDay0.day;
        int i7 = calDay0.year;
        int i8 = calDay0.getYear();
        java.lang.String str9 = calDay0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        Appt appt7 = new Appt((int) (byte) 1, (int) (short) 1, (int) (byte) 1, 1, (int) (byte) -1, "hi!", "hi!");
        int i8 = appt7.getStartYear();
        appt7.setDescription("hi!");
        boolean b11 = appt7.getValid();
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
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
        calDay0.valid = false;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(appt_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(linkedlist_appt26);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        calDay0.year = (byte) 100;
        boolean b6 = calDay0.valid;
        java.util.LinkedList<Appt> linkedlist_appt7 = calDay0.appts;
        int i8 = calDay0.getDay();
        int i9 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(linkedlist_appt7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        Appt appt7 = new Appt(100, (int) (byte) 10, 0, 32, 0, "hi!", "");
        boolean b8 = appt7.getValid();
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        java.util.LinkedList<Appt> linkedlist_appt5 = null;
        calDay0.appts = linkedlist_appt5;
        java.util.LinkedList<Appt> linkedlist_appt7 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertNull(linkedlist_appt7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
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
        java.lang.String str31 = appt23.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        Appt appt7 = new Appt((int) (byte) 1, (int) (short) 1, (int) (byte) 1, 1, (int) (byte) -1, "hi!", "hi!");
        appt7.setTitle("hi!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        CalDay calDay0 = new CalDay();
        calDay0.day = (byte) 0;
        int i3 = calDay0.day;
        int i4 = calDay0.year;
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        CalDay calDay0 = new CalDay();
        int i1 = calDay0.getMonth();
        calDay0.valid = true;
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        int i6 = calDay0.getDay();
        boolean b7 = calDay0.isValid();
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        calDay0.valid = true;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(linkedlist_appt8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.year;
        boolean b6 = calDay0.valid;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        Appt appt7 = new Appt(97, (int) '4', 0, 1, (int) (short) 0, "", "");
        appt7.setDescription("");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
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
        appt23.setStartMinute((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
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
        calDay0.year = 97;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt14);
        org.junit.Assert.assertTrue(i42 == 100);
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertTrue(i46 == 100);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
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
        appt12.setStartYear(0);
        appt12.setStartMonth(32);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue(i17 == 100);
        org.junit.Assert.assertTrue(i18 == 52);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        java.util.LinkedList<Appt> linkedlist_appt2 = calDay0.getAppts();
        calDay0.valid = false;
        int i5 = calDay0.getYear();
        calDay0.day = (byte) 1;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        int i9 = calDay0.getMonth();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
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
        boolean b36 = appt23.getValid();
        int i37 = appt23.getStartMinute();
        int i38 = appt23.getStartMinute();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i31 == 100);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 52);
        org.junit.Assert.assertTrue(i38 == 52);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        CalDay calDay0 = new CalDay();
        calDay0.day = (byte) 0;
        int i3 = calDay0.day;
        int i4 = calDay0.month;
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.day = (byte) 10;
        java.util.LinkedList<Appt> linkedlist_appt4 = calDay0.appts;
        boolean b5 = calDay0.valid;
        int i6 = calDay0.day;
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.year;
        java.util.LinkedList<Appt> linkedlist_appt9 = null;
        calDay0.appts = linkedlist_appt9;
        boolean b11 = calDay0.isValid();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        Appt appt7 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        boolean b8 = appt7.getValid();
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
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
        calDay0.month = (short) -1;
        int i23 = calDay0.year;
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        CalDay calDay0 = new CalDay();
        java.lang.String str1 = calDay0.toString();
        calDay0.year = (byte) 1;
        int i4 = calDay0.month;
        int i5 = calDay0.day;
        calDay0.valid = false;
        java.util.LinkedList<Appt> linkedlist_appt8 = calDay0.getAppts();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(linkedlist_appt8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
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
        int i49 = appt40.getStartMonth();
        java.lang.String str50 = appt40.getTitle();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
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
        appt15.setStartMonth(35);
        int i26 = appt15.getStartDay();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(linkedlist_appt7);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
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
        java.util.Iterator<?> iterator_wildcard12 = calDay0.iterator();
        int i13 = calDay0.month;
        java.lang.String str14 = calDay0.toString();
        int i15 = calDay0.day;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(iterator_wildcard12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue(i15 == 10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
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
        int i45 = appt36.getStartYear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == 100);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
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
        boolean b49 = calDay44.valid;
        calDay44.year = '4';
        java.util.LinkedList<Appt> linkedlist_appt52 = calDay44.appts;
        CalDay calDay53 = new CalDay();
        java.lang.String str54 = calDay53.toString();
        int i55 = calDay53.day;
        int i56 = calDay53.getYear();
        int i57 = calDay53.getYear();
        TimeTable timeTable58 = new TimeTable();
        Appt appt66 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt appt74 = new Appt((int) (short) -1, (int) '4', (int) (short) 0, (int) (short) 100, (int) (short) 100, "", "");
        Appt[] appt_array75 = new Appt[] { appt66, appt74 };
        java.util.LinkedList<Appt> linkedlist_appt76 = new java.util.LinkedList<Appt>();
        boolean b77 = java.util.Collections.addAll((java.util.Collection<Appt>) linkedlist_appt76, appt_array75);
        Appt appt78 = null;
        java.util.LinkedList<Appt> linkedlist_appt79 = timeTable58.deleteAppt(linkedlist_appt76, appt78);
        calDay53.appts = linkedlist_appt76;
        calDay44.appts = linkedlist_appt76;
        calDay0.appts = linkedlist_appt76;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i43 == 10);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(linkedlist_appt52);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(appt_array75);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertNull(linkedlist_appt79);
    }
}

