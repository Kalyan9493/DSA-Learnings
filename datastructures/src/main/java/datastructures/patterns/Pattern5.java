

//if 
//n=3
//
//1 1 1
//3   3
//5 5 5
//
//n=5
//
//1 1 1 1 1
//3       3
//5       5
//7       7
//9 9 9 9 9
//
//n=7
//
//1 1 1 1 1 1 1
//3           3
//5           5
//7           7
//9           9
//1           1
//3 3 3 3 3 3 3






package datastructures.patterns;

public class Pattern5 {
	
	public static void printPattern(int n) {
		int counter = 1;
		for (int i = 0; i <n; i++) {
			if(counter > 9) {
				counter = 1;
			}
			for (int j = 0; j <n; j++) {
				if( i == 0 || i == n-1 || j==0 || j == n-1) {
					System.out.print(counter);
				}else {
					System.out.print(" ");
				}
			}
			counter = counter + 2;
			System.out.println();
		}
	}

	public static void main(String args[]) {
		printPattern(11);
	}

}
