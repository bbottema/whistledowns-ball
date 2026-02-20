// Solution: intentional crash demonstrates stack trace

void main() {

	// Declare three variables
	int age = 21;
	String family = "Bridgerton";
	boolean invited = true;

	// Print each variable
	System.out.println(age);
	System.out.println(family);
	System.out.println(invited);

	// Build narrative tension, then trigger a controlled exception
	System.out.println("The season begins...");
	System.out.println("A rule is evaluated...");
	throw new RuntimeException("Scandal detected in the ballroom!");

	// OPTIONAL: Try this to see a parsing error
	// Integer.parseInt("not-a-number");
}