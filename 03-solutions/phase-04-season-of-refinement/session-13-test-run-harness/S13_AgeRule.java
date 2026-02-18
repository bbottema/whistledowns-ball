class S13_AgeRule implements S13_EtiquetteRule {
    public boolean passes(S13_Socialite s) {
        return s.age >= 18;
    }
    public String name() {
        return "AgeRule";
    }
}
