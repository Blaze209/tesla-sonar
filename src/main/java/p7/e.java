package p7;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f101255b;

    public e(int i11, float f11) {
        this.f101254a = i11;
        this.f101255b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f101254a == eVar.f101254a && Float.compare(eVar.f101255b, this.f101255b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f101254a) * 31) + Float.floatToIntBits(this.f101255b);
    }
}
