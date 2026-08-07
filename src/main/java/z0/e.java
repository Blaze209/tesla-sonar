package z0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class e extends p.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f126112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f126113c;

    e(x xVar, int i11) {
        if (xVar == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.f126112b = xVar;
        this.f126113c = i11;
    }

    @Override // z0.p.b
    @NonNull
    x b() {
        return this.f126112b;
    }

    @Override // z0.p.b
    int c() {
        return this.f126113c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p.b) {
            p.b bVar = (p.b) obj;
            if (this.f126112b.equals(bVar.b()) && this.f126113c == bVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f126112b.hashCode() ^ 1000003) * 1000003) ^ this.f126113c;
    }

    public String toString() {
        return "RuleStrategy{fallbackQuality=" + this.f126112b + ", fallbackRule=" + this.f126113c + "}";
    }
}
