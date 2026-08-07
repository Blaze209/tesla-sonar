package zt;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f129134a;

    static synchronized c a(Context context, boolean z11) {
        try {
            if (f129134a == null) {
                b bVar = new b(null);
                bVar.a(iu.g.a(context));
                f129134a = bVar.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f129134a;
    }
}
