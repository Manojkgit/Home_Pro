package aaaa_Program_Package;

import java.util.LinkedList;

public class StringSwappingClass {

	public static void main(String[] args) {
       /*String a="manavi";
       String b="viraj";
       
       a=a+b;
       b=a.substring(0,a.length()-b.length());
       a=a.substring(b.length());
       System.out.println(a+" "+b);*/
       
       LinkedList<String> ll=new LinkedList<String>();
       ll.add("Manoj 0");
       ll.add("Manavi 1");
       ll.add("Manavi 2");
       ll.add("Manavi 3");
       ll.add("Manavi 3");ll.add("Manavi 3");
       System.out.println(ll.get(0));
       
       System.out.println("**********************************");
       
       ll.addFirst("Sarita");
       for(int i=0;i<ll.size();i++){
    	  System.out.println(ll.get(i)); 
       }
       System.out.println("**********************************");
       
       for(String lll:ll){
    	   System.out.println(lll);
       }
       
       ll.addLast("Sushama");
       ll.getLast();  
       System.out.println(ll.getLast());
       System.out.println("*************************************");
       
       ll.removeLast();
       ll.remove(2);
       for(String lll:ll){
    	   System.out.println(lll);
       }
       
       
	}

}
