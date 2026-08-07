package h0;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Handler f70139a;

    private m() {
    }

    @NonNull
    public static Handler a() {
        if (f70139a != null) {
            return f70139a;
        }
        synchronized (m.class) {
            try {
                if (f70139a == null) {
                    f70139a = q5.i.a(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f70139a;
    }
}
