package s7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f110474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f110475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b<T> f110476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f110477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f110478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f110479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f110480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f110481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f110482i;

    public interface a<T> {
        void invoke(T t11);
    }

    public interface b<T> {
        void a(T t11, p7.q qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f110483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p7.q.b f110484b = new p7.q.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f110485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f110486d;

        public c(T t11) {
            this.f110483a = t11;
        }

        public void a(int i11, a<T> aVar) {
            if (this.f110486d) {
                return;
            }
            if (i11 != -1) {
                this.f110484b.a(i11);
            }
            this.f110485c = true;
            aVar.invoke(this.f110483a);
        }

        public void b(b<T> bVar) {
            if (this.f110486d || !this.f110485c) {
                return;
            }
            p7.q qVarE = this.f110484b.e();
            this.f110484b = new p7.q.b();
            this.f110485c = false;
            bVar.a(this.f110483a, qVarE);
        }

        public void c(b<T> bVar) {
            this.f110486d = true;
            if (this.f110485c) {
                this.f110485c = false;
                bVar.a(this.f110483a, this.f110484b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f110483a.equals(((c) obj).f110483a);
        }

        public int hashCode() {
            return this.f110483a.hashCode();
        }
    }

    public s(Looper looper, j jVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, jVar, bVar, true);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i11, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i11, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator<c<T>> it = this.f110477d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f110476c);
            if (this.f110475b.b(1)) {
                break;
            }
        }
        return true;
    }

    private void l() {
        if (this.f110482i) {
            s7.a.h(Thread.currentThread() == this.f110475b.f().getThread());
        }
    }

    public void c(T t11) {
        s7.a.f(t11);
        synchronized (this.f110480g) {
            try {
                if (this.f110481h) {
                    return;
                }
                this.f110477d.add(new c<>(t11));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public s<T> d(Looper looper, j jVar, b<T> bVar) {
        return new s<>(this.f110477d, looper, jVar, bVar, this.f110482i);
    }

    public s<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.f110474a, bVar);
    }

    public void f() {
        l();
        if (this.f110479f.isEmpty()) {
            return;
        }
        if (!this.f110475b.b(1)) {
            p pVar = this.f110475b;
            pVar.l(pVar.a(1));
        }
        boolean zIsEmpty = this.f110478e.isEmpty();
        this.f110478e.addAll(this.f110479f);
        this.f110479f.clear();
        if (zIsEmpty) {
            while (!this.f110478e.isEmpty()) {
                this.f110478e.peekFirst().run();
                this.f110478e.removeFirst();
            }
        }
    }

    public void h(final int i11, final a<T> aVar) {
        l();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f110477d);
        this.f110479f.add(new Runnable() { // from class: s7.r
            @Override // java.lang.Runnable
            public final void run() {
                s.a(copyOnWriteArraySet, i11, aVar);
            }
        });
    }

    public void i() {
        l();
        synchronized (this.f110480g) {
            this.f110481h = true;
        }
        Iterator<c<T>> it = this.f110477d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f110476c);
        }
        this.f110477d.clear();
    }

    public void j(T t11) {
        l();
        for (c<T> cVar : this.f110477d) {
            if (cVar.f110483a.equals(t11)) {
                cVar.c(this.f110476c);
                this.f110477d.remove(cVar);
            }
        }
    }

    public void k(int i11, a<T> aVar) {
        h(i11, aVar);
        f();
    }

    private s(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, j jVar, b<T> bVar, boolean z11) {
        this.f110474a = jVar;
        this.f110477d = copyOnWriteArraySet;
        this.f110476c = bVar;
        this.f110480g = new Object();
        this.f110478e = new ArrayDeque<>();
        this.f110479f = new ArrayDeque<>();
        this.f110475b = jVar.c(looper, new Handler.Callback() { // from class: s7.q
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f110453a.g(message);
            }
        });
        this.f110482i = z11;
    }
}
