class S08_AgeRule implements S08_EtiquetteRule {
    public boolean passes(S08_Socialite s) {
        return s.age >= 18;
    }
    public String name() {
        return "AgeRule";
    }
}
