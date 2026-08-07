package r8;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class v implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f107274a;

    public v(t tVar) {
        this.f107274a = tVar;
    }

    @Override // r8.t
    public int a() {
        return this.f107274a.a();
    }

    @Override // r8.x
    public int b(int i11) {
        return this.f107274a.b(i11);
    }

    @Override // r8.t
    public void c() {
        this.f107274a.c();
    }

    @Override // r8.x
    public int d(int i11) {
        return this.f107274a.d(i11);
    }

    @Override // r8.t
    public void disable() {
        this.f107274a.disable();
    }

    @Override // r8.t
    public void enable() {
        this.f107274a.enable();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.f107274a.equals(((v) obj).f107274a);
        }
        return false;
    }

    @Override // r8.t
    public void g() {
        this.f107274a.g();
    }

    public int hashCode() {
        return this.f107274a.hashCode();
    }

    @Override // r8.t
    public void i(float f11) {
        this.f107274a.i(f11);
    }

    @Override // r8.t
    public void j(boolean z11) {
        this.f107274a.j(z11);
    }

    @Override // r8.t
    public long k() {
        return this.f107274a.k();
    }

    @Override // r8.t
    public boolean l(int i11, long j11) {
        return this.f107274a.l(i11, j11);
    }

    @Override // r8.x
    public int length() {
        return this.f107274a.length();
    }

    @Override // r8.t
    public void m(long j11, long j12, long j13, List<? extends p8.m> list, p8.n[] nVarArr) {
        this.f107274a.m(j11, j12, j13, list, nVarArr);
    }

    @Override // r8.t
    public boolean n(int i11, long j11) {
        return this.f107274a.n(i11, j11);
    }

    @Override // r8.t
    public int o(long j11, List<? extends p8.m> list) {
        return this.f107274a.o(j11, list);
    }

    @Override // r8.t
    public int p() {
        return this.f107274a.p();
    }

    @Override // r8.t
    public boolean q(long j11, p8.e eVar, List<? extends p8.m> list) {
        return this.f107274a.q(j11, eVar, list);
    }

    @Override // r8.t
    public Object r() {
        return this.f107274a.r();
    }

    @Override // r8.t
    public int t() {
        return this.f107274a.t();
    }

    public t u() {
        return this.f107274a;
    }
}
