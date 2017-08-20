/*************************************************
 *Perpose: Print given data.
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 19-08-2017
 **************************************************/

package com.bridgelabz.lib;

class BLStdOut {
	public static void print(String s){
		System.out.print(s);
	}
	
	public static void println(String s){
		System.out.println(s);
	}
	
	public static void println(boolean s){
		System.out.println(s);
	}
	
	public static void println(int s){
		System.out.println(s);
	}
	
	public static void println(){
		System.out.println();
	}
	
	public static void printf(String format,Object args ){
		System.out.printf(format, args);
	}
	
	public static void main(String args[]){
		
	}
}