class S17_FamilyNameRule implements S17_EtiquetteRule {
    public boolean passes(S17_Socialite s) {
        return s.familyName != null && !s.familyName.isBlank();
    }
    public String name() {
        return "FamilyNameRule";
    }
}
