class S11_AgeRule implements S11_EtiquetteRule {
    public boolean passes(S11_Socialite s) {
        return s.age >= 18;
    }
    public String name() {
        return "AgeRule";
    }
}
