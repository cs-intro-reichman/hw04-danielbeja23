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
        String string = "HELLO   world";

        System.out.println(camelCase(string));

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

    public static boolean ifLower(char c) {
        if (97 <= c && c <= 122) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean ifUpper(char c) {
        if (65 <= c && c <= 90) {
            return true;
        } else {
            return false;
        }

    }

    public static char changeToLow(char c) {
        c = (char) (c + 32);
        return c;
    }

    public static char changeToUp(char c) {
        c = (char) (c - 32);
        return c;
    }

    public static String camelCase(String string) {
        String newString = "";
        boolean flag = false;
        for (int i = 0; i < string.length(); i++) {
            if (ifUpper(string.charAt(i))) {
                newString = newString + changeToLow(string.charAt(i));
            } else {
                if (string.charAt(i) == ' ') {
                    flag = true;
                } else {
                    if (flag == true) {
                        newString = newString + changeToUp(string.charAt(i));
                        flag = false;
                    } else {
                        newString = newString + string.charAt(i);
                    }
                }

            }

        }
        return newString;
    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
