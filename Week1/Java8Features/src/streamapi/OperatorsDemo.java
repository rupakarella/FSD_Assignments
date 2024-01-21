package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OperatorsDemo {
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("Rupa");
		list.add("Gayatri");
		list.add("Raji");
		list.add("Mohana");
		list.add("Mahesh");
		list.add("Lakshmi");
		list.add("Raji");
		Stream<String> stream= list.stream();
		//stream.limit(3).forEach(System.out::println);
		//stream.skip(3).forEach(System.out::println);
		//stream.distinct().forEach(System.out::println);
		String result=stream.reduce((a,b)->{return a+b;}).orElse("Hi");
		System.out.println(result);
	}
}
