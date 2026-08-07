package androidx.camera.core.internal;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.n1;

/* JADX INFO: loaded from: classes.dex */
final class a extends CameraUseCaseAdapter.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n1 f3402b;

    a(String str, n1 n1Var) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.f3401a = str;
        if (n1Var == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.f3402b = n1Var;
    }

    @Override // androidx.camera.core.internal.CameraUseCaseAdapter.a
    @NonNull
    public n1 b() {
        return this.f3402b;
    }

    @Override // androidx.camera.core.internal.CameraUseCaseAdapter.a
    @NonNull
    public String c() {
        return this.f3401a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraUseCaseAdapter.a) {
            CameraUseCaseAdapter.a aVar = (CameraUseCaseAdapter.a) obj;
            if (this.f3401a.equals(aVar.c()) && this.f3402b.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f3401a.hashCode() ^ 1000003) * 1000003) ^ this.f3402b.hashCode();
    }

    public String toString() {
        return "CameraId{cameraIdString=" + this.f3401a + ", cameraConfigId=" + this.f3402b + "}";
    }
}
