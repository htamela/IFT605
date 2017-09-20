import ift605.soap.service.IService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:9999/ws/hello?wsdl");

		QName qname = new QName("http://soap.ift605.service/", "ServiceImplService");

		Service service = Service.create(url, qname);

		IService hello = service.getPort(IService.class);

		//System.out.println(hello.getSayHelloAsString("Toto"));
	}
}
