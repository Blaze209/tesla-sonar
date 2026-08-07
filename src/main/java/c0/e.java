package c0;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class e extends o1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Size f18291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f18292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.camera.core.impl.j0 f18293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f18295e;

    e(Size size, Rect rect, androidx.camera.core.impl.j0 j0Var, int i11, boolean z11) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f18291a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f18292b = rect;
        this.f18293c = j0Var;
        this.f18294d = i11;
        this.f18295e = z11;
    }

    @Override // c0.o1.a
    public androidx.camera.core.impl.j0 a() {
        return this.f18293c;
    }

    @Override // c0.o1.a
    @NonNull
    public Rect b() {
        return this.f18292b;
    }

    @Override // c0.o1.a
    @NonNull
    public Size c() {
        return this.f18291a;
    }

    @Override // c0.o1.a
    public boolean d() {
        return this.f18295e;
    }

    @Override // c0.o1.a
    public int e() {
        return this.f18294d;
    }

    public boolean equals(Object obj) {
        androidx.camera.core.impl.j0 j0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1.a) {
            o1.a aVar = (o1.a) obj;
            if (this.f18291a.equals(aVar.c()) && this.f18292b.equals(aVar.b()) && ((j0Var = this.f18293c) != null ? j0Var.equals(aVar.a()) : aVar.a() == null) && this.f18294d == aVar.e() && this.f18295e == aVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f18291a.hashCode() ^ 1000003) * 1000003) ^ this.f18292b.hashCode()) * 1000003;
        androidx.camera.core.impl.j0 j0Var = this.f18293c;
        return ((((iHashCode ^ (j0Var == null ? 0 : j0Var.hashCode())) * 1000003) ^ this.f18294d) * 1000003) ^ (this.f18295e ? 1231 : 1237);
    }

    public String toString() {
        return "CameraInputInfo{inputSize=" + this.f18291a + ", inputCropRect=" + this.f18292b + ", cameraInternal=" + this.f18293c + ", rotationDegrees=" + this.f18294d + ", mirroring=" + this.f18295e + "}";
    }
}
