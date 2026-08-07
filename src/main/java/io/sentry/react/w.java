package io.sentry.react;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.facebook.react.bridge.Promise;
import io.sentry.o5;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Double> f81241a = new a(51, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f81242b = null;

    class a extends LinkedHashMap<String, Double> {
        a(int i11, float f11, boolean z11) {
            super(i11, f11, z11);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, Double> entry) {
            return size() > 50;
        }
    }

    public static /* synthetic */ void a(final o5 o5Var, final Promise promise) {
        try {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: io.sentry.react.v
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j11) {
                    promise.resolve(Double.valueOf(o5Var.now().f() / 1.0E9d));
                }
            });
        } catch (Exception e11) {
            promise.reject("Failed to receive the instance of Choreographer", e11);
        }
    }

    public static void c(final Promise promise, final o5 o5Var) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            promise.reject("GetTimeToDisplay is not able to measure the time to display: Main looper not available.");
        } else {
            new Handler(mainLooper).post(new Runnable() { // from class: io.sentry.react.u
                @Override // java.lang.Runnable
                public final void run() {
                    w.a(o5Var, promise);
                }
            });
        }
    }

    public static Double d(String str) {
        return f81241a.remove(str);
    }

    public static void e(String str, Double d11) {
        f81241a.put(str, d11);
    }

    public static void f(Double d11) {
        if (f81242b != null) {
            e("ttid-navigation-" + f81242b, d11);
        }
    }

    public static void g(String str) {
        f81242b = str;
    }
}
