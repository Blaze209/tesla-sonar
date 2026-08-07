package com.tesla.logging;

import androidx.annotation.Keep;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000bJ%\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0012\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0012\u0010\u0015J \u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0016\u0010\u000bJ%\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u000bJ\u001d\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u000bJ\u001d\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u000bJ\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/tesla/logging/TeslaLog;", "", "<init>", "()V", "", "tag", "Ljn0/h0;", "tagTimber", "(Ljava/lang/String;)V", "msg", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)V", "", "logToJs", "logToErrorReporting", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Z)V", "e", "", "tr", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "fatal", "v", "w", "wtf", "setTag", "(Ljava/lang/String;Z)V", "enable", "Z", "getEnable", "()Z", "setEnable", "(Z)V", "", "MAX_TAG_LENGTH", "I", "logging_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TeslaLog {
    private static final int MAX_TAG_LENGTH = 40;
    public static final TeslaLog INSTANCE = new TeslaLog();
    private static volatile boolean enable = true;

    private TeslaLog() {
    }

    public static /* synthetic */ void setTag$default(TeslaLog teslaLog, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        teslaLog.setTag(str, z11);
    }

    private final void tagTimber(String tag) {
        vr0.a.INSTANCE.o(t.L0(tag, 40, (char) 0, 2, null));
    }

    public final void d(String tag, String msg, boolean logToJs) {
        s.k(tag, "tag");
        s.k(msg, "msg");
    }

    public final void e(String tag, String msg) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = v0.f(x.a(tag, msg));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(msg));
        setTag$default(this, tag, false, 2, null);
        vr0.a.INSTANCE.a(msg, new Object[0]);
    }

    public final void fatal(String tag, String msg, Throwable tr2) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        s.k(tr2, "tr");
        e(tag, msg, tr2);
    }

    public final boolean getEnable() {
        return enable;
    }

    public final void i(String tag, String msg) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        if (enable) {
            i(tag, msg, true, false);
        }
    }

    public final void setEnable(boolean z11) {
        enable = z11;
    }

    public final void setTag(String tag, boolean logToJs) {
        s.k(tag, "tag");
        if (!t.b0(tag, "[", false, 2, null)) {
            tag = "[" + tag + "]";
        }
        tagTimber(tag);
    }

    public final void v(String tag, String msg) {
        s.k(tag, "tag");
        s.k(msg, "msg");
    }

    public final void w(String tag, String msg) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        if (enable) {
            setTag$default(this, tag, false, 2, null);
            vr0.a.INSTANCE.l(msg, new Object[0]);
        }
    }

    public final void wtf(String tag, String msg) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        if (enable) {
            setTag$default(this, tag, false, 2, null);
            vr0.a.INSTANCE.m(msg, new Object[0]);
        }
    }

    public final void d(String tag, String msg) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        if (enable) {
            d(tag, msg, true);
        }
    }

    public final void fatal(String tag, String msg) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = v0.f(x.a(tag, msg));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(msg));
        setTag$default(this, tag, false, 2, null);
        vr0.a.INSTANCE.a(msg, new Object[0]);
    }

    public final void i(String tag, String msg, boolean logToJs, boolean logToErrorReporting) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        if (enable) {
            if (logToErrorReporting) {
                zb0.a.f128044a.a(tag, msg);
            }
            setTag(tag, logToJs);
            vr0.a.INSTANCE.g(msg, new Object[0]);
        }
    }

    public final void e(String tag, String msg, Throwable tr2) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        s.k(tr2, "tr");
        zb0.a.f128044a.b(v0.f(x.a(tag, msg)), tr2);
        setTag$default(this, tag, false, 2, null);
        vr0.a.INSTANCE.b(tr2, msg, new Object[0]);
    }
}
