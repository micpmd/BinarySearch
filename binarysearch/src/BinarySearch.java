public class BinarySearch {
	public static<T extends Comparable<T>> int binarySrch(T [ ] A, T target){
		int low = 0;
		int high = A.length - 1;
		while(high >= low) {
			int middle = (low + high) / 2;
			
			if(A[middle].compareTo(target)==0) 
				return middle;
			if(A[middle].compareTo(target)<0) 
				low = middle + 1;
			if(A[middle].compareTo(target)>0) 
				high = middle - 1;
		}
		return -1;
	}
}