import java.util.List;
import java.util.Map;

public class S12_Demo {
    public static void main(String[] args) {

        Map<String, Integer> reputations = Map.of(
            "Bridgerton", 9,
            "Featherington", 6,
            "Basset", 10,
            "Sharpe", 2
        );

        S12_Ball ball = new S12_Ball(List.of(
            new S12_AgeRule(),
            new S12_FamilyNameRule(),
            new S12_ReputationRule(reputations)
        ));

        S12_Socialite daphne = new S12_Socialite("Daphne", 21, "Bridgerton");
        S12_Socialite penelope = new S12_Socialite("Penelope", 16, "Featherington");
        S12_Socialite simon = new S12_Socialite("Simon", 28, "Basset");
        S12_Socialite theo = new S12_Socialite("Theo", 21, "Sharpe");

        List<S12_Socialite> guests = List.of(daphne, penelope, simon, theo);
        ball.printRegistry(guests);
    }
}
