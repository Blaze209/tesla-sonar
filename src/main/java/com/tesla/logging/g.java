package com.tesla.logging;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u000f\u0018\u0000 \u00162\u00020\u0001:\u0001\u0013B\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u001d\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0016\u0010\rJ\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u001b\u0010\rJ\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\rJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\rJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010\rJ\u0015\u0010 \u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lcom/tesla/logging/g;", "", "", "tag", "prefix", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "p", "(Ljava/lang/String;)Lcom/tesla/logging/g;", "o", "msg", "Ljn0/h0;", "j", "(Ljava/lang/String;)V", "", "logToJs", "logToErrorReporting", "k", "(Ljava/lang/String;ZZ)V", "a", "b", "(Ljava/lang/String;Z)V", "c", "", "tr", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/Throwable;)V", "e", "f", "m", "n", "q", "g", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "getPrefix", "logging_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String tag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String prefix;

    /* JADX INFO: renamed from: com.tesla.logging.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/logging/g$a;", "", "<init>", "()V", "", "tag", "Lcom/tesla/logging/g;", "a", "(Ljava/lang/String;)Lcom/tesla/logging/g;", "logging_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final g a(String tag) {
            s.k(tag, "tag");
            return new g("[" + tag + "]", null, 2, 0 == true ? 1 : 0);
        }

        private Companion() {
        }
    }

    private g(String str, String str2) {
        this.tag = str;
        this.prefix = str2;
    }

    public static final g h(String str) {
        return INSTANCE.a(str);
    }

    public static /* synthetic */ void l(g gVar, String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        gVar.k(str, z11, z12);
    }

    public final void a(String msg) {
        s.k(msg, "msg");
        b(msg, false);
    }

    public final void b(String msg, boolean logToJs) {
        s.k(msg, "msg");
        TeslaLog.INSTANCE.d(this.tag, g(msg), logToJs);
    }

    public final void c(String msg) {
        s.k(msg, "msg");
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = getTag();
        String strG = g(msg);
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = v0.f(x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
    }

    public final void d(String msg, Throwable tr2) {
        s.k(msg, "msg");
        if (tr2 != null) {
            TeslaLog.INSTANCE.e(this.tag, g(msg), tr2);
            return;
        }
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = getTag();
        String strG = g(msg);
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = v0.f(x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
    }

    public final void e(String msg) {
        s.k(msg, "msg");
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = getTag();
        String strG = g(msg);
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = v0.f(x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
    }

    public final void f(String msg, Throwable tr2) {
        s.k(msg, "msg");
        if (tr2 != null) {
            TeslaLog.INSTANCE.fatal(this.tag, g(msg), tr2);
            return;
        }
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = getTag();
        String strG = g(msg);
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = v0.f(x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
    }

    public final String g(String msg) {
        s.k(msg, "msg");
        String str = this.prefix;
        if (str == null || str.length() == 0) {
            return msg;
        }
        return this.prefix + " " + msg;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    public final void j(String msg) {
        s.k(msg, "msg");
        k(msg, true, false);
    }

    public final void k(String msg, boolean logToJs, boolean logToErrorReporting) {
        s.k(msg, "msg");
        TeslaLog.INSTANCE.i(this.tag, g(msg), logToJs, logToErrorReporting);
    }

    public final void m(String msg) {
        s.k(msg, "msg");
        TeslaLog.INSTANCE.v(this.tag, g(msg));
    }

    public final void n(String msg) {
        s.k(msg, "msg");
        TeslaLog.INSTANCE.w(this.tag, g(msg));
    }

    public final g o(String prefix) {
        s.k(prefix, "prefix");
        return new g(this.tag, prefix);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g p(String tag) {
        s.k(tag, "tag");
        return new g(this.tag + "[" + tag + "]", null, 2, 0 == true ? 1 : 0);
    }

    public final void q(String msg) {
        s.k(msg, "msg");
        TeslaLog.INSTANCE.wtf(this.tag, g(msg));
    }

    /* synthetic */ g(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2);
    }
}
