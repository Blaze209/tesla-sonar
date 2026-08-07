package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class o extends f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Size f3253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, Size> f3254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Size f3255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Integer, Size> f3256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Size f3257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<Integer, Size> f3258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<Integer, Size> f3259g;

    o(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f3253a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f3254b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f3255c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f3256d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f3257e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f3258f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f3259g = map4;
    }

    @Override // androidx.camera.core.impl.f3
    @NonNull
    public Size b() {
        return this.f3253a;
    }

    @Override // androidx.camera.core.impl.f3
    @NonNull
    public Map<Integer, Size> d() {
        return this.f3258f;
    }

    @Override // androidx.camera.core.impl.f3
    @NonNull
    public Size e() {
        return this.f3255c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f3) {
            f3 f3Var = (f3) obj;
            if (this.f3253a.equals(f3Var.b()) && this.f3254b.equals(f3Var.j()) && this.f3255c.equals(f3Var.e()) && this.f3256d.equals(f3Var.h()) && this.f3257e.equals(f3Var.f()) && this.f3258f.equals(f3Var.d()) && this.f3259g.equals(f3Var.l())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.f3
    @NonNull
    public Size f() {
        return this.f3257e;
    }

    @Override // androidx.camera.core.impl.f3
    @NonNull
    public Map<Integer, Size> h() {
        return this.f3256d;
    }

    public int hashCode() {
        return ((((((((((((this.f3253a.hashCode() ^ 1000003) * 1000003) ^ this.f3254b.hashCode()) * 1000003) ^ this.f3255c.hashCode()) * 1000003) ^ this.f3256d.hashCode()) * 1000003) ^ this.f3257e.hashCode()) * 1000003) ^ this.f3258f.hashCode()) * 1000003) ^ this.f3259g.hashCode();
    }

    @Override // androidx.camera.core.impl.f3
    @NonNull
    public Map<Integer, Size> j() {
        return this.f3254b;
    }

    @Override // androidx.camera.core.impl.f3
    @NonNull
    public Map<Integer, Size> l() {
        return this.f3259g;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f3253a + ", s720pSizeMap=" + this.f3254b + ", previewSize=" + this.f3255c + ", s1440pSizeMap=" + this.f3256d + ", recordSize=" + this.f3257e + ", maximumSizeMap=" + this.f3258f + ", ultraMaximumSizeMap=" + this.f3259g + "}";
    }
}
