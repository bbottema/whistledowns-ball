class S16_AgeRule implements S16_EtiquetteRule {
    public boolean passes(S16_Socialite s) {
        return s.age >= 18;
    }
    public String name() {
        return "AgeRule";
    }
}
