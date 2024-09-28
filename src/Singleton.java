public class Singleton {
    // Create a private static variable to hold the single instance of the class.

    private static volatile Singleton instance; //volatile is used to ensure that multiple threads handle the instance variable correctly. Without volatile, it’s possible for a thread to see a partially initialized object, leading to unexpected behavior.

    private Singleton() {
        // Constructor is private to prevent creating multiple instances.
    }

    // Created a public static method that returns a single instance of the class.

    // Double-checked locking is used to maintain thread-safety and minimize synchronization overhead.
    public static Singleton getInstance() {
        if (instance == null) { // First tested without blocking, for better performance.
            synchronized (Singleton.class) { // Synchronize only when the instance is null.
                if (instance == null) { // Checked again with lock to make sure only one instance was created.
                    instance = new Singleton(); // Create the single instance of the class.
                }
            }
        }
        return instance; // Return the single instance of the class.
    }


    public void connect() {  // A method to simulate connecting to a database.
        System.out.println("Connected to the database.");
    }



    public void disconnect() {  // A method to simulate disconnecting from the database.
        System.out.println("Disconnected from the database.");
    }
}
