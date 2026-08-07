package com.google.android.libraries.barhopper;

import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByNative;

/* JADX INFO: loaded from: classes5.dex */
@UsedByNative("jni_common.cc")
public final class MultiScaleDecodingOptions {

    @UsedByNative("jni_common.cc")
    private float[] extraScales = new float[0];

    @UsedByNative("jni_common.cc")
    private int minimumDetectedDimension = 10;

    @UsedByNative("jni_common.cc")
    private boolean skipProcessingIfBarcodeFound = true;

    public void a(@NonNull float[] fArr) {
        this.extraScales = fArr;
    }

    public void b(int i11) {
        this.minimumDetectedDimension = i11;
    }

    public void c(boolean z11) {
        this.skipProcessingIfBarcodeFound = z11;
    }
}
