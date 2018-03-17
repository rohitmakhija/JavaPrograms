package problemSolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramsOrNot {
	public static void main(String args[]) {
		System.out.println(anagramsOrNot("tea", "atae"));
	}

	public static boolean anagramsOrNot(String str1, String str2) {
		String copyStr1 = str1.replaceAll("\\s", "");
		String copyStr2 = str2.replaceAll("\\s", "");

		if(copyStr1.length() != copyStr2.length())
			return false;

		char[] str1Array = copyStr1.toCharArray();
		char[] str2Array = copyStr2.toCharArray();

		Arrays.sort(str1Array);
		Arrays.sort(str2Array);

		return Arrays.equals(str1Array, str2Array);
	}

	public static boolean anagramsOrNot1(String str1, String str2) {
		String copyStr1 = str1.replaceAll("\\s", "");
		String copyStr2 = str2.replaceAll("\\s", "");

		if(copyStr1.length() != copyStr2.length())
			return false;

		Map<Character, Integer> count = new HashMap<>();
		for(int i = 0 ; i < str1.length(); i++) {
			count.put(str1.charAt(i), count.get(str1.charAt(i)) == null? 1: count.get(str1.charAt(i)) + 1);
		}

		for(int i = 0 ; i < str2.length(); i++) {
			if(count.containsKey(str2.charAt(i))) {
				count.put(str1.charAt(i), count.get(str1.charAt(i)) - 1);
			}
		}

		for(int value: count.values()) {
			if(value != 0)
				return false;
		}
		return true;
	}
}