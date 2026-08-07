package io.sentry.util;

import com.plaid.internal.EnumC4419g;
import io.sentry.b7;
import io.sentry.q7;
import io.sentry.r6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class g {
    private static boolean a(r6 r6Var, q7 q7Var) {
        return q.b(q7Var.getSerializer(), q7Var.getLogger(), r6Var) <= 1048576;
    }

    public static r6 b(r6 r6Var, io.sentry.h0 h0Var, q7 q7Var) {
        try {
            if (q7Var.isEnableEventSizeLimiting() && !a(r6Var, q7Var)) {
                q7Var.getLogger().c(b7.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", r6Var.G(), 1048576L);
                q7Var.getOnOversizedEvent();
                r6 r6VarC = c(r6Var, q7Var);
                if (a(r6VarC, q7Var)) {
                    return r6VarC;
                }
                r6 r6VarD = d(r6VarC, q7Var);
                if (a(r6VarD, q7Var)) {
                    return r6VarD;
                }
                q7Var.getLogger().c(b7.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", r6Var.G());
                return r6VarD;
            }
            return r6Var;
        } catch (Throwable th2) {
            q7Var.getLogger().a(b7.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th2);
            return r6Var;
        }
    }

    private static r6 c(r6 r6Var, q7 q7Var) {
        List<io.sentry.e> listB = r6Var.B();
        if (listB != null && !listB.isEmpty()) {
            r6Var.S(null);
            q7Var.getLogger().c(b7.DEBUG, "Removed breadcrumbs to reduce size of event %s", r6Var.G());
        }
        return r6Var;
    }

    private static r6 d(r6 r6Var, q7 q7Var) {
        List<io.sentry.protocol.s> listP0 = r6Var.p0();
        if (listP0 != null) {
            Iterator<io.sentry.protocol.s> it = listP0.iterator();
            while (it.hasNext()) {
                io.sentry.protocol.c0 c0VarI = it.next().i();
                if (c0VarI != null) {
                    e(c0VarI, r6Var, q7Var, "Truncated exception stack frames of event %s");
                }
            }
        }
        List<io.sentry.protocol.d0> listU0 = r6Var.u0();
        if (listU0 != null) {
            Iterator<io.sentry.protocol.d0> it2 = listU0.iterator();
            while (it2.hasNext()) {
                io.sentry.protocol.c0 c0VarN = it2.next().n();
                if (c0VarN != null) {
                    e(c0VarN, r6Var, q7Var, "Truncated thread stack frames for event %s");
                }
            }
        }
        return r6Var;
    }

    private static void e(io.sentry.protocol.c0 c0Var, r6 r6Var, q7 q7Var, String str) {
        List<io.sentry.protocol.b0> listD = c0Var.d();
        if (listD == null || listD.size() <= 500) {
            return;
        }
        ArrayList arrayList = new ArrayList(500);
        arrayList.addAll(listD.subList(0, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE));
        arrayList.addAll(listD.subList(listD.size() - EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, listD.size()));
        c0Var.e(arrayList);
        q7Var.getLogger().c(b7.DEBUG, str, r6Var.G());
    }
}
