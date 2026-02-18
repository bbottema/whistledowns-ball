class S14_FamilyNameRule implements S14_EtiquetteRule {
    public boolean passes(S14_Socialite s) {
        return s.familyName != null && !s.familyName.isBlank();
    }
    public String name() {
        return "FamilyNameRule";
    }
}
