package Jar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ArrayAndTreeSetExample
{
	public static void main(String[] args) 
	{
	ArrayList<String> ar=new ArrayList<String>();
	ar.add("Qsp");
	ar.add("Jsp");
	ar.add("Qsp");
	Collections.sort(ar);
	for(String b:ar)
	{
		System.out.println(b);
	}
	TreeSet<String> ts=new TreeSet<String>();
	ts.add("Qsp");
	ts.add("Jsp");
	ts.add("Qsp");
	for(String c:ts)
	{
		System.out.println(c);
	}
	}

}
