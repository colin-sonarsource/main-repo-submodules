import javax.crypto.spec.PBEParameterSpec;

public class HelloWorldMain {
    public static void main(String[] args) {
        System.out.println("Hello, World!!! from Main Repo");
    }

    public void hash() {
        byte[] salt = "salty".getBytes();
        PBEParameterSpec cipherSpec = new PBEParameterSpec(salt, 10000); // Noncompliant
    }
}
