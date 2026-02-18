import java.util.Map;

class S12_ReputationRule implements S12_EtiquetteRule {

    private final Map<String, Integer> reputationByFamily;

    S12_ReputationRule(Map<String, Integer> reputationByFamily) {
        this.reputationByFamily = reputationByFamily;
    }

    public boolean passes(S12_Socialite s) {
        Integer score = reputationByFamily.get(s.familyName);
        if (score == null) return false;
        return score >= 7;
    }

    public String name() {
        return "ReputationRule";
    }
}
