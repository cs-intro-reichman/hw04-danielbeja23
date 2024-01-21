public class ArrayOps {
    public static void main(String[] args) {
        int[] array2 = new int[] { 1, -2, 3, 4 };
        System.out.println(isSorted(array2));

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
        int maxValue = 0; // #feedback - indexOfMaxValue would be more clear in this case.
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) { // #feedback - you compare arrays values with array indexes, which can lead to bugs.
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
        // #feedback - this solution can have a problem if the max value appears more than once in the array.
        // A better approach here would be to first look for the max value, and then look for the second max value, which is not equal to the first max value (without using additional array).
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
        // #feedback - you also need to check the other way, that the smaller array's values are contained in the larger array.
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
        {
            boolean upSeq = false;
            boolean downSeq = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] != array[i + 1]) {
                    if (array[i] < array[i + 1]) {
                        upSeq = true;
                    } else {
                        downSeq = true;
                    }

                }
            }
            return (upSeq ^ downSeq);
        }

    }

}
