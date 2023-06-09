

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		
		
		//TIPOS DE DATOS PRIMITIVOS
		int numero=50;
		System.out.println(numero);
		
		double concoma= 0.7;
		System.out.println(concoma);
		
		boolean sino= true;
		System.out.println(sino);
		
		//Se pueden instanciar ya que es orientado a objetos
		@SuppressWarnings("removal")//@son anotaciones
		Integer num= new Integer(20);
		System.out.println(num);
		
		
		//TIPOS DE DATOS OBJETOS
		String nombre = "Marcos"; //Necesitamos memoria
		//como es tan comun no hace falta hacer new
		String name = new String ("MarcosInstanciado");
		System.out.println(nombre);
		System.out.println(name);
		
		
		//CONVERSION DE TIPOS
		 //numero = cocoma no compila Mismatch
		concoma=numero; //conversion Implicita
		System.out.println(concoma);
		
		String enLetras = Integer.toString(numero); //Conversion Explicita
		String Dedoble = Double.toString(concoma);
		System.out.println(concoma);
		System.out.println(enLetras);
		
		System.out.println("El numero en letras es: "+ enLetras);
		System.out.printf("El numero en letras es: %s", enLetras);
		System.out.println();
		System.out.printf("El numero en letras es: %d", numero);
		System.out.println();
		
		enLetras ="22";
		numero = Integer.parseInt(enLetras); //Conversion explicita de string a int
		System.out.println(enLetras);
		
		
		//CAPTURA DE EXCEPCIONES
		try {
			enLetras ="22dos"; //salta excepcion
			numero = Integer.parseInt(enLetras);
		}catch(NumberFormatException ex){ //Este catch recoge los errores de conversion 
			//}catch(Exception ex) este catch recoge todos los errores{
			System.out.println("No se pudo hacer la conversion de "+ enLetras + "a int");
		}
		
		
		//Convertir un String a un numero decimal variable float
		String CambioDecimal = "50.45";
		double decimal= 0;
		
		decimal = Double.parseDouble(CambioDecimal);
		System.out.println(CambioDecimal);
		
		try {
			CambioDecimal ="50dos"; //salta excepcion
			decimal = Integer.parseInt(enLetras);
		}catch(NumberFormatException ex){ //Este catch recoge los errores de conversion 
			//}catch(Exception ex) este catch recoge todos los errores{
			System.out.println("No se pudo hacer la conversion de "+ CambioDecimal + "a int");
		}
		
		
	}

}
