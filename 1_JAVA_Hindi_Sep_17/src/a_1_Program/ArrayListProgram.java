package a_1_Program;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("A");
		al.size();
		System.out.println(al);
		al.add("B");
		al.add(null);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.add(2,"Manoj");
		System.out.println(al);
		al.add(2,"Replace Manoj");
		System.out.println(al);
		al.lastIndexOf(al);
		System.out.println(al);
		al.addAll(al);
		System.out.println(al);
		al.indexOf("A");
		System.out.println(al);
	}

}
