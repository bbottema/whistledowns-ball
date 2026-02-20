public class S05_Assignment {

    static boolean isEligible(int age, String familyName) {
        if (age < 18) return false;
        if (familyName == null || familyName.isBlank()) return false;
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isEligible(21, "Bridgerton"));    // true
        System.out.println(isEligible(16, "Featherington")); // false
        System.out.println(isEligible(21, ""));              // false
        System.out.println(isEligible(21, null));            // false
    }
}
