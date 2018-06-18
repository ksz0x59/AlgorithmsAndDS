package com.company;

import com.sun.org.apache.xml.internal.security.algorithms.JCEMapper;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Anagram
{
    public static void main(String[] args) {
        String a = "pool";
        String b = "loop";
        StringBuffer sb = new StringBuffer(a);
        String lala = sb.reverse().toString();

        /*Set<Character> s1 = new TreeSet<>();
        Set<Character> s2 = new TreeSet<>();

        for (int i = 0; i < a.length(); ++i)
        {
            s1.add(a.charAt(i));
        }

        for (int i = 0; i < a.length(); ++i)
        {
            s2.add(b.charAt(i));
        }

        if (s1.equals(s2))
            System.out.println("anagram");
        else
            System.out.println("not anagram");*/

        char[] ara = a.toCharArray();
        Arrays.sort(ara);
        char[] arb = b.toCharArray();
        Arrays.sort(arb);
        if (Arrays.equals(ara, arb))
            System.out.println("anagram \n" + String.valueOf(ara) + "" + String.valueOf(arb));
        else
            System.out.println("not anagram" + String.valueOf(ara) + "" + String.valueOf(arb));
    }
}
