class S14_AgeRule implements S14_EtiquetteRule {
    public boolean passes(S14_Socialite s) {
        return s.age >= 18;
    }
    public String name() {
        return "AgeRule";
    }
}
