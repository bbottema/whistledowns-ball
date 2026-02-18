class S12_FamilyNameRule implements S12_EtiquetteRule {
    public boolean passes(S12_Socialite s) {
        return s.familyName != null && !s.familyName.isBlank();
    }
    public String name() {
        return "FamilyNameRule";
    }
}
