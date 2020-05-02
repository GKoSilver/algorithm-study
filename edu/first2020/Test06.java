package com.edu.first2020;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		String word = s.next();
		int point = 0;
		int word_fragment_1 = 0;
		int word_fragment_2 = 0;
		int word_fragment_3 = 0;
		int word_fragment_4 = 0;
		while (point < word.length()) {
			if (word.charAt(point) == 'a' || word.charAt(point) == 'e' || word.charAt(point) == 'i'
					|| word.charAt(point) == 'o' || word.charAt(point) == 'u') {
				break;
			}
			word_fragment_1++;
			point++;
		}
		while (point < word.length()) {
			if (word.charAt(point) != 'a' && word.charAt(point) != 'e' && word.charAt(point) != 'i'
					&& word.charAt(point) != 'o' && word.charAt(point) != 'u') {
				break;
			}
			word_fragment_2++;
			point++;
		}
		while (point < word.length()) {
			if (word.charAt(point) == 'a' || word.charAt(point) == 'e' || word.charAt(point) == 'i'
					|| word.charAt(point) == 'o' || word.charAt(point) == 'u') {
				break;
			}
			word_fragment_3++;
			point++;
		}
		while (point < word.length()) {
			if (word.charAt(point) != 'a' && word.charAt(point) != 'e' && word.charAt(point) != 'i'
					&& word.charAt(point) != 'o' && word.charAt(point) != 'u') {
				break;
			}
			word_fragment_4++;
			point++;
		}
		if (word_fragment_1 == 0 || word_fragment_2 == 0 | word_fragment_3 == 0 || word_fragment_4 == 0) {
			System.out.println("no");
		} else if (word_fragment_1 + word_fragment_2 + word_fragment_3 + word_fragment_4 == word.length()) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
