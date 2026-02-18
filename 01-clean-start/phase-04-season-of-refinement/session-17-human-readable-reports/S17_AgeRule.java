class S17_AgeRule implements S17_EtiquetteRule {
    public boolean passes(S17_Socialite s) {
        return s.age >= 18;
    }
    public String name() {
        return "AgeRule";
    }
}
