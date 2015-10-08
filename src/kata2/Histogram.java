/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.Map;

/**
 *
 * @author usuario
 */
public class Histogram {
    public static void main(String[] args) {
        final Integer[] values = {1,2,7,4,4,9,-2,5,7,9};
        final String[] nombres = {"Pepe", "Juan", "Jose", "Pepe", "Pepe", "Jose", "Alberto", "Pepe"};
        HistogramCalculator<String> histogram = new HistogramCalculator(nombres);
        Map map = histogram.calculate();
        HistogramMapDisplay display = new HistogramMapDisplay();
        display.display(map);
    }
}
