import java.io.IOException;
import java.util.List;
import java.util.Map;

// Session 15 – CSV ledger
//
// Start here:
// 1) Read `README.md` in this folder.
// 2) Uncomment the try/catch below.
// 3) Run `main(...)`.

public class S15_Assignment {
    public static void main(String[] args) {

        // TODO 1: Load guests from CSV file
        // try {
        //     List<S15_Socialite> guests = S15_GuestLoader.loadFromCsv("season-ledger.csv");
        //     System.out.println("Loaded " + guests.size() + " guests from season-ledger.csv");
        //
        //     // Create reputation map
        //     Map<String, Integer> reputations = Map.of(
        //         "Bridgerton", 9,
        //         "Featherington", 6,
        //         "Basset", 10,
        //         "Sharpe", 2
        //     );
        //
        //     // Create Ball and print registry
        //     S15_Ball ball = new S15_Ball(List.of(
        //         new S15_AgeRule(),
        //         new S15_FamilyNameRule(),
        //         new S15_ReputationRule(reputations)
        //     ));
        //
        //     ball.printRegistry(guests);
        //
        // } catch (IOException e) {
        //     System.out.println("Error reading file: " + e.getMessage());
        // }
    }
}
