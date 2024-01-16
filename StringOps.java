import javax.swing.text.StyledEditorKit.ForegroundAction;

public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String string = "One two tHRee world";

        System.out.println(capVowelsLowRest(string));

    }

    public static String capVowelsLowRest(String string) { // 32 65 - 90 upper 97 -122 lower
        String converted = "";
        for (int i = 0; i < string.length(); i++) {
            if (65 <= string.charAt(i) && string.charAt(i) <= 90) { // if upper
                if (checkIfCharIsVowel(string.charAt(i))) {// if vowel
                    converted = converted + string.charAt(i);
                } else {
                    converted = converted + ((char) (string.charAt(i) + 32));
                }
            } else if (97 <= string.charAt(i) && string.charAt(i) <= 122) {
                if (checkIfCharIsVowel(string.charAt(i))) {// if vowel
                    converted = converted + ((char) (string.charAt(i) - 32));
                } else {// if not vowel
                    converted = converted + string.charAt(i);
                }
            } else {
                converted = converted + string.charAt(i); // if not a letter
            }

        }
        return converted;
    }

    public static boolean checkIfCharIsVowel(char c) {
        char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < vowels.length; i++) {
            if (c == vowels[i] || vowels[i] - 32 == c) {
                return true;
            }
        }
        return false;
    }

    public static String camelCase(String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
