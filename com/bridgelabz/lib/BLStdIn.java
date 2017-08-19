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
		int number;
		try{
			number = scanner.nextInt();
		}
		catch(InputMismatchException e){
			String error = scanner.next();
			throw new InputMismatchException("Attemp to read int value but " + error + " is get from user");
		}
		catch (NoSuchElementException e) {
            throw new NoSuchElementException("No Elements Input given.");
        }
		return number;
	}
	
	public static double readDouble(){
		double number;
		try{
			number = scanner.nextDouble();
		}
		catch(InputMismatchException e){
			String error = scanner.next();
			throw new InputMismatchException("Attemp to read double value but " + error + " is get from user");
		}
		catch (NoSuchElementException e) {
            throw new NoSuchElementException("No Elements Input given.");
        }
		return number;
	}
	
	public static boolean readBoolean(){
		String number;
		try{
			number = scanner.next();
			if(number == "true") 
				return true;
			else if(number == "false") 
				return false;
			else if(number == "0") 
				return false;
			else if(number == "1") 
				return true;
            else
				BLStdOut.println("Enter only true(1) or false(0).");
		}
		catch(InputMismatchException e){
			String error = scanner.next();
			throw new InputMismatchException("Attemp to read double value but " + error + " is get from user");
		}
	}
	
	public static void main(String args[]) {
		
        BLStdOut.print("Type a Boolean: ");
        boolean c = BLStdIn.readBoolean();
        BLStdOut.println("Your boolean was: " + c);
        BLStdOut.println();
	}
}