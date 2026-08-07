package gk;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(b1 b1Var, String message) {
        p013kotlin.jvm.internal.s.k(message, "message");
        Iterator it = p013kotlin.collections.v.p(y0.f69161d.a(new i0(b1Var.a())), h.f69057a.a(new a2(b1Var.a()))).iterator();
        while (it.hasNext()) {
            ((v0) it.next()).a(message);
        }
    }
}
