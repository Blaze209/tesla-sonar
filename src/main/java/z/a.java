package z;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.core.impl.r2;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f126028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f126029b;

    public a(@NonNull r2 r2Var) {
        this.f126028a = r2Var.a(ImageCaptureFailWithAutoFlashQuirk.class);
        this.f126029b = androidx.camera.camera2.internal.compat.quirk.b.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }

    public int a(int i11) {
        if ((this.f126028a || this.f126029b) && i11 == 2) {
            return 1;
        }
        return i11;
    }
}
