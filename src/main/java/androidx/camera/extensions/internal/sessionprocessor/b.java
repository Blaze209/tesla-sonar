package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<g> f3482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Size f3483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f3485g;

    b(int i11, int i12, String str, List<g> list, Size size, int i13, int i14) {
        this.f3479a = i11;
        this.f3480b = i12;
        this.f3481c = str;
        if (list == null) {
            throw new NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.f3482d = list;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f3483e = size;
        this.f3484f = i13;
        this.f3485g = i14;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.g
    public String a() {
        return this.f3481c;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.g
    public int b() {
        return this.f3480b;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.g
    @NonNull
    public List<g> c() {
        return this.f3482d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f3479a == mVar.getId() && this.f3480b == mVar.b() && ((str = this.f3481c) != null ? str.equals(mVar.a()) : mVar.a() == null) && this.f3482d.equals(mVar.c()) && this.f3483e.equals(mVar.h()) && this.f3484f == mVar.f() && this.f3485g == mVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.m
    int f() {
        return this.f3484f;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.m
    int g() {
        return this.f3485g;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.g
    public int getId() {
        return this.f3479a;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.m
    @NonNull
    Size h() {
        return this.f3483e;
    }

    public int hashCode() {
        int i11 = (((this.f3479a ^ 1000003) * 1000003) ^ this.f3480b) * 1000003;
        String str = this.f3481c;
        return ((((((((i11 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f3482d.hashCode()) * 1000003) ^ this.f3483e.hashCode()) * 1000003) ^ this.f3484f) * 1000003) ^ this.f3485g;
    }

    public String toString() {
        return "ImageReaderOutputConfig{id=" + this.f3479a + ", surfaceGroupId=" + this.f3480b + ", physicalCameraId=" + this.f3481c + ", surfaceSharingOutputConfigs=" + this.f3482d + ", size=" + this.f3483e + ", imageFormat=" + this.f3484f + ", maxImages=" + this.f3485g + "}";
    }
}
