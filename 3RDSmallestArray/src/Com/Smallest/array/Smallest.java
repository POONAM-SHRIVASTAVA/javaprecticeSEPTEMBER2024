package Com.Smallest.array;

public class Smallest {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 3, 5, 2, -1};
        int[] arr2 = {0, 1, 2};
        int result = find3rdSmallest(arr1, arr2);
        if (result != -1) {
            System.out.println("The 3rd smallest element in arr1 not in arr2 is: " + result);
        } else {
            System.out.println("There aren't enough elements in arr1 that aren't in arr2.");
        }
    }

    static int find3rdSmallest(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (!isInArray(arr2, arr1[i])) {
                count++;
                if (count == 3) {
                    return arr1[i];
                }
            }
        }
        return -1;
    }

    public static boolean isInArray(int[] arr, int value) {
        // Removed the semicolon after the for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}
