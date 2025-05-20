package clases;

public class TrianguloRectangulo {

	double a;
	double b;
	double c;

	/**
	 * Constructor con parametros cateto 1 y cateto 2
	 * 
	 * @param a
	 * @param b
	 */
	public TrianguloRectangulo(double a, double b) {
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Un numero menor o igual que 0 no es valido");
		} else {
			this.a = a;
			this.b = b;
		}
	}

	/**
	 * Constructor por defecto con cateto 1 = 1 y cateto 2 = 1
	 * 
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
		this.c = hipotenusa();
	}

	/**
	 * Metodo para calcular el area del triangulo rectangulo
	 * 
	 * @return area del triangulo
	 */
	public double area() {
		return ((a * b) / 2.0);
	}

	
	/**
	 * Metodo para calcular la hipotenusa del triangulo rectangulo
	 * 
	 * @return hipotenusa del triangulo
	 */
	public double hipotenusa() {
		double raiz = ((a * a) + (b * b));
		double hipotenusa = Math.sqrt(raiz);
		return hipotenusa;
	}

	/**
	 * Metodo para calcular el perimetro del triangulo rectangulo
	 * 
	 * @return perimetro del triangulo
	 */
	public double perimetro() {
		return a + b + hipotenusa();
	}

	

/**
 * Getter para obtener el cateto a
 * 
 * @return cateto a
 */
	public double getA() {
		return a;
	}

	
	/**
	 * Getter para obtener el cateto b
	 * 
	 * @return cateto b
	 */
	public double getB() {
		return b;

	}

/**
 * toString para mostrar el mensaje de información de la clase triangulo rectangulo
 * 
 */
	public String toString() { 
		String mensaje = ""; 
		mensaje += "El cateto 1 (a) es: " + this.a; 
		mensaje += "El cateto 2 (b) es: " + this.b; 
		return mensaje; }
	
	
	
	
	
	
	
	
}
