import java.util.ArrayList;
import java.util.List;

public class SampleApp {

    private List<Integer> data;

    public SampleApp() {
        data = new ArrayList<>();
    }

    public void addData(int value) {
        if (value < 0) {
            System.out.println("Negative values not allowed");
            System.out.println("Hello");
            return;
        }
        data.add(value);
    }

    public void process() {
        // Null pointer dereference if `data` is null
        if (data.size() == 0) {
            System.out.println("No data to process");
        } else {
            System.out.println("Processing data");
        }
    }

    public void memoryLeakExample() {
        List<int[]> memoryHog = new ArrayList<>();
        while (true) {  // Infinite loop creating a memory leak
            memoryHog.add(new int[1000]);
        }
    }

    public static void main(String[] args) {
        SampleApp app = new SampleApp();
        app.addData(-5);
        app.process();
        // Uncomment to test the memory leak
        // app.memoryLeakExample();
    }
}
