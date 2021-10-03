public class SelectionSort {
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] array = {3, 8, 9, 7, 2, 6, 4, 1};
        System.out.println("Elements before sorting:");
        ss.printArray(array);
        
        ss.selectionSort(array);
        System.out.println("Elements after sorting:");
        ss.printArray(array);
    }
}
