package aaaa_Program_Package;
public class getCube {
	int lenght=10;
	int hight = 20;
	int width=3;
	public int getArea(){		
		return lenght*hight*width;
	}
	
	public getCube(){
		System.out.println("Its a constructer class calling.");
	    System.out.println(getArea());
	}
	
	public getCube(int i,int j,int k){
		int a=i*j*k;
        System.out.println(a);
	}

}
