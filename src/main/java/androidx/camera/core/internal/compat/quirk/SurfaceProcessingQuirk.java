package androidx.camera.core.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import androidx.camera.core.impl.r2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public interface SurfaceProcessingQuirk extends m2 {
    static boolean c(@NonNull r2 r2Var) {
        Iterator it = r2Var.c(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    default boolean b() {
        return true;
    }
}
