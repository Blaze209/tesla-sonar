package io.sentry;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f80761a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q7 f80762b;

    public m(q7 q7Var) {
        this.f80762b = q7Var;
    }

    @Override // io.sentry.c0
    public r6 n(r6 r6Var, h0 h0Var) {
        io.sentry.protocol.s sVarX0;
        String strK;
        Long lJ;
        if (!io.sentry.util.n.h(h0Var, UncaughtExceptionHandlerIntegration.a.class) || (sVarX0 = r6Var.x0()) == null || (strK = sVarX0.k()) == null || (lJ = sVarX0.j()) == null) {
            return r6Var;
        }
        Long l11 = this.f80761a.get(strK);
        if (l11 == null || l11.equals(lJ)) {
            this.f80761a.put(strK, lJ);
            return r6Var;
        }
        this.f80762b.getLogger().c(b7.INFO, "Event %s has been dropped due to multi-threaded deduplication", r6Var.G());
        io.sentry.util.n.n(h0Var, io.sentry.hints.h.MULTITHREADED_DEDUPLICATION);
        return null;
    }
}
