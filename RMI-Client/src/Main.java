import ift605.rmi.ISimpleMath;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Main {

    private static ISimpleMath math;

    public static void main(String[] args) {
        try {
            math = (ISimpleMath) Naming.lookup("//localhost:5005/simple-math");

            System.out.println(math.doAdd(5, 9));
            System.out.println(math.doMultiply(12, 7));

        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
