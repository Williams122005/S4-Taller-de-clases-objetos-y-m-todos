import java.util.Scanner;

public class PruebaFrecuenciasCardiacas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su primer nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Dia de nacimiento: ");
        int dia = scanner.nextInt();

        System.out.print("Mes de nacimiento: ");
        int mes = scanner.nextInt();

        System.out.print("Año de nacimiento: ");
        int anio = scanner.nextInt();

        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(
            nombre, apellido, dia, mes, anio);

        System.out.prinln("\nINFORMACION PERSONAS");
        System.out.println("Nombre: " + persona.obtenerPrimerNombre() 
                 + " " + perosna.obtenerApellido());
        System.out.printf("Edad: " + persona.calcularEdad() + "años");
        System.out.printf("Fecha de nacimiento: %02d/%02d/%04d%n",
                persona.obtenerDiaNacimiento(),
                persona.ontenerMesNacimiento(),
                persona.obtenerAnioNacimiento());
        
                          
        
        
        
    
    
