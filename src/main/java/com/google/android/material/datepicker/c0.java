package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import androidx.annotation.NonNull;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static AtomicReference<b0> f41949a = new AtomicReference<>();

    static long a(long j11) {
        Calendar calendarM = m();
        calendarM.setTimeInMillis(j11);
        return e(calendarM).getTimeInMillis();
    }

    @TargetApi(24)
    static DateFormat b(Locale locale) {
        return c("MMMd", locale);
    }

    @TargetApi(24)
    private static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(l());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    @NonNull
    static String d(@NonNull String str) {
        return str.replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y");
    }

    static Calendar e(Calendar calendar) {
        Calendar calendarN = n(calendar);
        Calendar calendarM = m();
        calendarM.set(calendarN.get(1), calendarN.get(2), calendarN.get(5));
        return calendarM;
    }

    static SimpleDateFormat f() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(d(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern()), Locale.getDefault());
        simpleDateFormat.setTimeZone(j());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    static String g(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(zs.k.P);
        String string2 = resources.getString(zs.k.O);
        String string3 = resources.getString(zs.k.N);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", DateTokenConverter.CONVERTER_KEY).replaceAll("M+", Gender.MALE).replaceAll("y+", "y");
        }
        return pattern.replace(DateTokenConverter.CONVERTER_KEY, string3).replace(Gender.MALE, string2).replace("y", string);
    }

    @TargetApi(24)
    static DateFormat h(Locale locale) {
        return c("MMMMEEEEd", locale);
    }

    static b0 i() {
        b0 b0Var = f41949a.get();
        return b0Var == null ? b0.c() : b0Var;
    }

    private static TimeZone j() {
        return DesugarTimeZone.getTimeZone("UTC");
    }

    static Calendar k() {
        Calendar calendarA = i().a();
        calendarA.set(11, 0);
        calendarA.set(12, 0);
        calendarA.set(13, 0);
        calendarA.set(14, 0);
        calendarA.setTimeZone(j());
        return calendarA;
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone l() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static Calendar m() {
        return n(null);
    }

    static Calendar n(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(j());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    @TargetApi(24)
    static DateFormat o(Locale locale) {
        return c("yMMMd", locale);
    }

    @TargetApi(24)
    static DateFormat p(Locale locale) {
        return c("yMMMM", locale);
    }

    @TargetApi(24)
    static DateFormat q(Locale locale) {
        return c("yMMMMEEEEd", locale);
    }
}
