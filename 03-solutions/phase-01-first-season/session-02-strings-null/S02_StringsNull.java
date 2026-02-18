// Session 02 - Strings & Null Safety (JShell)
// Copy these snippets into the JShell Console (Tools -> JShell Console...)

// String equality
String expected = "OK";
String actual = "OK";
System.out.println(expected.equals(actual)); // true

// Common string operations
String msg = "Status: OK";
System.out.println(msg.contains("OK"));
System.out.println(msg.startsWith("Status"));
System.out.println(msg.replace("Status: ", ""));
System.out.println(msg.toLowerCase());
System.out.println(" Status: OK ".trim());

// Null safety
String familyName = null;
boolean respectable = familyName != null && !familyName.isBlank();
System.out.println(respectable); // false

// OPTIONAL: Fail-fast check (will throw exception)
// String familyName2 = null;
// if (familyName2 == null) {
//     throw new IllegalArgumentException("Family name is required.");
// }
