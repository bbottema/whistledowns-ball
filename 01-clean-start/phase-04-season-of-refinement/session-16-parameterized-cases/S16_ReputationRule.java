import java.util.Map;

class S16_ReputationRule implements S16_EtiquetteRule {
    private final Map<String, Integer> reputationByFamily;

    S16_ReputationRule(Map<String, Integer> reputationByFamily) {
        this.reputationByFamily = reputationByFamily;
    }

    public boolean passes(S16_Socialite s) {
        Integer score = reputationByFamily.get(s.familyName);
        if (score == null) return false;
        return score >= 7;
    }

    public String name() {
        return "ReputationRule";
    }
}
