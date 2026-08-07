package s7;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f110411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f110412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a<T> f110413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T f110414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private T f110415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f110416f;

    public interface a<T> {
        void a(T t11, T t12);
    }

    public g(T t11, Looper looper, Looper looper2, j jVar, a<T> aVar) {
        this.f110411a = jVar.c(looper, null);
        this.f110412b = jVar.c(looper2, null);
        this.f110414d = t11;
        this.f110415e = t11;
        this.f110413c = aVar;
    }

    public static /* synthetic */ void a(final g gVar, ou.h hVar) {
        final T t11 = (T) hVar.apply(gVar.f110415e);
        gVar.f110415e = t11;
        gVar.f(new Runnable() { // from class: s7.f
            @Override // java.lang.Runnable
            public final void run() {
                g.c(this.f110409a, t11);
            }
        });
    }

    public static /* synthetic */ void b(g gVar, Object obj) {
        if (gVar.f110416f == 0) {
            gVar.i(obj);
        }
    }

    public static /* synthetic */ void c(g gVar, Object obj) {
        int i11 = gVar.f110416f - 1;
        gVar.f110416f = i11;
        if (i11 == 0) {
            gVar.i(obj);
        }
    }

    private void f(Runnable runnable) {
        if (this.f110412b.f().getThread().isAlive()) {
            this.f110412b.g(runnable);
        }
    }

    private void i(T t11) {
        T t12 = this.f110414d;
        this.f110414d = t11;
        if (t12.equals(t11)) {
            return;
        }
        this.f110413c.a(t12, t11);
    }

    public T d() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.f110412b.f()) {
            return this.f110414d;
        }
        s7.a.h(looperMyLooper == this.f110411a.f());
        return this.f110415e;
    }

    public void e(Runnable runnable) {
        if (this.f110411a.f().getThread().isAlive()) {
            this.f110411a.g(runnable);
        }
    }

    public void g(final T t11) {
        this.f110415e = t11;
        f(new Runnable() { // from class: s7.d
            @Override // java.lang.Runnable
            public final void run() {
                g.b(this.f110401a, t11);
            }
        });
    }

    public void h(ou.h<T, T> hVar, final ou.h<T, T> hVar2) {
        s7.a.h(Looper.myLooper() == this.f110412b.f());
        this.f110416f++;
        e(new Runnable() { // from class: s7.e
            @Override // java.lang.Runnable
            public final void run() {
                g.a(this.f110403a, hVar2);
            }
        });
        i(hVar.apply(this.f110414d));
    }
}
