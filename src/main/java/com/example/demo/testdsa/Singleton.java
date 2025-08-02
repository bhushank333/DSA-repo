package com.example.demo.testdsa;

public class Singleton {
    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
    }

    // Public method to provide the global point of access to the instance
    public static Singleton getInstance() {
        // Lazy initialization: create the instance only if it's not already created
        if (instance == null) {
            synchronized (Singleton.class) {  // Locking only when instance is null
                if (instance == null) {      // Double-checked locking
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    // Other methods (if any) can be added here

    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }

    public static void main(String[] args) {
        // Getting the Singleton instance
        Singleton singleton = Singleton.getInstance();

        // Using the instance
        singleton.showMessage();
    }
}
