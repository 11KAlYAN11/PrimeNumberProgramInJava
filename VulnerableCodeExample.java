import java.util.List;
import java.util.ArrayList;

public class VulnerableCodeExample {

    // This method demonstrates an example of a null pointer dereference.
    public void nullPointerDereference() {
        String str = null;
        System.out.println(str.length());  // Potential NullPointerException
    }

    // This method demonstrates an example of hardcoded password.
    public void hardcodedPassword() {
        String password = "password123";  // Vulnerability: Hardcoded password
        if (password.equals("password123")) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed.");echo "public class Main { public static void main(String[] args) { System.out.println(\"Initial Version\"); } }" > Main.java

        }
    }

    // This method demonstrates an example of SQL injection vulnerability.
    public void sqlInjection() {
        String userInput = "admin'; DROP TABLE users; --";  // User input directly in SQL
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";  // SQL Injection vulnerability
        System.out.println("Executing query: " + query);
    }

    // This method demonstrates an example of an array index out of bounds exception.
    public void arrayOutOfBounds() {
        int[] arr = new int[5];
        arr[10] = 10;  // ArrayIndexOutOfBoundsException
    }

    // This method demonstrates an example of an infinite loop.
    public void infiniteLoop() {
        while (true) {
            // This will run forever
        }
    }

    // This method demonstrates an example of thread synchronization issues.
    public void synchronizationIssue() {
        List<Integer> list = new ArrayList<>();
        Thread thread1 = new Thread(() -> list.add(1));
        Thread thread2 = new Thread(() -> list.add(2));

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        VulnerableCodeExample example = new VulnerableCodeExample();

        // Uncomment each method one at a time to test different vulnerabilities
        // example.nullPointerDereference();
        // example.hardcodedPassword();
        // example.sqlInjection();
        // example.arrayOutOfBounds();
        // example.infiniteLoop();
        // example.synchronizationIssue();
    }
}
