import java.util.ArrayList;
import java.util.List;

class S14_Ball {
    List<S14_EtiquetteRule> rules;

    S14_Ball(List<S14_EtiquetteRule> rules) {
        this.rules = rules;
    }

    S14_InvitationResult mayAttend(S14_Socialite s) {
        List<String> failures = new ArrayList<>();
        for (S14_EtiquetteRule rule : rules) {
            if (!rule.passes(s)) {
                failures.add(rule.name());
            }
        }
        boolean invited = failures.isEmpty();
        return new S14_InvitationResult(invited, failures);
    }

    void printRegistry(List<S14_Socialite> guests) {
        for (S14_Socialite g : guests) {
            S14_InvitationResult result = mayAttend(g);
            if (result.invited) {
                System.out.println(g.name + " -> INVITED");
            } else {
                System.out.println(g.name + " -> NOT INVITED (reasons: " + result.reasons + ")");
            }
        }
    }
}
