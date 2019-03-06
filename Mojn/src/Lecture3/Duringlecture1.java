package Lecture3;

public class Duringlecture1 {
	public static boolean RunGame(int s, int j, int[] A, int n) {
		int h = 0;
		int len = 0;
		int ju = 0;
		
		for (int i=1; i<n; i++) {
			len += 1;
			h += A[i]-A[i-1];
			if (len>=s || h>=s) {
				ju += 1;
				h= 0;
				len = 0;
				
			}
		}
		if (ju<j) {
			return false;
		}
		
		return true;
	}
}
