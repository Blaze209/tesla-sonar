package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e3 f3115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Size f3117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c0.b0 f3118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<p3.b> f3119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x0 f3120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Range<Integer> f3121g;

    b(e3 e3Var, int i11, Size size, c0.b0 b0Var, List<p3.b> list, x0 x0Var, Range<Integer> range) {
        if (e3Var == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f3115a = e3Var;
        this.f3116b = i11;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f3117c = size;
        if (b0Var == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f3118d = b0Var;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f3119e = list;
        this.f3120f = x0Var;
        this.f3121g = range;
    }

    @Override // androidx.camera.core.impl.a
    @NonNull
    public List<p3.b> b() {
        return this.f3119e;
    }

    @Override // androidx.camera.core.impl.a
    @NonNull
    public c0.b0 c() {
        return this.f3118d;
    }

    @Override // androidx.camera.core.impl.a
    public int d() {
        return this.f3116b;
    }

    @Override // androidx.camera.core.impl.a
    public x0 e() {
        return this.f3120f;
    }

    public boolean equals(Object obj) {
        x0 x0Var;
        Range<Integer> range;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f3115a.equals(aVar.g()) && this.f3116b == aVar.d() && this.f3117c.equals(aVar.f()) && this.f3118d.equals(aVar.c()) && this.f3119e.equals(aVar.b()) && ((x0Var = this.f3120f) != null ? x0Var.equals(aVar.e()) : aVar.e() == null) && ((range = this.f3121g) != null ? range.equals(aVar.h()) : aVar.h() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.a
    @NonNull
    public Size f() {
        return this.f3117c;
    }

    @Override // androidx.camera.core.impl.a
    @NonNull
    public e3 g() {
        return this.f3115a;
    }

    @Override // androidx.camera.core.impl.a
    public Range<Integer> h() {
        return this.f3121g;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f3115a.hashCode() ^ 1000003) * 1000003) ^ this.f3116b) * 1000003) ^ this.f3117c.hashCode()) * 1000003) ^ this.f3118d.hashCode()) * 1000003) ^ this.f3119e.hashCode()) * 1000003;
        x0 x0Var = this.f3120f;
        int iHashCode2 = (iHashCode ^ (x0Var == null ? 0 : x0Var.hashCode())) * 1000003;
        Range<Integer> range = this.f3121g;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f3115a + ", imageFormat=" + this.f3116b + ", size=" + this.f3117c + ", dynamicRange=" + this.f3118d + ", captureTypes=" + this.f3119e + ", implementationOptions=" + this.f3120f + ", targetFrameRate=" + this.f3121g + "}";
    }
}
