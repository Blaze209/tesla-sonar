package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public final class s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u7 f81311a;

    public s6(u7 u7Var) {
        this.f81311a = (u7) io.sentry.util.y.c(u7Var, "The SentryStackTraceFactory is required.");
    }

    private io.sentry.protocol.s c(Throwable th2, io.sentry.protocol.l lVar, Long l11, List<io.sentry.protocol.b0> list, boolean z11) {
        Package r11 = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        io.sentry.protocol.s sVar = new io.sentry.protocol.s();
        String message = th2.getMessage();
        if (r11 != null) {
            name = name.replace(r11.getName() + ".", "");
        }
        String name2 = r11 != null ? r11.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.c0 c0Var = new io.sentry.protocol.c0(list);
            if (z11) {
                c0Var.f(Boolean.TRUE);
            }
            sVar.n(c0Var);
        }
        sVar.o(l11);
        sVar.p(name);
        sVar.l(lVar);
        sVar.m(name2);
        sVar.r(message);
        return sVar;
    }

    private List<io.sentry.protocol.s> e(Deque<io.sentry.protocol.s> deque) {
        return new ArrayList(deque);
    }

    Deque<io.sentry.protocol.s> a(Throwable th2) {
        return b(th2, new AtomicInteger(-1), new HashSet<>(), new ArrayDeque(), null);
    }

    Deque<io.sentry.protocol.s> b(Throwable th2, AtomicInteger atomicInteger, HashSet<Throwable> hashSet, Deque<io.sentry.protocol.s> deque, String str) {
        io.sentry.protocol.l lVar;
        Thread threadCurrentThread;
        Throwable th3;
        boolean zD;
        String str2 = str;
        int i11 = atomicInteger.get();
        Throwable cause = th2;
        while (cause != null) {
            HashSet<Throwable> hashSet2 = hashSet;
            if (!hashSet2.add(cause)) {
                break;
            }
            if (str2 == null) {
                str2 = "chained";
            }
            int i12 = 0;
            if (cause instanceof ExceptionMechanismException) {
                ExceptionMechanismException exceptionMechanismException = (ExceptionMechanismException) cause;
                lVar = exceptionMechanismException.a();
                Throwable thC = exceptionMechanismException.c();
                threadCurrentThread = exceptionMechanismException.b();
                zD = exceptionMechanismException.d();
                th3 = thC;
            } else {
                lVar = new io.sentry.protocol.l();
                threadCurrentThread = Thread.currentThread();
                th3 = cause;
                zD = false;
            }
            io.sentry.protocol.l lVar2 = lVar;
            deque.addFirst(c(th3, lVar2, Long.valueOf(threadCurrentThread.getId()), this.f81311a.a(th3.getStackTrace(), Boolean.FALSE.equals(lVar2.l())), zD));
            if (lVar2.k() == null) {
                lVar2.p(str2);
            }
            if (atomicInteger.get() >= 0) {
                lVar2.o(Integer.valueOf(i11));
            }
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            lVar2.m(Integer.valueOf(iIncrementAndGet));
            Throwable[] suppressed = th3.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                int length = suppressed.length;
                while (i12 < length) {
                    b(suppressed[i12], atomicInteger, hashSet2, deque, "suppressed");
                    i12++;
                    hashSet2 = hashSet;
                    deque = deque;
                }
            }
            cause = th3.getCause();
            str2 = null;
            i11 = iIncrementAndGet;
        }
        return deque;
    }

    public List<io.sentry.protocol.s> d(Throwable th2) {
        return e(a(th2));
    }

    public List<io.sentry.protocol.s> f(io.sentry.protocol.d0 d0Var, io.sentry.protocol.l lVar, Throwable th2) {
        io.sentry.protocol.c0 c0VarN = d0Var.n();
        if (c0VarN == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c(th2, lVar, d0Var.l(), c0VarN.d(), true));
        return arrayList;
    }
}
