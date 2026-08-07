package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
abstract class d<Params, Progress, Result> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ThreadFactory f8980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f8981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Executor f8982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static f f8983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile Executor f8984j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<Params, Result> f8985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FutureTask<Result> f8986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile g f8987c = g.PENDING;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicBoolean f8988d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicBoolean f8989e = new AtomicBoolean();

    static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f8990a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f8990a.getAndIncrement());
        }
    }

    class b extends h<Params, Result> {
        b() {
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
        @Override // java.util.concurrent.Callable
        public Result call() {
            d.this.f8989e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) d.this.b(this.f8996a);
                Binder.flushPendingCommands();
                d.this.l(result);
                return result;
            } catch (Throwable th2) {
                try {
                    d.this.f8988d.set(true);
                    throw th2;
                } catch (Throwable th3) {
                    d.this.l(result);
                    throw th3;
                }
            }
        }
    }

    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                d.this.m(get());
            } catch (InterruptedException e11) {
                Log.w("AsyncTask", e11);
            } catch (CancellationException unused) {
                d.this.m(null);
            } catch (ExecutionException e12) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e12.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.d$d, reason: collision with other inner class name */
    static /* synthetic */ class C0189d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8993a;

        static {
            int[] iArr = new int[g.values().length];
            f8993a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8993a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class e<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d f8994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Data[] f8995b;

        e(d dVar, Data... dataArr) {
            this.f8994a = dVar;
            this.f8995b = dataArr;
        }
    }

    private static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i11 = message.what;
            if (i11 == 1) {
                eVar.f8994a.d(eVar.f8995b[0]);
            } else {
                if (i11 != 2) {
                    return;
                }
                eVar.f8994a.k(eVar.f8995b);
            }
        }
    }

    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    private static abstract class h<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Params[] f8996a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f8980f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f8981g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f8982h = threadPoolExecutor;
        f8984j = threadPoolExecutor;
    }

    d() {
        b bVar = new b();
        this.f8985a = bVar;
        this.f8986b = new c(bVar);
    }

    private static Handler e() {
        f fVar;
        synchronized (d.class) {
            try {
                if (f8983i == null) {
                    f8983i = new f();
                }
                fVar = f8983i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public final boolean a(boolean z11) {
        this.f8988d.set(true);
        return this.f8986b.cancel(z11);
    }

    protected abstract Result b(Params... paramsArr);

    public final d<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
        if (this.f8987c == g.PENDING) {
            this.f8987c = g.RUNNING;
            j();
            this.f8985a.f8996a = paramsArr;
            executor.execute(this.f8986b);
            return this;
        }
        int i11 = C0189d.f8993a[this.f8987c.ordinal()];
        if (i11 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i11 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    void d(Result result) {
        if (f()) {
            h(result);
        } else {
            i(result);
        }
        this.f8987c = g.FINISHED;
    }

    public final boolean f() {
        return this.f8988d.get();
    }

    protected void g() {
    }

    protected void h(Result result) {
        g();
    }

    protected void i(Result result) {
    }

    protected void j() {
    }

    protected void k(Progress... progressArr) {
    }

    Result l(Result result) {
        e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    void m(Result result) {
        if (this.f8989e.get()) {
            return;
        }
        l(result);
    }
}
