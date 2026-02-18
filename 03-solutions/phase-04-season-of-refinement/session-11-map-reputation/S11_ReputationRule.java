import java.util.Map;

class S11_ReputationRule implements S11_EtiquetteRule {

    private final Map<String, Integer> reputationByFamily;

    S11_ReputationRule(Map<String, Integer> reputationByFamily) {
        this.reputationByFamily = reputationByFamily;
    }

    public boolean passes(S11_Socialite s) {
        Integer score = reputationByFamily.get(s.familyName);
        if (score == null) return false; // unknown family -> FAIL
        return score >= 7; // threshold for INVITED
    }

    public String name() {
        return "ReputationRule";
    }
}
