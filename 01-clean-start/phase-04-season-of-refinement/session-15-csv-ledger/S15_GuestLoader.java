import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

class S15_GuestLoader {

    // TODO: Implement loadFromCsv method
    // static List<S15_Socialite> loadFromCsv(String filename) throws IOException {
    //     List<S15_Socialite> guests = new ArrayList<>();
    //     List<String> lines = Files.readAllLines(Path.of(filename));
    //
    //     // Skip header row (line 0)
    //     for (int i = 1; i < lines.size(); i++) {
    //         String line = lines.get(i);
    //         String[] parts = line.split(",");
    //
    //         // Handle malformed rows
    //         if (parts.length != 3) {
    //             System.out.println("Skipping malformed row: " + line);
    //             continue;
    //         }
    //
    //         try {
    //             String name = parts[0];
    //             int age = Integer.parseInt(parts[1]);
    //             String familyName = parts[2];
    //             guests.add(new S15_Socialite(name, age, familyName));
    //         } catch (NumberFormatException e) {
    //             System.out.println("Skipping row with invalid age: " + line);
    //         }
    //     }
    //
    //     return guests;
    // }
}
