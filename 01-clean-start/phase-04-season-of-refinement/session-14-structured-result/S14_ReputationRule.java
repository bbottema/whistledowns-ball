import java.util.Map;

class S14_ReputationRule implements S14_EtiquetteRule {
    private final Map<String, Integer> reputationByFamily;

    S14_ReputationRule(Map<String, Integer> reputationByFamily) {
        this.reputationByFamily = reputationByFamily;
    }

    public boolean passes(S14_Socialite s) {
        Integer score = reputationByFamily.get(s.familyName);
        if (score == null) return false;
        return score >= 7;
    }

    public String name() {
        return "ReputationRule";
    }
}
