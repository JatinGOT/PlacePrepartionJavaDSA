/**
 * MinMax
 */
class MinMax {
    static void minmax (int arr[]){
        if(arr.length == 0){
            return;
        }
        int min = arr[0];
        int max = arr[0];
         for (int i = 1 ; i <arr.length; i++){
             if (arr[i]>max ){
                 max = arr[i];
             }
             else if(arr[i]<min){
                 min = arr[i];
             }
         }
         System.out.println("maximum "+max);
                   System.out.println("minimum "+min);

    }
   public static void main(String[] args) {
       // Write your code here
       System.out.println("Welcome to Code 360 Online Compiler!!");
       //  Min and max
   
       int arr[] = {-2,1,-4,5,3};
       minmax(arr);

   }
}