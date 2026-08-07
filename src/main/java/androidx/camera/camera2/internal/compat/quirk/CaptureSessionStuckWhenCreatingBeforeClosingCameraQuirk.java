package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import w.z;

/* JADX INFO: loaded from: classes.dex */
public class CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk implements m2 {
    static boolean g(@NonNull z zVar) {
        return h(zVar);
    }

    private static boolean h(@NonNull z zVar) {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && zVar.b().equals("1");
    }
}
