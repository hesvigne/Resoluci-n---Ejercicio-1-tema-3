package ejercicio1;

public class ResolucionEjercicio1 {

	public static void main(String[] args) {
		 suma(20, 40, 60);

	        Car miCar = new Car();

	        miCar.sumarPuertas();
	        miCar.sumarPuertas();
	        System.out.println("El numero de puertas es: " + miCar.numeroDePuertas);

	    }

	    public static void suma(int a, int b, int c){
	        int resultado;
	        resultado = a + b + c;
	        System.out.println(resultado);
	    }
	}

	class Car {
	    public int numeroDePuertas = 4;

	    public void sumarPuertas(){

	        this.numeroDePuertas++;

	}

}
