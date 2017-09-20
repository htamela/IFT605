package ift605.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IService {
	@WebMethod
	double doSum(double x, double y);

	@WebMethod
	double doMultiply(double x, double y);
}
