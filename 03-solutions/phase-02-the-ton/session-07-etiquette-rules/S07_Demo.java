import java.util.List;

public class S07_Demo {
    public static void main(String[] args) {

        List<S07_EtiquetteRule> rules = List.of(new S07_AgeRule(), new S07_FamilyNameRule());
        S07_Socialite simon = new S07_Socialite("Simon", 28, "Basset");

        for (S07_EtiquetteRule rule : rules) {
            System.out.println(rule.name() + " -> " + rule.passes(simon));
        }
    }
}
