import java.util.List;

class S13_Ball {
    List<S13_EtiquetteRule> rules;

    S13_Ball(List<S13_EtiquetteRule> rules) {
        this.rules = rules;
    }

    boolean mayAttend(S13_Socialite s) {
        for (S13_EtiquetteRule rule : rules) {
            if (!rule.passes(s)) return false;
        }
        return true;
    }
}
