package aaaa_Program_Package;

public class Example {

	public static void main(String[] args) {
		Box bb  = new Box();
		bb.setDimention(2, 232, 20);
        Box cc = new Box();
		cc.ShowDimention();
	}
	
}	
  class Box{
		private int length,breadth,height;
		public void setDimention(int l,int b,int h){
			length=l;
			breadth=b;
			height=h;
		}
		
		public void ShowDimention(){
			System.out.println("L = " + length);
			System.out.println("B = " + breadth);
			System.out.println("H = " + height);
		}
	}


