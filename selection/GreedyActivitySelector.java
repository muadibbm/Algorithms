package selection;

import java.util.ArrayList;
import java.util.List;

public class GreedyActivitySelector {

	static List <Integer> GREEDY_ACTIVITY_SELECTOR(int [] S, int [] F) {
		int n = S.length;
		List <Integer> A = new ArrayList <Integer>();
		A.add(0);
		int i = 0;
		for(int m = 1; m < n; m++) {
			if(S[m] >= F[i]) {// activity m and i do not overlap
				A.add(m);
				i = m;
			}	
		}
		return A;
	}
	
	public static void main(String[] args) {
		int [] S = {1,3,0,5,3,5,6,8,8,2,12};
		int [] F = {4,5,6,7,8,9,10,11,12,13,14};
		System.out.println("There are " + S.length + " activities (0 to " + (S.length-1) + ") that need to share a single resource");
		System.out.print("List of start-times: ");
		for(int i=0; i < S.length; i++)
			System.out.print(S[i]+" ");
		System.out.println();
		System.out.print("List of finish-times: ");
		for(int i=0; i < F.length; i++)
			System.out.print(F[i]+" ");
		System.out.println();
		List <Integer> A = GREEDY_ACTIVITY_SELECTOR(S, F);
		System.out.print("Maximum-size subset of mutually compatible activities: ");
		for(int i=0; i < A.size(); i++)
			System.out.print(A.get(i).toString()+" ");
	}

}