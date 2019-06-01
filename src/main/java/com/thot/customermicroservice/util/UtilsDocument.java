package com.thot.customermicroservice.util;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Clase que contiene valores constantes
 * <b>Class<b/>: UtilsDocument<br/>
 * <b>Copyright<b/>: &copy; 2019 Peter Vasquez Sotelo<br/>
 *
 * @author Peter Vasquez Sotelo <br/>
 * <u>Developed by</u>:<br/>
 * <ul>
 * <li>Peter Vasquez Sotelo</li>
 * </ul>
 * <u>Changes</u>:<br/>
 * <ul>
 * <li>Mar 27, 2019 Creaci&oacute;n de la clase./li>
 * </ul>
 * @version 1.0
 */
public class UtilsDocument {

    public static Date getPossibleDateOfDeath(Date date, int field, int valor) {
        if (valor == 0) return date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(field, valor);
        return calendar.getTime();
    }

    public static Double calculateSD(List<Integer> ages) {
        double sum, standardDeviation;
        int length = ages.size();
        sum = ages.stream().mapToDouble(num -> num).sum();
        double mean = sum / length;
        standardDeviation = ages.stream().mapToDouble(num -> num).map(num -> Math.pow(num - mean, 2)).sum();
        return Math.sqrt(standardDeviation / length);
    }

    public static Double average(List<Integer> ages) {
        OptionalDouble average = ages
                .stream()
                .mapToDouble(a -> a)
                .average();

        return average.isPresent()?average.getAsDouble():Double.NaN;
    }

}
