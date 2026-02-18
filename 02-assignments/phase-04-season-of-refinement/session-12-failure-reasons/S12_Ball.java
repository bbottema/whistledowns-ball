import java.util.ArrayList;
import java.util.List;

class S12_Ball {
    List<S12_EtiquetteRule> rules;

    S12_Ball(List<S12_EtiquetteRule> rules) {
        this.rules = rules;
    }

    boolean mayAttend(S12_Socialite s) {
        for (S12_EtiquetteRule rule : rules) {
            if (!rule.passes(s)) return false;
        }
        return true;
    }

    // TODO: Add failureReasons method
    // List<String> failureReasons(S12_Socialite s) {
    //     List<String> failures = new ArrayList<>();
    //     for (S12_EtiquetteRule rule : rules) {
    //         if (!rule.passes(s)) {
    //             failures.add(rule.name());
    //         }
    //     }
    //     return failures;
    // }

    // TODO: Upgrade printRegistry to show reasons
    // void printRegistry(List<S12_Socialite> guests) {
    //     for (S12_Socialite g : guests) {
    //         List<String> failures = failureReasons(g);
    //         if (failures.isEmpty()) {
    //             System.out.println(g.name + " -> INVITED");
    //         } else {
    //             System.out.println(g.name + " -> NOT INVITED (failed: " + failures + ")");
    //         }
    //     }
    // }
}
