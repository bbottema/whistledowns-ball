import java.util.List;
import java.util.Map;

public class S14_Demo {
    public static void main(String[] args) {

        Map<String, Integer> reputations = Map.of(
            "Bridgerton", 9,
            "Featherington", 6,
            "Basset", 10,
            "Sharpe", 2
        );

        S14_Ball ball = new S14_Ball(List.of(
            new S14_AgeRule(),
            new S14_FamilyNameRule(),
            new S14_ReputationRule(reputations)
        ));

        S14_Socialite daphne = new S14_Socialite("Daphne", 21, "Bridgerton");
        S14_Socialite penelope = new S14_Socialite("Penelope", 16, "Featherington");
        S14_Socialite simon = new S14_Socialite("Simon", 28, "Basset");
        S14_Socialite theo = new S14_Socialite("Theo", 21, "Sharpe");

        List<S14_Socialite> guests = List.of(daphne, penelope, simon, theo);
        ball.printRegistry(guests);
    }
}
