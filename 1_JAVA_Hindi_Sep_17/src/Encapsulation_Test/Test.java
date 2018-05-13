package Encapsulation_Test;

import learn_JAVA.ProtectedClass;

public class Test {

	public static void main(String[] args) {
		Room r = new Room();
        r.setSpace(30);
        School sc = new School(r);
        System.out.println(sc.r.getSpace());
        System.out.println(sc.r.setSpace(20));
        Star s=new Star();
        s.star();
        
	}

}
