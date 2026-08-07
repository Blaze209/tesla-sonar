package androidx.media3.session;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class re {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12215b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f12217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f12218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12219f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f12214a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.collection.a<Integer, a<?>> f12216c = new androidx.collection.a<>();

    public static final class a<T> extends com.google.common.util.concurrent.a<T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f12220h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final T f12221i;

        private a(int i11, T t11) {
            this.f12220h = i11;
            this.f12221i = t11;
        }

        public static <T> a<T> Q(int i11, T t11) {
            return new a<>(i11, t11);
        }

        @Override // com.google.common.util.concurrent.a
        public boolean M(T t11) {
            return super.M(t11);
        }

        public T R() {
            return this.f12221i;
        }

        public int S() {
            return this.f12220h;
        }

        public void T() {
            M(this.f12221i);
        }
    }

    public <T> a<T> a(T t11) {
        a<T> aVarQ;
        synchronized (this.f12214a) {
            try {
                int iC = c();
                aVarQ = a.Q(iC, t11);
                if (this.f12219f) {
                    aVarQ.T();
                } else {
                    this.f12216c.put(Integer.valueOf(iC), aVarQ);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVarQ;
    }

    public void b(long j11, Runnable runnable) {
        synchronized (this.f12214a) {
            try {
                Handler handlerC = s7.q0.C();
                this.f12218e = handlerC;
                this.f12217d = runnable;
                if (this.f12216c.isEmpty()) {
                    d();
                } else {
                    handlerC.postDelayed(new Runnable() { // from class: androidx.media3.session.qe
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12173a.d();
                        }
                    }, j11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int c() {
        int i11;
        synchronized (this.f12214a) {
            i11 = this.f12215b;
            this.f12215b = i11 + 1;
        }
        return i11;
    }

    public void d() {
        ArrayList arrayList;
        synchronized (this.f12214a) {
            try {
                this.f12219f = true;
                arrayList = new ArrayList(this.f12216c.values());
                this.f12216c.clear();
                if (this.f12217d != null) {
                    ((Handler) s7.a.f(this.f12218e)).post(this.f12217d);
                    this.f12217d = null;
                    this.f12218e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).T();
        }
    }

    public <T> void e(int i11, T t11) {
        synchronized (this.f12214a) {
            try {
                a<?> aVarRemove = this.f12216c.remove(Integer.valueOf(i11));
                if (aVarRemove != null) {
                    if (aVarRemove.R().getClass() == t11.getClass()) {
                        aVarRemove.M(t11);
                    } else {
                        s7.t.i("SequencedFutureManager", "Type mismatch, expected " + aVarRemove.R().getClass() + ", but was " + t11.getClass());
                    }
                }
                if (this.f12217d != null && this.f12216c.isEmpty()) {
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
