package pg;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f102203a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f102204b = false;

    public static synchronized String a(Context context) {
        try {
            if (context == null) {
                throw new RuntimeException("Context is null");
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            b(context);
            a aVar = f102203a;
            if (aVar != null) {
                try {
                    return aVar.a(context);
                } catch (Exception unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void b(Context context) {
        if (f102203a != null || f102204b) {
            return;
        }
        synchronized (b.class) {
            try {
                if (f102203a == null && !f102204b) {
                    f102203a = rg.a.b(context);
                    f102204b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
