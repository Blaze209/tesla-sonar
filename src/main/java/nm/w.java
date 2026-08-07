package nm;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class w<K, V> implements n<K, V>, x<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n.b<K> f95189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final m<K, n.a<K, V>> f95190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final m<K, n.a<K, V>> f95191c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0<V> f95193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x.a f95194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final pk.n<y> f95195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected y f95196h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f95198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f95199k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map<Bitmap, Object> f95192d = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f95197i = SystemClock.uptimeMillis();

    class a implements d0<n.a<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d0 f95200a;

        a(d0 d0Var) {
            this.f95200a = d0Var;
        }

        @Override // nm.d0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(n.a<K, V> aVar) {
            return w.this.f95198j ? aVar.f95179g : this.f95200a.a(aVar.f95174b.H());
        }
    }

    class b implements tk.h<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n.a f95202a;

        b(n.a aVar) {
            this.f95202a = aVar;
        }

        @Override // tk.h
        public void a(V v11) {
            w.this.z(this.f95202a);
        }
    }

    public w(d0<V> d0Var, x.a aVar, pk.n<y> nVar, n.b<K> bVar, boolean z11, boolean z12) {
        this.f95193e = d0Var;
        this.f95190b = new m<>(B(d0Var));
        this.f95191c = new m<>(B(d0Var));
        this.f95194f = aVar;
        this.f95195g = nVar;
        this.f95196h = (y) pk.k.h(nVar.get(), "mMemoryCacheParamsSupplier returned null");
        this.f95189a = bVar;
        this.f95198j = z11;
        this.f95199k = z12;
    }

    private synchronized ArrayList<n.a<K, V>> A(int i11, int i12) {
        int iMax = Math.max(i11, 0);
        int iMax2 = Math.max(i12, 0);
        if (this.f95190b.c() <= iMax && this.f95190b.f() <= iMax2) {
            return null;
        }
        ArrayList<n.a<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.f95190b.c() <= iMax && this.f95190b.f() <= iMax2) {
                break;
            }
            K kD = this.f95190b.d();
            if (kD == null) {
                if (!this.f95199k) {
                    throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.f95190b.c()), Integer.valueOf(this.f95190b.f())));
                }
                this.f95190b.k();
                break;
            }
            this.f95190b.i(kD);
            arrayList.add(this.f95191c.i(kD));
        }
        return arrayList;
    }

    private d0<n.a<K, V>> B(d0<V> d0Var) {
        return new a(d0Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    private synchronized boolean j(int i11) {
        boolean z11;
        if (i11 <= this.f95196h.maxCacheEntrySize) {
            z11 = l() <= this.f95196h.maxCacheEntries - 1 && m() <= this.f95196h.maxCacheSize - i11;
        }
        return z11;
    }

    private synchronized void k(n.a<K, V> aVar) {
        pk.k.g(aVar);
        pk.k.i(aVar.f95175c > 0);
        aVar.f95175c--;
    }

    private synchronized void n(n.a<K, V> aVar) {
        pk.k.g(aVar);
        pk.k.i(!aVar.f95176d);
        aVar.f95175c++;
    }

    private synchronized void o(n.a<K, V> aVar) {
        pk.k.g(aVar);
        pk.k.i(!aVar.f95176d);
        aVar.f95176d = true;
    }

    private synchronized void p(ArrayList<n.a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<n.a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                o(it.next());
            }
        }
    }

    private synchronized boolean q(n.a<K, V> aVar) {
        if (aVar.f95176d || aVar.f95175c != 0) {
            return false;
        }
        this.f95190b.h(aVar.f95173a, aVar);
        return true;
    }

    private void r(ArrayList<n.a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<n.a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                tk.a.C(y(it.next()));
            }
        }
    }

    private static <K, V> void t(n.a<K, V> aVar) {
        n.b<K> bVar;
        if (aVar == null || (bVar = aVar.f95177e) == null) {
            return;
        }
        bVar.a(aVar.f95173a, true);
    }

    private void u(ArrayList<n.a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<n.a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                v(it.next());
            }
        }
    }

    private static <K, V> void v(n.a<K, V> aVar) {
        n.b<K> bVar;
        if (aVar == null || (bVar = aVar.f95177e) == null) {
            return;
        }
        bVar.a(aVar.f95173a, false);
    }

    private synchronized void w() {
        if (this.f95197i + this.f95196h.paramsCheckIntervalMs > SystemClock.uptimeMillis()) {
            return;
        }
        this.f95197i = SystemClock.uptimeMillis();
        this.f95196h = (y) pk.k.h(this.f95195g.get(), "mMemoryCacheParamsSupplier returned null");
    }

    private synchronized tk.a<V> x(n.a<K, V> aVar) {
        n(aVar);
        return tk.a.k0(aVar.f95174b.H(), new b(aVar));
    }

    private synchronized tk.a<V> y(n.a<K, V> aVar) {
        pk.k.g(aVar);
        return (aVar.f95176d && aVar.f95175c == 0) ? aVar.f95174b : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(n.a<K, V> aVar) {
        boolean zQ;
        tk.a<V> aVarY;
        pk.k.g(aVar);
        synchronized (this) {
            k(aVar);
            zQ = q(aVar);
            aVarY = y(aVar);
        }
        tk.a.C(aVarY);
        if (!zQ) {
            aVar = null;
        }
        t(aVar);
        w();
        s();
    }

    @Override // nm.x
    public void b(K k11) {
        pk.k.g(k11);
        synchronized (this) {
            try {
                n.a<K, V> aVarI = this.f95190b.i(k11);
                if (aVarI != null) {
                    this.f95190b.h(k11, aVarI);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nm.x
    public tk.a<V> c(K k11, tk.a<V> aVar) {
        return g(k11, aVar, this.f95189a);
    }

    @Override // nm.x
    public synchronized boolean contains(K k11) {
        return this.f95191c.a(k11);
    }

    @Override // nm.n
    public tk.a<V> d(K k11) {
        n.a<K, V> aVarI;
        boolean z11;
        tk.a<V> aVar;
        pk.k.g(k11);
        synchronized (this) {
            try {
                aVarI = this.f95190b.i(k11);
                z11 = false;
                if (aVarI != null) {
                    n.a<K, V> aVarI2 = this.f95191c.i(k11);
                    pk.k.g(aVarI2);
                    pk.k.i(aVarI2.f95175c == 0);
                    aVar = aVarI2.f95174b;
                    z11 = true;
                } else {
                    aVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            v(aVarI);
        }
        return aVar;
    }

    @Override // nm.x
    public int e(pk.l<K> lVar) {
        ArrayList<n.a<K, V>> arrayListJ;
        ArrayList<n.a<K, V>> arrayListJ2;
        synchronized (this) {
            arrayListJ = this.f95190b.j(lVar);
            arrayListJ2 = this.f95191c.j(lVar);
            p(arrayListJ2);
        }
        r(arrayListJ2);
        u(arrayListJ);
        w();
        s();
        return arrayListJ2.size();
    }

    @Override // nm.x
    public synchronized boolean f(pk.l<K> lVar) {
        return !this.f95191c.e(lVar).isEmpty();
    }

    @Override // nm.n
    public tk.a<V> g(K k11, tk.a<V> aVar, n.b<K> bVar) {
        n.a<K, V> aVarI;
        tk.a<V> aVarX;
        tk.a<V> aVarY;
        pk.k.g(k11);
        pk.k.g(aVar);
        w();
        synchronized (this) {
            try {
                aVarI = this.f95190b.i(k11);
                n.a<K, V> aVarI2 = this.f95191c.i(k11);
                aVarX = null;
                if (aVarI2 != null) {
                    o(aVarI2);
                    aVarY = y(aVarI2);
                } else {
                    aVarY = null;
                }
                int iA = this.f95193e.a(aVar.H());
                if (j(iA)) {
                    n.a<K, V> aVarA = this.f95198j ? n.a.a(k11, aVar, iA, bVar) : n.a.b(k11, aVar, bVar);
                    this.f95191c.h(k11, aVarA);
                    aVarX = x(aVarA);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        tk.a.C(aVarY);
        v(aVarI);
        s();
        return aVarX;
    }

    @Override // nm.x
    public tk.a<V> get(K k11) {
        n.a<K, V> aVarI;
        tk.a<V> aVarX;
        pk.k.g(k11);
        synchronized (this) {
            try {
                aVarI = this.f95190b.i(k11);
                n.a<K, V> aVarB = this.f95191c.b(k11);
                aVarX = aVarB != null ? x(aVarB) : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        v(aVarI);
        w();
        s();
        return aVarX;
    }

    public synchronized int l() {
        return this.f95191c.c() - this.f95190b.c();
    }

    public synchronized int m() {
        return this.f95191c.f() - this.f95190b.f();
    }

    public void s() {
        ArrayList<n.a<K, V>> arrayListA;
        synchronized (this) {
            y yVar = this.f95196h;
            int iMin = Math.min(yVar.maxEvictionQueueEntries, yVar.maxCacheEntries - l());
            y yVar2 = this.f95196h;
            arrayListA = A(iMin, Math.min(yVar2.maxEvictionQueueSize, yVar2.maxCacheSize - m()));
            p(arrayListA);
        }
        r(arrayListA);
        u(arrayListA);
    }
}
