class S07_FamilyNameRule implements S07_EtiquetteRule {
    public boolean passes(S07_Socialite s) {
        return s.familyName != null && !s.familyName.isBlank();
    }
    public String name() {
        return "FamilyNameRule";
    }
}
