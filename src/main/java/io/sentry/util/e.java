package io.sentry.util;

import io.sentry.r6;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public static boolean a(List<io.sentry.f0> list, r6 r6Var) {
        if (r6Var != null && list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            io.sentry.protocol.m mVarS0 = r6Var.s0();
            if (mVarS0 != null) {
                String strE = mVarS0.e();
                if (strE != null) {
                    hashSet.add(strE);
                }
                String strD = mVarS0.d();
                if (strD != null) {
                    hashSet.add(strD);
                }
            }
            Throwable thO = r6Var.O();
            if (thO != null) {
                hashSet.add(thO.toString());
            }
            Iterator<io.sentry.f0> it = list.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(it.next().a())) {
                    return true;
                }
            }
            for (io.sentry.f0 f0Var : list) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    if (f0Var.b((String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
