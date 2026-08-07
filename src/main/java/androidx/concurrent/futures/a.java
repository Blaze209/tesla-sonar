package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import com.google.common.util.concurrent.s;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<V> implements s<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f6423d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f6424e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f6425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f6426g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f6427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile e f6428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile i f6429c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f6430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f6431d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f6432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f6433b;

        static {
            if (a.f6423d) {
                f6431d = null;
                f6430c = null;
            } else {
                f6431d = new c(false, null);
                f6430c = new c(true, null);
            }
        }

        c(boolean z11, Throwable th2) {
            this.f6432a = z11;
            this.f6433b = th2;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f6434b = new d(new C0145a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f6435a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C0145a extends Throwable {
            C0145a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f6435a = (Throwable) a.e(th2);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f6436d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f6437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f6438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f6439c;

        e(Runnable runnable, Executor executor) {
            this.f6437a = runnable;
            this.f6438b = executor;
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f6440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f6441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f6442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f6443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f6444e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f6440a = atomicReferenceFieldUpdater;
            this.f6441b = atomicReferenceFieldUpdater2;
            this.f6442c = atomicReferenceFieldUpdater3;
            this.f6443d = atomicReferenceFieldUpdater4;
            this.f6444e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f6443d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f6444e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f6442c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f6441b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f6440a.lazySet(iVar, thread);
        }
    }

    private static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<V> f6445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final s<? extends V> f6446b;
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f6428b != eVar) {
                        return false;
                    }
                    aVar.f6428b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f6427a != obj) {
                        return false;
                    }
                    aVar.f6427a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f6429c != iVar) {
                        return false;
                    }
                    aVar.f6429c = iVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f6449b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f6448a = thread;
        }
    }

    private static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i f6447c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f6448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile i f6449b;

        i(boolean z11) {
        }

        void a(i iVar) {
            a.f6425f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f6448a;
            if (thread != null) {
                this.f6448a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f6425f.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f6425f = hVar;
        if (th != null) {
            f6424e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f6426g = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb2) {
        try {
            Object objK = k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(r(objK));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e12) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e12.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException d(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @NonNull
    static <T> T e(T t11) {
        t11.getClass();
        return t11;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f6428b;
        } while (!f6425f.a(this, eVar2, e.f6436d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f6439c;
            eVar4.f6439c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static void g(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.c();
            e eVarF = aVar.f(eVar);
            while (eVarF != null) {
                eVar = eVarF.f6439c;
                Runnable runnable = eVarF.f6437a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f6445a;
                    if (aVar.f6427a == gVar) {
                        if (f6425f.b(aVar, gVar, j(gVar.f6446b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, eVarF.f6438b);
                }
                eVarF = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e11) {
            f6424e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V i(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f6433b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f6435a);
        }
        if (obj == f6426g) {
            return null;
        }
        return obj;
    }

    static Object j(s<?> sVar) {
        if (sVar instanceof a) {
            Object obj = ((a) sVar).f6427a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f6432a) {
                return cVar.f6433b != null ? new c(false, cVar.f6433b) : c.f6431d;
            }
            return obj;
        }
        boolean zIsCancelled = sVar.isCancelled();
        if ((!f6423d) && zIsCancelled) {
            return c.f6431d;
        }
        try {
            Object objK = k(sVar);
            return objK == null ? f6426g : objK;
        } catch (CancellationException e11) {
            if (zIsCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + sVar, e11));
        } catch (ExecutionException e12) {
            return new d(e12.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    static <V> V k(Future<V> future) {
        V v11;
        boolean z11 = false;
        while (true) {
            try {
                v11 = future.get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return v11;
    }

    private void n() {
        i iVar;
        do {
            iVar = this.f6429c;
        } while (!f6425f.c(this, iVar, i.f6447c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f6449b;
        }
    }

    private void o(i iVar) {
        iVar.f6448a = null;
        while (true) {
            i iVar2 = this.f6429c;
            if (iVar2 == i.f6447c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f6449b;
                if (iVar2.f6448a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f6449b = iVar4;
                    if (iVar3.f6448a == null) {
                    }
                } else if (!f6425f.c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String r(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.s
    public final void b(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f6428b;
        if (eVar != e.f6436d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f6439c = eVar;
                if (f6425f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f6428b;
                }
            } while (eVar != e.f6436d);
        }
        h(runnable, executor);
    }

    protected void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        c cVar;
        Object obj = this.f6427a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f6423d) {
            cVar = new c(z11, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z11 ? c.f6430c : c.f6431d;
        }
        a<V> aVar = this;
        boolean z12 = false;
        while (true) {
            if (f6425f.b(aVar, obj, cVar)) {
                if (z11) {
                    aVar.l();
                }
                g(aVar);
                if (obj instanceof g) {
                    s<? extends V> sVar = ((g) obj).f6446b;
                    if (sVar instanceof a) {
                        aVar = (a) sVar;
                        obj = aVar.f6427a;
                        if ((obj == null) | (obj instanceof g)) {
                            z12 = true;
                        }
                    } else {
                        sVar.cancel(z11);
                    }
                }
                return true;
            }
            obj = aVar.f6427a;
            if (!(obj instanceof g)) {
                return z12;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j11, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j11);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f6427a;
        if ((obj != null) && (!(obj instanceof g))) {
            return i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f6429c;
            if (iVar != i.f6447c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.a(iVar);
                    if (f6425f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f6427a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                        break;
                    }
                    iVar = this.f6429c;
                    if (iVar == i.f6447c) {
                    }
                }
            }
            return i(this.f6427a);
        }
        while (nanos > 0) {
            Object obj3 = this.f6427a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return i(obj3);
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6427a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f6427a;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String m() {
        Object obj = this.f6427a;
        if (obj instanceof g) {
            return "setFuture=[" + r(((g) obj).f6446b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean p(V v11) {
        if (v11 == null) {
            v11 = (V) f6426g;
        }
        if (!f6425f.b(this, null, v11)) {
            return false;
        }
        g(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(Throwable th2) {
        if (!f6425f.b(this, null, new d((Throwable) e(th2)))) {
            return false;
        }
        g(this);
        return true;
    }

    protected final boolean s() {
        Object obj = this.f6427a;
        return (obj instanceof c) && ((c) obj).f6432a;
    }

    public String toString() {
        String strM;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strM = m();
            } catch (RuntimeException e11) {
                strM = "Exception thrown from implementation: " + e11.getClass();
            }
            if (strM != null && !strM.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strM);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f6427a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f6429c;
            if (iVar != i.f6447c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f6425f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f6427a;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f6429c;
                } while (iVar != i.f6447c);
            }
            return i(this.f6427a);
        }
        throw new InterruptedException();
    }
}
