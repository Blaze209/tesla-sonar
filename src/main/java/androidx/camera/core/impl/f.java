package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class f extends j1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<j1.a> f3169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<j1.c> f3170d;

    f(int i11, int i12, List<j1.a> list, List<j1.c> list2) {
        this.f3167a = i11;
        this.f3168b = i12;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f3169c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f3170d = list2;
    }

    @Override // androidx.camera.core.impl.j1
    public int b() {
        return this.f3168b;
    }

    @Override // androidx.camera.core.impl.j1
    @NonNull
    public List<j1.a> c() {
        return this.f3169c;
    }

    @Override // androidx.camera.core.impl.j1
    public int d() {
        return this.f3167a;
    }

    @Override // androidx.camera.core.impl.j1
    @NonNull
    public List<j1.c> e() {
        return this.f3170d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1.b) {
            j1.b bVar = (j1.b) obj;
            if (this.f3167a == bVar.d() && this.f3168b == bVar.b() && this.f3169c.equals(bVar.c()) && this.f3170d.equals(bVar.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f3167a ^ 1000003) * 1000003) ^ this.f3168b) * 1000003) ^ this.f3169c.hashCode()) * 1000003) ^ this.f3170d.hashCode();
    }

    public String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f3167a + ", recommendedFileFormat=" + this.f3168b + ", audioProfiles=" + this.f3169c + ", videoProfiles=" + this.f3170d + "}";
    }
}
