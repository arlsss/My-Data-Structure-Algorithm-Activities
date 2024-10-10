public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        for (; left <= right; ) {
            int mid = left + (right - left) / 2; //Calculate middle index

            if (array[mid] == target) {
                return mid; // Target found at index mid
            } else if (array[mid] < target) {
                left = mid + 1; //Search the right half
            } else {
                right = mid - 1; //Search the left half
            }
        }

        return -1; //Target not found
    }

    public static void main(String[] args) {
        int[] sortedNum = {10, 12, 14, 16, 18, 20};
        int target = 20;

        int index = binarySearch(sortedNum, target);

        if (index != -1) {
            System.out.println("Target " + target + " found at index " + index);
        } else {
            System.out.println("Target " + target + " not found in the array");
        }
    }
}