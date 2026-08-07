package ts;

import android.os.Trace;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class n0 {
    public static void a(String str) {
        if (p0.f115040a >= 18) {
            b(str);
        }
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (p0.f115040a >= 18) {
            d();
        }
    }

    private static void d() {
        Trace.endSection();
    }
}
