package androidx.camera.camera2.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import androidx.camera.core.impl.r2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public interface CaptureIntentPreviewQuirk extends m2 {
    static boolean e(@NonNull r2 r2Var) {
        Iterator it = r2Var.c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    default boolean a() {
        return true;
    }
}
