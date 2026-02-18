class S16_FamilyNameRule implements S16_EtiquetteRule {
    public boolean passes(S16_Socialite s) {
        return s.familyName != null && !s.familyName.isBlank();
    }
    public String name() {
        return "FamilyNameRule";
    }
}
