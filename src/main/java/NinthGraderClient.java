public class NinthGraderClient {
    public static void main(String[] args) {
        NinthGrader n1 = new NinthGrader();
        System.out.println(n1.toString());
        n1.doSomething();
        n1.setLastName("Bloggs");
        System.out.println(n1.toString());
    }

}