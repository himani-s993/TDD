public class StringDemo {

    public String swapLastTwoChars(String str) {
        int strLength = str.length();

        if (strLength < 2) {
            return str;
        }

        char lastChar = str.charAt(strLength - 1);
        char secondLastChar = str.charAt(strLength - 2);
        String stringMinusLastTwoChar = str.substring(0, strLength - 2);
        return stringMinusLastTwoChar + lastChar + secondLastChar;
    }
}
