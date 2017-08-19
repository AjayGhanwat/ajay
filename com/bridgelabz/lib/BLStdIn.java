/*************************************************
 *Perpose: Takes input data from user.
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 17-08-2017
 **************************************************/

package com.bridgelabz.lib;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


class BLStdIn {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static boolean isEmpty(){
		return !scanner.hasNext();
	}
	
	public static int readInt(){
		int token;
		try{
			token = scanner.nextInt();
		}
		catch(InputMismatchException e){
			String error = scanner.next();
			throw new InputMismatchException("Attemp to read int value but " + error + " is get from user");
		}
		catch (NoSuchElementException e) {
            throw new NoSuchElementException("No Elements Input given.");
        }
		return token;
	}
	
	public static double readDouble(){
		double token;
		try{
			token = scanner.nextDouble();
		}
		catch(InputMismatchException e){
			String error = scanner.next();
			throw new InputMismatchException("Attemp to read double value but " + error + " is get from user");
		}
		catch (NoSuchElementException e) {
            throw new NoSuchElementException("No Elements Input given.");
        }
		return token;
	}
	
	public static boolean readBoolean(){
		String token;
		try{
			token = scanner.next();
			if("true".equalsIgnoreCase(token)) 
				return true;
			else if("false".equalsIgnoreCase(token)) 
				return false;
			else if("0".equalsIgnoreCase(token)) 
				return false;
			else if("1".equalsIgnoreCase(token)) 
				return true;
            else
				BLStdOut.println("Enter only true or false.");
			throw new InputMismatchException("Attemp to read boolean value");
		}
		catch (NoSuchElementException e) {
            throw new NoSuchElementException("Attemp to read boolean value.");
        }
	}
	
	public static String readString() {
        try {
            return scanner.next();
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'String' value from standard input, but there are no more tokens available");
        }
    }
	
	public static void main(String args[]) {
		
        BLStdOut.print("Type a string: ");
        String s = readString();
        BLStdOut.println("Your string was: " + s);
        BLStdOut.println();
	}
}