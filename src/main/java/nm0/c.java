package nm0;

import fm0.g;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rm0.k;

/* JADX INFO: loaded from: classes9.dex */
public final class c<T> implements g<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f95219i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f95220j = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f95222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f95223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f95224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    AtomicReferenceArray<Object> f95225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f95226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    AtomicReferenceArray<Object> f95227g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicLong f95221a = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final AtomicLong f95228h = new AtomicLong();

    public c(int i11) {
        int iA = k.a(Math.max(8, i11));
        int i12 = iA - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iA + 1);
        this.f95225e = atomicReferenceArray;
        this.f95224d = i12;
        a(iA);
        this.f95227g = atomicReferenceArray;
        this.f95226f = i12;
        this.f95223c = iA - 2;
        o(0L);
    }

    private void a(int i11) {
        this.f95222b = Math.min(i11 / 4, f95219i);
    }

    private static int c(long j11, int i11) {
        return b(((int) j11) & i11);
    }

    private long d() {
        return this.f95228h.get();
    }

    private long e() {
        return this.f95221a.get();
    }

    private long f() {
        return this.f95228h.get();
    }

    private static Object g(AtomicReferenceArray<Object> atomicReferenceArray, int i11) {
        return atomicReferenceArray.get(i11);
    }

    private AtomicReferenceArray<Object> h(AtomicReferenceArray<Object> atomicReferenceArray, int i11) {
        int iB = b(i11);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) g(atomicReferenceArray, iB);
        m(atomicReferenceArray, iB, null);
        return atomicReferenceArray2;
    }

    private long i() {
        return this.f95221a.get();
    }

    private T j(AtomicReferenceArray<Object> atomicReferenceArray, long j11, int i11) {
        this.f95227g = atomicReferenceArray;
        int iC = c(j11, i11);
        T t11 = (T) g(atomicReferenceArray, iC);
        if (t11 != null) {
            m(atomicReferenceArray, iC, null);
            l(j11 + 1);
        }
        return t11;
    }

    private void k(AtomicReferenceArray<Object> atomicReferenceArray, long j11, int i11, T t11, long j12) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f95225e = atomicReferenceArray2;
        this.f95223c = (j12 + j11) - 1;
        m(atomicReferenceArray2, i11, t11);
        n(atomicReferenceArray, atomicReferenceArray2);
        m(atomicReferenceArray, i11, f95220j);
        o(j11 + 1);
    }

    private void l(long j11) {
        this.f95228h.lazySet(j11);
    }

    private static void m(AtomicReferenceArray<Object> atomicReferenceArray, int i11, Object obj) {
        atomicReferenceArray.lazySet(i11, obj);
    }

    private void n(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void o(long j11) {
        this.f95221a.lazySet(j11);
    }

    private boolean p(AtomicReferenceArray<Object> atomicReferenceArray, T t11, long j11, int i11) {
        m(atomicReferenceArray, i11, t11);
        o(j11 + 1);
        return true;
    }

    @Override // fm0.h
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // fm0.h
    public boolean isEmpty() {
        return i() == f();
    }

    @Override // fm0.h
    public boolean offer(T t11) {
        if (t11 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f95225e;
        long jE = e();
        int i11 = this.f95224d;
        int iC = c(jE, i11);
        if (jE < this.f95223c) {
            return p(atomicReferenceArray, t11, jE, iC);
        }
        long j11 = ((long) this.f95222b) + jE;
        if (g(atomicReferenceArray, c(j11, i11)) == null) {
            this.f95223c = j11 - 1;
            return p(atomicReferenceArray, t11, jE, iC);
        }
        if (g(atomicReferenceArray, c(jE + 1, i11)) == null) {
            return p(atomicReferenceArray, t11, jE, iC);
        }
        k(atomicReferenceArray, jE, iC, t11, i11);
        return true;
    }

    @Override // fm0.g, fm0.h
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f95227g;
        long jD = d();
        int i11 = this.f95226f;
        int iC = c(jD, i11);
        T t11 = (T) g(atomicReferenceArray, iC);
        boolean z11 = t11 == f95220j;
        if (t11 == null || z11) {
            if (z11) {
                return j(h(atomicReferenceArray, i11 + 1), jD, i11);
            }
            return null;
        }
        m(atomicReferenceArray, iC, null);
        l(jD + 1);
        return t11;
    }

    private static int b(int i11) {
        return i11;
    }
}
