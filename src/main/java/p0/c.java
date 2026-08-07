package p0;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class c extends v0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f100100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<r0.f> f100101b;

    c(n0 n0Var, List<r0.f> list) {
        if (n0Var == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f100100a = n0Var;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f100101b = list;
    }

    @Override // p0.v0.b
    @NonNull
    public List<r0.f> a() {
        return this.f100101b;
    }

    @Override // p0.v0.b
    @NonNull
    public n0 b() {
        return this.f100100a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0.b) {
            v0.b bVar = (v0.b) obj;
            if (this.f100100a.equals(bVar.b()) && this.f100101b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f100100a.hashCode() ^ 1000003) * 1000003) ^ this.f100101b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f100100a + ", outConfigs=" + this.f100101b + "}";
    }
}
