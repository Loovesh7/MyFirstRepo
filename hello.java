package StaticDefaultJava8Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(5);
		list1.add(1000);
		list1.add(15);
		list1.add(520);
		list1.add(520);
		list1.add(1690);

		System.out.println(list1);

		// creating a stream on a collection

		List<Integer> list2 = list1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(list2);
		
		Set<Integer> list3 = list1.stream().filter(x-> x > 500).collect(Collectors.toSet());
		System.out.println(list3);
		// set dont allow duplicate values
		
		Set<Integer> list4= list1.stream().map(x -> x + 5).collect(Collectors.toSet());
		System.out.println(list4);
		System.out.println(list4.stream().count());
	}

}
