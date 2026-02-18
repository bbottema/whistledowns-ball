class S18_FamilyNameRule implements S18_EtiquetteRule {
    public boolean passes(S18_Socialite s) {
        return s.familyName != null && !s.familyName.isBlank();
    }
    public String name() {
        return "FamilyNameRule";
    }
}
