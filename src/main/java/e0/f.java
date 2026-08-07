package e0;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class f extends t0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0.u<t0.b> f61307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0.u<t0.b> f61308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f61309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Integer> f61310d;

    f(p0.u<t0.b> uVar, p0.u<t0.b> uVar2, int i11, List<Integer> list) {
        if (uVar == null) {
            throw new NullPointerException("Null edge");
        }
        this.f61307a = uVar;
        if (uVar2 == null) {
            throw new NullPointerException("Null postviewEdge");
        }
        this.f61308b = uVar2;
        this.f61309c = i11;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f61310d = list;
    }

    @Override // e0.t0.a
    @NonNull
    p0.u<t0.b> a() {
        return this.f61307a;
    }

    @Override // e0.t0.a
    int b() {
        return this.f61309c;
    }

    @Override // e0.t0.a
    @NonNull
    List<Integer> c() {
        return this.f61310d;
    }

    @Override // e0.t0.a
    @NonNull
    p0.u<t0.b> d() {
        return this.f61308b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t0.a) {
            t0.a aVar = (t0.a) obj;
            if (this.f61307a.equals(aVar.a()) && this.f61308b.equals(aVar.d()) && this.f61309c == aVar.b() && this.f61310d.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f61307a.hashCode() ^ 1000003) * 1000003) ^ this.f61308b.hashCode()) * 1000003) ^ this.f61309c) * 1000003) ^ this.f61310d.hashCode();
    }

    public String toString() {
        return "In{edge=" + this.f61307a + ", postviewEdge=" + this.f61308b + ", inputFormat=" + this.f61309c + ", outputFormats=" + this.f61310d + "}";
    }
}
