package ex1;

public class Main {

	public static void main(String[] args) {
		
		Carro car1 = new Carro();
		Carro car2 = new Carro();
		
		car1.marca = "Toyota";
		car1.modelo = "Corolla";
		car1.ano = 2020;
		car1.preco = 100000.0;
		
		car2.marca = "Mitsubishi";
		car2.modelo = "ASX";
		car2.ano = 2021;
		car2.preco = 95000.0;
		
		car1.exibirInfo();
		car2.exibirInfo();

	}

}
