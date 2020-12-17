/**
 * 
 */
package javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author kowshic
 *
 */
public class StreamsFilter {
	
	@Test
	public void streams() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("kows");
		names.add("sen");
		names.add("ko");
		
		Long c = names.stream().filter(s->s.startsWith("k")).count();
		System.out.println(c);
		
		List<String> result = names.stream().filter(s->s.length()>2).collect(Collectors.toList());
		
		Assert.assertEquals(names, result);
	}
	
	
	@Test
	public void sort() {
		List<Integer> li = Arrays.asList(1,5,98,58,56,98,5,2);
		List<Integer> newList = li.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(newList.get(2));
		System.out.println(newList);
	}
}
