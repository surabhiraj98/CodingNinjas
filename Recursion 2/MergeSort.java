import java.util.Arrays;
public class solution {

	public static void mergeSort(int[] input){
		// Write your code here
		if(input.length==1){
        return;
      }
      
      int mid = input.length/2;
      int[] leftArr = Arrays.copyOfRange(input,0,mid);
      mergeSort(leftArr);
      int[] rightArr = Arrays.copyOfRange(input,mid,input.length);
      mergeSort(rightArr);
      
      merge(input,leftArr,rightArr);
      
		
	}
  
  	public static void merge(int[] input,int[] leftArr, int[] rightArr){
      int leftSize = leftArr.length;
      int rightSize = rightArr.length;
      int size = leftArr.length+ rightArr.length;
      int[] arr = new int[size];
      int countR = 0;
      int countL = 0;
      for(int i = 0; i<size; i++){
        if(countR== rightSize){
          arr[i] = leftArr[countL];
          countL++;
        }
        else if(countL==leftSize){
          arr[i] = rightArr[countR];
          countR++;
        }
        else{
          if(leftArr[countL]<rightArr[countR]){
            arr[i]=leftArr[countL];
            countL++;
          }
          else{
            arr[i]= rightArr[countR];
            countR++;
          }
        }
   		  
        
      }
      
      for(int i = 0; i<size; i++){
        input[i] = arr[i];
}
	}
}
