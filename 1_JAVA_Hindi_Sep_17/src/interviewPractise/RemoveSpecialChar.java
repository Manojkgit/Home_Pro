package interviewPractise;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String s="!@#$&*#manj)((*&";
		String newS=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(newS);
	}

}
