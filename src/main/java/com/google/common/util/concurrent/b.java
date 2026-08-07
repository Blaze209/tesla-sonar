package com.google.common.util.concurrent;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
abstract class b<V> extends su.a implements s<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Object f43793d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final r f43794e = new r(com.google.common.util.concurrent.a.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final boolean f43795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AbstractC0690b f43796g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f43797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile com.google.common.util.concurrent.a.d f43798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile f f43799c;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.b$b, reason: collision with other inner class name */
    private static abstract class AbstractC0690b {
        private AbstractC0690b() {
        }

        abstract boolean a(b<?> bVar, com.google.common.util.concurrent.a.d dVar, com.google.common.util.concurrent.a.d dVar2);

        abstract boolean b(b<?> bVar, Object obj, Object obj2);

        abstract boolean c(b<?> bVar, f fVar, f fVar2);

        abstract com.google.common.util.concurrent.a.d d(b<?> bVar, com.google.common.util.concurrent.a.d dVar);

        abstract f e(b<?> bVar, f fVar);

        abstract void f(f fVar, f fVar2);

        abstract void g(f fVar, Thread thread);
    }

    private static final class c extends AbstractC0690b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater<f, Thread> f43800a = AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater<f, f> f43801b = AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater<? super b<?>, f> f43802c = AtomicReferenceFieldUpdater.newUpdater(b.class, f.class, "c");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater<? super b<?>, com.google.common.util.concurrent.a.d> f43803d = AtomicReferenceFieldUpdater.newUpdater(b.class, com.google.common.util.concurrent.a.d.class, "b");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater<? super b<?>, Object> f43804e = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "a");

        private c() {
            super();
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        boolean a(b<?> bVar, com.google.common.util.concurrent.a.d dVar, com.google.common.util.concurrent.a.d dVar2) {
            return androidx.concurrent.futures.b.a(f43803d, bVar, dVar, dVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        boolean b(b<?> bVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(f43804e, bVar, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        boolean c(b<?> bVar, f fVar, f fVar2) {
            return androidx.concurrent.futures.b.a(f43802c, bVar, fVar, fVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        com.google.common.util.concurrent.a.d d(b<?> bVar, com.google.common.util.concurrent.a.d dVar) {
            return f43803d.getAndSet(bVar, dVar);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        f e(b<?> bVar, f fVar) {
            return f43802c.getAndSet(bVar, fVar);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        void f(f fVar, f fVar2) {
            f43801b.lazySet(fVar, fVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        void g(f fVar, Thread thread) {
            f43800a.lazySet(fVar, thread);
        }
    }

    private static final class d extends AbstractC0690b {
        private d() {
            super();
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        boolean a(b<?> bVar, com.google.common.util.concurrent.a.d dVar, com.google.common.util.concurrent.a.d dVar2) {
            synchronized (bVar) {
                try {
                    if (bVar.f43798b != dVar) {
                        return false;
                    }
                    bVar.f43798b = dVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        boolean b(b<?> bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                try {
                    if (bVar.f43797a != obj) {
                        return false;
                    }
                    bVar.f43797a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        boolean c(b<?> bVar, f fVar, f fVar2) {
            synchronized (bVar) {
                try {
                    if (bVar.f43799c != fVar) {
                        return false;
                    }
                    bVar.f43799c = fVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        com.google.common.util.concurrent.a.d d(b<?> bVar, com.google.common.util.concurrent.a.d dVar) {
            com.google.common.util.concurrent.a.d dVar2;
            synchronized (bVar) {
                try {
                    dVar2 = bVar.f43798b;
                    if (dVar2 != dVar) {
                        bVar.f43798b = dVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return dVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        f e(b<?> bVar, f fVar) {
            f fVar2;
            synchronized (bVar) {
                try {
                    fVar2 = bVar.f43799c;
                    if (fVar2 != fVar) {
                        bVar.f43799c = fVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        void f(f fVar, f fVar2) {
            fVar.f43813b = fVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        void g(f fVar, Thread thread) {
            fVar.f43812a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e extends AbstractC0690b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Unsafe f43805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final long f43806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final long f43807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final long f43808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final long f43809e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f43810f;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e11) {
                    throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.common.util.concurrent.c
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() {
                        return b.e.i();
                    }
                });
            }
            try {
                f43807c = unsafe.objectFieldOffset(b.class.getDeclaredField("c"));
                f43806b = unsafe.objectFieldOffset(b.class.getDeclaredField("b"));
                f43808d = unsafe.objectFieldOffset(b.class.getDeclaredField("a"));
                f43809e = unsafe.objectFieldOffset(f.class.getDeclaredField("a"));
                f43810f = unsafe.objectFieldOffset(f.class.getDeclaredField("b"));
                f43805a = unsafe;
            } catch (NoSuchFieldException e12) {
                throw new RuntimeException(e12);
            }
        }

        private e() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unsafe i() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        boolean a(b<?> bVar, com.google.common.util.concurrent.a.d dVar, com.google.common.util.concurrent.a.d dVar2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.a.a(f43805a, bVar, f43806b, dVar, dVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        boolean b(b<?> bVar, Object obj, Object obj2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.a.a(f43805a, bVar, f43808d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        boolean c(b<?> bVar, f fVar, f fVar2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.a.a(f43805a, bVar, f43807c, fVar, fVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        com.google.common.util.concurrent.a.d d(b<?> bVar, com.google.common.util.concurrent.a.d dVar) {
            com.google.common.util.concurrent.a.d dVar2;
            do {
                dVar2 = bVar.f43798b;
                if (dVar == dVar2) {
                    break;
                }
            } while (!a(bVar, dVar2, dVar));
            return dVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        f e(b<?> bVar, f fVar) {
            f fVar2;
            do {
                fVar2 = bVar.f43799c;
                if (fVar == fVar2) {
                    break;
                }
            } while (!c(bVar, fVar2, fVar));
            return fVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        void f(f fVar, f fVar2) {
            f43805a.putObject(fVar, f43810f, fVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0690b
        void g(f fVar, Thread thread) {
            f43805a.putObject(fVar, f43809e, thread);
        }
    }

    static final class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final f f43811c = new f(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f43812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile f f43813b;

        f(boolean z11) {
        }

        void a(f fVar) {
            b.p(this, fVar);
        }

        void b() {
            Thread thread = this.f43812a;
            if (thread != null) {
                this.f43812a = null;
                LockSupport.unpark(thread);
            }
        }

        f() {
            b.q(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.common.util.concurrent.b$a] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    static {
        boolean z11;
        AbstractC0690b cVar;
        Throwable th2;
        AbstractC0690b eVar;
        try {
            z11 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z11 = false;
        }
        f43795f = z11;
        ?? r11 = 0;
        ?? r12 = 0;
        if (o()) {
            try {
                eVar = new e();
            } catch (Error | Exception e11) {
                try {
                    cVar = new c();
                } catch (Error | Exception e12) {
                    d dVar = new d();
                    r11 = e12;
                    cVar = dVar;
                }
                AbstractC0690b abstractC0690b = cVar;
                th2 = e11;
                eVar = abstractC0690b;
                r12 = r11;
            }
        } else {
            try {
                eVar = new c();
            } catch (NoClassDefFoundError unused2) {
                eVar = new d();
            }
        }
        th2 = null;
        f43796g = eVar;
        if (r12 != 0) {
            r rVar = f43794e;
            Logger loggerA = rVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th2);
            rVar.a().log(level, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", r12);
        }
    }

    b() {
    }

    static boolean j(b<?> bVar, Object obj, Object obj2) {
        return f43796g.b(bVar, obj, obj2);
    }

    private boolean k(f fVar, f fVar2) {
        return f43796g.c(this, fVar, fVar2);
    }

    private final f m(f fVar) {
        return f43796g.e(this, fVar);
    }

    private static boolean o() {
        String property = System.getProperty("java.runtime.name", "");
        return property == null || property.contains("Android");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(f fVar, f fVar2) {
        f43796g.f(fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(f fVar, Thread thread) {
        f43796g.g(fVar, thread);
    }

    private void s(f fVar) {
        fVar.f43812a = null;
        while (true) {
            f fVar2 = this.f43799c;
            if (fVar2 == f.f43811c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f43813b;
                if (fVar2.f43812a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f43813b = fVar4;
                    if (fVar3.f43812a == null) {
                    }
                } else if (!k(fVar2, fVar4)) {
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    final V g() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f43797a;
        if ((obj2 != null) && com.google.common.util.concurrent.a.K(obj2)) {
            return (V) com.google.common.util.concurrent.a.F(obj2);
        }
        f fVar = this.f43799c;
        if (fVar != f.f43811c) {
            f fVar2 = new f();
            do {
                fVar2.a(fVar);
                if (k(fVar, fVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            s(fVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f43797a;
                    } while (!((obj != null) & com.google.common.util.concurrent.a.K(obj)));
                    return (V) com.google.common.util.concurrent.a.F(obj);
                }
                fVar = this.f43799c;
            } while (fVar != f.f43811c);
        }
        Object obj3 = this.f43797a;
        Objects.requireNonNull(obj3);
        return (V) com.google.common.util.concurrent.a.F(obj3);
    }

    final V h(long j11, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j11);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f43797a;
        if ((obj != null) && com.google.common.util.concurrent.a.K(obj)) {
            return (V) com.google.common.util.concurrent.a.F(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f43799c;
            if (fVar != f.f43811c) {
                f fVar2 = new f();
                while (true) {
                    fVar2.a(fVar);
                    if (k(fVar, fVar2)) {
                        do {
                            y.a(this, nanos);
                            if (Thread.interrupted()) {
                                s(fVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f43797a;
                            if ((obj2 != null) && com.google.common.util.concurrent.a.K(obj2)) {
                                return (V) com.google.common.util.concurrent.a.F(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        s(fVar2);
                        break;
                    }
                    fVar = this.f43799c;
                    if (fVar == f.f43811c) {
                    }
                }
            }
            Object obj3 = this.f43797a;
            Objects.requireNonNull(obj3);
            return (V) com.google.common.util.concurrent.a.F(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f43797a;
            if ((obj4 != null) && com.google.common.util.concurrent.a.K(obj4)) {
                return (V) com.google.common.util.concurrent.a.F(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j11 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j12 = -nanos;
            long jConvert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
            long nanos2 = j12 - timeUnit.toNanos(jConvert);
            boolean z11 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z11) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z11) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    final boolean i(com.google.common.util.concurrent.a.d dVar, com.google.common.util.concurrent.a.d dVar2) {
        return f43796g.a(this, dVar, dVar2);
    }

    final com.google.common.util.concurrent.a.d l(com.google.common.util.concurrent.a.d dVar) {
        return f43796g.d(this, dVar);
    }

    final com.google.common.util.concurrent.a.d n() {
        return this.f43798b;
    }

    final void r() {
        for (f fVarM = m(f.f43811c); fVarM != null; fVarM = fVarM.f43813b) {
            fVarM.b();
        }
    }

    final Object t() {
        return this.f43797a;
    }
}
