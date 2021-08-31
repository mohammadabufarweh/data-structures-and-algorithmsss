public class MergeSort {
    public void sort(int arr[]){
        int n = arr.length;
        if ((n>1)){
            int mid = n/2;
            int[] left =new int[mid];
            int[] right =new int[arr.length-mid];
            for ( int p=0 ; p < mid ; p++ ) {
                left[p] = arr[p];
            }
            for ( int p=0 ; p<arr.length-mid ; p++ ) {
                right [p]= arr[p+mid];
            }
            sort(left);
            sort(right);
            merge(left,right,arr);
        }
    }
    public static void merge(int[] left, int[] right, int[] arr){
        int i=0;
        int j=0;
        int k=0;
    while (i < left.length && j < right.length){
    if (left[i] <= right[j]){
        arr[k] = left[i];
        i++;
    }else{
        arr[k] = right[j];
        j++;
    }
    k++;

    }
        while (i<left.length){
       arr[k]=left[i];
        i++;
        k++;
        }
        while (j<right.length){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
}
