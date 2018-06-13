package Jar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map_java {
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("Name", "Bhanu");
		map.put("Subject", "QTP");
		map.put("Subject", "Selenium");
		String s = map.get("Subject");
		System.out.println(s);

		Map<String, Integer> map1 = new LinkedHashMap<String, Integer>();
		map1.put("Pen", 2);
		map1.put("Book", 4);
		System.out.println(map1.containsKey("Pen"));
		System.out.println(map1.containsKey("Pencil"));

		Set<String> allKeys = map1.keySet();
		for (String key : allKeys) {
			Integer v = map1.get(key);
			System.out.println(key + "-" + v);
		}
	}

}
