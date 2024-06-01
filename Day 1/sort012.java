public class sort012 {
    static void printArray(int arr[]){
        for(int i = 0; i <arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
    }
    static void sort(int arr[]) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 1, 2, 1, 0, 1 };
        sort(arr);
        printArray(arr);
    }
}
