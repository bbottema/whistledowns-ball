import java.util.ArrayList;
import java.util.List;

class S16_Ball {
    List<S16_EtiquetteRule> rules;

    S16_Ball(List<S16_EtiquetteRule> rules) {
        this.rules = rules;
    }

    S16_InvitationResult mayAttend(S16_Socialite s) {
        List<String> failures = new ArrayList<>();
        for (S16_EtiquetteRule rule : rules) {
            if (!rule.passes(s)) {
                failures.add(rule.name());
            }
        }
        boolean invited = failures.isEmpty();
        return new S16_InvitationResult(invited, failures);
    }

    void printRegistry(List<S16_Socialite> guests) {
        for (S16_Socialite g : guests) {
            S16_InvitationResult result = mayAttend(g);
            if (result.invited) {
                System.out.println(g.name + " -> INVITED");
            } else {
                System.out.println(g.name + " -> NOT INVITED (reasons: " + result.reasons + ")");
            }
        }
    }
}
