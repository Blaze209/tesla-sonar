package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import c0.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import w.r0;
import w.z;

/* JADX INFO: loaded from: classes.dex */
public class CamcorderProfileResolutionQuirk implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f2983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Size> f2984b = null;

    public CamcorderProfileResolutionQuirk(@NonNull z zVar) {
        this.f2983a = zVar.d();
    }

    static boolean h(@NonNull z zVar) {
        Integer num = (Integer) zVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    @NonNull
    public List<Size> g() {
        if (this.f2984b == null) {
            Size[] sizeArrC = this.f2983a.c(34);
            this.f2984b = sizeArrC != null ? Arrays.asList((Size[]) sizeArrC.clone()) : Collections.EMPTY_LIST;
            y0.a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + this.f2984b);
        }
        return new ArrayList(this.f2984b);
    }
}
