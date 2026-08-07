package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class i extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Surface f3189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Size f3190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3191c;

    i(Surface surface, Size size, int i11) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f3189a = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f3190b = size;
        this.f3191c = i11;
    }

    @Override // androidx.camera.core.impl.j2
    public int b() {
        return this.f3191c;
    }

    @Override // androidx.camera.core.impl.j2
    @NonNull
    public Size c() {
        return this.f3190b;
    }

    @Override // androidx.camera.core.impl.j2
    @NonNull
    public Surface d() {
        return this.f3189a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            j2 j2Var = (j2) obj;
            if (this.f3189a.equals(j2Var.d()) && this.f3190b.equals(j2Var.c()) && this.f3191c == j2Var.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f3189a.hashCode() ^ 1000003) * 1000003) ^ this.f3190b.hashCode()) * 1000003) ^ this.f3191c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f3189a + ", size=" + this.f3190b + ", imageFormat=" + this.f3191c + "}";
    }
}
