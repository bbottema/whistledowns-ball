import java.util.List;

public class S08_Demo {
    public static void main(String[] args) {

        List<S08_EtiquetteRule> rules = List.of(new S08_AgeRule(), new S08_FamilyNameRule());
        S08_Ball ball = new S08_Ball(rules);

        S08_Socialite daphne = new S08_Socialite("Daphne", 21, "Bridgerton");
        S08_Socialite penelope = new S08_Socialite("Penelope", 16, "Featherington");
        S08_Socialite simon = new S08_Socialite("Simon", 28, "Basset");

        List<S08_Socialite> guests = List.of(daphne, penelope, simon);
        ball.printRegistry(guests);
    }
}
