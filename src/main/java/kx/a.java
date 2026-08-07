package kx;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f89437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f89438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f89439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f89440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f89441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f89442f;

    public a(double d11, double d12, double d13, double d14) {
        this.f89437a = d11;
        this.f89438b = d13;
        this.f89439c = d12;
        this.f89440d = d14;
        this.f89441e = (d11 + d12) / 2.0d;
        this.f89442f = (d13 + d14) / 2.0d;
    }

    public boolean a(double d11, double d12) {
        return this.f89437a <= d11 && d11 <= this.f89439c && this.f89438b <= d12 && d12 <= this.f89440d;
    }

    public boolean b(a aVar) {
        return aVar.f89437a >= this.f89437a && aVar.f89439c <= this.f89439c && aVar.f89438b >= this.f89438b && aVar.f89440d <= this.f89440d;
    }

    public boolean c(b bVar) {
        return a(bVar.f89443a, bVar.f89444b);
    }

    public boolean d(double d11, double d12, double d13, double d14) {
        return d11 < this.f89439c && this.f89437a < d12 && d13 < this.f89440d && this.f89438b < d14;
    }

    public boolean e(a aVar) {
        return d(aVar.f89437a, aVar.f89439c, aVar.f89438b, aVar.f89440d);
    }
}
