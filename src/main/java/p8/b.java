package p8;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f101844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f101845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f101846d;

    public b(long j11, long j12) {
        this.f101844b = j11;
        this.f101845c = j12;
        f();
    }

    protected final void c() {
        long j11 = this.f101846d;
        if (j11 < this.f101844b || j11 > this.f101845c) {
            throw new NoSuchElementException();
        }
    }

    protected final long d() {
        return this.f101846d;
    }

    public boolean e() {
        return this.f101846d > this.f101845c;
    }

    public void f() {
        this.f101846d = this.f101844b - 1;
    }

    @Override // p8.n
    public boolean next() {
        this.f101846d++;
        return !e();
    }
}
