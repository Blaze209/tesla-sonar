package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class d extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<g> f3495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Surface f3496e;

    d(int i11, int i12, String str, List<g> list, Surface surface) {
        this.f3492a = i11;
        this.f3493b = i12;
        this.f3494c = str;
        if (list == null) {
            throw new NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.f3495d = list;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f3496e = surface;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.g
    public String a() {
        return this.f3494c;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.g
    public int b() {
        return this.f3493b;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.g
    @NonNull
    public List<g> c() {
        return this.f3495d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f3492a == xVar.getId() && this.f3493b == xVar.b() && ((str = this.f3494c) != null ? str.equals(xVar.a()) : xVar.a() == null) && this.f3495d.equals(xVar.c()) && this.f3496e.equals(xVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.x
    @NonNull
    Surface f() {
        return this.f3496e;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.g
    public int getId() {
        return this.f3492a;
    }

    public int hashCode() {
        int i11 = (((this.f3492a ^ 1000003) * 1000003) ^ this.f3493b) * 1000003;
        String str = this.f3494c;
        return ((((i11 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f3495d.hashCode()) * 1000003) ^ this.f3496e.hashCode();
    }

    public String toString() {
        return "SurfaceOutputConfig{id=" + this.f3492a + ", surfaceGroupId=" + this.f3493b + ", physicalCameraId=" + this.f3494c + ", surfaceSharingOutputConfigs=" + this.f3495d + ", surface=" + this.f3496e + "}";
    }
}
