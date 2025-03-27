package frogger;

public class Main {
    public static void main(String[] args) {
        // Create a Road object
        Road road = new Road(new boolean[10]); // Example road with 10 positions

        // Create a FroggerIdentity object
        FroggerIdentity identity = new FroggerIdentity(
            "John", "Doe", "1234567890", "12345", "NY", "Male"
        );

        // Create a Records object
        Records records = new Records();

        // Create a Frogger object
        Frogger frogger = new Frogger(road, 0, identity);

        // Move the Frogger
        System.out.println("Move forward: " + frogger.move(true));
        System.out.println("Move backward: " + frogger.move(false));

        // Record the Frogger's identity
        System.out.println("Record identity: " + frogger.recordMyself(records));

        // Print all records
        System.out.println("All records: " + records.getRecords());
    }
}