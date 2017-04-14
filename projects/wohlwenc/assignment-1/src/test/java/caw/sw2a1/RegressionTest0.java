package caw.sw2a1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import edu.osu.cs362.hw1.Queue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Queue<java.lang.CharSequence> queue_charSequence0 = new Queue<java.lang.CharSequence>();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Queue<Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str0 = new Queue<Queue<java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Queue<java.lang.Object> queue_obj0 = new Queue<java.lang.Object>();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Queue<java.lang.String> queue_str0 = new Queue<java.lang.String>();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        int i1 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Queue<java.io.Serializable> queue_serializable0 = new Queue<java.io.Serializable>();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        int i6 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i6 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
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
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(comparable_str18);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        int i9 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
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
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(comparable_str14);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
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
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        try {
            java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(comparable_str14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        int i12 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = null;
        queue_comparable_str0.add(comparable_str11);
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str15 = null;
        queue_comparable_str0.add(comparable_str15);
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
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
        int i16 = queue_comparable_str0.size();
        int i17 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertTrue(i17 == 2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i17 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i17 == 4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
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
        int i17 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "hi!" + "'", comparable_str4.equals("hi!"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        int i12 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i11 == 3);
        org.junit.Assert.assertTrue(i12 == 3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = null;
        queue_comparable_str0.add(comparable_str11);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i17 = queue_comparable_str0.size();
        int i18 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue(i17 == 3);
        org.junit.Assert.assertTrue(i18 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "" + "'", comparable_str19.equals(""));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i12 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        int i10 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
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
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i16 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i16 == 2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        int i13 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "" + "'", comparable_str16.equals(""));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        int i14 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
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
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i12 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = null;
        queue_comparable_str0.add(comparable_str11);
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i17 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i17 == 6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
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
        int i13 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
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
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
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
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i13 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        int i10 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        int i10 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        int i12 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        int i10 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue(i15 == 5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        queue_comparable_str0.add(comparable_str5);
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "" + "'", comparable_str16.equals(""));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
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
        int i15 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
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
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        int i6 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(i6 == 2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(i8 == 3);
        org.junit.Assert.assertTrue(i11 == 4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
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
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        int i10 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i11 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        int i11 = queue_comparable_str0.size();
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = null;
        queue_comparable_str0.add(comparable_str8);
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
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
        int i17 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = null;
        queue_comparable_str0.add(comparable_str8);
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i11 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 4);
        org.junit.Assert.assertTrue(i15 == 5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue(i15 == 2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        int i5 = queue_comparable_str0.size();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
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
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.peek();
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
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        int i13 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i12 == 3);
        org.junit.Assert.assertTrue(i13 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i19 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i19 == 6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        int i10 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = null;
        queue_comparable_str0.add(comparable_str9);
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str21 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str21 + "' != '" + "" + "'", comparable_str21.equals(""));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i7 == 3);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        int i10 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str16 = null;
        queue_comparable_str0.add(comparable_str16);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        int i16 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
        org.junit.Assert.assertTrue(i16 == 2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i17 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
        org.junit.Assert.assertTrue(i17 == 2);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i9 = queue_comparable_str0.size();
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
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
        int i14 = queue_comparable_str0.size();
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 4);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 4);
        org.junit.Assert.assertTrue(i15 == 4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = null;
        queue_comparable_str0.add(comparable_str11);
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 4);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        int i10 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue(i15 == 4);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str14 = null;
        queue_comparable_str0.add(comparable_str14);
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i12 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = null;
        queue_comparable_str0.add(comparable_str12);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        int i7 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        int i6 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(i6 == 2);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = null;
        queue_comparable_str0.add(comparable_str8);
        int i10 = queue_comparable_str0.size();
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        int i12 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        int i14 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i12 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 2);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i14 = queue_comparable_str0.size();
        int i15 = queue_comparable_str0.size();
        int i16 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "" + "'", comparable_str17.equals(""));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
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
        int i21 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
        org.junit.Assert.assertTrue(i21 == 2);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
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
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        int i14 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
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
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "hi!" + "'", comparable_str19.equals("hi!"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
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
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "" + "'", comparable_str16.equals(""));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i16 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue(i16 == 3);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i12 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
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
        int i17 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
        org.junit.Assert.assertTrue(i16 == 3);
        org.junit.Assert.assertTrue(i17 == 3);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        int i12 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        try {
            java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        int i4 = queue_comparable_str0.size();
        int i5 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "hi!" + "'", comparable_str3.equals("hi!"));
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        int i9 = queue_comparable_str0.size();
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i13 = queue_comparable_str0.size();
        int i14 = queue_comparable_str0.size();
        int i15 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 3);
        org.junit.Assert.assertTrue(i14 == 3);
        org.junit.Assert.assertTrue(i15 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i11 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i10 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 3);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        int i10 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = null;
        queue_comparable_str0.add(comparable_str11);
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str20 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "hi!" + "'", comparable_str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str20 + "' != '" + "hi!" + "'", comparable_str20.equals("hi!"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        int i11 = queue_comparable_str0.size();
        int i12 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
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
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertNull(comparable_str19);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "" + "'", comparable_str19.equals(""));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        int i10 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
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
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        try {
            java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertNull(comparable_str14);
        org.junit.Assert.assertNull(comparable_str15);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        int i5 = queue_comparable_str0.size();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(i8 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        int i10 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str20 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "hi!" + "'", comparable_str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str20 + "' != '" + "hi!" + "'", comparable_str20.equals("hi!"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        int i9 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
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
        int i15 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str16 = null;
        queue_comparable_str0.add(comparable_str16);
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i14 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i14 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i19 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue(i19 == 4);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
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
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 4);
        org.junit.Assert.assertTrue(i13 == 4);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue(i15 == 2);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        int i13 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i12 == 3);
        org.junit.Assert.assertTrue(i13 == 3);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        int i9 = queue_comparable_str0.size();
        int i10 = queue_comparable_str0.size();
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
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
        int i16 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(i16 == 2);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
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
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i14 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i10 == 3);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i7 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
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
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
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
        int i16 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i17 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str22 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue(i17 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str22 + "' != '" + "" + "'", comparable_str22.equals(""));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue(i15 == 3);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "" + "'", comparable_str16.equals(""));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
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
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "" + "'", comparable_str16.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "" + "'", comparable_str17.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "" + "'", comparable_str18.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "" + "'", comparable_str19.equals(""));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        int i15 = queue_comparable_str0.size();
        int i16 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(i16 == 2);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        int i11 = queue_comparable_str0.size();
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        int i14 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue(i12 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        int i15 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i18 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(i18 == 3);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str21 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str21 + "' != '" + "hi!" + "'", comparable_str21.equals("hi!"));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = null;
        queue_comparable_str0.add(comparable_str11);
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "" + "'", comparable_str17.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "" + "'", comparable_str18.equals(""));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
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
        int i14 = queue_comparable_str0.size();
        int i15 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str16 = null;
        queue_comparable_str0.add(comparable_str16);
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        int i5 = queue_comparable_str0.size();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        int i12 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        int i15 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "" + "'", comparable_str16.equals(""));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        int i17 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue(i17 == 2);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i18 = queue_comparable_str0.size();
        int i19 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str20 = queue_comparable_str0.peek();
        int i21 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i18 == 7);
        org.junit.Assert.assertTrue(i19 == 7);
        org.junit.Assert.assertTrue("'" + comparable_str20 + "' != '" + "" + "'", comparable_str20.equals(""));
        org.junit.Assert.assertTrue(i21 == 7);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        int i14 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i18 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
        org.junit.Assert.assertTrue(i18 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "hi!" + "'", comparable_str19.equals("hi!"));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        int i12 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = null;
        queue_comparable_str0.add(comparable_str12);
        int i14 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i14 == 4);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
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
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertNull(comparable_str14);
        org.junit.Assert.assertNull(comparable_str17);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
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
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        try {
            java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertNull(comparable_str14);
        org.junit.Assert.assertNull(comparable_str15);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
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
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i24 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str21 + "' != '" + "hi!" + "'", comparable_str21.equals("hi!"));
        org.junit.Assert.assertTrue(i24 == 2);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        queue_comparable_str0.add(comparable_str5);
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        int i10 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        int i10 = queue_comparable_str0.size();
        try {
            java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "" + "'", comparable_str18.equals(""));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "hi!" + "'", comparable_str19.equals("hi!"));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(i8 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
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
        int i19 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
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
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        int i16 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
        org.junit.Assert.assertTrue(i16 == 2);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        int i9 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue(i15 == 2);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i12 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i13 = queue_comparable_str0.size();
        int i14 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 3);
        org.junit.Assert.assertTrue(i14 == 3);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i12 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
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
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i16 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue(i16 == 2);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = null;
        queue_comparable_str0.add(comparable_str9);
        org.junit.Assert.assertTrue(i7 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
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
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = null;
        queue_comparable_str0.add(comparable_str10);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue(i12 == 3);
        org.junit.Assert.assertTrue(i13 == 3);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        int i13 = queue_comparable_str0.size();
        int i14 = queue_comparable_str0.size();
        int i15 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i13 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i13 == 3);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
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
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
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
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        int i9 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
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
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i18 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 3);
        org.junit.Assert.assertTrue(i18 == 5);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i18 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
        org.junit.Assert.assertTrue(i18 == 3);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        int i13 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.remove();
        int i6 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
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
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i19 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue(i19 == 3);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
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
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        int i10 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
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
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "" + "'", comparable_str16.equals(""));
        org.junit.Assert.assertTrue(i17 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "" + "'", comparable_str18.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "" + "'", comparable_str19.equals(""));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == 3);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        int i5 = queue_comparable_str0.size();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i8 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i9 = queue_comparable_str0.size();
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        int i12 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
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
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.peek();
        int i19 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
        org.junit.Assert.assertTrue(i19 == 3);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        int i10 = queue_comparable_str0.size();
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i8 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i8 == 3);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
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
        java.lang.Comparable<java.lang.String> comparable_str13 = null;
        queue_comparable_str0.add(comparable_str13);
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue(i15 == 2);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        int i5 = queue_comparable_str0.size();
        int i6 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str8 = null;
        queue_comparable_str0.add(comparable_str8);
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = null;
        queue_comparable_str0.add(comparable_str11);
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        int i18 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue(i18 == 6);
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "hi!" + "'", comparable_str19.equals("hi!"));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i11 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = null;
        queue_comparable_str0.add(comparable_str11);
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i15 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i15 == 5);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = null;
        queue_comparable_str0.add(comparable_str11);
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.peek();
        int i20 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "hi!" + "'", comparable_str19.equals("hi!"));
        org.junit.Assert.assertTrue(i20 == 7);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i17 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
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
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertNull(comparable_str14);
        org.junit.Assert.assertNull(comparable_str15);
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "" + "'", comparable_str18.equals(""));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
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
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
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
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        int i13 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i11 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue(i13 == 3);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i14 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i12 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i12 == 3);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i6 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
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
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
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
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertNull(comparable_str19);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        int i10 = queue_comparable_str0.size();
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        int i10 = queue_comparable_str0.size();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        int i19 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "" + "'", comparable_str17.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "" + "'", comparable_str18.equals(""));
        org.junit.Assert.assertTrue(i19 == 2);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
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
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "" + "'", comparable_str16.equals(""));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        int i10 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i12 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "" + "'", comparable_str17.equals(""));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "" + "'", comparable_str18.equals(""));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "hi!" + "'", comparable_str19.equals("hi!"));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i18 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
        org.junit.Assert.assertTrue(i18 == 4);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
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
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "hi!" + "'", comparable_str19.equals("hi!"));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = null;
        queue_comparable_str0.add(comparable_str8);
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i18 = queue_comparable_str0.size();
        int i19 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i18 == 7);
        org.junit.Assert.assertTrue(i19 == 7);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i10 = queue_comparable_str0.size();
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str15 = null;
        queue_comparable_str0.add(comparable_str15);
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
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
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        int i5 = queue_comparable_str0.size();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        int i13 = queue_comparable_str0.size();
        int i14 = queue_comparable_str0.size();
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 3);
        org.junit.Assert.assertTrue(i14 == 3);
        org.junit.Assert.assertTrue(i15 == 3);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        int i15 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = null;
        queue_comparable_str0.add(comparable_str6);
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i9 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.remove();
        int i20 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "" + "'", comparable_str19.equals(""));
        org.junit.Assert.assertTrue(i20 == 2);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "" + "'", comparable_str16.equals(""));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i6 = queue_comparable_str0.size();
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i10 = queue_comparable_str0.size();
        int i11 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i12 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = null;
        queue_comparable_str0.add(comparable_str11);
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i15 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i15 == 5);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i14 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue(i14 == 5);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
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
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
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
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertNull(comparable_str14);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        int i14 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 2);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i6 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i9 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "hi!" + "'", comparable_str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "hi!" + "'", comparable_str19.equals("hi!"));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
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
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
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
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertNull(comparable_str17);
        org.junit.Assert.assertNull(comparable_str18);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
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
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str20 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "" + "'", comparable_str16.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "" + "'", comparable_str17.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str20 + "' != '" + "" + "'", comparable_str20.equals(""));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i8 == 2);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
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
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i18 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str19 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertNull(comparable_str14);
        org.junit.Assert.assertNull(comparable_str15);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "" + "'", comparable_str19.equals(""));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        int i12 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = null;
        queue_comparable_str0.add(comparable_str12);
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        int i11 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i17 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str22 = queue_comparable_str0.remove();
        int i23 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str24 = queue_comparable_str0.remove();
        int i25 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str26 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue(i17 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str22 + "' != '" + "" + "'", comparable_str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 4);
        org.junit.Assert.assertTrue("'" + comparable_str24 + "' != '" + "" + "'", comparable_str24.equals(""));
        org.junit.Assert.assertTrue(i25 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str26 + "' != '" + "" + "'", comparable_str26.equals(""));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i12 == 3);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        queue_comparable_str0.add(comparable_str5);
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        int i10 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i12 = queue_comparable_str0.size();
        int i13 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i19 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str20 = queue_comparable_str0.remove();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "" + "'", comparable_str3.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue(i19 == 4);
        org.junit.Assert.assertTrue("'" + comparable_str20 + "' != '" + "" + "'", comparable_str20.equals(""));
    }
}

