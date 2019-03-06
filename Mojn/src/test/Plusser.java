package test;

public class Plusser {
	  public static int add(int x, int y) {
		    return x+y*x*x;
		  }
		  public static int loop1(int n) {
		    int x = 0;
		    for(int i = 0; i < n; i++) {
		        for(int j = 0; j < n; j++) x++;
		    }
		    return x;
		  }
		  public static int loop2(int n) {
		      int x = 0;
		      for(int i = 0; i <= n; i++) x++;
		      for(int j = 0; j <= n; j++) x++;
		      return x;
		  }
		  public static int loop3(int n) {
		      int x = 0;
		      for(int i = 0; i < n; i++) {
		          if (i == n-1) for(int j = 0; j < n; j++) x++;
		      }
		      return x;
		  }
		  public static int loop4(int n) {
		      int x = 0;
		      for(int i = 0; i < n; i++) {
		          for(int j = i; j < n; j++) x++;
		      }
		      return x;
		  }
		  public static int f(int n) {
		      int[] A = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		      int k = 0;
		      for(int i=0; i<n; i++){
		        k = k + A[i];
		      }
		      return k;

		  }
		  public static void main(String[] args) {
		  System.out.format("a: %d, b: %d, c: %d, d: %d, e: %d, f: %d", loop1(1000), loop2(1000), loop3(1000), loop4(1000), f(10), add(5,6));
		}
}
