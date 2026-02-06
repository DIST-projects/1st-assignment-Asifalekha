import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("16.170.250.199", 1099);
            Calculator stub = (Calculator) registry.lookup("CalcService");

            System.out.println("Addition: " + stub.add(10, 5));
            System.out.println("Subtraction: " + stub.subtract(10, 5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
