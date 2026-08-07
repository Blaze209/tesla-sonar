package x;

import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class o implements j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f122466a;

    o(@NonNull Object obj) {
        this.f122466a = obj;
    }

    @Override // x.j.a
    public void b(@NonNull Surface surface) {
        u5.h.h(surface, "Surface must not be null");
        if (getSurface() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!i()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return Objects.equals(this.f122466a, ((o) obj).f122466a);
        }
        return false;
    }

    @Override // x.j.a
    public Surface getSurface() {
        throw null;
    }

    public int hashCode() {
        return this.f122466a.hashCode();
    }

    boolean i() {
        throw null;
    }

    @Override // x.j.a
    public void d(long j11) {
    }

    @Override // x.j.a
    public void g(int i11) {
    }
}
