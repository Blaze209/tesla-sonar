package x0;

import androidx.annotation.NonNull;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.p003lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
final class a extends f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LifecycleOwner f122476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CameraUseCaseAdapter.a f122477b;

    a(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.a aVar) {
        if (lifecycleOwner == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f122476a = lifecycleOwner;
        if (aVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f122477b = aVar;
    }

    @Override // x0.f.a
    @NonNull
    public CameraUseCaseAdapter.a b() {
        return this.f122477b;
    }

    @Override // x0.f.a
    @NonNull
    public LifecycleOwner c() {
        return this.f122476a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.a) {
            f.a aVar = (f.a) obj;
            if (this.f122476a.equals(aVar.c()) && this.f122477b.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f122476a.hashCode() ^ 1000003) * 1000003) ^ this.f122477b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f122476a + ", cameraId=" + this.f122477b + "}";
    }
}
