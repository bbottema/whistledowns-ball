import java.util.List;

public class S09_Demo {
    public static void main(String[] args) {

        S09_Ball ball = new S09_Ball(List.of(new S09_AgeRule(), new S09_FamilyNameRule()));

        S09_Socialite simon = new S09_Socialite("Simon", 28, "Basset");
        S09_Socialite penelope = new S09_Socialite("Penelope", 16, "Featherington");

        S09_MiniAsserts.assertTrue(ball.mayAttend(simon), "Simon should be invited");
        S09_MiniAsserts.assertTrue(!ball.mayAttend(penelope), "Penelope should not be invited");

        System.out.println("All checks passed");
    }
}
