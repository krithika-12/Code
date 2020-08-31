package GeeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class KThSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int N,i,k;
        System.out.println("enter array size");
        N=sc.nextInt();
        int A[]=new int[N];
        System.out.println("enter array elements");
        for(i=0;i<N;i++) {
            A[i]=sc.nextInt();
        }
        Arrays.sort(A);
        System.out.println("enter k");
        k=sc.nextInt();
        System.out.println("kth smallest element is"+A[k-1]);
	}

}
