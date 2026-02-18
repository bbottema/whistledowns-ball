import java.util.Map;

class S17_ReputationRule implements S17_EtiquetteRule {
    private final Map<String, Integer> reputationByFamily;

    S17_ReputationRule(Map<String, Integer> reputationByFamily) {
        this.reputationByFamily = reputationByFamily;
    }

    public boolean passes(S17_Socialite s) {
        Integer score = reputationByFamily.get(s.familyName);
        if (score == null) return false;
        return score >= 7;
    }

    public String name() {
        return "ReputationRule";
    }
}
