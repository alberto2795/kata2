/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        final Integer[] values = {1,2,7,4,4,9,-2,5,7,9};
        final String[] nombres = {"Pepe", "Juan", "Jose", "Pepe", "Pepe", "Jose", "Alberto", "Pepe"};
        Histogram histogram = new HistogramCalculator<>(nombres).calculate();
        HistogramMapDisplay display = new HistogramMapDisplay();
        display.display(histogram);
    }
}
