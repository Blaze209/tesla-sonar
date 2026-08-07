package e0;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b extends x.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Size f61271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f61272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<Integer> f61273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f61274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c0.w0 f61275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Size f61276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f61277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p0.u<u0> f61278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p0.u<a1.a> f61279n;

    b(Size size, int i11, List<Integer> list, boolean z11, c0.w0 w0Var, Size size2, int i12, p0.u<u0> uVar, p0.u<a1.a> uVar2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f61271f = size;
        this.f61272g = i11;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f61273h = list;
        this.f61274i = z11;
        this.f61275j = w0Var;
        this.f61276k = size2;
        this.f61277l = i12;
        if (uVar == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f61278m = uVar;
        if (uVar2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f61279n = uVar2;
    }

    @Override // e0.x.c
    @NonNull
    p0.u<a1.a> b() {
        return this.f61279n;
    }

    @Override // e0.x.c
    c0.w0 c() {
        return this.f61275j;
    }

    @Override // e0.x.c
    int d() {
        return this.f61272g;
    }

    @Override // e0.x.c
    @NonNull
    List<Integer> e() {
        return this.f61273h;
    }

    public boolean equals(Object obj) {
        c0.w0 w0Var;
        Size size;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x.c) {
            x.c cVar = (x.c) obj;
            if (this.f61271f.equals(cVar.l()) && this.f61272g == cVar.d() && this.f61273h.equals(cVar.e()) && this.f61274i == cVar.n() && ((w0Var = this.f61275j) != null ? w0Var.equals(cVar.c()) : cVar.c() == null) && ((size = this.f61276k) != null ? size.equals(cVar.g()) : cVar.g() == null) && this.f61277l == cVar.f() && this.f61278m.equals(cVar.i()) && this.f61279n.equals(cVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // e0.x.c
    int f() {
        return this.f61277l;
    }

    @Override // e0.x.c
    Size g() {
        return this.f61276k;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f61271f.hashCode() ^ 1000003) * 1000003) ^ this.f61272g) * 1000003) ^ this.f61273h.hashCode()) * 1000003) ^ (this.f61274i ? 1231 : 1237)) * 1000003;
        c0.w0 w0Var = this.f61275j;
        int iHashCode2 = (iHashCode ^ (w0Var == null ? 0 : w0Var.hashCode())) * 1000003;
        Size size = this.f61276k;
        return ((((((iHashCode2 ^ (size != null ? size.hashCode() : 0)) * 1000003) ^ this.f61277l) * 1000003) ^ this.f61278m.hashCode()) * 1000003) ^ this.f61279n.hashCode();
    }

    @Override // e0.x.c
    @NonNull
    p0.u<u0> i() {
        return this.f61278m;
    }

    @Override // e0.x.c
    @NonNull
    Size l() {
        return this.f61271f;
    }

    @Override // e0.x.c
    boolean n() {
        return this.f61274i;
    }

    public String toString() {
        return "In{size=" + this.f61271f + ", inputFormat=" + this.f61272g + ", outputFormats=" + this.f61273h + ", virtualCamera=" + this.f61274i + ", imageReaderProxyProvider=" + this.f61275j + ", postviewSize=" + this.f61276k + ", postviewImageFormat=" + this.f61277l + ", requestEdge=" + this.f61278m + ", errorEdge=" + this.f61279n + "}";
    }
}
