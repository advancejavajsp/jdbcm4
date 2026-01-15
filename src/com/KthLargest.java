package com;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargest {
	public static void main(String[] args) {
		
		int [] arr= {3,5,3,6,7,8,8,9};
		int k=3;
		
		Queue<Integer> q=new PriorityQueue<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			q.offer(arr[i]);
			if(q.size()>k) {
				q.poll();
			}
		}
		System.out.println(q.peek());
	}

}
