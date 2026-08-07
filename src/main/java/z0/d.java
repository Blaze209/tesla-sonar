package z0;

/* JADX INFO: loaded from: classes.dex */
final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f126100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f126101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Throwable f126102d;

    d(int i11, double d11, Throwable th2) {
        this.f126100b = i11;
        this.f126101c = d11;
        this.f126102d = th2;
    }

    @Override // z0.b
    double a() {
        return this.f126101c;
    }

    @Override // z0.b
    public int b() {
        return this.f126100b;
    }

    @Override // z0.b
    public Throwable c() {
        return this.f126102d;
    }

    public boolean equals(Object obj) {
        Throwable th2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f126100b == bVar.b() && Double.doubleToLongBits(this.f126101c) == Double.doubleToLongBits(bVar.a()) && ((th2 = this.f126102d) != null ? th2.equals(bVar.c()) : bVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iDoubleToLongBits = (((this.f126100b ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f126101c) >>> 32) ^ Double.doubleToLongBits(this.f126101c)))) * 1000003;
        Throwable th2 = this.f126102d;
        return iDoubleToLongBits ^ (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "AudioStats{audioState=" + this.f126100b + ", audioAmplitudeInternal=" + this.f126101c + ", errorCause=" + this.f126102d + "}";
    }
}
