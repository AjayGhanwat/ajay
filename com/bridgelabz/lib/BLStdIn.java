/*************************************************
 *Perpose: Takes input data from user.
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 17-08-2017
 **************************************************/

package com.bridgelabz.lib;

import java.util.InputMismatchException;
import java.util.Scanner;


class BLStdIn {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static boolean isEmpty(){
		return !scanner.hasNext();
	}
	
	public static int readInt(){
		int token = scanner.nextInt();
		return token;
	}
	
	public static double readDouble(){
		double token = scanner.nextDouble();
		return token;
	}
	
	public static boolean readBoolean(){
		String token = scanner.next();
		if("true".equalsIgnoreCase(token)) 
			return true;
		else if("false".equalsIgnoreCase(token)) 
			return false;
		else if("0".equalsIgnoreCase(token)) 
			return false;
		else if("1".equalsIgnoreCase(token)) 
			return true;
		throw new InputMismatchException("Attemp boolean from user");
    }
	
	public static String readString() {
            return scanner.next();
    }
	
	public static boolean hasNextChar(){
		return scanner.hasNext();
	} 
	
	public static char readChar(){
		char token = scanner.next().charAt(0);
	    return token;			
	}
	
	public static boolean hasNextLine(){
		return scanner.hasNextLine();
	}
	
	public static String readLine(){
		String token = scanner.nextLine();
		return token;
	}
	
	public static void main(String args[]) {
		
	}
}