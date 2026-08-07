package z0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class i extends z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f126150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f126151b;

    i(x xVar, int i11) {
        if (xVar == null) {
            throw new NullPointerException("Null quality");
        }
        this.f126150a = xVar;
        this.f126151b = i11;
    }

    @Override // z0.z.a
    int a() {
        return this.f126151b;
    }

    @Override // z0.z.a
    @NonNull
    x b() {
        return this.f126150a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z.a) {
            z.a aVar = (z.a) obj;
            if (this.f126150a.equals(aVar.b()) && this.f126151b == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f126150a.hashCode() ^ 1000003) * 1000003) ^ this.f126151b;
    }

    public String toString() {
        return "QualityRatio{quality=" + this.f126150a + ", aspectRatio=" + this.f126151b + "}";
    }
}
