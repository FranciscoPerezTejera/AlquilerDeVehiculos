package actividad_1_1_c.ClasesEInterfaces;

abstract public class Vehiculo {

    protected String matricula;  // Matricula XX-XXXX-XXX
    protected boolean alquilado; // Estado de ocupaci�n

    public Vehiculo(String matricula, boolean alquilado) {
        this.matricula = matricula;
        this.alquilado = alquilado;
    }
    
    public void alquilar(int numDias){
    
        
    }
    
    public boolean devolver(int numeroDias) {
    
        return false;
    }
    
    public String mostarInformacion(){
    
        return "skjhfbs";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", alquilado=" + alquilado + '}';
    }
    
    
    
}
