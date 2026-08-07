package ra0;

import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.concurrent.TimeUnit;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0003J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0003R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001f"}, d2 = {"Lra0/h;", "", "<init>", "()V", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, DateTokenConverter.CONVERTER_KEY, "c", "g", "h", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "logger", "", "J", "INACTIVE_THRESHOLD_MS", "TELEMETRY_INACTIVE_THRESHOLD_MS", "Landroid/os/Handler;", "e", "Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "f", "Ljava/lang/Runnable;", "userInactiveRunnable", "userInactiveTelemetryRunnable", "", "Z", "isUserInactive", "initialized", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f107467a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("UserActivity");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long INACTIVE_THRESHOLD_MS;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final long TELEMETRY_INACTIVE_THRESHOLD_MS;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static Handler handler;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static Runnable userInactiveRunnable;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static Runnable userInactiveTelemetryRunnable;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static boolean isUserInactive;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static boolean initialized;

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        INACTIVE_THRESHOLD_MS = timeUnit.convert(5L, timeUnit2);
        TELEMETRY_INACTIVE_THRESHOLD_MS = timeUnit.convert(2L, timeUnit2);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        int intExact = Math.toIntExact((INACTIVE_THRESHOLD_MS / ((long) 1000)) / ((long) 60));
        logger.j("User inactive for " + intExact + " min");
        isUserInactive = true;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("threshold", intExact);
        com.tesla.logging.a.b(com.tesla.logging.a.EnumC1131a.USER_ACTIVITY_INACTIVE, writableNativeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        int intExact = Math.toIntExact((TELEMETRY_INACTIVE_THRESHOLD_MS / ((long) 1000)) / ((long) 60));
        logger.j("User inactive for " + intExact + " min");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("threshold", intExact);
        com.tesla.logging.a.b(com.tesla.logging.a.EnumC1131a.USER_ACTIVITY_INACTIVE, writableNativeMap);
    }

    private final void i() {
        Handler handler2 = handler;
        Runnable runnable = null;
        if (handler2 == null) {
            s.B("handler");
            handler2 = null;
        }
        Runnable runnable2 = userInactiveRunnable;
        if (runnable2 == null) {
            s.B("userInactiveRunnable");
            runnable2 = null;
        }
        handler2.removeCallbacks(runnable2);
        Handler handler3 = handler;
        if (handler3 == null) {
            s.B("handler");
            handler3 = null;
        }
        Runnable runnable3 = userInactiveTelemetryRunnable;
        if (runnable3 == null) {
            s.B("userInactiveTelemetryRunnable");
            runnable3 = null;
        }
        handler3.removeCallbacks(runnable3);
        Handler handler4 = handler;
        if (handler4 == null) {
            s.B("handler");
            handler4 = null;
        }
        Runnable runnable4 = userInactiveRunnable;
        if (runnable4 == null) {
            s.B("userInactiveRunnable");
            runnable4 = null;
        }
        handler4.postDelayed(runnable4, INACTIVE_THRESHOLD_MS);
        Handler handler5 = handler;
        if (handler5 == null) {
            s.B("handler");
            handler5 = null;
        }
        Runnable runnable5 = userInactiveTelemetryRunnable;
        if (runnable5 == null) {
            s.B("userInactiveTelemetryRunnable");
        } else {
            runnable = runnable5;
        }
        handler5.postDelayed(runnable, TELEMETRY_INACTIVE_THRESHOLD_MS);
    }

    public final void c() {
        if (isUserInactive) {
            logger.j("User active after period of inactivity");
            isUserInactive = false;
            com.tesla.logging.a.d(com.tesla.logging.a.EnumC1131a.USER_ACTIVITY_ACTIVE, null, 2, null);
        }
        i();
    }

    public final void d() {
        if (initialized) {
            throw new IllegalStateException("Cannot initialize manager as it is already initialized!");
        }
        initialized = true;
        handler = new Handler(Looper.getMainLooper());
        userInactiveRunnable = new Runnable() { // from class: ra0.f
            @Override // java.lang.Runnable
            public final void run() {
                h.e();
            }
        };
        userInactiveTelemetryRunnable = new Runnable() { // from class: ra0.g
            @Override // java.lang.Runnable
            public final void run() {
                h.f();
            }
        };
    }

    public final void g() {
        logger.j("onAppBackground, invalidate timers");
        Handler handler2 = handler;
        Runnable runnable = null;
        if (handler2 == null) {
            s.B("handler");
            handler2 = null;
        }
        Runnable runnable2 = userInactiveRunnable;
        if (runnable2 == null) {
            s.B("userInactiveRunnable");
            runnable2 = null;
        }
        handler2.removeCallbacks(runnable2);
        Handler handler3 = handler;
        if (handler3 == null) {
            s.B("handler");
            handler3 = null;
        }
        Runnable runnable3 = userInactiveTelemetryRunnable;
        if (runnable3 == null) {
            s.B("userInactiveTelemetryRunnable");
        } else {
            runnable = runnable3;
        }
        handler3.removeCallbacks(runnable);
    }

    public final void h() {
        logger.j("onAppForeground, restart timers");
        isUserInactive = false;
        i();
    }
}
