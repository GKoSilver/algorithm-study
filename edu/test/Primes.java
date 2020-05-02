package com.edu.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer> p=getPrimesArrayForNum(n);
		for(int i:p) {
			System.out.print(i+"*");
		}
		System.out.println();
		for(int i:p) {
			System.out.print("{"+i+",0},");
		}
		
	}
	public static ArrayList<Integer> getPrimesArrayForNum(int n){  
	    ArrayList<Integer> a=new ArrayList<Integer>();  
	    int k=0;  
	    int num = 5;  
	    a.add(0, 1);
	    a.add(1, 2);
	    a.add(2, 3);
	    a.add(3, 5);
	    a.add(4, 7);
	    for(int i=3;i<n;i+=3){  
	        for(int j=0;j<2;j++){  
	            k = 2*(i+j)-1;  
	            if((k<n)&&k%5==0?false:k%7==0?false:true){
	            	a.add(num, k);
	                num++;  
	            }    
	        }  
	    }  
	    return a;
	}
	public static ArrayList<Integer> getPrimesArrayForInt(int n){  
	    ArrayList<Integer> a=new ArrayList<Integer>();  
	    int k=0;
	    
	    int num = 5;  
	    a.add(0, 1);
	    a.add(1, 2);
	    a.add(2, 3);
	    a.add(3, 5);
	    a.add(4, 7);
	    for(int i=3;i<n;i+=3){  
	        for(int j=0;j<2;j++){  
	            k = 2*(i+j)-1;  
	            if((k<n)&&k%5==0?false:k%7==0?false:true){
	            	a.add(num, k);
	                num++;  
	            }    
	        }  
	    }  
	    return a;
	}
}
