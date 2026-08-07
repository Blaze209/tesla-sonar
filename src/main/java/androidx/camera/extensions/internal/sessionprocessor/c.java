package androidx.camera.extensions.internal.sessionprocessor;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class c extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<g> f3489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3491f;

    c(int i11, int i12, String str, List<g> list, int i13, int i14) {
        this.f3486a = i11;
        this.f3487b = i12;
        this.f3488c = str;
        if (list == null) {
            throw new NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.f3489d = list;
        this.f3490e = i13;
        this.f3491f = i14;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.g
    public String a() {
        return this.f3488c;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.g
    public int b() {
        return this.f3487b;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.g
    @NonNull
    public List<g> c() {
        return this.f3489d;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.p
    int e() {
        return this.f3490e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f3486a == pVar.getId() && this.f3487b == pVar.b() && ((str = this.f3488c) != null ? str.equals(pVar.a()) : pVar.a() == null) && this.f3489d.equals(pVar.c()) && this.f3490e == pVar.e() && this.f3491f == pVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.p
    int f() {
        return this.f3491f;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.g
    public int getId() {
        return this.f3486a;
    }

    public int hashCode() {
        int i11 = (((this.f3486a ^ 1000003) * 1000003) ^ this.f3487b) * 1000003;
        String str = this.f3488c;
        return ((((((i11 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f3489d.hashCode()) * 1000003) ^ this.f3490e) * 1000003) ^ this.f3491f;
    }

    public String toString() {
        return "MultiResolutionImageReaderOutputConfig{id=" + this.f3486a + ", surfaceGroupId=" + this.f3487b + ", physicalCameraId=" + this.f3488c + ", surfaceSharingOutputConfigs=" + this.f3489d + ", imageFormat=" + this.f3490e + ", maxImages=" + this.f3491f + "}";
    }
}
