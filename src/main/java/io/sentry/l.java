package io.sentry;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public final class l {
    public static long a(Date date) {
        return i(date.getTime());
    }

    public static double b(Date date) {
        return j(date.getTime());
    }

    public static BigDecimal c(Double d11) {
        return BigDecimal.valueOf(d11.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public static Date d() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f81533a).getTime();
    }

    public static Date e(long j11) {
        Calendar calendar = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f81533a);
        calendar.setTimeInMillis(j11);
        return calendar.getTime();
    }

    public static Date f(String str) {
        try {
            return io.sentry.vendor.gson.internal.bind.util.a.f(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException("timestamp is not ISO format " + str);
        }
    }

    public static Date g(String str) {
        try {
            return e(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("timestamp is not millis format " + str);
        }
    }

    public static String h(Date date) {
        return io.sentry.vendor.gson.internal.bind.util.a.b(date, true);
    }

    public static long i(long j11) {
        return j11 * 1000000;
    }

    public static double j(double d11) {
        return d11 / 1000.0d;
    }

    public static Date k(long j11) {
        return e(Double.valueOf(l(j11)).longValue());
    }

    public static double l(double d11) {
        return d11 / 1000000.0d;
    }

    public static double m(long j11) {
        return j11 / 1.0E9d;
    }

    public static long n(long j11) {
        return j11 * 1000000000;
    }

    public static Date o(n5 n5Var) {
        if (n5Var == null) {
            return null;
        }
        return p(n5Var);
    }

    public static Date p(n5 n5Var) {
        return k(n5Var.f());
    }
}
