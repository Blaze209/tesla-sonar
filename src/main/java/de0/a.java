package de0;

import bo0.n;
import ce0.TeslaCommandRequest;
import ce0.c;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.d;
import com.tesla.logging.g;
import ic0.e;
import java.util.Locale;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u000b\u001a\u00020\u0006*\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u0010\u001a\u00020\u0004*\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\u0006*\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0016\u001a\u00020\u0004*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0018\u001a\u00020\u0004*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\"\u0017\u0010\u0018\u001a\u00020\u0004*\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/d;", "logLevel", "", "msg", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/tesla/logging/g;Lcom/tesla/logging/d;Ljava/lang/String;)V", "Lic0/e;", "value", "e", "(Lic0/e;Ljava/lang/String;Lcom/tesla/logging/g;Lcom/tesla/logging/d;)V", "Lce0/j;", "", "logThread", "h", "(Lce0/j;Ljava/lang/String;Z)Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "(Lce0/j;Ljava/lang/String;Lcom/tesla/logging/g;Lcom/tesla/logging/d;Z)V", "a", "(Lic0/e;)Ljava/lang/String;", "logCmdPrefix", "c", "logPrefix", "b", "(Lce0/j;)Ljava/lang/String;", "requestmanager_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: de0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class C1235a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60519a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f60519a = iArr;
        }
    }

    public static final String a(e eVar) {
        s.k(eVar, "<this>");
        String strSubstring = b.a(eVar).substring(0, n.j(b.a(eVar).length(), 5));
        s.j(strSubstring, "substring(...)");
        String upperCase = strSubstring.toUpperCase(Locale.ROOT);
        s.j(upperCase, "toUpperCase(...)");
        return "[CMD][" + upperCase + "]";
    }

    public static final String b(TeslaCommandRequest teslaCommandRequest) {
        if (teslaCommandRequest == null) {
            return "NO_REQUEST_FOUND";
        }
        String strA = a(teslaCommandRequest.getRequest());
        String strI = teslaCommandRequest.I();
        String upperCase = teslaCommandRequest.o().toUpperCase(Locale.ROOT);
        s.j(upperCase, "toUpperCase(...)");
        return strA + "[" + strI + "][" + upperCase + "]";
    }

    public static final String c(e eVar) {
        s.k(eVar, "<this>");
        String strA = a(eVar);
        String upperCase = c.b(eVar).toUpperCase(Locale.ROOT);
        s.j(upperCase, "toUpperCase(...)");
        return strA + "[" + upperCase + "]";
    }

    public static final void d(TeslaCommandRequest teslaCommandRequest, String value, g logger, d logLevel, boolean z11) {
        s.k(value, "value");
        s.k(logger, "logger");
        s.k(logLevel, "logLevel");
        i(logger, logLevel, h(teslaCommandRequest, value, z11));
    }

    public static final void e(e eVar, String value, g logger, d logLevel) {
        s.k(eVar, "<this>");
        s.k(value, "value");
        s.k(logger, "logger");
        s.k(logLevel, "logLevel");
        i(logger, logLevel, c(eVar) + value);
    }

    public static /* synthetic */ void f(TeslaCommandRequest teslaCommandRequest, String str, g gVar, d dVar, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            dVar = d.INFO;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        d(teslaCommandRequest, str, gVar, dVar, z11);
    }

    public static /* synthetic */ void g(e eVar, String str, g gVar, d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            dVar = d.INFO;
        }
        e(eVar, str, gVar, dVar);
    }

    public static final String h(TeslaCommandRequest teslaCommandRequest, String value, boolean z11) {
        String strSubstring;
        String str;
        s.k(value, "value");
        if (z11) {
            String name = Thread.currentThread().getName();
            s.h(name);
            String strH0 = t.H0(t.V(name, "RxCachedThread", "RxCached", false, 4, null), 10, ' ');
            strSubstring = strH0.substring(strH0.length() - 10, strH0.length());
            s.j(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
        }
        String strB = b(teslaCommandRequest);
        if (strSubstring != null) {
            str = "[" + strSubstring + "]";
        } else {
            str = "";
        }
        return strB + str + " " + value;
    }

    public static final void i(g logger, d logLevel, String msg) {
        s.k(logger, "logger");
        s.k(logLevel, "logLevel");
        s.k(msg, "msg");
        int i11 = C1235a.f60519a[logLevel.ordinal()];
        if (i11 == 1) {
            logger.m(msg);
            return;
        }
        if (i11 == 2) {
            logger.j(msg);
            return;
        }
        if (i11 == 3) {
            logger.a(msg);
            return;
        }
        if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = logger.getTag();
        String strG = logger.g(msg);
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

    public static /* synthetic */ String j(TeslaCommandRequest teslaCommandRequest, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return h(teslaCommandRequest, str, z11);
    }
}
