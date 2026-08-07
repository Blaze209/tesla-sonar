package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    @NonNull
    public static String a(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
        }
        return "CONCURRENT_CAMERA";
    }
}
