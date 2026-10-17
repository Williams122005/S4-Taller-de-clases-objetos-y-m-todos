Java

import java.util.Scanner;
public class PruebaEmpleado {
    public static void main (String[] args) {
        Scanner sacnner = new Scanner(System.in);

        System.out.println("SISTEMA DE GESTIÓN DE EMPLEADOS");

        System.out.println("\n Datos del Empleado 1");
        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingrese el apellido materno: ");
        String apellido1 = scanner.nextline();
        System.out.print("Ingrese el salario mensual: $");
        double salario1 = scanner.nextDouble();

        Empleado emp1 = new Empleado(nombre1, apellido 1, salario1);
        Empleado emp2 = new Empleado(nombre2, apellido2, salario2);

        System.out.println("\n");
        System.out.println("SALARIOS ANUALES INICIALES (12 MESES)");
        System.out.println("");
        System.out.println("Empleado 1: %s %s - Salario Anual: $%.2f\n")
            emp1.obtenerPrimerNombre(), emp1.obtenerApellidoPaterno(), (emp1.obtenerSalarioMensual() * 12));
        System.out.printf("Empleado 2: %s %s - Salario Anual: $%.2f\n", 
            emp2.obtenerPrimerNombre(), emp2.obtenerApellidoPaterno(), (emp2.obtenerSalarioMensual() * 12));

        emp1.establecerSalarioMensual(emp1.obtenerSalarioMensual() * 1.10);
        emp2.establecerSalarioMensual(emp2.obtenerSalarioMensual() * 1.10);

        System.out.println("\n========================================");
        System.out.println(" SALARIOS ANUALES DESPUÉS DEL AUMENTO (10%)");
        System.out.println("========================================");
        System.out.printf("Empleado 1: %s %s - Nuevo Salario Anual: $%.2f\n", 
            emp1.obtenerPrimerNombre(), emp1.obtenerApellidoPaterno(), (emp1.obtenerSalarioMensual() * 12));
        System.out.printf("Empleado 2: %s %s - Nuevo Salario Anual: $%.2f\n", 
            emp2.obtenerPrimerNombre(), emp2.obtenerApellidoPaterno(), (emp2.obtenerSalarioMensual() * 12));

        scanner.close();
    }
}