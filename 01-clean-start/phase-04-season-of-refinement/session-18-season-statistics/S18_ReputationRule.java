import java.util.Map;

class S18_ReputationRule implements S18_EtiquetteRule {
    private final Map<String, Integer> reputationByFamily;

    S18_ReputationRule(Map<String, Integer> reputationByFamily) {
        this.reputationByFamily = reputationByFamily;
    }

    public boolean passes(S18_Socialite s) {
        Integer score = reputationByFamily.get(s.familyName);
        if (score == null) return false;
        return score >= 7;
    }

    public String name() {
        return "ReputationRule";
    }
}
