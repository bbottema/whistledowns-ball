import java.util.List;
import java.util.Map;

// Session 16 – Parameterized cases
//
// Start here:
// 1) Read `README.md` in this folder.
// 2) Uncomment the TODO blocks below in order.
// 3) Run `main(...)`.

public class S16_Assignment {
    public static void main(String[] args) {

        // TODO 1: Define test cases with expected outcomes
        // List<S16_TestCase> testCases = List.of(
        //     new S16_TestCase("Daphne", 21, "Bridgerton", true),
        //     new S16_TestCase("Penelope", 16, "Featherington", false),
        //     new S16_TestCase("Simon", 28, "Basset", true),
        //     new S16_TestCase("Theo", 21, "Sharpe", false)
        // );

        // TODO 2: Create reputation map
        // Map<String, Integer> reputations = Map.of(
        //     "Bridgerton", 9,
        //     "Featherington", 6,
        //     "Basset", 10,
        //     "Sharpe", 2
        // );

        // TODO 3: Create Ball
        // S16_Ball ball = new S16_Ball(List.of(
        //     new S16_AgeRule(),
        //     new S16_FamilyNameRule(),
        //     new S16_ReputationRule(reputations)
        // ));

        // TODO 4: Loop over test cases and compare actual vs expected
        // int passedCount = 0;
        // int failedCount = 0;
        //
        // for (S16_TestCase testCase : testCases) {
        //     S16_Socialite guest = new S16_Socialite(testCase.name, testCase.age, testCase.familyName);
        //     S16_InvitationResult result = ball.mayAttend(guest);
        //
        //     boolean passed = (result.invited == testCase.expectedInvited);
        //     String status = passed ? "PASS" : "FAIL";
        //
        //     if (passed) {
        //         passedCount++;
        //     } else {
        //         failedCount++;
        //     }
        //
        //     System.out.println("Test Case: " + testCase.name + " (" + testCase.age + ", " +
        //                      testCase.familyName + ") -> " + status);
        // }
        //
        // System.out.println("All " + passedCount + " test cases passed!");
        // if (failedCount > 0) {
        //     System.out.println("WARNING: " + failedCount + " test cases failed!");
        // }
    }
}
