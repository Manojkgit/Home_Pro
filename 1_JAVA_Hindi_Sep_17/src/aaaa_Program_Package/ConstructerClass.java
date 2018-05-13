package aaaa_Program_Package;

public class ConstructerClass {
	public static void main(String[] args){
		getCube gc=new getCube();
		getCube gc1=new getCube(23,1,10);
        System.out.println(gc.getArea());
        System.out.println(gc1.getArea());
	}
}
