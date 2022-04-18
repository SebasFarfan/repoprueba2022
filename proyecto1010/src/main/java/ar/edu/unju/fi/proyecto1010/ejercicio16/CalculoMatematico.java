package ar.edu.unju.fi.proyecto1010.ejercicio16;

public class CalculoMatematico {
    private int n;

    public CalculoMatematico() {
    }

    public CalculoMatematico(int n) {
        this.n = n;
    }

    public int getN() {
        return this.n;
    }

    public void setN(int n) {
        this.n = n;
    }

    /**
     * Metodo que calcula la sumatoria para k=1 hasta k=n de ((k*(k+1))/2)^2
     * @return double
     */
    public double calcularSumatoria() {
        double suma = 0;
        double base = 0;
        for (int k = 1; k <= n; k++) {
            base = ((k * (k + 1)) / 2);
            suma += Math.pow(base, 2);
        }
        return suma;
    }

    /**
     * Método que calcula la productoria para i=1 hasta i=n de i*(i+4)
     * @return double
     */
    public double calcularProductoria() {
        double producto = 1;
        for (int i = 1; i <= n; i++) {
            producto *= i * (i + 4);
        }
        return producto;
    }

}
