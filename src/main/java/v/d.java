package v;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class d extends q0.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f116881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<?> f116882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.camera.core.impl.x2 f116883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.camera.core.impl.o3<?> f116884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Size f116885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.camera.core.impl.c3 f116886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<androidx.camera.core.impl.p3.b> f116887g;

    d(String str, Class<?> cls, androidx.camera.core.impl.x2 x2Var, androidx.camera.core.impl.o3<?> o3Var, Size size, androidx.camera.core.impl.c3 c3Var, List<androidx.camera.core.impl.p3.b> list) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f116881a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.f116882b = cls;
        if (x2Var == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f116883c = x2Var;
        if (o3Var == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f116884d = o3Var;
        this.f116885e = size;
        this.f116886f = c3Var;
        this.f116887g = list;
    }

    @Override // v.q0.k
    List<androidx.camera.core.impl.p3.b> c() {
        return this.f116887g;
    }

    @Override // v.q0.k
    @NonNull
    androidx.camera.core.impl.x2 d() {
        return this.f116883c;
    }

    @Override // v.q0.k
    androidx.camera.core.impl.c3 e() {
        return this.f116886f;
    }

    public boolean equals(Object obj) {
        Size size;
        androidx.camera.core.impl.c3 c3Var;
        List<androidx.camera.core.impl.p3.b> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0.k) {
            q0.k kVar = (q0.k) obj;
            if (this.f116881a.equals(kVar.h()) && this.f116882b.equals(kVar.i()) && this.f116883c.equals(kVar.d()) && this.f116884d.equals(kVar.g()) && ((size = this.f116885e) != null ? size.equals(kVar.f()) : kVar.f() == null) && ((c3Var = this.f116886f) != null ? c3Var.equals(kVar.e()) : kVar.e() == null) && ((list = this.f116887g) != null ? list.equals(kVar.c()) : kVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // v.q0.k
    Size f() {
        return this.f116885e;
    }

    @Override // v.q0.k
    @NonNull
    androidx.camera.core.impl.o3<?> g() {
        return this.f116884d;
    }

    @Override // v.q0.k
    @NonNull
    String h() {
        return this.f116881a;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f116881a.hashCode() ^ 1000003) * 1000003) ^ this.f116882b.hashCode()) * 1000003) ^ this.f116883c.hashCode()) * 1000003) ^ this.f116884d.hashCode()) * 1000003;
        Size size = this.f116885e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        androidx.camera.core.impl.c3 c3Var = this.f116886f;
        int iHashCode3 = (iHashCode2 ^ (c3Var == null ? 0 : c3Var.hashCode())) * 1000003;
        List<androidx.camera.core.impl.p3.b> list = this.f116887g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // v.q0.k
    @NonNull
    Class<?> i() {
        return this.f116882b;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f116881a + ", useCaseType=" + this.f116882b + ", sessionConfig=" + this.f116883c + ", useCaseConfig=" + this.f116884d + ", surfaceResolution=" + this.f116885e + ", streamSpec=" + this.f116886f + ", captureTypes=" + this.f116887g + "}";
    }
}
