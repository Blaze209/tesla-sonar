package c0;

import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.g3;

/* JADX INFO: loaded from: classes.dex */
final class d extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g3 f18286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f18289d;

    d(g3 g3Var, long j11, int i11, Matrix matrix) {
        if (g3Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f18286a = g3Var;
        this.f18287b = j11;
        this.f18288c = i11;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f18289d = matrix;
    }

    @Override // c0.x0, c0.s0
    public long a() {
        return this.f18287b;
    }

    @Override // c0.x0, c0.s0
    @NonNull
    public g3 c() {
        return this.f18286a;
    }

    @Override // c0.x0, c0.s0
    public int d() {
        return this.f18288c;
    }

    @Override // c0.x0, c0.s0
    @NonNull
    public Matrix e() {
        return this.f18289d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            if (this.f18286a.equals(x0Var.c()) && this.f18287b == x0Var.a() && this.f18288c == x0Var.d() && this.f18289d.equals(x0Var.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f18286a.hashCode() ^ 1000003) * 1000003;
        long j11 = this.f18287b;
        return ((((iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f18288c) * 1000003) ^ this.f18289d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f18286a + ", timestamp=" + this.f18287b + ", rotationDegrees=" + this.f18288c + ", sensorToBufferTransformMatrix=" + this.f18289d + "}";
    }
}
