package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b0 f41938c = new b0(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f41939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeZone f41940b;

    private b0(Long l11, TimeZone timeZone) {
        this.f41939a = l11;
        this.f41940b = timeZone;
    }

    static b0 c() {
        return f41938c;
    }

    Calendar a() {
        return b(this.f41940b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l11 = this.f41939a;
        if (l11 != null) {
            calendar.setTimeInMillis(l11.longValue());
        }
        return calendar;
    }
}
