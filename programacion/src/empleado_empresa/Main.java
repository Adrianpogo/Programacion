package empleado_empresa;

public class Main {

	public static void main(String[] args) throws Exception {

		Empresa gigaTech = new Empresa("GigaTech");

		System.out.println(" ~~~~~~~~~~  GIGATECH  ~~~~~~~~~~ \n");

		// Creamos los empleados y la empresa
		System.out.println("Creando empleados...\n");
		System.out.println("__________________________________\n");
		Empleado em1 = new Empleado("Adrian", "Pousa", 23, 1350.5, "adri@gmail.com", "111111111");
		Empleado em2 = new Empleado("Dario", "Montero", 21, 1110.5, "dariomon@gmail.com", "222222222");
		Empleado em3 = new Empleado("Sergio", "Suarez", 19, 1100, "sesua@gmail.com", "333333333");
		Empleado em4 = new Empleado("David", "Garcia", 29, 1250, "david10@gmail.com", "444444444");
		Empleado em5 = new Empleado("Luis", "Acero", 25, 1200, "lacero@gmail.com", "555555555");
		Empleado em6 = new Empleado("Bianca", "Ionela", 23, 1250, "bi1290@gmail.com", "666666666");
		Empleado em7 = new Empleado("Celia", "Rico", 19, 1320, "celiarico2@gmail.com", "777777777");

		// Mostramos la lista de los empleados en la empresa
		gigaTech.mostrarListaEmpleados();
		System.out.println("__________________________________\n");

		// Añadimos a la empresa los empleados creados
		System.out.println("Contratando empleados...\n");
		System.out.println("__________________________________\n");
		gigaTech.contratarEmpleado(em1);
		gigaTech.contratarEmpleado(em2);
		gigaTech.contratarEmpleado(em3);
		gigaTech.contratarEmpleado(em4);
		gigaTech.contratarEmpleado(em5);
		gigaTech.contratarEmpleado(em6);
		gigaTech.contratarEmpleado(em7);

		// Mostramos la lista de los empleados en la empresa
		gigaTech.mostrarListaEmpleados();
		System.out.println("__________________________________\n");

		// Mostramos la información de determinados empleados
		em1.mostrarInformacion();
		System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  - \n");
		em2.mostrarInformacion();
		System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  - \n");
		em3.mostrarInformacion();
		System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  - \n");
		em4.mostrarInformacion();
		System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  - \n");
		em5.mostrarInformacion();
		System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  - \n");
		em6.mostrarInformacion();
		System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  - \n");
		em7.mostrarInformacion();
		System.out.println("\n__________________________________\n");

		// Eliminamos a 2 empleados
		gigaTech.despedirEmpleado(em2);
		gigaTech.despedirEmpleado(em3);

		// Mostramos la lista de los empleados en la empresa
		gigaTech.mostrarListaEmpleados();
		System.out.println("__________________________________\n");

		// Aumentamos el salario a determinados empleados
		em1.aumentarSalario(50);
		em2.aumentarSalario(10);
		em3.aumentarSalario(50);
		em4.aumentarSalario(20);

		// Mostramos la información de determinados empleados
		em1.mostrarInformacion();
		System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  - \n");
		em2.mostrarInformacion();
		System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  - \n");
		em3.mostrarInformacion();
		System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  - \n");
		em4.mostrarInformacion();
		System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  - \n");
		em5.mostrarInformacion();
		System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  - \n");
		em6.mostrarInformacion();
		System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  - \n");
		em7.mostrarInformacion();
		System.out.println("__________________________________\n");

	}

}
