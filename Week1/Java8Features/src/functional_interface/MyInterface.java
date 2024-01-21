package functional_interface;
@FunctionalInterface
public interface MyInterface {
	public abstract int add(int a, int b );
	
	default void show1()
	{
		System.out.println("Show1 is default method call");
	}
	static void show2()
	{
		System.out.println("Show2 is static method call");
	}
}
