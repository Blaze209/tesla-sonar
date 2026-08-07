package z;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.core.impl.r2;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static boolean a(@NonNull r2 r2Var) {
        return r2Var.a(LegacyCameraOutputConfigNullPointerQuirk.class) || r2Var.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class);
    }
}
