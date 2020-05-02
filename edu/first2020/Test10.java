package com.edu.first2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		String[] program = new String[n];
		ArrayList<String> keep_program = new ArrayList<String>();
		HashMap<Integer, String> program_list = new HashMap<Integer, String>();
		for (int i = 0; i < n; i++) {
			program[i] = s.next();
		}
		for (String keepProgram : program) {
			keep_program.add(keepProgram);
		}
		Arrays.sort(program, Collections.reverseOrder());
		for (int j = 0; j < m; j++) {
			program_list.put(keep_program.indexOf(program[j]), program[j]);
		}
		Set<Integer> set = program_list.keySet();
		Object[] arr = set.toArray();
		Arrays.sort(arr);
		for (Object key : arr) {
			System.out.print(keep_program.get((int) key) + " ");
		}
	}

}
