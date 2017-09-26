import ift605.rmi.ISimpleMath;
import ift605.rmi.SimpleMath;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Main {

    public static void main(String[] args) {
        try {
            ISimpleMath math = new SimpleMath();
            Naming.rebind("rmi://localhost:5005/simple-math", math);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
