class S09_FamilyNameRule implements S09_EtiquetteRule {
    public boolean passes(S09_Socialite s) {
        return s.familyName != null && !s.familyName.isBlank();
    }
    public String name() {
        return "FamilyNameRule";
    }
}
