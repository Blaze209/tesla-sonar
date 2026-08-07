package dr;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f60893b;

    public p(int i11, float f11) {
        this.f60892a = i11;
        this.f60893b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f60892a == pVar.f60892a && Float.compare(pVar.f60893b, this.f60893b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f60892a) * 31) + Float.floatToIntBits(this.f60893b);
    }
}
