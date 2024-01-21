package strings;

public class StringDemos extends Object {

	public static void main(String[] args) {

		StringDemos d1 = new StringDemos();

		StringDemos d2 = new StringDemos();

		System.out.println(d1.equals(d2)); // false

		String str1 = new String("hello");
		String str2 = new String("hello");

		System.out.println("Values: " + str1.equals(str2));
		System.out.print("Hashcode");
		System.out.println(str1 == str2);

		String str3 = "Rupa";
		String str4 = "Rupa";

		System.out.println("Values SCP :" + str3.equals(str4));
		System.out.print("Hashcode");
		System.out.println(str3 == str4);// it compare refs or hashcode

	}

}
