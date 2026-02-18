class S12_AgeRule implements S12_EtiquetteRule {
    public boolean passes(S12_Socialite s) {
        return s.age >= 18;
    }
    public String name() {
        return "AgeRule";
    }
}
