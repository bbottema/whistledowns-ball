import java.util.List;

class S08_Ball {
    List<S08_EtiquetteRule> rules;

    S08_Ball(List<S08_EtiquetteRule> rules) {
        this.rules = rules;
    }

    boolean mayAttend(S08_Socialite s) {
        for (S08_EtiquetteRule rule : rules) {
            if (!rule.passes(s)) return false;
        }
        return true;
    }

    void printRegistry(List<S08_Socialite> guests) {
        for (S08_Socialite g : guests) {
            System.out.println(g.name + " -> " + (mayAttend(g) ? "INVITED" : "NOT INVITED"));
        }
    }
}
