package b0;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.i0;
import c0.n;
import v.k2;
import v.x0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private x0 f15242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k2 f15243b;

    public h(@NonNull x0 x0Var) {
        this.f15242a = x0Var;
    }

    @NonNull
    public static h a(@NonNull n nVar) {
        if (nVar instanceof k2) {
            return ((k2) nVar).A();
        }
        i0 implementation = ((i0) nVar).getImplementation();
        u5.h.b(implementation instanceof x0, "CameraInfo doesn't contain Camera2 implementation.");
        return ((x0) implementation).A();
    }

    public <T> T b(@NonNull CameraCharacteristics.Key<T> key) {
        return (T) this.f15242a.B().a(key);
    }

    @NonNull
    public String c() {
        return this.f15242a.d();
    }
}
