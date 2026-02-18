import java.util.List;
import java.util.Map;

public class S11_Demo {
    public static void main(String[] args) {

        Map<String, Integer> reputations = Map.of(
            "Bridgerton", 9,
            "Featherington", 6,
            "Basset", 10,
            "Sharpe", 2
        );

        System.out.println(reputations.get("Basset"));   // 10
        System.out.println(reputations.get("Sharpe"));   // 2
        System.out.println(reputations.get("Unknown")); // null

        S11_Ball ball = new S11_Ball(List.of(
            new S11_AgeRule(),
            new S11_FamilyNameRule(),
            new S11_ReputationRule(reputations)
        ));

        S11_Socialite simon = new S11_Socialite("Simon", 28, "Basset");
        S11_Socialite theo = new S11_Socialite("Theo", 21, "Sharpe");

        List<S11_Socialite> guests = List.of(simon, theo);
        ball.printRegistry(guests);
    }
}
