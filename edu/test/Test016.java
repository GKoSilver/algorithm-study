package com.edu.test;
/*
 * 算法训练 景点游览
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test016 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int n=s.nextInt();
		int i=0;
		while(i<n) {
			arr.add(s.nextInt());
			i++;
		}
		/*
		 * 自定义排序方法
		 */
		Comparator<Integer> c= new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO 自动生成的方法存根
				if(o1<o2) {
					return 1;
				}
				else return -1;
			}
		};
		Collections.sort(arr,c);
		for(int j:arr) {
			System.out.print(j+" ");
		}
	}

}
