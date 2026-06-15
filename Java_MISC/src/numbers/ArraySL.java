package numbers;

public class ArraySL {

	public static void main(String[] args) {
		
		int[] iArr = {8,67,5, 234,34,52,98,78};
		
		findSmallestLargest(iArr);
//		int smallest = iArr[0];
//		int largest = iArr[0];
//		
//		for(int i=0; i<iArr.length-1;i++){
//			if(iArr[i]<smallest){
//				smallest = iArr[i];
//			}
//			if(iArr[i]>largest){
//				largest = iArr[i];
//			}
//		}
//		System.out.println("Smallest #: "+ smallest+" ,largest #: "+largest);

	}
	
	public static void findSmallestLargest(int[] iArr){
		
		int smallest = iArr[0];
		int largest = iArr[0];
		
		for(int i=0; i<iArr.length-1;i++){
			if(iArr[i]<smallest){
				smallest = iArr[i];
			}
			if(iArr[i]>largest){
				largest = iArr[i];
			}
		}
		System.out.println("Smallest #: "+ smallest+"; largest #: "+largest);
		
	}

}
