package teoria;

public class Conversiones {

	public static void main(String[] args) {

		///////////////////////////////////////////////////////////
		/////////////      STRING --> NUMERO         //////////////
		///////////////////////////////////////////////////////////
		
		// INT
		String txt1 = "524";
		int numInt = Integer.parseInt(txt1);
		System.out.println(numInt);
		
		// DOUBLE 
		String txt2 = "123.98";
		double numDouble = Double.parseDouble(txt2);
		System.out.println(numDouble);
		
		// FLOAT
		String txt3 = "0.003";
		float numFloat = Float.parseFloat(txt3);
		System.out.println(numFloat);
		
		///////////////////////////////////////////////////////////
		/////////////      NUMERO --> NUMERO         //////////////  --> SON LAS QUE MAS SE USAN
		///////////////////////////////////////////////////////////		
		
		//PASAR DE DOUBLE A INT 
		int numDoubleToInt = (int)numDouble;  // --> SE QUEDA CON LA PARTE ENTERA
		System.out.println(numDoubleToInt);  
		
		
		//PASAR DE FLOAR A INT
		int numFloatToInt = (int)numFloat;  // --> SE QUEDA CON LA PARTE ENTERA
		System.out.println(numFloatToInt);  
		
		
		///////////////////////////////////////////////////////////
		/////////////   CUALQUIER DATO --> STRING    //////////////
		///////////////////////////////////////////////////////////
		
		// PASAR DE INT A STRING
		String txtNum = numInt + "";
		System.out.println(txtNum);
		
		
		///////////////////////////////////////////////////////////
		/////////////           BOOLEANOS            //////////////
		///////////////////////////////////////////////////////////		
		
		// PASAR DE STRING A BOOLEANO
		String b="True"; // --> CUALQUIE TRUE ES TRUE, LO QUE NO SEA TRUE LO DETECTA COMO FALSE
		boolean boleano = Boolean.parseBoolean(b);
		System.out.println(boleano);
		
		
		
		
		
		
	}

}
