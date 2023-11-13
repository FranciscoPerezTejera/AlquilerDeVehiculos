package actividad_1_1_c.ClasesEInterfaces;

import java.util.Random;

public class Camion extends Vehiculo implements Coste {

    protected double precioPorDia;
    protected int diasAlquilar, diasDevolucion;

    public Camion(String matricula, boolean alquilado) {
        super(matricula, alquilado);
        Random random = new Random();
        double numeroAleatorio = 150.0 + (random.nextDouble() * (600.0 - 150.0));
        this.diasAlquilar = 0;
        this.diasDevolucion = 0;
        this.precioPorDia = Math.round(numeroAleatorio * 100.0) / 100.0;
    }

    @Override
    public double importeFinal(int numeroDias, double precio) {

        double suma;

        if (this.devolver(diasDevolucion)) {

            suma = numeroDias * precio;

        } else {

            suma = this.getDiasAlquilar() * precio;
        }

        return suma;
    }

    @Override
    public String toString() {

        String condicion = (this.isAlquilado()) ? "SÍ" : "NO";

        return String.format("--> Datos de un Camión:\n"
                + "Matrícula: %s\n"
                + "Alquilado: %s\n"
                + "Precio por día: %.2f "
                + "EUR", this.getMatricula(), condicion, this.getPrecioPorDia());
    }

    @Override
    public String mostarInformacion() {

        return String.format("Se devuelve el camión con matrícla %s con %s días ."
                + "\nCantidad a pagar: %.2f EUROS",
                this.getMatricula(),
                this.getDiasDevolucion(),
                this.importeFinal(diasDevolucion, precioPorDia));
    }

    @Override
    public boolean devolver(int numeroDias) {

        return numeroDias > this.getDiasAlquilar();
    }

    @Override
    public void alquilar(int numDias) {

        this.diasAlquilar = numDias;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public int getDiasAlquilar() {
        return diasAlquilar;
    }

    public void setDiasAlquilar(int diasAlquilar) {
        this.diasAlquilar = diasAlquilar;
    }

    public int getDiasDevolucion() {
        return diasDevolucion;
    }

    public void setDiasDevolucion(int diasDevolucion) {
        this.diasDevolucion = diasDevolucion;
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

}
