package com.facebook.datasource;

import android.util.Pair;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T> implements com.facebook.datasource.c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Object> f21534a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T f21537d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f21538e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f21539f = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21536c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f21535b = d.IN_PROGRESS;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Pair<e<T>, Executor>> f21540g = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: com.facebook.datasource.a$a, reason: collision with other inner class name */
    class RunnableC0430a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f21541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f21542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f21543c;

        RunnableC0430a(boolean z11, e eVar, boolean z12) {
            this.f21541a = z11;
            this.f21542b = eVar;
            this.f21543c = z12;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f21541a) {
                this.f21542b.onFailure(a.this);
            } else if (this.f21543c) {
                this.f21542b.onCancellation(a.this);
            } else {
                this.f21542b.onNewResult(a.this);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f21545a;

        b(e eVar) {
            this.f21545a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21545a.onProgressUpdate(a.this);
        }
    }

    public interface c {
    }

    private enum d {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    protected a() {
    }

    public static c f() {
        return null;
    }

    private void j() {
        boolean zG = g();
        boolean zT = t();
        for (Pair<e<T>, Executor> pair : this.f21540g) {
            i((e) pair.first, (Executor) pair.second, zG, zT);
        }
    }

    private synchronized boolean o(Throwable th2, Map<String, Object> map) {
        if (!this.f21536c && this.f21535b == d.IN_PROGRESS) {
            this.f21535b = d.FAILURE;
            this.f21538e = th2;
            this.f21534a = map;
            return true;
        }
        return false;
    }

    private synchronized boolean q(float f11) {
        if (!this.f21536c && this.f21535b == d.IN_PROGRESS) {
            if (f11 < this.f21539f) {
                return false;
            }
            this.f21539f = f11;
            return true;
        }
        return false;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003a). Please report as a decompilation issue!!! */
    private boolean s(T t11, boolean z11) {
        T t12;
        T t13 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f21536c && this.f21535b == d.IN_PROGRESS) {
                            if (z11) {
                                this.f21535b = d.SUCCESS;
                                this.f21539f = 1.0f;
                            }
                            T t14 = this.f21537d;
                            if (t14 != t11) {
                                try {
                                    this.f21537d = t11;
                                    t12 = t14;
                                } catch (Throwable th2) {
                                    th = th2;
                                    t13 = t14;
                                    throw th;
                                }
                            } else {
                                t12 = null;
                            }
                            if (t12 != null) {
                                e(t12);
                            }
                            return true;
                        }
                        if (t11 != null) {
                            e(t11);
                        }
                        return false;
                    } catch (Throwable th3) {
                        t13 = t11;
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            if (t13 != null) {
                e(t13);
            }
            throw th5;
        }
    }

    private synchronized boolean t() {
        return h() && !isFinished();
    }

    @Override // com.facebook.datasource.c
    public synchronized boolean a() {
        return this.f21537d != null;
    }

    @Override // com.facebook.datasource.c
    public synchronized Throwable b() {
        return this.f21538e;
    }

    @Override // com.facebook.datasource.c
    public void c(e<T> eVar, Executor executor) {
        k.g(eVar);
        k.g(executor);
        synchronized (this) {
            try {
                if (this.f21536c) {
                    return;
                }
                if (this.f21535b == d.IN_PROGRESS) {
                    this.f21540g.add(Pair.create(eVar, executor));
                }
                boolean z11 = a() || isFinished() || t();
                if (z11) {
                    i(eVar, executor, g(), t());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facebook.datasource.c
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f21536c) {
                    return false;
                }
                this.f21536c = true;
                T t11 = this.f21537d;
                this.f21537d = null;
                if (t11 != null) {
                    e(t11);
                }
                if (!isFinished()) {
                    j();
                }
                synchronized (this) {
                    this.f21540g.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facebook.datasource.c
    public boolean d() {
        return false;
    }

    protected void e(T t11) {
    }

    public synchronized boolean g() {
        return this.f21535b == d.FAILURE;
    }

    @Override // com.facebook.datasource.c
    public Map<String, Object> getExtras() {
        return this.f21534a;
    }

    @Override // com.facebook.datasource.c
    public synchronized float getProgress() {
        return this.f21539f;
    }

    @Override // com.facebook.datasource.c
    public synchronized T getResult() {
        return this.f21537d;
    }

    public synchronized boolean h() {
        return this.f21536c;
    }

    protected void i(e<T> eVar, Executor executor, boolean z11, boolean z12) {
        RunnableC0430a runnableC0430a = new RunnableC0430a(z11, eVar, z12);
        f();
        executor.execute(runnableC0430a);
    }

    @Override // com.facebook.datasource.c
    public synchronized boolean isFinished() {
        return this.f21535b != d.IN_PROGRESS;
    }

    protected void k() {
        for (Pair<e<T>, Executor> pair : this.f21540g) {
            ((Executor) pair.second).execute(new b((e) pair.first));
        }
    }

    protected void l(Map<String, Object> map) {
        this.f21534a = map;
    }

    protected boolean m(Throwable th2) {
        return n(th2, null);
    }

    protected boolean n(Throwable th2, Map<String, Object> map) {
        boolean zO = o(th2, map);
        if (zO) {
            j();
        }
        return zO;
    }

    protected boolean p(float f11) {
        boolean zQ = q(f11);
        if (zQ) {
            k();
        }
        return zQ;
    }

    protected boolean r(T t11, boolean z11, Map<String, Object> map) {
        l(map);
        boolean zS = s(t11, z11);
        if (zS) {
            j();
        }
        return zS;
    }
}
