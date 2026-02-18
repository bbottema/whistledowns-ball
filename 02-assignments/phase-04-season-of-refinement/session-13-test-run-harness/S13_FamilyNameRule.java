class S13_FamilyNameRule implements S13_EtiquetteRule {
    public boolean passes(S13_Socialite s) {
        return s.familyName != null && !s.familyName.isBlank();
    }
    public String name() {
        return "FamilyNameRule";
    }
}
