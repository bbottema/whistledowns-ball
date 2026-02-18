import java.util.ArrayList;
import java.util.List;

class S17_Ball {
    List<S17_EtiquetteRule> rules;

    S17_Ball(List<S17_EtiquetteRule> rules) {
        this.rules = rules;
    }

    S17_InvitationResult mayAttend(S17_Socialite s) {
        List<String> failures = new ArrayList<>();
        for (S17_EtiquetteRule rule : rules) {
            if (!rule.passes(s)) {
                failures.add(rule.name());
            }
        }
        boolean invited = failures.isEmpty();
        return new S17_InvitationResult(invited, failures);
    }

    void printRegistry(List<S17_Socialite> guests) {
        for (S17_Socialite g : guests) {
            S17_InvitationResult result = mayAttend(g);
            if (result.invited) {
                System.out.println(g.name + " -> INVITED");
            } else {
                System.out.println(g.name + " -> NOT INVITED (reasons: " + result.reasons + ")");
            }
        }
    }
}
