package project4;

import java.util.Scanner;

public class lisubsequence {
	
	static int longsub(int arr[]) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i;j+1<arr.length;j++) {
				if(arr[j]<arr[j+1]) {
					count++;
				}
			}
			if(max<count) {
				max=count;
			}
			
		}
					return max;
	}
	public static void main(String[] args) {
		int n;
		System.out.println("enter length of array:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int arr[]= new int[n];
	System.out.println("enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("the longest subsequence of given array:="+longsub(arr));
		
		sc.close();
	}

}