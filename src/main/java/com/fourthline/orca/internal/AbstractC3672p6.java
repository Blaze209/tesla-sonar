package com.fourthline.orca.internal;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: renamed from: com.fourthline.orca.internal.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3672p6 {
    public static final Date a(String str, Calendar calendar) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        p013kotlin.jvm.internal.s.k(calendar, "calendar");
        if (str.length() == 8) {
            String strSubstring = str.substring(0, 2);
            p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
            int i11 = Integer.parseInt(strSubstring);
            String strSubstring2 = str.substring(2, 4);
            p013kotlin.jvm.internal.s.j(strSubstring2, "substring(...)");
            int i12 = Integer.parseInt(strSubstring2);
            String strSubstring3 = str.substring(4);
            p013kotlin.jvm.internal.s.j(strSubstring3, "substring(...)");
            calendar.set(1, Integer.parseInt(strSubstring3));
            if (i12 <= 12) {
                calendar.set(2, i12 - 1);
                if (i11 <= calendar.getActualMaximum(5)) {
                    calendar.set(5, i11);
                    return calendar.getTime();
                }
            }
        }
        return null;
    }

    public static final boolean a(Date date, int i11) {
        if (date == null) {
            return false;
        }
        Date dateA = a(date, null, 2, null);
        Date dateA2 = a(new Date(), Integer.valueOf(-i11));
        return p013kotlin.jvm.internal.s.f(dateA, dateA2) || dateA.before(dateA2);
    }

    public static final Date a(Date date, Integer num) {
        p013kotlin.jvm.internal.s.k(date, "date");
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (num != null) {
            calendar.add(1, num.intValue());
        }
        return calendar.getTime();
    }

    public static /* synthetic */ Date a(Date date, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        return a(date, num);
    }
}
