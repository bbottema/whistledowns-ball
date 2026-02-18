import java.util.Map;

class S15_ReputationRule implements S15_EtiquetteRule {
    private final Map<String, Integer> reputationByFamily;

    S15_ReputationRule(Map<String, Integer> reputationByFamily) {
        this.reputationByFamily = reputationByFamily;
    }

    public boolean passes(S15_Socialite s) {
        Integer score = reputationByFamily.get(s.familyName);
        if (score == null) return false;
        return score >= 7;
    }

    public String name() {
        return "ReputationRule";
    }
}
