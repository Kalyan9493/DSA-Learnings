package datastructures.patterns;

public class Pattern1 {

	public static void main(String args[]) {
//		for(int i=0; i<5; i++) {
//			for(int j=0; j < 5-i; j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		printPattern(10);
	}
	
	public static void printPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i%2 == 0 && j%2 == 0) {
					System.out.print("   ");
				}else {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
//		
//		for (int i = mid; i >= 1; i--) {
//			for (int j = mid; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print(" * ");
//			}
//			System.out.println("");
//		} 
	}
//	  static void printDiamond(int n)
//	    {
//	        int space = n - 1;
//	     
//	        // run loop (parent loop)
//	        // till number of rows
//	        for (int i = 0; i < n; i++)
//	        {
//	            // loop for initially space,
//	            // before star printing
//	            for (int j = 0; j < space; j++)
//	                System.out.print("* ");
//	     
//	            // Print i+1 stars
//	            for (int j = 0; j <= i; j++)
//	                System.out.print(" ");
//	     
//	            System.out.print("\n");
//	            space--;
//	        }
//	     
//	        // Repeat again in
//	        // reverse order
//	        space = 0;
//	     
//	        // run loop (parent loop)
//	        // till number of rows
//	        for (int i = n; i > 0; i--)
//	        {
//	            // loop for initially space,
//	            // before star printing
//	            for (int j = 0; j < space; j++)
//	                System.out.print("* ");
//	     
//	            // Print i stars
//	            for (int j = 0; j < i; j++)
//	                System.out.print(" ");
//	     
//	            System.out.print("\n");
//	            space++;
//	        }
//	    }
}
