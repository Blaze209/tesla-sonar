package com.fourthline.adapters.common;

import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000e"}, d2 = {"Lcom/fourthline/adapters/common/DateFormat;", "", "format", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", CoreConstants.ISO8601_STR, "SHORT", "toUtcDateFormat", "timeMillis", "", "fromDateFormat", "Ljava/util/Date;", InquiryField.DateField.TYPE, "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum DateFormat {
    ISO8601("yyyy-MM-dd'T'HH:mm:ss'Z'"),
    SHORT("yyyy-MM-dd");

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final String format;

    DateFormat(String str) {
        this.format = str;
    }

    public static EnumEntries<DateFormat> getEntries() {
        return $ENTRIES;
    }

    public final Date fromDateFormat(String date) throws ParseException {
        s.k(date, "date");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.format, Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        Date date2 = simpleDateFormat.parse(date);
        s.j(date2, "parse(...)");
        return date2;
    }

    public final String toUtcDateFormat(long timeMillis) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.format, Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(Long.valueOf(timeMillis));
        s.j(str, "format(...)");
        return str;
    }
}
