class S06_Socialite {
    String name;
    int age;
    String familyName;

    S06_Socialite(String name, int age, String familyName) {
        this.name = name;
        this.age = age;
        this.familyName = familyName;
    }

    boolean isOfAge() {
        return age >= 18;
    }

    boolean hasRespectableFamily() {
        return familyName != null && !familyName.isBlank();
    }
}
