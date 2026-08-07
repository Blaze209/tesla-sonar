package b1;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.j1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class a extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<j1.a> f15254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<j1.c> f15255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j1.a f15256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j1.c f15257f;

    a(int i11, int i12, List<j1.a> list, List<j1.c> list2, j1.a aVar, j1.c cVar) {
        this.f15252a = i11;
        this.f15253b = i12;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f15254c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f15255d = list2;
        this.f15256e = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f15257f = cVar;
    }

    @Override // androidx.camera.core.impl.j1
    public int b() {
        return this.f15253b;
    }

    @Override // androidx.camera.core.impl.j1
    @NonNull
    public List<j1.a> c() {
        return this.f15254c;
    }

    @Override // androidx.camera.core.impl.j1
    public int d() {
        return this.f15252a;
    }

    @Override // androidx.camera.core.impl.j1
    @NonNull
    public List<j1.c> e() {
        return this.f15255d;
    }

    public boolean equals(Object obj) {
        j1.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f15252a == iVar.d() && this.f15253b == iVar.b() && this.f15254c.equals(iVar.c()) && this.f15255d.equals(iVar.e()) && ((aVar = this.f15256e) != null ? aVar.equals(iVar.j()) : iVar.j() == null) && this.f15257f.equals(iVar.k())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f15252a ^ 1000003) * 1000003) ^ this.f15253b) * 1000003) ^ this.f15254c.hashCode()) * 1000003) ^ this.f15255d.hashCode()) * 1000003;
        j1.a aVar = this.f15256e;
        return ((iHashCode ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003) ^ this.f15257f.hashCode();
    }

    @Override // b1.i
    public j1.a j() {
        return this.f15256e;
    }

    @Override // b1.i
    @NonNull
    public j1.c k() {
        return this.f15257f;
    }

    public String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f15252a + ", recommendedFileFormat=" + this.f15253b + ", audioProfiles=" + this.f15254c + ", videoProfiles=" + this.f15255d + ", defaultAudioProfile=" + this.f15256e + ", defaultVideoProfile=" + this.f15257f + "}";
    }
}
