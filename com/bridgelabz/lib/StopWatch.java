/********************************************************
 *Perpose: It gives time taken by program for execution
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 20-08-2017
 ********************************************************/

package com.bridgelabz.lib;

class StopWatch {
	private static long start;
	
	public StopWatch(){
		start = System.currentTimeMillis();
	}
	
	public static long elapsedTime(){
		long now = System.currentTimeMillis();
		return (now - start);
	}
	
	public static void main(String args[]){
		
	}
} 