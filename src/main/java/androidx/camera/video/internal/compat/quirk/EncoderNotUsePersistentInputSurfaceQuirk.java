package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.m2;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EncoderNotUsePersistentInputSurfaceQuirk implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f3663a = Arrays.asList("SM-N9208", "SM-G920V");

    static boolean g() {
        return f3663a.contains(Build.MODEL.toUpperCase());
    }
}
