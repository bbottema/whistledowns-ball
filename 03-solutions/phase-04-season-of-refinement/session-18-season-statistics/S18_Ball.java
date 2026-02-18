import java.util.ArrayList;
import java.util.List;

class S18_Ball {
    List<S18_EtiquetteRule> rules;

    S18_Ball(List<S18_EtiquetteRule> rules) {
        this.rules = rules;
    }

    S18_InvitationResult mayAttend(S18_Socialite s) {
        List<String> failures = new ArrayList<>();
        for (S18_EtiquetteRule rule : rules) {
            if (!rule.passes(s)) {
                failures.add(rule.name());
            }
        }
        boolean invited = failures.isEmpty();
        return new S18_InvitationResult(invited, failures);
    }

    void printRegistry(List<S18_Socialite> guests) {
        for (S18_Socialite g : guests) {
            S18_InvitationResult result = mayAttend(g);
            if (result.invited) {
                System.out.println(g.name + " -> INVITED");
            } else {
                System.out.println(g.name + " -> NOT INVITED (reasons: " + result.reasons + ")");
            }
        }
    }
}
