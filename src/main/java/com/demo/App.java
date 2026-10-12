package com.demo;

public class App {

    public String getMessage() {
        return "Hello from GitHub and Jenkins!";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getMessage());
        System.out.println("Addition: " + app.add(10, 20));
    }
}
