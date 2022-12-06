public class InsertionSort {
    public int[] InsertionSort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int j = i;
            while (j > 0 && input[j] < input[j - 1]) {
                int temp = input[j];
                input[j] = input[j - 1];
                input[j - 1] = temp;
                j--;
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = new int[] { 5, 2, 4, 6, 1, 3 };
        InsertionSort insertionSort = new InsertionSort();
        int[] output = insertionSort.InsertionSort(input);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

}
