package com.henninghall.date_picker;

import android.content.Context;
import android.content.res.Configuration;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class h {
    public static String a(String str) {
        return e(str, f.c.d);
    }

    public static String b(Locale locale) {
        return ((SimpleDateFormat) DateFormat.getDateInstance(0, locale)).toLocalizedPattern().replaceAll(",", "").replaceAll("([a-zA-Z]+)", " $1").trim();
    }

    static String c(Locale locale) {
        return ((SimpleDateFormat) DateFormat.getDateTimeInstance(0, 0, locale)).toLocalizedPattern().replace(",", "");
    }

    public static String d(String str) {
        return e(str, f.c.MMMEd);
    }

    private static String e(String str, f.c cVar) {
        try {
            try {
                return f.b(str, cVar);
            } catch (f.d unused) {
                return f.b(str.substring(0, str.indexOf("_")), cVar);
            }
        } catch (f.d | IndexOutOfBoundsException unused2) {
            return f.f45189a.get(cVar);
        }
    }

    public static Locale f(String str) {
        try {
            return fq0.a.e(str);
        } catch (Exception unused) {
            return fq0.a.e(str.substring(0, str.indexOf("_")));
        }
    }

    public static String g(Locale locale, int i11, Context context) {
        try {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(locale);
            return context.createConfigurationContext(configuration).getText(i11).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String h(String str) {
        return e(str, f.c.y);
    }

    public static boolean i(Locale locale) {
        DateFormat timeInstance = DateFormat.getTimeInstance(0, locale);
        return (timeInstance instanceof SimpleDateFormat) && ((SimpleDateFormat) timeInstance).toPattern().contains("a");
    }
}
