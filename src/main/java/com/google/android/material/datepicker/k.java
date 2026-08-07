package com.google.android.material.datepicker;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
class k {
    static String a(long j11) {
        return b(j11, null);
    }

    static String b(long j11, SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j11));
        }
        return o(j11) ? d(j11) : k(j11);
    }

    static String c(Context context, long j11, boolean z11, boolean z12, boolean z13) {
        String strH = h(j11);
        if (z11) {
            strH = String.format(context.getString(zs.k.Q), strH);
        }
        if (z12) {
            return String.format(context.getString(zs.k.M), strH);
        }
        return z13 ? String.format(context.getString(zs.k.F), strH) : strH;
    }

    static String d(long j11) {
        return e(j11, Locale.getDefault());
    }

    static String e(long j11, Locale locale) {
        return c0.b(locale).format(new Date(j11));
    }

    static String f(long j11) {
        return g(j11, Locale.getDefault());
    }

    static String g(long j11, Locale locale) {
        return c0.h(locale).format(new Date(j11));
    }

    static String h(long j11) {
        return o(j11) ? f(j11) : m(j11);
    }

    static String i(Context context, int i11) {
        return c0.k().get(1) == i11 ? String.format(context.getString(zs.k.J), Integer.valueOf(i11)) : String.format(context.getString(zs.k.K), Integer.valueOf(i11));
    }

    static String j(long j11) {
        return c0.p(Locale.getDefault()).format(new Date(j11));
    }

    static String k(long j11) {
        return l(j11, Locale.getDefault());
    }

    static String l(long j11, Locale locale) {
        return c0.o(locale).format(new Date(j11));
    }

    static String m(long j11) {
        return n(j11, Locale.getDefault());
    }

    static String n(long j11, Locale locale) {
        return c0.q(locale).format(new Date(j11));
    }

    private static boolean o(long j11) {
        Calendar calendarK = c0.k();
        Calendar calendarM = c0.m();
        calendarM.setTimeInMillis(j11);
        return calendarK.get(1) == calendarM.get(1);
    }
}
