package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Set;
import pk.k;
import pk.m;
import pk.p;
import xm.a0;
import xm.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BasePool<V> implements sk.f<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f21689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final sk.d f21690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final z f21691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final SparseArray<com.facebook.imagepipeline.memory.a<V>> f21692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Set<V> f21693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final a f21695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final a f21696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a0 f21697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21698j;

    public static class InvalidSizeException extends RuntimeException {
        public InvalidSizeException(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    public static class InvalidValueException extends RuntimeException {
    }

    public static class PoolSizeViolationException extends RuntimeException {
        public PoolSizeViolationException(int i11, int i12, int i13, int i14) {
            super("Pool hard cap violation? Hard cap = " + i11 + " Used size = " + i12 + " Free size = " + i13 + " Request size = " + i14);
        }
    }

    public static class SizeTooLargeException extends InvalidSizeException {
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f21700b;

        a() {
        }

        public void a(int i11) {
            int i12;
            int i13 = this.f21700b;
            if (i13 < i11 || (i12 = this.f21699a) <= 0) {
                qk.a.N("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i11), Integer.valueOf(this.f21700b), Integer.valueOf(this.f21699a));
            } else {
                this.f21699a = i12 - 1;
                this.f21700b = i13 - i11;
            }
        }

        public void b(int i11) {
            this.f21699a++;
            this.f21700b += i11;
        }
    }

    public BasePool(sk.d dVar, z zVar, a0 a0Var) {
        this.f21689a = getClass();
        this.f21690b = (sk.d) k.g(dVar);
        z zVar2 = (z) k.g(zVar);
        this.f21691c = zVar2;
        this.f21697i = (a0) k.g(a0Var);
        this.f21692d = new SparseArray<>();
        if (zVar2.f123793f) {
            s();
        } else {
            w(new SparseIntArray(0));
        }
        this.f21693e = m.b();
        this.f21696h = new a();
        this.f21695g = new a();
    }

    private synchronized void j() {
        try {
            k.i(!u() || this.f21696h.f21700b == 0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void k(SparseIntArray sparseIntArray) {
        this.f21692d.clear();
        for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
            int iKeyAt = sparseIntArray.keyAt(i11);
            this.f21692d.put(iKeyAt, new com.facebook.imagepipeline.memory.a<>(q(iKeyAt), sparseIntArray.valueAt(i11), 0, this.f21691c.f123793f));
        }
    }

    private synchronized com.facebook.imagepipeline.memory.a<V> n(int i11) {
        return this.f21692d.get(i11);
    }

    private synchronized void s() {
        try {
            SparseIntArray sparseIntArray = this.f21691c.f123790c;
            if (sparseIntArray != null) {
                k(sparseIntArray);
                this.f21694f = false;
            } else {
                this.f21694f = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void w(SparseIntArray sparseIntArray) {
        try {
            k.g(sparseIntArray);
            this.f21692d.clear();
            SparseIntArray sparseIntArray2 = this.f21691c.f123790c;
            if (sparseIntArray2 != null) {
                for (int i11 = 0; i11 < sparseIntArray2.size(); i11++) {
                    int iKeyAt = sparseIntArray2.keyAt(i11);
                    this.f21692d.put(iKeyAt, new com.facebook.imagepipeline.memory.a<>(q(iKeyAt), sparseIntArray2.valueAt(i11), sparseIntArray.get(iKeyAt, 0), this.f21691c.f123793f));
                }
                this.f21694f = false;
            } else {
                this.f21694f = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    private void x() {
        if (qk.a.w(2)) {
            qk.a.B(this.f21689a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f21695g.f21699a), Integer.valueOf(this.f21695g.f21700b), Integer.valueOf(this.f21696h.f21699a), Integer.valueOf(this.f21696h.f21700b));
        }
    }

    synchronized void A() {
        if (u()) {
            z(this.f21691c.f123789b);
        }
    }

    @Override // sk.f, tk.h
    public void a(V v11) {
        k.g(v11);
        int iP = p(v11);
        int iQ = q(iP);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.a<V> aVarN = n(iP);
                if (!this.f21693e.remove(v11)) {
                    qk.a.k(this.f21689a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v11)), Integer.valueOf(iP));
                    l(v11);
                    this.f21697i.e(iQ);
                } else if (aVarN == null || aVarN.f() || u() || !v(v11)) {
                    if (aVarN != null) {
                        aVarN.b();
                    }
                    if (qk.a.w(2)) {
                        qk.a.z(this.f21689a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v11)), Integer.valueOf(iP));
                    }
                    l(v11);
                    this.f21695g.a(iQ);
                    this.f21697i.e(iQ);
                } else {
                    aVarN.h(v11);
                    this.f21696h.b(iQ);
                    this.f21695g.a(iQ);
                    this.f21697i.f(iQ);
                    if (qk.a.w(2)) {
                        qk.a.z(this.f21689a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v11)), Integer.valueOf(iP));
                    }
                }
                x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @Override // sk.f
    public V get(int i11) throws X {
        V vH;
        V vR;
        j();
        int iO = o(i11);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.a<V> aVarM = m(iO);
                if (aVarM != null && (vR = r(aVarM)) != null) {
                    k.i(this.f21693e.add(vR));
                    int iP = p(vR);
                    int iQ = q(iP);
                    this.f21695g.b(iQ);
                    this.f21696h.a(iQ);
                    this.f21697i.b(iQ);
                    x();
                    if (qk.a.w(2)) {
                        qk.a.z(this.f21689a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vR)), Integer.valueOf(iP));
                    }
                    return vR;
                }
                int iQ2 = q(iO);
                if (!i(iQ2)) {
                    throw new PoolSizeViolationException(this.f21691c.f123788a, this.f21695g.f21700b, this.f21696h.f21700b, iQ2);
                }
                this.f21695g.b(iQ2);
                if (aVarM != null) {
                    aVarM.e();
                }
                try {
                    vH = h(iO);
                } catch (Throwable th2) {
                    synchronized (this) {
                        try {
                            this.f21695g.a(iQ2);
                            com.facebook.imagepipeline.memory.a<V> aVarM2 = m(iO);
                            if (aVarM2 != null) {
                                aVarM2.b();
                            }
                            p.c(th2);
                            vH = null;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                synchronized (this) {
                    try {
                        k.i(this.f21693e.add(vH));
                        A();
                        this.f21697i.a(iQ2);
                        x();
                        if (qk.a.w(2)) {
                            qk.a.z(this.f21689a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vH)), Integer.valueOf(iO));
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return vH;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    protected abstract V h(int i11);

    synchronized boolean i(int i11) {
        if (this.f21698j) {
            return true;
        }
        z zVar = this.f21691c;
        int i12 = zVar.f123788a;
        int i13 = this.f21695g.f21700b;
        if (i11 > i12 - i13) {
            this.f21697i.c();
            return false;
        }
        int i14 = zVar.f123789b;
        if (i11 > i14 - (i13 + this.f21696h.f21700b)) {
            z(i14 - i11);
        }
        if (i11 <= i12 - (this.f21695g.f21700b + this.f21696h.f21700b)) {
            return true;
        }
        this.f21697i.c();
        return false;
    }

    protected abstract void l(V v11);

    synchronized com.facebook.imagepipeline.memory.a<V> m(int i11) {
        try {
            com.facebook.imagepipeline.memory.a<V> aVar = this.f21692d.get(i11);
            if (aVar == null && this.f21694f) {
                if (qk.a.w(2)) {
                    qk.a.y(this.f21689a, "creating new bucket %s", Integer.valueOf(i11));
                }
                com.facebook.imagepipeline.memory.a<V> aVarY = y(i11);
                this.f21692d.put(i11, aVarY);
                return aVarY;
            }
            return aVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected abstract int o(int i11);

    protected abstract int p(V v11);

    protected abstract int q(int i11);

    protected synchronized V r(com.facebook.imagepipeline.memory.a<V> aVar) {
        return aVar.c();
    }

    protected void t() {
        this.f21690b.a(this);
        this.f21697i.g(this);
    }

    synchronized boolean u() {
        boolean z11;
        z11 = this.f21695g.f21700b + this.f21696h.f21700b > this.f21691c.f123789b;
        if (z11) {
            this.f21697i.d();
        }
        return z11;
    }

    protected boolean v(V v11) {
        k.g(v11);
        return true;
    }

    com.facebook.imagepipeline.memory.a<V> y(int i11) {
        return new com.facebook.imagepipeline.memory.a<>(q(i11), Integer.MAX_VALUE, 0, this.f21691c.f123793f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized void z(int i11) {
        try {
            int i12 = this.f21695g.f21700b;
            int i13 = this.f21696h.f21700b;
            int iMin = Math.min((i12 + i13) - i11, i13);
            if (iMin <= 0) {
                return;
            }
            if (qk.a.w(2)) {
                qk.a.A(this.f21689a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i11), Integer.valueOf(this.f21695g.f21700b + this.f21696h.f21700b), Integer.valueOf(iMin));
            }
            x();
            for (int i14 = 0; i14 < this.f21692d.size() && iMin > 0; i14++) {
                com.facebook.imagepipeline.memory.a aVar = (com.facebook.imagepipeline.memory.a) k.g(this.f21692d.valueAt(i14));
                while (iMin > 0) {
                    Object objG = aVar.g();
                    if (objG == null) {
                        break;
                    }
                    l(objG);
                    int i15 = aVar.f21707a;
                    iMin -= i15;
                    this.f21696h.a(i15);
                }
            }
            x();
            if (qk.a.w(2)) {
                qk.a.z(this.f21689a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i11), Integer.valueOf(this.f21695g.f21700b + this.f21696h.f21700b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public BasePool(sk.d dVar, z zVar, a0 a0Var, boolean z11) {
        this(dVar, zVar, a0Var);
        this.f21698j = z11;
    }
}
