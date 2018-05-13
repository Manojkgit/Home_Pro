package interface_collection_map;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Class {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("manoj");
		al.add("Sarita");
		al.add("manavi");
		
		ArrayList<String> alI=new ArrayList<String>();
		alI.add("12");
		alI.add("19");
	
		al.addAll(alI);
		for(String newvalue:al){
			System.out.println(newvalue);	
		}
		System.out.println("--------------------------");
		al.remove(1);
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
	
		al.removeAll(alI);
	
		Iterator<String> it=al.iterator();
		
		System.out.println(it.hasNext());
		al.add("New Manoj");
		System.out.println("-----------------------------");
		for(String newvalue:al){
			System.out.println(newvalue);	
		}
	}

}
