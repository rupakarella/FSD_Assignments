package functional_interface;

public class ImpJava7 implements MyInterface{
	@Override
	public int add(int a, int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		MyInterface mi= new ImpJava7();
		int result=mi.add(5,5);
		System.out.println(result);
		
	}

}
