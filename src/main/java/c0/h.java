package c0;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class h extends z1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f18314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f18317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Matrix f18318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f18319f;

    h(Rect rect, int i11, int i12, boolean z11, Matrix matrix, boolean z12) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f18314a = rect;
        this.f18315b = i11;
        this.f18316c = i12;
        this.f18317d = z11;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f18318e = matrix;
        this.f18319f = z12;
    }

    @Override // c0.z1.h
    @NonNull
    public Rect a() {
        return this.f18314a;
    }

    @Override // c0.z1.h
    public int b() {
        return this.f18315b;
    }

    @Override // c0.z1.h
    @NonNull
    public Matrix c() {
        return this.f18318e;
    }

    @Override // c0.z1.h
    public int d() {
        return this.f18316c;
    }

    @Override // c0.z1.h
    public boolean e() {
        return this.f18317d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1.h) {
            z1.h hVar = (z1.h) obj;
            if (this.f18314a.equals(hVar.a()) && this.f18315b == hVar.b() && this.f18316c == hVar.d() && this.f18317d == hVar.e() && this.f18318e.equals(hVar.c()) && this.f18319f == hVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // c0.z1.h
    public boolean f() {
        return this.f18319f;
    }

    public int hashCode() {
        return ((((((((((this.f18314a.hashCode() ^ 1000003) * 1000003) ^ this.f18315b) * 1000003) ^ this.f18316c) * 1000003) ^ (this.f18317d ? 1231 : 1237)) * 1000003) ^ this.f18318e.hashCode()) * 1000003) ^ (this.f18319f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f18314a + ", getRotationDegrees=" + this.f18315b + ", getTargetRotation=" + this.f18316c + ", hasCameraTransform=" + this.f18317d + ", getSensorToBufferTransform=" + this.f18318e + ", isMirroring=" + this.f18319f + "}";
    }
}
