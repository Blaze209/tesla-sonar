package ts;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f115059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f115060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b<T> f115061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f115062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f115063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f115064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f115065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f115066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f115067i;

    public interface a<T> {
        void invoke(T t11);
    }

    public interface b<T> {
        void a(T t11, o oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f115068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o.b f115069b = new o.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f115070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f115071d;

        public c(T t11) {
            this.f115068a = t11;
        }

        public void a(int i11, a<T> aVar) {
            if (this.f115071d) {
                return;
            }
            if (i11 != -1) {
                this.f115069b.a(i11);
            }
            this.f115070c = true;
            aVar.invoke(this.f115068a);
        }

        public void b(b<T> bVar) {
            if (this.f115071d || !this.f115070c) {
                return;
            }
            o oVarE = this.f115069b.e();
            this.f115069b = new o.b();
            this.f115070c = false;
            bVar.a(this.f115068a, oVarE);
        }

        public void c(b<T> bVar) {
            this.f115071d = true;
            if (this.f115070c) {
                this.f115070c = false;
                bVar.a(this.f115068a, this.f115069b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f115068a.equals(((c) obj).f115068a);
        }

        public int hashCode() {
            return this.f115068a.hashCode();
        }
    }

    public t(Looper looper, d dVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar, true);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i11, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i11, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator<c<T>> it = this.f115062d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f115061c);
            if (this.f115060b.b(0)) {
                return true;
            }
        }
        return true;
    }

    private void l() {
        if (this.f115067i) {
            ts.a.g(Thread.currentThread() == this.f115060b.f().getThread());
        }
    }

    public void c(T t11) {
        ts.a.e(t11);
        synchronized (this.f115065g) {
            try {
                if (this.f115066h) {
                    return;
                }
                this.f115062d.add(new c<>(t11));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t<T> d(Looper looper, d dVar, b<T> bVar) {
        return new t<>(this.f115062d, looper, dVar, bVar, this.f115067i);
    }

    public t<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.f115059a, bVar);
    }

    public void f() {
        l();
        if (this.f115064f.isEmpty()) {
            return;
        }
        if (!this.f115060b.b(0)) {
            q qVar = this.f115060b;
            qVar.k(qVar.a(0));
        }
        boolean zIsEmpty = this.f115063e.isEmpty();
        this.f115063e.addAll(this.f115064f);
        this.f115064f.clear();
        if (zIsEmpty) {
            while (!this.f115063e.isEmpty()) {
                this.f115063e.peekFirst().run();
                this.f115063e.removeFirst();
            }
        }
    }

    public void h(final int i11, final a<T> aVar) {
        l();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f115062d);
        this.f115064f.add(new Runnable() { // from class: ts.s
            @Override // java.lang.Runnable
            public final void run() {
                t.a(copyOnWriteArraySet, i11, aVar);
            }
        });
    }

    public void i() {
        l();
        synchronized (this.f115065g) {
            this.f115066h = true;
        }
        Iterator<c<T>> it = this.f115062d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f115061c);
        }
        this.f115062d.clear();
    }

    public void j(T t11) {
        l();
        for (c<T> cVar : this.f115062d) {
            if (cVar.f115068a.equals(t11)) {
                cVar.c(this.f115061c);
                this.f115062d.remove(cVar);
            }
        }
    }

    public void k(int i11, a<T> aVar) {
        h(i11, aVar);
        f();
    }

    private t(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d dVar, b<T> bVar, boolean z11) {
        this.f115059a = dVar;
        this.f115062d = copyOnWriteArraySet;
        this.f115061c = bVar;
        this.f115065g = new Object();
        this.f115063e = new ArrayDeque<>();
        this.f115064f = new ArrayDeque<>();
        this.f115060b = dVar.c(looper, new Handler.Callback() { // from class: ts.r
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f115055a.g(message);
            }
        });
        this.f115067i = z11;
    }
}
