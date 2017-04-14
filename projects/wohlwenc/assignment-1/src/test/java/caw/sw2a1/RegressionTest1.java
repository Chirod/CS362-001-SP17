package caw.sw2a1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import edu.osu.cs362.hw1.Queue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test02");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test03");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        int i14 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "" + "'", comparable_str17.equals(""));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test04");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = null;
        queue_comparable_str0.add(comparable_str8);
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        int i12 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test05");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = null;
        queue_comparable_str0.add(comparable_str12);
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i16 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertNull(comparable_str17);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test06");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i17 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue(i17 == 5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test07");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test08");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test09");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test10");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str19 = null;
        queue_comparable_str0.add(comparable_str19);
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test11");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test12");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        int i14 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str21 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str22 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str21 + "' != '" + "hi!" + "'", comparable_str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str22 + "' != '" + "" + "'", comparable_str22.equals(""));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test13");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str12 = null;
        queue_comparable_str0.add(comparable_str12);
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i19 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str20 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertNull(comparable_str14);
        org.junit.Assert.assertTrue(i19 == 3);
        org.junit.Assert.assertNull(comparable_str20);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test14");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i14 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test15");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i13 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test16");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test17");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        int i10 = queue_comparable_str0.size();
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test18");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        int i9 = queue_comparable_str0.size();
        int i10 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test19");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test20");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str12 = null;
        queue_comparable_str0.add(comparable_str12);
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertNull(comparable_str14);
        org.junit.Assert.assertNull(comparable_str15);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test21");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.peek();
        int i17 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i20 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str21 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "" + "'", comparable_str16.equals(""));
        org.junit.Assert.assertTrue(i17 == 3);
        org.junit.Assert.assertTrue(i20 == 4);
        org.junit.Assert.assertTrue("'" + comparable_str21 + "' != '" + "" + "'", comparable_str21.equals(""));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test22");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test23");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        int i14 = queue_comparable_str0.size();
        int i15 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test24");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i16 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue(i16 == 2);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test25");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test26");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i13 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.remove();
        int i20 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "hi!" + "'", comparable_str19.equals("hi!"));
        org.junit.Assert.assertTrue(i20 == 4);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test27");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test28");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test29");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test30");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test31");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str13 = null;
        queue_comparable_str0.add(comparable_str13);
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test32");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        int i19 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
        org.junit.Assert.assertTrue(i19 == 2);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test33");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.peek();
        int i19 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
        org.junit.Assert.assertTrue(i19 == 5);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test34");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = null;
        queue_comparable_str0.add(comparable_str12);
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i16 = queue_comparable_str0.size();
        int i17 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertTrue(i17 == 2);
        org.junit.Assert.assertNull(comparable_str18);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test35");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 4);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test36");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i18 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue(i18 == 6);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test37");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test38");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test39");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test40");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        int i14 = queue_comparable_str0.size();
        int i15 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test41");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test42");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        int i16 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
        org.junit.Assert.assertTrue(i16 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "" + "'", comparable_str19.equals(""));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test43");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        int i17 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue(i17 == 3);
    }
}

