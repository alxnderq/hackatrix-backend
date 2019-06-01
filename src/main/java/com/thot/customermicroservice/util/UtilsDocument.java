package com.thot.customermicroservice.util;

import java.util.Calendar;
import java.util.Date;

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
 * <li>Jun 01, 2019 Creaci&oacute;n de la clase./li>
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

}
