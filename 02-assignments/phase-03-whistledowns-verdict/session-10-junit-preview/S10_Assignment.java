// Session 10 – JUnit preview (read-only)
//
// Start here:
// 1) Read `README.md` in this folder.
// 2) Read the example below.
// 3) Your job is to recognise the shape (Arrange / Act / Assert), not to run it.
//
// JUnit is intentionally NOT set up in this warmup project.
// You’ll configure and run JUnit in your actual Java testing course.

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;
// import java.util.List;

// class S10_BallTest {
//
//     @Test
//     void dukeIsInvited() {
//         // Arrange
//         List<EtiquetteRule> rules = List.of(new AgeRule(), new FamilyNameRule());
//         Ball ball = new Ball(rules);
//         Socialite simon = new Socialite("Simon", 28, "Basset");
//
//         // Act & Assert
//         assertTrue(ball.mayAttend(simon));
//     }
//
//     @Test
//     void youngGuestIsNotInvited() {
//         // Arrange
//         List<EtiquetteRule> rules = List.of(new AgeRule(), new FamilyNameRule());
//         Ball ball = new Ball(rules);
//         Socialite penelope = new Socialite("Penelope", 16, "Featherington");
//
//         // Act & Assert
//         assertFalse(ball.mayAttend(penelope));
//     }
// }

// TODO: What to notice
// 1) `@Test` marks each test method
// 2) Method names describe the scenario
// 3) Each test creates its own data (independent tests)
// 4) `assertTrue` / `assertFalse` are built-in assertions
