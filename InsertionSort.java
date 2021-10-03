public class InsertionSort {
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] array = {3, 7, 5, 4, 2, 6, 9, 1};
        System.out.println("Elements before sorting:");
        is.printArray(array);
        
        is.insertionSort(array);
        System.out.println("Elements after sorting:");
        is.printArray(array);
 
    }
}
