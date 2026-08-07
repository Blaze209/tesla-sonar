package l9;

import p7.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f89720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89721b;

    public d(float f11, int i11) {
        this.f89720a = f11;
        this.f89721b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f89720a == dVar.f89720a && this.f89721b == dVar.f89721b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + ru.c.a(this.f89720a)) * 31) + this.f89721b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f89720a + ", svcTemporalLayerCount=" + this.f89721b;
    }
}
