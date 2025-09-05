// UserExistsTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Arrays;

public class UserExistsTest {
    @Test
    public void testReturnsTrueForExistingUserByName() {
        class User { String name; int id; User(String name, int id) { this.name = name; this.id = id; } }
        User[] users = { new User("John Doe", 123) };
        boolean userExists(String name) {
            return Arrays.stream(users).anyMatch(user -> user.name.equals(name));
        }

        boolean result = userExists("John Doe");
        assertTrue(result);
    }

    @Test
    public void testReturnsFalseForNonExistentUser() {
        class User { String name; int id; User(String name, int id) { this.name = name; this.id = id; } }
        User[] users = { new User("John Doe", 123) };
        boolean userExists(String name) {
            return Arrays.stream(users).anyMatch(user -> user.name.equals(name));
        }

        boolean result = userExists("Jane Doe");
        assertFalse(result);
    }
}
