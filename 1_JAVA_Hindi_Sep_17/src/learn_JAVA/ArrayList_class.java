package learn_JAVA;

import java.util.ArrayList;

public class ArrayList_class {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("A");
	    String B = Integer.toString(10);
		l.add(B);
		l.add("A");
		System.out.println(l);
		l.add(3,"Manoj");
		l.add(null);
		l.remove(2);
		System.out.println(l);

		l.add(1,"A");
		System.out.println(l.get(3));
        l.add("Sarita");
        System.out.println(l);
	}
}
