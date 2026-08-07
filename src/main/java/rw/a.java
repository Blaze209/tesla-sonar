package rw;

import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f109222a;

    a(Set<String> set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.f109222a = set;
    }

    @Override // rw.b
    @NonNull
    public Set<String> b() {
        return this.f109222a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f109222a.equals(((b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f109222a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f109222a + "}";
    }
}
