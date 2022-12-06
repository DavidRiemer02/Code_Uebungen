public class HeapSort {
    public int[] HeapSort(int[] input) {
        int n = input.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(input, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = input[0];
            input[0] = input[i];
            input[i] = temp;
            heapify(input, i, 0);
        }
        return input;
    }

    public void heapify(int[] input, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && input[left] > input[largest]) {
            largest = left;
        }
        if (right < n && input[right] > input[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = input[i];
            input[i] = input[largest];
            input[largest] = temp;
            heapify(input, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] input = new int[] { 5, 2, 4, 6, 1, 3 };
        HeapSort heapSort = new HeapSort();
        int[] output = heapSort.HeapSort(input);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
