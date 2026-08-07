package io.sentry.util;

import io.sentry.d4;
import io.sentry.f4;
import io.sentry.m2;
import io.sentry.q7;
import io.sentry.w3;
import io.sentry.x0;
import io.sentry.y8;
import io.sentry.z0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 {
    public static /* synthetic */ void b(x0 x0Var, q7 q7Var, w3 w3Var) {
        io.sentry.d dVarA = w3Var.a();
        if (dVarA.q()) {
            dVarA.H(x0Var, q7Var);
            dVarA.b();
        }
    }

    public static io.sentry.d d(io.sentry.d dVar, y8 y8Var) {
        return e(dVar, y8Var == null ? null : y8Var.e(), y8Var == null ? null : y8Var.d(), y8Var != null ? y8Var.c() : null);
    }

    public static io.sentry.d e(io.sentry.d dVar, Boolean bool, Double d11, Double d12) {
        if (dVar == null) {
            dVar = new io.sentry.d(m2.e());
        }
        if (dVar.i() == null) {
            Double dJ = dVar.j();
            if (dJ != null) {
                d11 = dJ;
            }
            dVar.B(c0.b(d12, d11, bool));
        }
        if (dVar.q() && dVar.r()) {
            dVar.b();
        }
        return dVar;
    }

    public static boolean f(List<io.sentry.f0> list, String str) {
        if (str != null && list != null && !list.isEmpty()) {
            Iterator<io.sentry.f0> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().a().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            Iterator<io.sentry.f0> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    if (it2.next().b(str)) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    public static w3 g(final x0 x0Var, final q7 q7Var) {
        return x0Var.N(new d4.a() { // from class: io.sentry.util.g0
            @Override // io.sentry.d4.a
            public final void a(w3 w3Var) {
                j0.b(x0Var, q7Var, w3Var);
            }
        });
    }

    public static void h(z0 z0Var) {
        z0Var.s(new f4() { // from class: io.sentry.util.h0
            @Override // io.sentry.f4
            public final void a(x0 x0Var) {
                x0Var.N(new d4.a() { // from class: io.sentry.util.i0
                    @Override // io.sentry.d4.a
                    public final void a(w3 w3Var) {
                        x0Var.D(new w3());
                    }
                });
            }
        });
    }
}
