package in.bushansirgur;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 *	Given a String, find how many times each character present in that String 
 *	Input: bushansirgur
 *	Output: b = 1
 *			u = 2
 *			s = 2
 *			h = 1
 *			a = 1
 *			n = 1
 *			i = 1
 *			r = 2
 *			g = 1
 **/
public class CountCharactersInString {
	public static void main(String[] args) {
		Map<Character, Integer> map = countCharacters("bushansirgur");
		for(Character c : map.keySet()) {
			System.out.println(c+" = "+map.get(c));
		}
	}
	public static Map<Character, Integer> countCharacters(String str){
		char[] c = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(Character ch : c) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		return map;
	}
}
