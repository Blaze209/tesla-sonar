package v;

import android.hardware.camera2.CaptureFailure;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.camera.core.impl.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CaptureFailure f116995b;

    public g(@NonNull androidx.camera.core.impl.r.a aVar, @NonNull CaptureFailure captureFailure) {
        super(aVar);
        this.f116995b = captureFailure;
    }

    @Override // androidx.camera.core.impl.r
    @NonNull
    public Object a() {
        return this.f116995b;
    }
}
