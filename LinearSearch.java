public class LinearSearch {

    public static int linearSearch(int[] array, int target) {
        for (int a = 0; a < array.length; a++) {
            if (array [a] == target) {
                return a; //Target found at index a
            }
        }
        return -1; //Target not found
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 2};
        int target = 5;

        int index = linearSearch(numbers, target);

        if (index != -1) {
            System.out.println("Target " + target + " found at index " + index);
        } else {
            System.out.println("Target " + target + " not found in the array");
        }
    }
}
