package nm0;

import fm0.g;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rm0.k;

/* JADX INFO: loaded from: classes9.dex */
public final class b<E> extends AtomicReferenceArray<E> implements g<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Integer f95213f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f95214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicLong f95215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f95216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicLong f95217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f95218e;

    public b(int i11) {
        super(k.a(i11));
        this.f95214a = length() - 1;
        this.f95215b = new AtomicLong();
        this.f95217d = new AtomicLong();
        this.f95218e = Math.min(i11 / 4, f95213f.intValue());
    }

    int a(long j11) {
        return ((int) j11) & this.f95214a;
    }

    int b(long j11, int i11) {
        return ((int) j11) & i11;
    }

    E c(int i11) {
        return get(i11);
    }

    @Override // fm0.h
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    void d(long j11) {
        this.f95217d.lazySet(j11);
    }

    void e(int i11, E e11) {
        lazySet(i11, e11);
    }

    void f(long j11) {
        this.f95215b.lazySet(j11);
    }

    @Override // fm0.h
    public boolean isEmpty() {
        return this.f95215b.get() == this.f95217d.get();
    }

    @Override // fm0.h
    public boolean offer(E e11) {
        if (e11 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i11 = this.f95214a;
        long j11 = this.f95215b.get();
        int iB = b(j11, i11);
        if (j11 >= this.f95216c) {
            long j12 = ((long) this.f95218e) + j11;
            if (c(b(j12, i11)) == null) {
                this.f95216c = j12;
            } else if (c(iB) != null) {
                return false;
            }
        }
        e(iB, e11);
        f(j11 + 1);
        return true;
    }

    @Override // fm0.g, fm0.h
    public E poll() {
        long j11 = this.f95217d.get();
        int iA = a(j11);
        E eC = c(iA);
        if (eC == null) {
            return null;
        }
        d(j11 + 1);
        e(iA, null);
        return eC;
    }
}
