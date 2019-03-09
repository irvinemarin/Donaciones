package com.example.irvinmarin.donaciones.utils;

import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by irvinmarin on 28/02/2018.
 */

public class Utils {
    public static String getFechaDetalle(String fecha) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        String dateInString = ;

        Date date = null;
        String formatterUIFinal = null;
        try {
            date = formatter.parse(fecha);
            SimpleDateFormat formatterUI = new SimpleDateFormat("d MMM yyyy", Locale.getDefault());
            formatterUIFinal = formatterUI.format(date);
            Log.d("", "date : " + formatter.format(date));
            return formatterUIFinal;
        } catch (ParseException e) {
//            e.printStackTrace();
            return "Fecha no Valida";
        }

    }
}
