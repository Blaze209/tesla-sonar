package c0;

import android.view.Surface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class g extends z1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Surface f18312b;

    g(int i11, Surface surface) {
        this.f18311a = i11;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f18312b = surface;
    }

    @Override // c0.z1.g
    public int a() {
        return this.f18311a;
    }

    @Override // c0.z1.g
    @NonNull
    public Surface b() {
        return this.f18312b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1.g) {
            z1.g gVar = (z1.g) obj;
            if (this.f18311a == gVar.a() && this.f18312b.equals(gVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f18311a ^ 1000003) * 1000003) ^ this.f18312b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f18311a + ", surface=" + this.f18312b + "}";
    }
}
