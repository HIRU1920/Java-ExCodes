public class changing
{
    public static void main(String[] args) {
        String str1 = "HiR MadHaV JeeT";
        StringBuffer newStr = new StringBuffer(str1);
        for (int i = 0; i < str1.length(); i++) {
            char currentChar = str1.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                newStr.setCharAt(i, Character.toUpperCase(currentChar));
            } else if (Character.isUpperCase(currentChar)) {
                newStr.setCharAt(i, Character.toLowerCase(currentChar));
            }
        }
        System.out.println("Converted str: " + newStr);
    }
}
