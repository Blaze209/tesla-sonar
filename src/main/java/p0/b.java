package p0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class b<T> extends b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f100092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0.g f100093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f100094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Size f100095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f100096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f100097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Matrix f100098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.camera.core.impl.z f100099h;

    b(T t11, h0.g gVar, int i11, Size size, Rect rect, int i12, Matrix matrix, androidx.camera.core.impl.z zVar) {
        if (t11 == null) {
            throw new NullPointerException("Null data");
        }
        this.f100092a = t11;
        this.f100093b = gVar;
        this.f100094c = i11;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f100095d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f100096e = rect;
        this.f100097f = i12;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f100098g = matrix;
        if (zVar == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f100099h = zVar;
    }

    @Override // p0.b0
    @NonNull
    public androidx.camera.core.impl.z a() {
        return this.f100099h;
    }

    @Override // p0.b0
    @NonNull
    public Rect b() {
        return this.f100096e;
    }

    @Override // p0.b0
    @NonNull
    public T c() {
        return this.f100092a;
    }

    @Override // p0.b0
    public h0.g d() {
        return this.f100093b;
    }

    @Override // p0.b0
    public int e() {
        return this.f100094c;
    }

    public boolean equals(Object obj) {
        h0.g gVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.f100092a.equals(b0Var.c()) && ((gVar = this.f100093b) != null ? gVar.equals(b0Var.d()) : b0Var.d() == null) && this.f100094c == b0Var.e() && this.f100095d.equals(b0Var.h()) && this.f100096e.equals(b0Var.b()) && this.f100097f == b0Var.f() && this.f100098g.equals(b0Var.g()) && this.f100099h.equals(b0Var.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // p0.b0
    public int f() {
        return this.f100097f;
    }

    @Override // p0.b0
    @NonNull
    public Matrix g() {
        return this.f100098g;
    }

    @Override // p0.b0
    @NonNull
    public Size h() {
        return this.f100095d;
    }

    public int hashCode() {
        int iHashCode = (this.f100092a.hashCode() ^ 1000003) * 1000003;
        h0.g gVar = this.f100093b;
        return ((((((((((((iHashCode ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003) ^ this.f100094c) * 1000003) ^ this.f100095d.hashCode()) * 1000003) ^ this.f100096e.hashCode()) * 1000003) ^ this.f100097f) * 1000003) ^ this.f100098g.hashCode()) * 1000003) ^ this.f100099h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f100092a + ", exif=" + this.f100093b + ", format=" + this.f100094c + ", size=" + this.f100095d + ", cropRect=" + this.f100096e + ", rotationDegrees=" + this.f100097f + ", sensorToBufferTransform=" + this.f100098g + ", cameraCaptureResult=" + this.f100099h + "}";
    }
}
