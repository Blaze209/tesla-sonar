package ko;

import com.facebook.react.runtime.internal.bolts.ExecutorException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class c<TResult> implements qn.a<TResult> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Executor f86377i = ko.b.IMMEDIATE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Executor f86378j = ko.b.UI_THREAD;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static c<?> f86379k = new c<>((Object) null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static c<Boolean> f86380l = new c<>(Boolean.TRUE);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static c<Boolean> f86381m = new c<>(Boolean.FALSE);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static c<?> f86382n = new c<>(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f86384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f86385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TResult f86386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f86387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f86388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ko.e f86389g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f86383a = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<ko.a<TResult, Void>> f86390h = new ArrayList();

    class a implements ko.a<TResult, c<Void>> {
        a() {
        }

        @Override // ko.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c<Void> a(c<TResult> cVar) {
            if (cVar.q()) {
                return c.e();
            }
            return cVar.s() ? c.l(cVar.n()) : c.m(null);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ko.d f86392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f86393b;

        b(ko.d dVar, Callable callable) {
            this.f86392a = dVar;
            this.f86393b = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f86392a.d(this.f86393b.call());
            } catch (CancellationException unused) {
                this.f86392a.b();
            } catch (Exception e11) {
                this.f86392a.c(e11);
            }
        }
    }

    /* JADX INFO: renamed from: ko.c$c, reason: collision with other inner class name */
    class C1855c implements ko.a<TResult, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ko.d f86394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ko.a f86395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f86396c;

        C1855c(ko.d dVar, ko.a aVar, Executor executor) {
            this.f86394a = dVar;
            this.f86395b = aVar;
            this.f86396c = executor;
        }

        @Override // ko.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(c<TResult> cVar) {
            c.g(this.f86394a, this.f86395b, cVar, this.f86396c);
            return null;
        }
    }

    class d implements ko.a<TResult, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ko.d f86398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ko.a f86399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f86400c;

        d(ko.d dVar, ko.a aVar, Executor executor) {
            this.f86398a = dVar;
            this.f86399b = aVar;
            this.f86400c = executor;
        }

        @Override // ko.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(c<TResult> cVar) {
            c.f(this.f86398a, this.f86399b, cVar, this.f86400c);
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
    class e<TContinuationResult> implements ko.a<TResult, c<TContinuationResult>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ko.a f86402a;

        e(ko.a aVar) {
            this.f86402a = aVar;
        }

        @Override // ko.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c<TContinuationResult> a(c<TResult> cVar) {
            if (cVar.s()) {
                return c.l(cVar.n());
            }
            return cVar.q() ? c.e() : cVar.h(this.f86402a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
    class f<TContinuationResult> implements ko.a<TResult, c<TContinuationResult>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ko.a f86404a;

        f(ko.a aVar) {
            this.f86404a = aVar;
        }

        @Override // ko.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c<TContinuationResult> a(c<TResult> cVar) {
            if (cVar.s()) {
                return c.l(cVar.n());
            }
            return cVar.q() ? c.e() : cVar.j(this.f86404a);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ko.a f86406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f86407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ko.d f86408c;

        g(ko.a aVar, c cVar, ko.d dVar) {
            this.f86406a = aVar;
            this.f86407b = cVar;
            this.f86408c = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f86408c.d(this.f86406a.a(this.f86407b));
            } catch (CancellationException unused) {
                this.f86408c.b();
            } catch (Exception e11) {
                this.f86408c.c(e11);
            }
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ko.a f86409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f86410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ko.d f86411c;

        /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
        class a<TContinuationResult> implements ko.a<TContinuationResult, Void> {
            a() {
            }

            @Override // ko.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void a(c<TContinuationResult> cVar) {
                if (cVar.q()) {
                    h.this.f86411c.b();
                    return null;
                }
                if (cVar.s()) {
                    h.this.f86411c.c(cVar.n());
                    return null;
                }
                h.this.f86411c.d(cVar.o());
                return null;
            }
        }

        h(ko.a aVar, c cVar, ko.d dVar) {
            this.f86409a = aVar;
            this.f86410b = cVar;
            this.f86411c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c cVar = (c) this.f86409a.a(this.f86410b);
                if (cVar == null) {
                    this.f86411c.d(null);
                } else {
                    cVar.h(new a());
                }
            } catch (CancellationException unused) {
                this.f86411c.b();
            } catch (Exception e11) {
                this.f86411c.c(e11);
            }
        }
    }

    public interface i {
    }

    c() {
    }

    public static <TResult> c<TResult> c(Callable<TResult> callable) {
        return d(callable, f86377i);
    }

    public static <TResult> c<TResult> d(Callable<TResult> callable, Executor executor) {
        ko.d dVar = new ko.d();
        try {
            executor.execute(new b(dVar, callable));
        } catch (Exception e11) {
            dVar.c(new ExecutorException(e11));
        }
        return dVar.a();
    }

    public static <TResult> c<TResult> e() {
        return (c<TResult>) f86382n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void f(ko.d<TContinuationResult> dVar, ko.a<TResult, c<TContinuationResult>> aVar, c<TResult> cVar, Executor executor) {
        try {
            executor.execute(new h(aVar, cVar, dVar));
        } catch (Exception e11) {
            dVar.c(new ExecutorException(e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void g(ko.d<TContinuationResult> dVar, ko.a<TResult, TContinuationResult> aVar, c<TResult> cVar, Executor executor) {
        try {
            executor.execute(new g(aVar, cVar, dVar));
        } catch (Exception e11) {
            dVar.c(new ExecutorException(e11));
        }
    }

    public static <TResult> c<TResult> l(Exception exc) {
        ko.d dVar = new ko.d();
        dVar.c(exc);
        return dVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TResult> c<TResult> m(TResult tresult) {
        if (tresult == 0) {
            return (c<TResult>) f86379k;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (c<TResult>) f86380l : (c<TResult>) f86381m;
        }
        ko.d dVar = new ko.d();
        dVar.d(tresult);
        return dVar.a();
    }

    public static i p() {
        return null;
    }

    private void w() {
        synchronized (this.f86383a) {
            Iterator<ko.a<TResult, Void>> it = this.f86390h.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(this);
                } catch (RuntimeException e11) {
                    throw e11;
                } catch (Exception e12) {
                    throw new RuntimeException(e12);
                }
            }
            this.f86390h = null;
        }
    }

    public <TContinuationResult> c<TContinuationResult> h(ko.a<TResult, TContinuationResult> aVar) {
        return i(aVar, f86377i);
    }

    public <TContinuationResult> c<TContinuationResult> i(ko.a<TResult, TContinuationResult> aVar, Executor executor) {
        boolean zR;
        ko.d dVar = new ko.d();
        synchronized (this.f86383a) {
            try {
                zR = r();
                if (!zR) {
                    this.f86390h.add(new C1855c(dVar, aVar, executor));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zR) {
            g(dVar, aVar, this, executor);
        }
        return dVar.a();
    }

    public <TContinuationResult> c<TContinuationResult> j(ko.a<TResult, c<TContinuationResult>> aVar) {
        return k(aVar, f86377i);
    }

    public <TContinuationResult> c<TContinuationResult> k(ko.a<TResult, c<TContinuationResult>> aVar, Executor executor) {
        boolean zR;
        ko.d dVar = new ko.d();
        synchronized (this.f86383a) {
            try {
                zR = r();
                if (!zR) {
                    this.f86390h.add(new d(dVar, aVar, executor));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zR) {
            f(dVar, aVar, this, executor);
        }
        return dVar.a();
    }

    public Exception n() {
        Exception exc;
        synchronized (this.f86383a) {
            try {
                if (this.f86387e != null) {
                    this.f86388f = true;
                }
                exc = this.f86387e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return exc;
    }

    public TResult o() {
        TResult tresult;
        synchronized (this.f86383a) {
            tresult = this.f86386d;
        }
        return tresult;
    }

    public boolean q() {
        boolean z11;
        synchronized (this.f86383a) {
            z11 = this.f86385c;
        }
        return z11;
    }

    public boolean r() {
        boolean z11;
        synchronized (this.f86383a) {
            z11 = this.f86384b;
        }
        return z11;
    }

    public boolean s() {
        boolean z11;
        synchronized (this.f86383a) {
            z11 = n() != null;
        }
        return z11;
    }

    public c<Void> t() {
        return j(new a());
    }

    public <TContinuationResult> c<TContinuationResult> u(ko.a<TResult, TContinuationResult> aVar, Executor executor) {
        return k(new e(aVar), executor);
    }

    public <TContinuationResult> c<TContinuationResult> v(ko.a<TResult, c<TContinuationResult>> aVar, Executor executor) {
        return k(new f(aVar), executor);
    }

    boolean x() {
        synchronized (this.f86383a) {
            try {
                if (this.f86384b) {
                    return false;
                }
                this.f86384b = true;
                this.f86385c = true;
                this.f86383a.notifyAll();
                w();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean y(Exception exc) {
        synchronized (this.f86383a) {
            try {
                if (this.f86384b) {
                    return false;
                }
                this.f86384b = true;
                this.f86387e = exc;
                this.f86388f = false;
                this.f86383a.notifyAll();
                w();
                if (!this.f86388f) {
                    p();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean z(TResult tresult) {
        synchronized (this.f86383a) {
            try {
                if (this.f86384b) {
                    return false;
                }
                this.f86384b = true;
                this.f86386d = tresult;
                this.f86383a.notifyAll();
                w();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private c(TResult tresult) {
        z(tresult);
    }

    private c(boolean z11) {
        if (z11) {
            x();
        } else {
            z(null);
        }
    }
}
