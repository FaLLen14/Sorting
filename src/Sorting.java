
import java.util.Arrays;

public class Sorting {
public static int[] insertionSort(int[] arr) {
for (int i=0; i < arr.length; i++) {

for (int j=i+1; j<arr.length; j++){
if(arr[i]>arr[j]){
    int temp=arr[i ];
    arr[i]=arr[j];
    arr[j]=temp;
}
}
}
return arr;
}

public static void main(String args[]) {
int arr[] = new int[] { 3, 6, 5, 1, 2, 4 };
arr = insertionSort(arr);
System.out.println(Arrays.toString(arr));
}
}