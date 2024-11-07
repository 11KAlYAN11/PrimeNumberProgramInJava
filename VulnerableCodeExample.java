import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VulnerableCodeExample {
    // This method demonstrates an example of a null pointer dereference.
    public void nullPointerDereference() {
        String str = null;
        if (str != null) {
            System.out.println(str.length());
        } else {
            System.out.println("String is null.");
        }
    }

    // This method demonstrates an example of hardcoded password.
    public void hardcodedPassword() {
        // Store the password securely (e.g., in a configuration file, environment variable, or a secure password manager)
        String password = getSecurePassword();
        if (password.equals("password123")) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed.");
        }
    }

    // This method demonstrates an example of SQL injection vulnerability.
    public void sqlInjection(Connection connection) {
        String userInput = "admin'; DROP TABLE users; --";
        String query = "SELECT * FROM users WHERE username = ?";
        // Use prepared statement to escape user input
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, userInput);
            ResultSet resultSet = statement.executeQuery();
            // Process the results
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // This method demonstrates an example of an array index out of bounds exception.
    public void arrayOutOfBounds(int index) {
        int[] arr = new int[5];
        if (0 <= index && index < arr.length) {
            arr[index] = 10;
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    // This method demonstrates an example of an infinite loop.
    public void infiniteLoop() {
        boolean keepRunning = true;
        while (keepRunning) {
            // Check a condition to stop the loop
            if (someCondition()) {
                keepRunning = false;
            }
            // Loop body
        }
    }

    // This method demonstrates an example of thread synchronization issues.
    public void synchronizationIssue() {
        List<Integer> list = new ArrayList<>();
        Object lock = new Object();
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                list.add(1);
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                list.add(2);
            }
        });
        thread1.start();
        thread2.start();
    }

    private String getSecurePassword() {
        // Implement logic to retrieve the password securely
        return "password123";
    }

    private boolean someCondition() {
        // Implement logic to check the condition for stopping the infinite loop
        return false;
    }

    public static void main(String[] args) {
        VulnerableCodeExample example = new VulnerableCodeExample();
        // Uncomment each method one at a time to test different vulnerabilities
        example.nullPointerDereference();
        example.hardcodedPassword();
        example.sqlInjection(getConnection());
        example.arrayOutOfBounds(10);
        example.infiniteLoop();
        example.synchronizationIssue();
    }

    private static Connection getConnection() {
        // Implement logic to get a database connection
        System.out.println("Returning Null");
        return null;
    }
}