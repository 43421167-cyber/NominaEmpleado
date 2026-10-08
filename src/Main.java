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

        // Mostrar el recibo
        System.out.println("\n================================");
        System.out.println("       RECIBO DE NOMINA        ");
        System.out.println("================================");
        System.out.println("Clave: " + nominaEmpleado.getClave());
        System.out.println("Empleado: " + nominaEmpleado.getNombre());
        System.out.println("Horas normales: " + nominaEmpleado.calcularHorasNormales());
        System.out.println("Horas extra: " + nominaEmpleado.calcularHorasExtras());
        System.out.println("Pago por hora: $" + nominaEmpleado.getPagoPorHora());
        System.out.println("Pago normal: $" + nominaEmpleado.calcularPagoNormal());
        System.out.println("Pago horas extra: $" + nominaEmpleado.calcularPagoExtra());
        System.out.println("--------------------------------");
        System.out.println("Pago total: $" + nominaEmpleado.calcularPagoTotal());
        System.out.println("================================");

        // Mensaje de advertencia si excede las 50 horas
        if (horasTrabajadas > 50) {
            System.out.println("\nADVERTENCIA: Capturó " + horasTrabajadas + " horas. Solamente se consideran 50 horas para el cálculo de la nómina.");
        }
    }
}
