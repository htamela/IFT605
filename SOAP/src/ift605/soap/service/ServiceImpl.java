package ift605.soap.service;

import javax.jws.WebService;

@WebService(endpointInterface = "ift605.soap.service.IService")
public class ServiceImpl implements IService {
    @Override
    public double doSum(double x, double y) {
        return x + y;
    }

    @Override
    public double doMultiply(double x, double y) {
        return x * y;
    }
}
