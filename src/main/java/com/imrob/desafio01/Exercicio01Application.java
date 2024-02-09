package com.imrob.desafio01;

import com.imrob.desafio01.entities.Order;
import com.imrob.desafio01.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Exercicio01Application.class, args);
	}

	@Override
	public void run(String[] args) throws Exception {
		Integer code = 1309;
		double basic = 95.90;
		double discount = 0;

		Order order = new Order(code, basic, discount);

		System.out.printf("Pedido codigo %d\n", order.getCode());
		System.out.printf("Valor total: R$ %.2f\n", orderService.total(order));
	}
}
