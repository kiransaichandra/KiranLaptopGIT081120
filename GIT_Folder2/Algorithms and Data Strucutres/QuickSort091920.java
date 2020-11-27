import java.util.Arrays;

public class QuickSort091920{

public static void main(String[] args) {

    Integer arr1[]={2,9,4,22,3, 8, 1, 7,5,6};
    int high=arr1.length-1;
    int low=0;
    
    QuickSort(arr1,low,high);

    System.out.println("Final Array: "+ Arrays.toString(arr1));

}


public static void QuickSort(Integer arr1[], int low, int high){
    System.out.println("Quick Sort Started...");
    // if(low==high)
    // return;

    int pivot= low+((high-low)/2);
    int i=low, j=high;
while(i<j){
    while(arr1[i]<arr1[pivot]){
        i++;
    }

    while(arr1[pivot]<arr1[j]){
        j--;
    }
if(i<=j){
        arr1=swap(arr1,i,j);
i++;
j--;
}
}
    if(low<j){
        System.out.println("low<j");
    QuickSort(arr1,low,j);
    }
    if(i<high){
        System.out.println("i<high"+ i +" "+ high);
    QuickSort(arr1,i,high);
    }

    return;
}

public static Integer[] swap(Integer[] arr1, int i, int j){
    int temp=arr1[i];
    arr1[i]=arr1[j];
    arr1[j]=temp;
    System.out.println("New Array: "+ Arrays.toString(arr1) );
    return arr1;
    
}



}