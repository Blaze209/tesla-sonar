package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.m2;

/* JADX INFO: loaded from: classes.dex */
public class NegativeLatLongSavesIncorrectlyQuirk implements m2 {
    static boolean g() {
        return Build.VERSION.SDK_INT < 34;
    }
}
