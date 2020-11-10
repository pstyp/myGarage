package com.qa.qacommunity;

public class UniqueSum {

	public static void start() {
		System.out.println("Unique Sum exercise has started");

		System.out.println(returnSum(2,3,1));
	}
	
	public static int returnSum(int x, int y, int z) {
		
		if(x==y && y!=z && x!=z) {
			return z;
		}	else if(x==z && y!=z && y!=x) {
	        return y;
	    }		else if(y==z && y!=x && x!=z) {
	    	return x;
	    } else if(x==y && x==z && y==z) {
	    	return 0;
	    }
			return x+y+z;
		}
		
	}
