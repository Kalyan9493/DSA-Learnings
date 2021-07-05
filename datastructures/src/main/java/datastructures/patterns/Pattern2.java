package datastructures.patterns;

public class Pattern2 {

	public static void printPattern(int n) {

		  // print the upper half
        for (int i = 1; i <= n; i++)
        {
            // print '*'
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(" * ");
            }
 
            // print space
            for (int k = 1; k < (2*i - 1); k++) {
                System.out.print("   ");
            }
 
            // print '*'
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(" * ");
            }
 
            System.out.print(System.lineSeparator());
        }
 
        // print the lower half
        for (int i = n - 1; i >= 1; i--)
        {
            // print '*'
            for (int j = n; j >= i; j--) {
                System.out.print(" * ");
            }
 
            // print space
            for (int k = 1; k < (2*i - 1); k++) {
                System.out.print("   ");
            }
 
            // print '*'
            for (int j = n; j >= i; j--) {
                System.out.print(" * ");
            }
 
            System.out.print(System.lineSeparator());
        }
    }
	public static void main(String[] args) {
		print(5);
	}
	
	public static void print(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" * ");
			}
			for(int k=0; k<(2*i); k++) {
				System.out.print("   ");
			}
			for(int j=0; j<n-i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		for(int i=n; i>0; i--) {
			for(int j=n+1; j>i; j--) {
				System.out.print(" * ");
			}
			for(int k=0; k<(2*i-2); k++) {
				System.out.print("   ");
			}
			for(int j=n+1; j>i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
