package gh;

import android.content.Context;
import ch.d;
import eh.c;

/* JADX INFO: loaded from: classes3.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f68907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ch.a f68908b;

    public static a b(Context context, String str) {
        if (context == null) {
            return null;
        }
        if (f68907a == null) {
            f68908b = d.a(context, str);
            f68907a = new b();
        }
        return f68907a;
    }

    @Override // gh.a
    public c a(eh.d dVar) {
        return eh.b.b(f68908b.a(eh.b.a(dVar)));
    }

    @Override // gh.a
    public boolean logCollect(String str) {
        return f68908b.logCollect(str);
    }
}
