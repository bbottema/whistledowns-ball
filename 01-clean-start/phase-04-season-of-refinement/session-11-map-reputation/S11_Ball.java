import java.util.List;

class S11_Ball {
    List<S11_EtiquetteRule> rules;

    S11_Ball(List<S11_EtiquetteRule> rules) {
        this.rules = rules;
    }

    boolean mayAttend(S11_Socialite s) {
        for (S11_EtiquetteRule rule : rules) {
            if (!rule.passes(s)) return false;
        }
        return true;
    }

    void printRegistry(List<S11_Socialite> guests) {
        for (S11_Socialite g : guests) {
            System.out.println(g.name + " -> " + (mayAttend(g) ? "INVITED" : "NOT INVITED"));
        }
    }
}
