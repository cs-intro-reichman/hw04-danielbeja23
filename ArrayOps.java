public class ArrayOps {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(secondMaxValue(array));

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
        int maxValue = 0;
        int seconedMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > seconedMax && maxValue != array[i]) {
                seconedMax = array[i];
            }
        }

        return seconedMax;
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
