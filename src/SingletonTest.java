public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance(); // Even if we call getInstance() multiple times, it will always return the same instance.
        Singleton instance2 = Singleton.getInstance(); // create multiple instances of the Singleton class.

        // Check if both references point to the same object.
        if (instance1 == instance2) {
            System.out.println("Both variables refer to the same instance.");
        } else {
            System.out.println("The variables refer to different instances.");
        } // If both variables refer to the same instance, this proves that there is only one Singleton object.



        // Call the connect and disconnect methods to demonstrate that both instance1 and instance2 refer to the same Singleton object.
        instance1.connect(); // This print: "Connected to the database."
        instance2.disconnect(); // This print: "Disconnected from the database."
    }
}
