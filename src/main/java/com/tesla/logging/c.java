package com.tesla.logging;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/tesla/logging/c;", "", "<init>", "()V", "Ljava/util/Date;", InquiryField.DateField.TYPE, "", "a", "(Ljava/util/Date;)Ljava/lang/String;", "Ljava/text/SimpleDateFormat;", "b", "Ljava/text/SimpleDateFormat;", "dateFormat", "logging_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f56371a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static SimpleDateFormat dateFormat;

    static {
        try {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSXXX", Locale.getDefault());
        } catch (Exception unused) {
        }
    }

    private c() {
    }

    public final String a(Date date) {
        s.k(date, "date");
        SimpleDateFormat simpleDateFormat = dateFormat;
        if (simpleDateFormat == null) {
            s.B("dateFormat");
            simpleDateFormat = null;
        }
        String str = simpleDateFormat.format(date);
        s.j(str, "format(...)");
        return str;
    }
}
