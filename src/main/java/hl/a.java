package hl;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f73114a;

    /* JADX INFO: renamed from: hl.a$a, reason: collision with other inner class name */
    public interface InterfaceC1536a {
        void release();
    }

    public static synchronized a b() {
        try {
            if (f73114a == null) {
                f73114a = new b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f73114a;
    }

    static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public abstract void a(InterfaceC1536a interfaceC1536a);

    public abstract void d(InterfaceC1536a interfaceC1536a);
}
