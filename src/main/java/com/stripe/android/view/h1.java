package com.stripe.android.view;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Calendar;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/h1;", "", "<init>", "()V", "", "expiryMonth", "expiryYear", "", "c", "(II)Z", "Ljava/util/Calendar;", "calendar", DateTokenConverter.CONVERTER_KEY, "(IILjava/util/Calendar;)Z", "inputYear", "a", "(I)I", "b", "(ILjava/util/Calendar;)I", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f54917a = new h1();

    private h1() {
    }

    public static final boolean c(int expiryMonth, int expiryYear) {
        if (expiryYear < 100) {
            expiryYear = f54917a.a(expiryYear);
        }
        Calendar calendar = Calendar.getInstance();
        p013kotlin.jvm.internal.s.j(calendar, "getInstance(...)");
        return d(expiryMonth, expiryYear, calendar);
    }

    public static final boolean d(int expiryMonth, int expiryYear, Calendar calendar) {
        int i11;
        p013kotlin.jvm.internal.s.k(calendar, "calendar");
        if (1 > expiryMonth || expiryMonth >= 13 || expiryYear < 0 || expiryYear >= 9981 || expiryYear < (i11 = calendar.get(1))) {
            return false;
        }
        return expiryYear > i11 || expiryMonth >= calendar.get(2) + 1;
    }

    public final int a(int inputYear) {
        Calendar calendar = Calendar.getInstance();
        p013kotlin.jvm.internal.s.j(calendar, "getInstance(...)");
        return b(inputYear, calendar);
    }

    public final int b(int inputYear, Calendar calendar) {
        p013kotlin.jvm.internal.s.k(calendar, "calendar");
        int i11 = calendar.get(1);
        int i12 = i11 / 100;
        int i13 = i11 % 100;
        if (i13 > 80 && inputYear < 20) {
            i12++;
        } else if (i13 < 20 && inputYear > 80) {
            i12--;
        }
        return (i12 * 100) + inputYear;
    }
}
