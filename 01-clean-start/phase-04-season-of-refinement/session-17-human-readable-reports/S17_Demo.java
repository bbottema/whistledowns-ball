import java.util.List;
import java.util.Map;

public class S17_Demo {
    public static void main(String[] args) {

        // TODO: Create reputation map and ball
        // Map<String, Integer> reputations = Map.of(
        //     "Bridgerton", 9,
        //     "Featherington", 6,
        //     "Basset", 10,
        //     "Sharpe", 2
        // );
        //
        // S17_Ball ball = new S17_Ball(List.of(
        //     new S17_AgeRule(),
        //     new S17_FamilyNameRule(),
        //     new S17_ReputationRule(reputations)
        // ));

        // TODO: Create guest list
        // List<S17_Socialite> guests = List.of(
        //     new S17_Socialite("Daphne", 21, "Bridgerton"),
        //     new S17_Socialite("Penelope", 16, "Featherington"),
        //     new S17_Socialite("Simon", 28, "Basset"),
        //     new S17_Socialite("Theo", 21, "Sharpe")
        // );

        // TODO: Print formatted report with header
        // System.out.println("========================================");
        // System.out.println("   Whistledown's Society Report");
        // System.out.println("========================================");
        // System.out.println(String.format("%-18s %-4s %-17s %s", "Name", "Age", "Family", "Status"));
        // System.out.println("--------------------------------------------------");

        // TODO: Loop through guests, count invited/rejected
        // int invitedCount = 0;
        // int rejectedCount = 0;
        //
        // for (S17_Socialite guest : guests) {
        //     S17_InvitationResult result = ball.mayAttend(guest);
        //     String status = result.invited ? "INVITED" : "NOT INVITED";
        //
        //     if (result.invited) {
        //         invitedCount++;
        //     } else {
        //         rejectedCount++;
        //     }
        //
        //     System.out.println(String.format("%-18s %-4d %-17s %s",
        //         guest.name, guest.age, guest.familyName, status));
        // }

        // TODO: Print summary footer
        // System.out.println("--------------------------------------------------");
        // System.out.println("Total Guests: " + guests.size());
        // System.out.println("Invited: " + invitedCount);
        // System.out.println("Rejected: " + rejectedCount);
        // System.out.println("========================================");
    }
}
