import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S18_Demo {
    public static void main(String[] args) {

        // TODO: Create reputation map and ball
        // Map<String, Integer> reputations = Map.of(
        //     "Bridgerton", 9,
        //     "Featherington", 6,
        //     "Basset", 10,
        //     "Sharpe", 2
        // );
        //
        // S18_Ball ball = new S18_Ball(List.of(
        //     new S18_AgeRule(),
        //     new S18_FamilyNameRule(),
        //     new S18_ReputationRule(reputations)
        // ));

        // TODO: Create guest list
        // List<S18_Socialite> guests = List.of(
        //     new S18_Socialite("Daphne", 21, "Bridgerton"),
        //     new S18_Socialite("Penelope", 16, "Featherington"),
        //     new S18_Socialite("Simon", 28, "Basset"),
        //     new S18_Socialite("Theo", 21, "Sharpe")
        // );

        // TODO: Calculate statistics
        // int totalGuests = guests.size();
        // int invitedCount = 0;
        // int rejectedCount = 0;
        // Map<String, Integer> rejectionReasons = new HashMap<>();
        //
        // for (S18_Socialite guest : guests) {
        //     S18_InvitationResult result = ball.mayAttend(guest);
        //
        //     if (result.invited) {
        //         invitedCount++;
        //     } else {
        //         rejectedCount++;
        //         // Count each rejection reason
        //         for (String reason : result.reasons) {
        //             rejectionReasons.put(reason, rejectionReasons.getOrDefault(reason, 0) + 1);
        //         }
        //     }
        // }

        // TODO: Find most common rejection reason
        // String mostCommonReason = null;
        // int maxCount = 0;
        // for (Map.Entry<String, Integer> entry : rejectionReasons.entrySet()) {
        //     if (entry.getValue() > maxCount) {
        //         maxCount = entry.getValue();
        //         mostCommonReason = entry.getKey();
        //     }
        // }

        // TODO: Print statistics
        // System.out.println("=== Season Statistics ===");
        // System.out.println("Total Guests: " + totalGuests);
        // System.out.println("Invited: " + invitedCount);
        // System.out.println("Rejected: " + rejectedCount);
        // if (mostCommonReason != null) {
        //     System.out.println("Most Common Rejection: " + mostCommonReason + " (" + maxCount + " occurrences)");
        // }
        // System.out.println("==========================");
    }
}
