package if0;

import android.os.Looper;
import androidx.core.uwb.exceptions.UwbApiException;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, d2 = {"Lif0/b;", "", "<init>", "()V", "Ljn0/h0;", "b", DateTokenConverter.CONVERTER_KEY, "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "Ljava/lang/Thread$UncaughtExceptionHandler;", "c", "Ljava/lang/Thread$UncaughtExceptionHandler;", "originalHandler", "", "Z", "isInstalled", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f77637a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("Uwb").p("GlobalExceptionHandler");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static Thread.UncaughtExceptionHandler originalHandler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static boolean isInstalled;

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Thread thread, Throwable th2) {
        if (!(th2 instanceof UwbApiException)) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            s.j(stackTrace, "getStackTrace(...)");
            int length = stackTrace.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = originalHandler;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th2);
                        return;
                    }
                    return;
                }
                String className = stackTrace[i11].getClassName();
                s.j(className, "getClassName(...)");
                if (t.h0(className, "androidx.core.uwb", false, 2, null)) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        g gVar = logger;
        String str = "Intercept MainThread UWB crash: " + th2.getMessage();
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g(str);
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

    public final void b() {
        if (isInstalled) {
            return;
        }
        Thread thread = Looper.getMainLooper().getThread();
        s.j(thread, "getThread(...)");
        originalHandler = thread.getUncaughtExceptionHandler();
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: if0.a
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread2, Throwable th2) {
                b.c(thread2, th2);
            }
        });
        isInstalled = true;
    }

    public final void d() {
        if (isInstalled) {
            Thread thread = Looper.getMainLooper().getThread();
            s.j(thread, "getThread(...)");
            thread.setUncaughtExceptionHandler(originalHandler);
            isInstalled = false;
        }
    }
}
