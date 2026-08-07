package j$.util;

import j$.time.Instant;
import j$.time.ZonedDateTime;
import j$.time.b;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DesugarGregorianCalendar {
    public static ZonedDateTime toZonedDateTime(GregorianCalendar gregorianCalendar) {
        return ZonedDateTime.w(Instant.ofEpochMilli(gregorianCalendar.getTimeInMillis()), b.d(gregorianCalendar.getTimeZone()));
    }
}
