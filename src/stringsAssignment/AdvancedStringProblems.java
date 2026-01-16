package stringsAssignment;

import java.*;
import java.util.HashMap;

public class AdvancedStringProblems {

	public static void main(String[] args) {

		// 1
//		String string="7923049830b";
//		int i=0;
//		while(i<string.length()) {
//			if(!Character.isDigit(string.charAt(i))) {
//				System.out.println("False");
//				return;
//			}
//			i++;
//			
//			
//		}
//		System.out.println("True");

//2

//		String string="jhdjbhihab@#$%^*&^jbdckj";
//		StringBuilder sBuilder=new StringBuilder();
//		for(int i=0;i<string.length();i++) {
//			if(Character.isAlphabetic(string.charAt(i)) || Character.isDigit(string.charAt(i))) {
//				sBuilder.append(string.charAt(i));
//			}
//		}
//		System.out.println(sBuilder.toString());

//6
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
//			System.out.print(key +""+map.get(key));
//
//		}

		// 7
//		String string = "a bb ccc dddd eeeee ffffff zzzzzzzzzzzzzzz";
//		HashMap<Character, Integer> map = new HashMap<>();
//
//		for (int i = 0; i < string.length(); i++) {
//			char ch = string.charAt(i);
//			if (ch == ' ')
//				continue;
//
//			if (map.containsKey(ch)) {
//				map.put(ch, map.get(ch) + 1);
//
//			} else {
//				map.put(ch, 1);
//			}
//		}
//		int maxCount = 0;
//		char ch=' ';
//		for (char key : map.keySet()) {
//
//			if (map.get(key) > maxCount) {
//				maxCount = map.get(key);
//				ch=key;
//			}
//		}
//		System.out.println(ch+"->"+maxCount);

//8

//		String string="12345";
//		int num=0;
//		for(int i=0;i<string.length();i++) {
//			num=num*10+(string.charAt(i)-'0');
//			
//		}
//		System.out.println(num);
//		System.out.println(Integer.parseInt(string));

//9
		String string = "Sarabu Varun Kumar";
		StringBuilder stringBuilder=new StringBuilder();
		for(int i=0;i<string.length();i++) {
			
		}

//10
//		String string2 = "Lovely Professional University";
//		StringBuilder sBuilder=new StringBuilder();
//
//		for (int i = 0; i < string2.length(); i++) {
//			if(Character.isLowerCase(string2.charAt(i))) {
//				sBuilder.append(Character.toUpperCase(string2.charAt(i)));
//			}else {
//				sBuilder.append(Character.toLowerCase(string2.charAt(i)));
//
//			}
//
//		}
//		System.out.println(sBuilder.toString());

	}
}
