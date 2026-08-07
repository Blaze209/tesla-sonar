package mg;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import di.g;
import di.p;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ConcurrentHashMap<Integer, Pair<Long, ?>> f92087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ExecutorService f92088b = Executors.newFixedThreadPool(16);

    /* JADX INFO: renamed from: mg.a$a, reason: collision with other inner class name */
    public interface InterfaceC1966a<T, R> {
        R a(T t11);
    }

    public static Context a(Context context) {
        if (context == null) {
            return null;
        }
        return context.getApplicationContext();
    }

    public static Pair<Boolean, ?> b(int i11, TimeUnit timeUnit, long j11) {
        ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = f92087a;
        if (concurrentHashMap == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        Pair<Long, ?> pair = concurrentHashMap.get(Integer.valueOf(i11));
        if (pair == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        Long l11 = (Long) pair.first;
        return (l11 == null || SystemClock.elapsedRealtime() - l11.longValue() > TimeUnit.MILLISECONDS.convert(j11, timeUnit)) ? new Pair<>(Boolean.FALSE, null) : new Pair<>(Boolean.TRUE, pair.second);
    }

    public static <T> T c(int i11, long j11, TimeUnit timeUnit, InterfaceC1966a<Object, Boolean> interfaceC1966a, Callable<T> callable, boolean z11, long j12, TimeUnit timeUnit2, ai.a aVar, boolean z12) {
        T tCall;
        try {
            Pair<Boolean, ?> pairB = b(i11, timeUnit, j11);
            if (((Boolean) pairB.first).booleanValue() && interfaceC1966a.a(pairB.second).booleanValue()) {
                g.h("getC", i11 + " got " + pairB.second);
                return (T) pairB.second;
            }
            if (z12 && p.Z()) {
                hh.a.g(aVar, "biz", "ch_get_main", "" + i11);
                g.h("getC", i11 + " skip");
                tCall = null;
            } else {
                tCall = z11 ? f92088b.submit(callable).get(j12, timeUnit2) : callable.call();
                d(i11, tCall);
            }
            g.h("getC", i11 + " new " + tCall);
            return tCall;
        } catch (Throwable th2) {
            g.c("CDT", "ch_get_e|" + i11, th2);
            hh.a.c(aVar, "biz", "ch_get_e|" + i11, th2);
            g.h("getC", i11 + " err");
            return null;
        }
    }

    public static synchronized void d(int i11, Object obj) {
        try {
            if (f92087a == null) {
                f92087a = new ConcurrentHashMap<>();
            }
            f92087a.put(Integer.valueOf(i11), new Pair<>(Long.valueOf(SystemClock.elapsedRealtime()), obj));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
