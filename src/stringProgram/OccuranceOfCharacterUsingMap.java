package stringProgram;

import java.util.HashMap;

public class OccuranceOfCharacterUsingMap {

	public static void main(String[] args) {
		String str = "Tester";
		String s = str.toLowerCase();

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		System.out.println(map);
	}
}
 