import java.util.Map;

class S13_ReputationRule implements S13_EtiquetteRule {

    private final Map<String, Integer> reputationByFamily;

    S13_ReputationRule(Map<String, Integer> reputationByFamily) {
        this.reputationByFamily = reputationByFamily;
    }

    public boolean passes(S13_Socialite s) {
        Integer score = reputationByFamily.get(s.familyName);
        if (score == null) return false;
        return score >= 7;
    }

    public String name() {
        return "ReputationRule";
    }
}
