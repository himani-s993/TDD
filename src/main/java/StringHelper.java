
public class StringHelper {

    /*
    Test Condition 1: When Code isn't implemented but only the requirement is known
    */
    public String swapLast2CharType1(String str) {
        return null;
    }

    /*
    Test Condition 2: When code is implemented but not considering all the edge cases.
    */
    public String swapLast2CharType2(String str) {
        char lastChar = str.charAt(str.length() - 1 );
        char secondLastChar = str.charAt(str.length() - 2 );
        String strMinusLastTwoChar = str.substring(0, str.length() - 2);

        return strMinusLastTwoChar + lastChar + secondLastChar;
    }

    /*
    Test Condition 3: When code is proper considering edge cases.
    */
    public String swapLast2CharType3(String str) {
        if (str.length() < 2){
            return str;
        }

        char lastChar = str.charAt(str.length() - 1 );
        char secondLastChar = str.charAt(str.length() - 2);
        String strMinusLastTwoChar = str.substring(0, str.length() - 2);

        return strMinusLastTwoChar + lastChar + secondLastChar;
    }
}
