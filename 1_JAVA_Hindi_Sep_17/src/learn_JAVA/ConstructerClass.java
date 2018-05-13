package learn_JAVA;
public class ConstructerClass {
	int i;
	String name;
	float f;
	double d;

	public static void main(String[] args) {
		ConstructerClass cc = new ConstructerClass(); //32, "manavi", 23.2f, 343
		System.out.println(cc.i+" "+ cc.name);
		// cc.ConstructerClass(90, "string", 4.2f, 34.2);
		// System.out.println(cc.i + " " + cc.name + " " + cc.f + " " + cc.d);

	}
}
	/*public ConstructerClass(int j, String string, float g, double k) {
		this.i = j;
		this.name = string;
		this.f = g;
		this.d = k;
		System.out.println(j + "  " + string + "  " + g + "  " + k);
		System.out.println("Hello Words");
	}

	public ConstructerClass(String n, float fff,int ii, double ddd) {
		name = n;
		f = fff;
		d = ddd;
	}
*/

