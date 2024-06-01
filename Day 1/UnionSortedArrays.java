public class UnionSortedArrays {

    public static void printUnion(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int m = arr1.length;
        int n = arr2.length;

        while (i < m && j < n) {
            // Skip duplicates in arr1
            while (i > 0 && i < m && arr1[i] == arr1[i - 1]) {
                i++;
            }
            // Skip duplicates in arr2
            while (j > 0 && j < n && arr2[j] == arr2[j - 1]) {
                j++;
            }

            if (i < m && j < n) {
                if (arr1[i] < arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    System.out.print(arr2[j] + " ");
                    j++;
                } else {
                    System.out.print(arr1[i] + " ");
                    i++;
                    j++;
                }
            }
        }

        // Print remaining elements of the larger array
        while (i < m) {
            // Skip duplicates in arr1
            while (i > 0 && i < m && arr1[i] == arr1[i - 1]) {
                i++;
            }
            if (i < m) {
                System.out.print(arr1[i] + " ");
                i++;
            }
        }

        while (j < n) {
            // Skip duplicates in arr2
            while (j > 0 && j < n && arr2[j] == arr2[j - 1]) {
                j++;
            }
            if (j < n) {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 3, 5, 6};

        System.out.print("Union of two arrays: ");
        printUnion(arr1, arr2);
    }
}
