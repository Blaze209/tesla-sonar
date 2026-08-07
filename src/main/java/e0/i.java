package e0;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class i extends k1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f61321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c0.r0.e f61322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c0.r0.f f61323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c0.r0.g f61324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c0.r0.g f61325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f61326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Matrix f61327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f61328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f61329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f61330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f61331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<androidx.camera.core.impl.p> f61332n;

    i(Executor executor, c0.r0.e eVar, c0.r0.f fVar, c0.r0.g gVar, c0.r0.g gVar2, Rect rect, Matrix matrix, int i11, int i12, int i13, boolean z11, List<androidx.camera.core.impl.p> list) {
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f61321c = executor;
        this.f61322d = eVar;
        this.f61323e = fVar;
        this.f61324f = gVar;
        this.f61325g = gVar2;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f61326h = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f61327i = matrix;
        this.f61328j = i11;
        this.f61329k = i12;
        this.f61330l = i13;
        this.f61331m = z11;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f61332n = list;
    }

    public boolean equals(Object obj) {
        c0.r0.e eVar;
        c0.r0.f fVar;
        c0.r0.g gVar;
        c0.r0.g gVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            if (this.f61321c.equals(k1Var.g()) && ((eVar = this.f61322d) != null ? eVar.equals(k1Var.j()) : k1Var.j() == null) && ((fVar = this.f61323e) != null ? fVar.equals(k1Var.l()) : k1Var.l() == null) && ((gVar = this.f61324f) != null ? gVar.equals(k1Var.m()) : k1Var.m() == null) && ((gVar2 = this.f61325g) != null ? gVar2.equals(k1Var.o()) : k1Var.o() == null) && this.f61326h.equals(k1Var.i()) && this.f61327i.equals(k1Var.p()) && this.f61328j == k1Var.n() && this.f61329k == k1Var.k() && this.f61330l == k1Var.h() && this.f61331m == k1Var.t() && this.f61332n.equals(k1Var.q())) {
                return true;
            }
        }
        return false;
    }

    @Override // e0.k1
    @NonNull
    Executor g() {
        return this.f61321c;
    }

    @Override // e0.k1
    int h() {
        return this.f61330l;
    }

    public int hashCode() {
        int iHashCode = (this.f61321c.hashCode() ^ 1000003) * 1000003;
        c0.r0.e eVar = this.f61322d;
        int iHashCode2 = (iHashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        c0.r0.f fVar = this.f61323e;
        int iHashCode3 = (iHashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        c0.r0.g gVar = this.f61324f;
        int iHashCode4 = (iHashCode3 ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003;
        c0.r0.g gVar2 = this.f61325g;
        return ((((((((((((((iHashCode4 ^ (gVar2 != null ? gVar2.hashCode() : 0)) * 1000003) ^ this.f61326h.hashCode()) * 1000003) ^ this.f61327i.hashCode()) * 1000003) ^ this.f61328j) * 1000003) ^ this.f61329k) * 1000003) ^ this.f61330l) * 1000003) ^ (this.f61331m ? 1231 : 1237)) * 1000003) ^ this.f61332n.hashCode();
    }

    @Override // e0.k1
    @NonNull
    public Rect i() {
        return this.f61326h;
    }

    @Override // e0.k1
    public c0.r0.e j() {
        return this.f61322d;
    }

    @Override // e0.k1
    public int k() {
        return this.f61329k;
    }

    @Override // e0.k1
    public c0.r0.f l() {
        return this.f61323e;
    }

    @Override // e0.k1
    public c0.r0.g m() {
        return this.f61324f;
    }

    @Override // e0.k1
    public int n() {
        return this.f61328j;
    }

    @Override // e0.k1
    public c0.r0.g o() {
        return this.f61325g;
    }

    @Override // e0.k1
    @NonNull
    Matrix p() {
        return this.f61327i;
    }

    @Override // e0.k1
    @NonNull
    List<androidx.camera.core.impl.p> q() {
        return this.f61332n;
    }

    @Override // e0.k1
    boolean t() {
        return this.f61331m;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.f61321c + ", inMemoryCallback=" + this.f61322d + ", onDiskCallback=" + this.f61323e + ", outputFileOptions=" + this.f61324f + ", secondaryOutputFileOptions=" + this.f61325g + ", cropRect=" + this.f61326h + ", sensorToBufferTransform=" + this.f61327i + ", rotationDegrees=" + this.f61328j + ", jpegQuality=" + this.f61329k + ", captureMode=" + this.f61330l + ", simultaneousCapture=" + this.f61331m + ", sessionConfigCameraCaptureCallbacks=" + this.f61332n + "}";
    }
}
