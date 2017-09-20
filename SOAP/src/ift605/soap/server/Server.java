package ift605.soap.server;

import ift605.soap.service.ServiceImpl;

import javax.xml.ws.Endpoint;

public class Server {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new ServiceImpl());
	}
}
