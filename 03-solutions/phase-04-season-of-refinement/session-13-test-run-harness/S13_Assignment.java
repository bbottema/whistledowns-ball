import java.util.List;
import java.util.Map;

public class S13_Assignment {
    public static void main(String[] args) {

        // Arrange - Create test data
        Map<String, Integer> reputations = Map.of(
            "Bridgerton", 9,
            "Featherington", 6,
            "Basset", 10,
            "Sharpe", 2
        );

        // Arrange - Create Ball with rules
        S13_Ball ball = new S13_Ball(List.of(
            new S13_AgeRule(),
            new S13_FamilyNameRule(),
            new S13_ReputationRule(reputations)
        ));

        // Arrange - Create test subjects
        S13_Socialite simon = new S13_Socialite("Simon", 28, "Basset");
        S13_Socialite theo = new S13_Socialite("Theo", 21, "Sharpe");

        // Assert - Check expected outcomes
        S13_MiniAsserts.assertTrue(ball.mayAttend(simon), "Simon should be invited");
        S13_MiniAsserts.assertTrue(!ball.mayAttend(theo), "Theo should fail on reputation");

        // Report
        System.out.println("Registry checks: PASS");
    }
}
