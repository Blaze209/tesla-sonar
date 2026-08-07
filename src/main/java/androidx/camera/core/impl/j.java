package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class j extends k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j2 f3196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j2 f3197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j2 f3198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j2 f3199d;

    j(j2 j2Var, j2 j2Var2, j2 j2Var3, j2 j2Var4) {
        if (j2Var == null) {
            throw new NullPointerException("Null previewOutputSurface");
        }
        this.f3196a = j2Var;
        if (j2Var2 == null) {
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        this.f3197b = j2Var2;
        this.f3198c = j2Var3;
        this.f3199d = j2Var4;
    }

    @Override // androidx.camera.core.impl.k2
    public j2 b() {
        return this.f3198c;
    }

    @Override // androidx.camera.core.impl.k2
    @NonNull
    public j2 c() {
        return this.f3197b;
    }

    @Override // androidx.camera.core.impl.k2
    public j2 d() {
        return this.f3199d;
    }

    @Override // androidx.camera.core.impl.k2
    @NonNull
    public j2 e() {
        return this.f3196a;
    }

    public boolean equals(Object obj) {
        j2 j2Var;
        j2 j2Var2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            k2 k2Var = (k2) obj;
            if (this.f3196a.equals(k2Var.e()) && this.f3197b.equals(k2Var.c()) && ((j2Var = this.f3198c) != null ? j2Var.equals(k2Var.b()) : k2Var.b() == null) && ((j2Var2 = this.f3199d) != null ? j2Var2.equals(k2Var.d()) : k2Var.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f3196a.hashCode() ^ 1000003) * 1000003) ^ this.f3197b.hashCode()) * 1000003;
        j2 j2Var = this.f3198c;
        int iHashCode2 = (iHashCode ^ (j2Var == null ? 0 : j2Var.hashCode())) * 1000003;
        j2 j2Var2 = this.f3199d;
        return iHashCode2 ^ (j2Var2 != null ? j2Var2.hashCode() : 0);
    }

    public String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.f3196a + ", imageCaptureOutputSurface=" + this.f3197b + ", imageAnalysisOutputSurface=" + this.f3198c + ", postviewOutputSurface=" + this.f3199d + "}";
    }
}
