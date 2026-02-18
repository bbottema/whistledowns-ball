class S18_AgeRule implements S18_EtiquetteRule {
    public boolean passes(S18_Socialite s) {
        return s.age >= 18;
    }
    public String name() {
        return "AgeRule";
    }
}
