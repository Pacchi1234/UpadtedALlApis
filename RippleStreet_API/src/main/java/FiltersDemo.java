import java.util.ArrayList;
import java.util.Iterator;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class FiltersDemo {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Mary");
		names.add("Bob");

		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
		    
		    System.out.println(name);
		}
		 System.out.println(names);
		

}
