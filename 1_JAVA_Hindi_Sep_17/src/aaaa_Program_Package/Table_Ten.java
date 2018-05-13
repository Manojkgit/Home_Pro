package aaaa_Program_Package;

public class Table_Ten {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			int table = 10*i;
			System.out.print(table + " ");
		}
		System.out.println("");
		
		//---------------- Palendrome -------------//
		int temp,sum=0,num=1231;
        temp=num;
		while(num>0){
			int r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
            if(temp==sum){
			System.out.println("Number is Palendrome");
		}else{
			System.out.println("Not paneldrome..");
		}
	}
}
