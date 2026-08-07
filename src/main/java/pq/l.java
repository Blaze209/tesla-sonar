package pq;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes4.dex */
public final class l {
    @SuppressLint({"DiscouragedApi"})
    public static void a(nq.i<?> iVar, nq.f fVar) {
        if (!(iVar instanceof s)) {
            tq.a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", iVar);
        } else {
            u.c().e().l(((s) iVar).d().f(fVar), 1);
        }
    }
}
