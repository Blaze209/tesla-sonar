package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u7 f81516a;

    public v7(u7 u7Var) {
        this.f81516a = (u7) io.sentry.util.y.c(u7Var, "The SentryStackTraceFactory is required.");
    }

    private io.sentry.protocol.d0 d(boolean z11, StackTraceElement[] stackTraceElementArr, Thread thread, boolean z12) {
        List<io.sentry.protocol.b0> listA;
        io.sentry.protocol.d0 d0Var = new io.sentry.protocol.d0();
        d0Var.w(thread.getName());
        d0Var.x(Integer.valueOf(thread.getPriority()));
        d0Var.u(Long.valueOf(thread.getId()));
        d0Var.s(Boolean.valueOf(thread.isDaemon()));
        d0Var.z(thread.getState().name());
        d0Var.q(Boolean.valueOf(z11));
        if (z12 && (listA = this.f81516a.a(stackTraceElementArr, false)) != null && !listA.isEmpty()) {
            io.sentry.protocol.c0 c0Var = new io.sentry.protocol.c0(listA);
            c0Var.f(Boolean.TRUE);
            d0Var.y(c0Var);
        }
        return d0Var;
    }

    List<io.sentry.protocol.d0> a(boolean z11) {
        HashMap map = new HashMap();
        Thread threadCurrentThread = Thread.currentThread();
        map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        return c(map, null, false, z11);
    }

    List<io.sentry.protocol.d0> b(List<Long> list, boolean z11, boolean z12) {
        return c(Thread.getAllStackTraces(), list, z11, z12);
    }

    List<io.sentry.protocol.d0> c(Map<Thread, StackTraceElement[]> map, List<Long> list, boolean z11, boolean z12) {
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            Thread key = entry.getKey();
            arrayList.add(d((key == threadCurrentThread && !z11) || !(list == null || !list.contains(Long.valueOf(key.getId())) || z11), entry.getValue(), entry.getKey(), z12));
        }
        return arrayList;
    }
}
