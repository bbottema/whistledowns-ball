import java.util.List;

void main() {

    // One rule
    int age = 17;
    if (age >= 18) {
        System.out.println("Eligible");
    } else {
        System.out.println("Not eligible");
    }

    // Multiple test cases (array)
    int[] ages = { 16, 17, 18, 21 };
    for (int a : ages) {
        System.out.println(a + " -> " + (a >= 18));
    }

    // Multiple test cases (list)
    List<String> families = List.of("Bridgerton", "", "Featherington");
    for (String f : families) {
        boolean respectable = f != null && !f.isBlank();
        System.out.println("\"" + f + "\" -> " + respectable);
    }
}
