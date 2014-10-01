package sorting;

public class Quicksort 
{
	static int PARTITION (int [] A, int p, int r) {
		int x = A[r];
		int i = p - 1;
		int tmp;
		for(int j = p; j < r; j++) {
			if(A[j] <= x) {
				i = i + 1;
				tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
			}
		}
		tmp = A[i+1];
		A[i+1] = A[r];
		A[r] = tmp;
		return i+1;
	}
	
	// Quicksort which only sorts the elements from p to r
	static void QUICKSORT (int [] A, int p, int r) {
		if(p < r) {
			int q = PARTITION(A, p, r);
			QUICKSORT(A, p, q-1);
			QUICKSORT(A, q+1, r);
		}
	}
	
	// General Quicksort which sorts the entire given array
	static void QUICKSORT (int [] A) {
		int q = PARTITION(A, 0, A.length-1);
		QUICKSORT(A, 0, q-1);
		QUICKSORT(A, q+1, A.length-1);
	}
	
	public static void main (String [] args) {
		int [] A = {2,8,7,1,3,5,6,4};
		System.out.print("Unsorted List: ");
		for(int i=0; i < A.length; i++)
			System.out.print(A[i]+" ");
		QUICKSORT(A, 0, A.length-1);
		System.out.print("\nSorted List: ");
		for(int i=0; i < A.length; i++)
			System.out.print(A[i]+" ");
	}
}
