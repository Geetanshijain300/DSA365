package Array;

public class All0And1using2pointer {
    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public int[] sortZeroesAndOnes(int[] arr) {
        int l = 0, r = arr.length - 1;

        while (l < r) {
            while (l < r && arr[l] == 0)
                l++;
            while (l < r && arr[r] == 1)
                r--;

            if (l < r) {
                swap(arr, l, r);
                l++;
                r--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        All0And1using2pointer obj = new All0And1using2pointer();
        int arr[] = { 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0 };

        int sortedArr[] = obj.sortZeroesAndOnes(arr);

        for (int e : sortedArr) {
            System.out.print(e + " ");
        }
    }
}
