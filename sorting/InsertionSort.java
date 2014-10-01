package sorting;

public class InsertionSort 
{
	static void INSERTION_SORT (int [] A) {
		int value;
		int j;
		for(int i = 1; i < A.length; i++) {
			value = A[i];
			j = i - 1;
			while(A[j] > value) {
				A[j+1] = A[j];
				j = j - 1;
				if(j < 0)
					break;
			}
			A[j+1] = value;
		}
	}
	
	public static void main(String[] args) {
		int [] A = {2,8,7,1,3,5,6,4};
		System.out.print("Unsorted List: ");
		for(int i=0; i < A.length; i++)
			System.out.print(A[i]+" ");
		INSERTION_SORT(A);
		System.out.print("\nSorted List: ");
		for(int i=0; i < A.length; i++)
			System.out.print(A[i]+" ");
	}
}
