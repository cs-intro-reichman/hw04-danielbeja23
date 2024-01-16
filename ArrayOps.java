public class ArrayOps {
    public static void main(String[] args) {
        int[] array = new int[] { 3 };
        int[] array2 = new int[] { 1 };
        System.out.println(containsTheSameElements(array, array2));

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

    private static int returnPlaceOfmax(int[] array) {
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    private static int maxValOfArray(int[] array) {
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int secondMaxValue(int[] array) {
        int[] newArr = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (returnPlaceOfmax(array) != i) {
                newArr[i] = array[i];
            }
        }
        return maxValOfArray(newArr);
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        boolean flag = false; // if the arrays are not equal numbers = false.
        boolean result = true;// return the result
        for (int i = 0; i < Math.max(array1.length, array2.length); i++) {
            for (int j = 0; j < Math.min(array1.length, array2.length); j++) {
                if (array1.length >= array2.length) {
                    if (array1[i] == array2[j]) {
                        flag = true;
                    }
                } else {
                    if (array2[i] == array1[j]) {
                        flag = true;
                    }
                }
            }
            if (flag == false) {
                result = false;
            }
            flag = false;
        }
        return result;
    }

    public static boolean isSorted(int[] array) {
        // Write your code here:
        return false;
    }

}
