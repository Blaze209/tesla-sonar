package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.s1;
import androidx.camera.core.impl.z;
import c0.s0;
import c0.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class p implements s1, e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.camera.core.impl.p f3424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s1.a f3426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s1 f3428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    s1.a f3429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Executor f3430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final LongSparseArray<s0> f3431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LongSparseArray<n> f3432j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f3433k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<n> f3434l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<n> f3435m;

    class a extends androidx.camera.core.impl.p {
        a() {
        }

        @Override // androidx.camera.core.impl.p
        public void b(int i11, @NonNull z zVar) {
            super.b(i11, zVar);
            p.this.q(zVar);
        }
    }

    public p(int i11, int i12, int i13, int i14) {
        this(j(i11, i12, i13, i14));
    }

    public static /* synthetic */ void h(p pVar, s1.a aVar) {
        pVar.getClass();
        aVar.a(pVar);
    }

    public static /* synthetic */ void i(p pVar, s1 s1Var) {
        synchronized (pVar.f3423a) {
            pVar.f3425c++;
        }
        pVar.n(s1Var);
    }

    private static s1 j(int i11, int i12, int i13, int i14) {
        return new d(ImageReader.newInstance(i11, i12, i13, i14));
    }

    private void k(n nVar) {
        synchronized (this.f3423a) {
            try {
                int iIndexOf = this.f3434l.indexOf(nVar);
                if (iIndexOf >= 0) {
                    this.f3434l.remove(iIndexOf);
                    int i11 = this.f3433k;
                    if (iIndexOf <= i11) {
                        this.f3433k = i11 - 1;
                    }
                }
                this.f3435m.remove(nVar);
                if (this.f3425c > 0) {
                    n(this.f3428f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l(r rVar) {
        final s1.a aVar;
        Executor executor;
        synchronized (this.f3423a) {
            try {
                if (this.f3434l.size() < b()) {
                    rVar.c(this);
                    this.f3434l.add(rVar);
                    aVar = this.f3429g;
                    executor = this.f3430h;
                } else {
                    y0.a("TAG", "Maximum image number reached.");
                    rVar.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: c0.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.p.h(this.f18234a, aVar);
                    }
                });
            } else {
                aVar.a(this);
            }
        }
    }

    private void o() {
        synchronized (this.f3423a) {
            try {
                for (int size = this.f3431i.size() - 1; size >= 0; size--) {
                    s0 s0VarValueAt = this.f3431i.valueAt(size);
                    long jA = s0VarValueAt.a();
                    n nVar = this.f3432j.get(jA);
                    if (nVar != null) {
                        this.f3432j.remove(jA);
                        this.f3431i.removeAt(size);
                        l(new r(nVar, s0VarValueAt));
                    }
                }
                p();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void p() {
        synchronized (this.f3423a) {
            try {
                if (this.f3432j.size() != 0 && this.f3431i.size() != 0) {
                    long jKeyAt = this.f3432j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f3431i.keyAt(0);
                    u5.h.a(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f3432j.size() - 1; size >= 0; size--) {
                            if (this.f3432j.keyAt(size) < jKeyAt2) {
                                this.f3432j.valueAt(size).close();
                                this.f3432j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f3431i.size() - 1; size2 >= 0; size2--) {
                            if (this.f3431i.keyAt(size2) < jKeyAt) {
                                this.f3431i.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.s1
    public int a() {
        int iA;
        synchronized (this.f3423a) {
            iA = this.f3428f.a();
        }
        return iA;
    }

    @Override // androidx.camera.core.impl.s1
    public int b() {
        int iB;
        synchronized (this.f3423a) {
            iB = this.f3428f.b();
        }
        return iB;
    }

    @Override // androidx.camera.core.impl.s1
    public n c() {
        synchronized (this.f3423a) {
            try {
                if (this.f3434l.isEmpty()) {
                    return null;
                }
                if (this.f3433k >= this.f3434l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                List<n> list = this.f3434l;
                int i11 = this.f3433k;
                this.f3433k = i11 + 1;
                n nVar = list.get(i11);
                this.f3435m.add(nVar);
                return nVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.s1
    public void close() {
        synchronized (this.f3423a) {
            try {
                if (this.f3427e) {
                    return;
                }
                Iterator it = new ArrayList(this.f3434l).iterator();
                while (it.hasNext()) {
                    ((n) it.next()).close();
                }
                this.f3434l.clear();
                this.f3428f.close();
                this.f3427e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.s1
    public n d() {
        synchronized (this.f3423a) {
            try {
                if (this.f3434l.isEmpty()) {
                    return null;
                }
                if (this.f3433k >= this.f3434l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < this.f3434l.size() - 1; i11++) {
                    if (!this.f3435m.contains(this.f3434l.get(i11))) {
                        arrayList.add(this.f3434l.get(i11));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).close();
                }
                int size = this.f3434l.size();
                List<n> list = this.f3434l;
                this.f3433k = size;
                n nVar = list.get(size - 1);
                this.f3435m.add(nVar);
                return nVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.e.a
    public void e(@NonNull n nVar) {
        synchronized (this.f3423a) {
            k(nVar);
        }
    }

    @Override // androidx.camera.core.impl.s1
    public void f() {
        synchronized (this.f3423a) {
            this.f3428f.f();
            this.f3429g = null;
            this.f3430h = null;
            this.f3425c = 0;
        }
    }

    @Override // androidx.camera.core.impl.s1
    public void g(@NonNull s1.a aVar, @NonNull Executor executor) {
        synchronized (this.f3423a) {
            this.f3429g = (s1.a) u5.h.g(aVar);
            this.f3430h = (Executor) u5.h.g(executor);
            this.f3428f.g(this.f3426d, executor);
        }
    }

    @Override // androidx.camera.core.impl.s1
    public int getHeight() {
        int height;
        synchronized (this.f3423a) {
            height = this.f3428f.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.s1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f3423a) {
            surface = this.f3428f.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.s1
    public int getWidth() {
        int width;
        synchronized (this.f3423a) {
            width = this.f3428f.getWidth();
        }
        return width;
    }

    @NonNull
    public androidx.camera.core.impl.p m() {
        return this.f3424b;
    }

    void n(s1 s1Var) {
        n nVarC;
        synchronized (this.f3423a) {
            try {
                if (this.f3427e) {
                    return;
                }
                int size = this.f3432j.size() + this.f3434l.size();
                if (size >= s1Var.b()) {
                    y0.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        nVarC = s1Var.c();
                        if (nVarC != null) {
                            this.f3425c--;
                            size++;
                            this.f3432j.put(nVarC.z().a(), nVarC);
                            o();
                        }
                    } catch (IllegalStateException e11) {
                        y0.b("MetadataImageReader", "Failed to acquire next image.", e11);
                        nVarC = null;
                    }
                    if (nVarC == null || this.f3425c <= 0) {
                        break;
                    }
                } while (size < s1Var.b());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void q(z zVar) {
        synchronized (this.f3423a) {
            try {
                if (this.f3427e) {
                    return;
                }
                this.f3431i.put(zVar.a(), new k0.b(zVar));
                o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    p(@NonNull s1 s1Var) {
        this.f3423a = new Object();
        this.f3424b = new a();
        this.f3425c = 0;
        this.f3426d = new s1.a() { // from class: c0.z0
            @Override // androidx.camera.core.impl.s1.a
            public final void a(androidx.camera.core.impl.s1 s1Var2) {
                androidx.camera.core.p.i(this.f18480a, s1Var2);
            }
        };
        this.f3427e = false;
        this.f3431i = new LongSparseArray<>();
        this.f3432j = new LongSparseArray<>();
        this.f3435m = new ArrayList();
        this.f3428f = s1Var;
        this.f3433k = 0;
        this.f3434l = new ArrayList(b());
    }
}
