import java.util.ArrayList;
import java.util.List;

class S15_Ball {
    List<S15_EtiquetteRule> rules;

    S15_Ball(List<S15_EtiquetteRule> rules) {
        this.rules = rules;
    }

    // TODO: Change return type from boolean to S15_InvitationResult
    // S15_InvitationResult mayAttend(S15_Socialite s) {
    //     List<String> failures = new ArrayList<>();
    //     for (S15_EtiquetteRule rule : rules) {
    //         if (!rule.passes(s)) {
    //             failures.add(rule.name());
    //         }
    //     }
    //     boolean invited = failures.isEmpty();
    //     return new S15_InvitationResult(invited, failures);
    // }

    // TODO: Update printRegistry to use InvitationResult
    // void printRegistry(List<S15_Socialite> guests) {
    //     for (S15_Socialite g : guests) {
    //         S15_InvitationResult result = mayAttend(g);
    //         if (result.invited) {
    //             System.out.println(g.name + " -> INVITED");
    //         } else {
    //             System.out.println(g.name + " -> NOT INVITED (reasons: " + result.reasons + ")");
    //         }
    //     }
    // }
}
