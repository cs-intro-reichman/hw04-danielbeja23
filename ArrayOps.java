public class ArrayOps {
    public static void main(String[] args) {
        int[] array = new int[] { 0 };
        System.out.println(findMissingInt(array));

    }

    public static int findMissingInt(int[] array) {
        int sum = array.length; // sum of 0 to N.
        int sumOfArray = 0;// sum of the values of the array.
        for (int i = 0; i < array.length; i++) {
            sum = sum + i;
            sumOfArray = sumOfArray + array[i];
        }
        return (sum - sumOfArray);
    }

    public static int secondMaxValue(int[] array) {
        // Write your code here:
        return 0;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int[] array) {
        // Write your code here:
        return false;
    }

}
