package stringsAssignment;

import java.util.HashMap;
import java.util.HashSet;


public class IntermediateStringProblems {

	public static void main(String[] args) {

		String string = "Lovely Professional University";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
				
			}else {
				map.put(ch,1);  
			}
		}
		
		for(char key:map.keySet()) {
			if(map.get(key)>1) {
				System.out.print(key+" ");
			}
			
		}

		// 2

//		String string = "a bb ccc dddd eeeee ffffff";
//		HashMap<Character, Integer> map = new HashMap<>();
//
//		for (int i = 0; i < string.length(); i++) {
//			char ch = string.charAt(i);
//			if (ch == ' ') continue;
//
//			if (map.containsKey(ch)) {
//				map.put(ch, map.get(ch) + 1);
//
//			} else {
//				map.put(ch, 1);
//			}
//		}
//
//		for (char key : map.keySet()) {
//
//			System.out.print(key + "-> " + map.get(key));
//			System.out.println();
//
//		}

//3

//		String str1 = "listen";
//		String str2 = "sile...";
//
//		int[] freq = new int[26];
//
//		if (str1.length() != str2.length()) {
//			System.out.println("Not anagrams");
//			return;
//		}
//
//		for (int i = 0; i < str1.length(); i++) {
//			freq[str1.charAt(i) - 'a']++;
//			freq[str2.charAt(i) - 'a']--;
//
//		}
//		
//		for(int count : freq) {
//			if(count!=0) {
//				System.out.println("Not a anagrams");
//				return;
//			}
//		}
//		System.out.println("Yes both the strings are anagrams");

//4
//		String string="Varun Kumar";
//		
//		System.out.println(string.replace("Varun","Sarabu Varun"));

//5

//		String string = "sdbciyweiuhiuiehiuewh ih oiaeuw iuwei";
//		HashSet<Character> set = new HashSet<>();
//		for (int i = 0; i < string.length(); i++) {
//			if(string.charAt(i)==' ') continue;
//			set.add(string.charAt(i));
//		}
//		
//		System.out.println(set);

//6

//		String string = "dbsibdicuicb";
//
//		HashMap<Character, Integer> map = new HashMap<>();
//
//		for (int i = 0; i < string.length(); i++) {
//			char ch = string.charAt(i);
//
//			if (ch == ' ')
//				continue;
//
//			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
//		}
//
//		for (int i = 0; i < string.length(); i++) {
//			char ch = string.charAt(i);
//
//			if (map.get(ch) == 1) {
//				System.out.println("First repeating character: " + ch);
//				return;       
//			}
//		}

//7

//		String string = "Sarabu Varun Kumar";
//		String[] arr = string.split(" ");
//		
//		StringBuilder sBuilder=new StringBuilder();
//		
//		for(int i=0;i<arr.length;i++) {
//			StringBuilder sBuilder2=new StringBuilder(arr[i]);
//			sBuilder2.reverse();
//			sBuilder.append(sBuilder2).append(" ");
//			
//			
//		}
//		
//		System.out.println(sBuilder.toString());
	}

}
