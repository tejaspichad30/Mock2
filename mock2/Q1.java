package mock2;

// Q1. WAP to print a pattern using stars(*)


public class Q1 {

	 public static void main(String[] args) {
	        int row = 10 ; 

	       
	        for (int i = 1; i <= row; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        
	        for (int i = row - 1; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	}