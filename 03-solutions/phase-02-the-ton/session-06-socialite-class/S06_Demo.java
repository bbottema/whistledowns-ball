public class S06_Demo {
    public static void main(String[] args) {

        S06_Socialite daphne = new S06_Socialite("Daphne", 21, "Bridgerton");
        S06_Socialite penelope = new S06_Socialite("Penelope", 16, "Featherington");
        S06_Socialite simon = new S06_Socialite("Simon", 28, "Basset");

        System.out.println(daphne.isOfAge());
        System.out.println(penelope.isOfAge());
        System.out.println(simon.hasRespectableFamily());
    }
}
