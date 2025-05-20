package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		TrianguloRectangulo tr1 = new TrianguloRectangulo(2,3); //triangulo rectangulo con catetos entre 0 y 10 
		TrianguloRectangulo tr2 = new TrianguloRectangulo(); //triangulo rectangulo por defecto
		
		
		//Area y perimetro de tr1 
		tr1.area(); 
		tr1.perimetro(); 
		 
		
		
		//Area y perimetro de tr2 
		tr2.area();
		tr2.perimetro(); 
		
		
		
		

	}

}
