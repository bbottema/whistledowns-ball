class S15_AgeRule implements S15_EtiquetteRule {
    public boolean passes(S15_Socialite s) {
        return s.age >= 18;
    }
    public String name() {
        return "AgeRule";
    }
}
