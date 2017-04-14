package caw.sw2a1;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import edu.osu.cs362.hw1.Queue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> comparable_str1 = queue_comparable_str0.peek();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> comparable_str1 = queue_comparable_str0.remove();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.remove();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.remove();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        int i1 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str2 = queue_comparable_str0.peek();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.remove();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.peek();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        int i4 = queue_comparable_str0.size();
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.remove();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        int i5 = queue_comparable_str0.size();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
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
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.remove();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
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
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        int i10 = queue_comparable_str0.size();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        int i1 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str2 = queue_comparable_str0.remove();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
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
        java.lang.Comparable<java.lang.String> comparable_str15 = queue_comparable_str0.peek();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        int i9 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.remove();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i5 = queue_comparable_str0.size();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
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
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.peek();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        int i4 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i9 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        int i11 = queue_comparable_str0.size();
        int i12 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        int i10 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        int i1 = queue_comparable_str0.size();
        int i2 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        int i11 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str13 = queue_comparable_str0.peek();
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
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
        int i15 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str17 = queue_comparable_str0.peek();
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.remove();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.peek();
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        int i5 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
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
        int i15 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str16 = queue_comparable_str0.remove();
        int i17 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str18 = queue_comparable_str0.peek();
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        int i4 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.remove();
        int i8 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        int i3 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.remove();
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.remove();
        queue_comparable_str0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str11 = queue_comparable_str0.remove();
        java.lang.Comparable<java.lang.String> comparable_str12 = queue_comparable_str0.peek();
    }
}

