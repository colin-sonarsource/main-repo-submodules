public class HelloWorldMain {
    public static void main(String[] args) {
        System.out.println("Hello, World! from Main Repo");
    }

  public void method() {
      Object myObject = null;
      System.out.println(myObject.toString()); // Noncompliant: myObject is null
    }
}
