package ac;

import bolts.ExecutorException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public class e<TResult> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ExecutorService f930i = ac.b.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Executor f931j = ac.b.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Executor f932k = ac.a.c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static e<?> f933l = new e<>((Object) null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static e<Boolean> f934m = new e<>(Boolean.TRUE);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static e<Boolean> f935n = new e<>(Boolean.FALSE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static e<?> f936o = new e<>(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TResult f940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g f943g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f937a = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<ac.d<TResult, Void>> f944h = new ArrayList();

    class a implements ac.d<TResult, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ac.d f946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f947c;

        a(f fVar, ac.d dVar, Executor executor, ac.c cVar) {
            this.f945a = fVar;
            this.f946b = dVar;
            this.f947c = executor;
        }

        @Override // ac.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(e<TResult> eVar) {
            e.d(this.f945a, this.f946b, eVar, this.f947c, null);
            return null;
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ac.d f950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f951c;

        b(ac.c cVar, f fVar, ac.d dVar, e eVar) {
            this.f949a = fVar;
            this.f950b = dVar;
            this.f951c = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f949a.d(this.f950b.a(this.f951c));
            } catch (CancellationException unused) {
                this.f949a.b();
            } catch (Exception e11) {
                this.f949a.c(e11);
            }
        }
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f953b;

        c(ac.c cVar, f fVar, Callable callable) {
            this.f952a = fVar;
            this.f953b = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f952a.d(this.f953b.call());
            } catch (CancellationException unused) {
                this.f952a.b();
            } catch (Exception e11) {
                this.f952a.c(e11);
            }
        }
    }

    public interface d {
    }

    e() {
    }

    public static <TResult> e<TResult> b(Callable<TResult> callable, Executor executor) {
        return c(callable, executor, null);
    }

    public static <TResult> e<TResult> c(Callable<TResult> callable, Executor executor, ac.c cVar) {
        f fVar = new f();
        try {
            executor.execute(new c(cVar, fVar, callable));
        } catch (Exception e11) {
            fVar.c(new ExecutorException(e11));
        }
        return fVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void d(f<TContinuationResult> fVar, ac.d<TResult, TContinuationResult> dVar, e<TResult> eVar, Executor executor, ac.c cVar) {
        try {
            executor.execute(new b(cVar, fVar, dVar, eVar));
        } catch (Exception e11) {
            fVar.c(new ExecutorException(e11));
        }
    }

    public static <TResult> e<TResult> g(Exception exc) {
        f fVar = new f();
        fVar.c(exc);
        return fVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TResult> e<TResult> h(TResult tresult) {
        if (tresult == 0) {
            return (e<TResult>) f933l;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (e<TResult>) f934m : (e<TResult>) f935n;
        }
        f fVar = new f();
        fVar.d(tresult);
        return fVar.a();
    }

    public static d k() {
        return null;
    }

    private void o() {
        synchronized (this.f937a) {
            Iterator<ac.d<TResult, Void>> it = this.f944h.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(this);
                } catch (RuntimeException e11) {
                    throw e11;
                } catch (Exception e12) {
                    throw new RuntimeException(e12);
                }
            }
            this.f944h = null;
        }
    }

    public <TContinuationResult> e<TContinuationResult> e(ac.d<TResult, TContinuationResult> dVar) {
        return f(dVar, f931j, null);
    }

    public <TContinuationResult> e<TContinuationResult> f(ac.d<TResult, TContinuationResult> dVar, Executor executor, ac.c cVar) throws Throwable {
        ac.d<TResult, TContinuationResult> dVar2;
        Executor executor2;
        ac.c cVar2;
        f fVar = new f();
        synchronized (this.f937a) {
            try {
                try {
                    boolean zM = m();
                    if (zM) {
                        dVar2 = dVar;
                        executor2 = executor;
                        cVar2 = cVar;
                    } else {
                        dVar2 = dVar;
                        executor2 = executor;
                        cVar2 = cVar;
                        this.f944h.add(new a(fVar, dVar2, executor2, cVar2));
                    }
                    if (zM) {
                        d(fVar, dVar2, this, executor2, cVar2);
                    }
                    return fVar.a();
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public Exception i() {
        Exception exc;
        synchronized (this.f937a) {
            try {
                if (this.f941e != null) {
                    this.f942f = true;
                }
                exc = this.f941e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return exc;
    }

    public TResult j() {
        TResult tresult;
        synchronized (this.f937a) {
            tresult = this.f940d;
        }
        return tresult;
    }

    public boolean l() {
        boolean z11;
        synchronized (this.f937a) {
            z11 = this.f939c;
        }
        return z11;
    }

    public boolean m() {
        boolean z11;
        synchronized (this.f937a) {
            z11 = this.f938b;
        }
        return z11;
    }

    public boolean n() {
        boolean z11;
        synchronized (this.f937a) {
            z11 = i() != null;
        }
        return z11;
    }

    boolean p() {
        synchronized (this.f937a) {
            try {
                if (this.f938b) {
                    return false;
                }
                this.f938b = true;
                this.f939c = true;
                this.f937a.notifyAll();
                o();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean q(Exception exc) {
        synchronized (this.f937a) {
            try {
                if (this.f938b) {
                    return false;
                }
                this.f938b = true;
                this.f941e = exc;
                this.f942f = false;
                this.f937a.notifyAll();
                o();
                if (!this.f942f) {
                    k();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean r(TResult tresult) {
        synchronized (this.f937a) {
            try {
                if (this.f938b) {
                    return false;
                }
                this.f938b = true;
                this.f940d = tresult;
                this.f937a.notifyAll();
                o();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private e(TResult tresult) {
        r(tresult);
    }

    private e(boolean z11) {
        if (z11) {
            p();
        } else {
            r(null);
        }
    }
}
