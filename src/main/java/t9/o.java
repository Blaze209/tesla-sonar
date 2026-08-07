package t9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o extends y7.e implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j f112979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f112980f;

    @Override // t9.j
    public long a(int i11) {
        return ((j) s7.a.f(this.f112979e)).a(i11) + this.f112980f;
    }

    @Override // t9.j
    public int b() {
        return ((j) s7.a.f(this.f112979e)).b();
    }

    @Override // t9.j
    public int c(long j11) {
        return ((j) s7.a.f(this.f112979e)).c(j11 - this.f112980f);
    }

    @Override // t9.j
    public List<r7.a> d(long j11) {
        return ((j) s7.a.f(this.f112979e)).d(j11 - this.f112980f);
    }

    @Override // y7.e, y7.a
    public void f() {
        super.f();
        this.f112979e = null;
    }

    public void p(long j11, j jVar, long j12) {
        this.f125193b = j11;
        this.f112979e = jVar;
        if (j12 != Long.MAX_VALUE) {
            j11 = j12;
        }
        this.f112980f = j11;
    }
}
