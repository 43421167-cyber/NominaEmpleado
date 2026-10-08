import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Nomina de Empleados");


        //Creando objeto de entrada
        Scanner entrada = new Scanner(System.in);
        //Pidiendo datos
        System.out.print ("Ingrese la clave : ");
        String clave = entrada.nextLine();

        System.out.print ("Ingrese el nombre completo : ");
        String nombre = entrada.nextLine();

        System.out.print ("Ingrese las horas trabajadas : ");
        int horasTrabajadas = entrada.nextInt();

        System.out.print ("Ingrese el pago por hora : ");
        double pagoPorHora = entrada.nextDouble();

        //Instancias del objeto Nómina
        Nomina nominaEmpleado = new Nomina(clave, nombre, horasTrabajadas, pagoPorHora);
    }
}
