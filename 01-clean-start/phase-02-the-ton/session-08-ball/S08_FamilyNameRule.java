class S08_FamilyNameRule implements S08_EtiquetteRule {
    public boolean passes(S08_Socialite s) {
        return s.familyName != null && !s.familyName.isBlank();
    }
    public String name() {
        return "FamilyNameRule";
    }
}
