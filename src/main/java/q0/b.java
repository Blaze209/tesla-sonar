package q0;

import androidx.annotation.NonNull;
import java.util.List;
import p0.n0;

/* JADX INFO: loaded from: classes.dex */
final class b extends r.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f104126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0 f104127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<d> f104128c;

    b(n0 n0Var, n0 n0Var2, List<d> list) {
        if (n0Var == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f104126a = n0Var;
        if (n0Var2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f104127b = n0Var2;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f104128c = list;
    }

    @Override // q0.r.b
    @NonNull
    public List<d> a() {
        return this.f104128c;
    }

    @Override // q0.r.b
    @NonNull
    public n0 b() {
        return this.f104126a;
    }

    @Override // q0.r.b
    @NonNull
    public n0 c() {
        return this.f104127b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r.b) {
            r.b bVar = (r.b) obj;
            if (this.f104126a.equals(bVar.b()) && this.f104127b.equals(bVar.c()) && this.f104128c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f104126a.hashCode() ^ 1000003) * 1000003) ^ this.f104127b.hashCode()) * 1000003) ^ this.f104128c.hashCode();
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.f104126a + ", secondarySurfaceEdge=" + this.f104127b + ", outConfigs=" + this.f104128c + "}";
    }
}
