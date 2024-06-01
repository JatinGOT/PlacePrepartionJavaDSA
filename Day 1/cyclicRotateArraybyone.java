public class cyclicRotateArraybyone {    static void printArray(int arr[]){
    for(int i = 0; i <arr.length;i++){
        System.out.print(arr[i]+" ");
        
    }
    System.out.println();
}
static void cyclic(int arr[], int n){
    int i = 0,j=n-1;
    while (i!=j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
    }
}
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 3;
        cyclic(arr,n);
        printArray(arr);
        
    }
}
