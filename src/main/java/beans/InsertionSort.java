package beans;

public class InsertionSort implements Sort {
    @Override
    public void sort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }
}
