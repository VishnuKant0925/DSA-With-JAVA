public class SortZeroesOnes {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0};
        int n = arr.length;
        int NoOfZeroes = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                NoOfZeroes++;

            }
        }

        for (int i = 0; i < n; i++) {
            if (i < NoOfZeroes) {
                    arr[i] = 0;
            } else {
                    arr[i] = 1;
            }
        }
        System.out.println();
        for (int ele : arr) {
                System.out.print(ele + " ");
            }
        }
    }

