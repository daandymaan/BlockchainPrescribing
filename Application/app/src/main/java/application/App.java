/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package application;

public class App {
    public String getGreeting() {
        return "Starting Java app";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        RegisterUser register = new RegisterUser();
        register.enrollAdmin();
        register.enrollUser("Rachel");
    }
}
