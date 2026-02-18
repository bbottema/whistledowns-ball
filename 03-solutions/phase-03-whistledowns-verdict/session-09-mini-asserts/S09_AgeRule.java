class S09_AgeRule implements S09_EtiquetteRule {
    public boolean passes(S09_Socialite s) {
        return s.age >= 18;
    }
    public String name() {
        return "AgeRule";
    }
}
