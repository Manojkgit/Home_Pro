package aaaa_Program_Package;

public class RemoveJunk_CharacterInArray {

	public static void main(String[] args) {
		String s="!@# manoj*&^%$";
		String new_String = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s.replaceAll("[^a-z*]", ""));
	}

}
