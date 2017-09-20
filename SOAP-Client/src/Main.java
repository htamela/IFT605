import ift605.soap.service.IService;
import ift605.soap.service.ServiceImplService;

public class Main {

    public static void main(String[] args) {
        ServiceImplService service = new ServiceImplService();

        System.out.println(service.getServiceImplPort().doSum(5, 15));
        System.out.println(service.getServiceImplPort().doMultiply(12, 2));
    }
}
