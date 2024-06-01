public class MoveAllNegative {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void neg(int arr[], int l, int r){
        while(l<=r){
            if(arr[l]<0 && arr[r]<0){
                l++;
            }else if(arr[l]>0 && arr[r]<0){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            else if (arr[l]>0 && arr[r]>0){
                r--;
            }
            else{
                l++;
                r--;

            }
            
        }
    }
    public static void main(String[] args) {
        int arr[]={4,0,-5};
        neg(arr, 0, arr.length-1);
        printArray(arr);

    }
}
