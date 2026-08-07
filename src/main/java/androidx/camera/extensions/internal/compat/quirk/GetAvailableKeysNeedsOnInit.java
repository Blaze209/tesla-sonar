package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.m2;

/* JADX INFO: loaded from: classes.dex */
public class GetAvailableKeysNeedsOnInit implements m2 {
    static boolean g() {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG");
    }
}
