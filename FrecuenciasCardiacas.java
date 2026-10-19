import java.time.LocalDate;

public class FrecuenciasCardiacas {

    private String primerNombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;

    public FrecuenciasCardiacas(String primerNombre, String apellido,
           int diaNacimiento, int anioNacimiento) {
        this.primerNombre = primerNombre;
        this.apellido = apellido; 
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento; 
        this.anioNacimiento = aniNacimiento;
    }
    public void establecerPrimerNombre(String primerNombre){
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

    
        
