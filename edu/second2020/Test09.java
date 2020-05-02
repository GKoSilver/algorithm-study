package com.edu.second2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<ArrayList<Integer>> villages = new ArrayList<ArrayList<Integer>>();
//		int [][]village=new int[n][4];
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> village = new ArrayList<Integer>();
			village.add(s.nextInt());
			village.add(s.nextInt());
			village.add(s.nextInt());
			villages.add(village);
		}
		s.close();
		double totle_dist = 0;
		for (int i = 0; i < n; i++) {
			ArrayList<ArrayList<Double>> dist = new ArrayList<ArrayList<Double>>();
			for (int j = 0; j <= i; j++) {
				ArrayList<Double> kvlist = new ArrayList<Double>();
				for (int k = j + 1; k < n; k++) {
					kvlist.add(Double.valueOf(k));
					kvlist.add(distance(villages.get(j), villages.get(k)));
					dist.add(kvlist);
				}
			}

			double min_k = dist.get(0).get(0);
			double min_dist = dist.get(0).get(1);

			for (int a = 0; a < dist.size(); a++) {
				if (dist.get(a).get(1) < min_dist) {
					min_k = dist.get(a).get(0);
					min_dist = dist.get(a).get(1);
				}
			}

			if (i < n-1) {
				ArrayList<Integer> cache = new ArrayList<Integer>();
				for (int a : villages.get(i)) {
					cache.add(a);
				}
				villages.set(i + 1, villages.get((int) min_k));
				villages.set((int) min_k, cache);
			}
			totle_dist += min_dist;

		}
		System.out.println(totle_dist);
	}

	public static double distance(ArrayList<Integer> villagea, ArrayList<Integer> villageb) {
		return Math.sqrt(Math.pow(villagea.get(0), villagea.get(0)) + Math.pow(villagea.get(1), villagea.get(1))
				+ Math.pow(villagea.get(2), villagea.get(2)));
	}

}
