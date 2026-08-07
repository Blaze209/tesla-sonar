package com.henninghall.date_picker;

import android.text.format.DateFormat;
import android.text.format.DateUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import j$.util.DesugarTimeZone;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import net.time4j.PrettyTime;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    public static String a(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String b(Calendar calendar) {
        return d().format(calendar.getTime());
    }

    public static boolean c() {
        return !DateFormat.is24HourFormat(c.f45183a);
    }

    private static SimpleDateFormat d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    public static String e(Locale locale, String str) {
        ReactApplicationContext reactApplicationContext = c.f45183a;
        return h.g(locale, reactApplicationContext.getResources().getIdentifier(str, InquiryField.StringField.TYPE, reactApplicationContext.getPackageName()), reactApplicationContext);
    }

    public static int f(int i11, int i12, int i13, boolean z11) {
        int i14;
        int i15 = i13 + 1;
        int i16 = i12 - i11;
        int i17 = i16 > 0 ? i16 - i15 : i15 + i16;
        return (!z11 ? !((i14 = i11 + i16) <= i13 && i14 >= 0) : Math.abs(i16) >= Math.abs(i17)) ? i16 : i17;
    }

    public static boolean g(Calendar calendar) {
        return DateUtils.isToday(calendar.getTimeInMillis());
    }

    public static Calendar h(String str, TimeZone timeZone) {
        if (str == null) {
            return null;
        }
        try {
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(d().parse(str));
            return calendar;
        } catch (ParseException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static ny.d i(char c11) {
        if (c11 != 'H') {
            if (c11 == 'M') {
                return ny.d.MONTH;
            }
            if (c11 == 'a') {
                return ny.d.AM_PM;
            }
            if (c11 == 'd') {
                return ny.d.DATE;
            }
            if (c11 != 'h') {
                if (c11 == 'm') {
                    return ny.d.MINUTE;
                }
                if (c11 == 'y') {
                    return ny.d.YEAR;
                }
                throw new Exception("Invalid pattern char: " + c11);
            }
        }
        return ny.d.HOUR;
    }

    public static String j(Locale locale) {
        return PrettyTime.b(locale).c();
    }

    public static int k(int i11) {
        return (int) (i11 * c.f45183a.getResources().getDisplayMetrics().density);
    }

    public static String l(int i11) {
        return new DecimalFormat("00").format(i11);
    }
}
