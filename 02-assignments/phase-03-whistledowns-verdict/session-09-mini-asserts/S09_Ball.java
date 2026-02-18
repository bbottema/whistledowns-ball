import java.util.List;

class S09_Ball {
    List<S09_EtiquetteRule> rules;

    S09_Ball(List<S09_EtiquetteRule> rules) {
        this.rules = rules;
    }

    boolean mayAttend(S09_Socialite s) {
        for (S09_EtiquetteRule rule : rules) {
            if (!rule.passes(s)) return false;
        }
        return true;
    }
}
