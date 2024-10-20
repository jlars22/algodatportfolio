public class Assignment3 {
    public static void main(String[] args) {
        System.out.println(additive("82842605"));
    }

    private static boolean additive(String s) {
        if (s.length() < 3) return false;

        int num1 = Character.getNumericValue(s.charAt(0));
        int num2 = Character.getNumericValue(s.charAt(1));
        int sum = Character.getNumericValue(s.charAt(2));

        if (num1 + num2 == sum) return true;

        return additive(s.substring(1));
    }
}