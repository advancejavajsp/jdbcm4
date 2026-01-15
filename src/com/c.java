package com;

import java.util.HashMap;
import java.util.Map;

public class c {
	
	public static void main(String[] args) {
		
		String s="pwwkew";
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		int l=0;
		int r=0;
		int max=0;
		
		while(r<s.length()) {
			char c=s.charAt(r);
			
			if(map.containsKey(c)) {
				
				
				
				l=l>map.get(c)?l:map.get(c)+1;
				
			}
			int le=r-l+1;
			max=max>le?max:le;
			map.put(c, r);
			r++;
		}
		System.out.println(max);
	}

}
