package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		TrianguloRectangulo tr1 = new TrianguloRectangulo(2,3); //triangulo rectangulo con catetos entre 0 y 10 
		TrianguloRectangulo tr2 = new TrianguloRectangulo(); //triangulo rectangulo por defecto
		
		
		//Area y perimetro de tr1 
		double areatr1 = tr1.area(); 
		double perimetrotr1 = tr1.perimetro(); 
		 
		
		
		//Area y perimetro de tr2 
		double areatr2= tr2.area();
     	double perimetrotr2 = tr2.perimetro(); 
		
		
		
		

	}

}
