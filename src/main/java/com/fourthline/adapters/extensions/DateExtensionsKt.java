package com.fourthline.adapters.extensions;

import com.fourthline.adapters.common.DateFormat;
import java.util.Date;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"toShortString", "", "Ljava/util/Date;", "toISO8601String", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DateExtensionsKt {
    public static final String toISO8601String(Date date) {
        s.k(date, "<this>");
        return DateFormat.ISO8601.toUtcDateFormat(date.getTime());
    }

    public static final String toShortString(Date date) {
        s.k(date, "<this>");
        return DateFormat.SHORT.toUtcDateFormat(date.getTime());
    }
}
