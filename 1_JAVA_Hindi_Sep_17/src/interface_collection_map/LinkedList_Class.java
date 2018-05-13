package interface_collection_map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Class {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("m");
		ll.add("ss");
		ll.add("viraj");
		
		for(int i=0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}
		System.out.println("_______________________________");
		ll.removeFirst();
		ll.addFirst("manoj");
		ll.addLast("raju");
		ll.set(2, "Manavi");
		for(int i=0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}
		System.out.println("-----------------------------------");
	    
		ArrayList<String> al=new ArrayList<String>();
		al.add("Suraj");
		ll.addAll(al);
		System.out.println("---------------------------------");
		for(String store:ll){
			System.out.println(store);
		}
		
		Iterator<String> it=ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
    }
}
