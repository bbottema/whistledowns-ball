class S15_FamilyNameRule implements S15_EtiquetteRule {
    public boolean passes(S15_Socialite s) {
        return s.familyName != null && !s.familyName.isBlank();
    }
    public String name() {
        return "FamilyNameRule";
    }
}
