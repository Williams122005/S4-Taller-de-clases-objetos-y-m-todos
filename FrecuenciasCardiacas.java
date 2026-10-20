import java.time.LocalDate;

public class FrecuenciasCardiacas {

    private String primerNombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;

    public FrecuenciasCardiacas(String primerNombre, String apellido,
            int diaNacimiento, int mesNacimiento, int anioNacimiento) {
        this.primerNombre = primerNombre;
        this.apellido = apellido; 
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento; 
        this.anioNacimiento = anioNacimiento;
    }
    
    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int obtenerDiaNacimiento() {
        return diaNaciemiento;
    }

      public void establecerMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int obtenerMesNacimiento() {
        return mesNaciemiento;
    }

      public void establecerAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int obtenerAnioNacimiento() {
        return anioNaciemiento;
    }

    public int calcularEdad() { 
        LocalDate hoy = LocalDate.now();
        LocalDate nacimiento = LocalDate.of(
            anioNacimiento, mesNacimiento, diaNacimiento);

    int edad = hoy.getYear() - nacimiento.getYear();

    if (hoy.isBefore(nacimiento.plusYears(edad))) {
        edad--;
    }

        return edad;
    }

    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }
    public double calcularFrecuenciaEsperadaMinima() {
        return calcularFrecuenciaMaxima() * 0.50;
    }

    public double calcularFrecuenciaEsperadaMaxima() {
        return calcularFrecuenciaMaxima() * 0.85;
    }
}
