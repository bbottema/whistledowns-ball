class S11_FamilyNameRule implements S11_EtiquetteRule {
    public boolean passes(S11_Socialite s) {
        return s.familyName != null && !s.familyName.isBlank();
    }
    public String name() {
        return "FamilyNameRule";
    }
}
