public class NinthGrader extends Student {

    public NinthGrader(String firstName, String lastName) {
        super(firstName, lastName, 2024);
    }

    public NinthGrader() {
        super("Joe", "Smith", 2024);
    }

    public void doSomething() {
        System.out.println("I am preparing for a Harkness discussion!");
    }

    @Override
    public String toString() {
        return super.toString() + " (Ninth Grader)";
    }
}