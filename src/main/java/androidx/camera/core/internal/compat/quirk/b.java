package androidx.camera.core.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import androidx.camera.core.impl.n2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {
    @NonNull
    static List<m2> a(@NonNull n2 n2Var) {
        ArrayList arrayList = new ArrayList();
        if (n2Var.a(ImageCaptureRotationOptionQuirk.class, ImageCaptureRotationOptionQuirk.l())) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (n2Var.a(SurfaceOrderQuirk.class, SurfaceOrderQuirk.g())) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (n2Var.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.h())) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (n2Var.a(LowMemoryQuirk.class, LowMemoryQuirk.g())) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (n2Var.a(LargeJpegImageQuirk.class, LargeJpegImageQuirk.j())) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        if (n2Var.a(IncorrectJpegMetadataQuirk.class, IncorrectJpegMetadataQuirk.k())) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        if (n2Var.a(ImageCaptureFailedForSpecificCombinationQuirk.class, ImageCaptureFailedForSpecificCombinationQuirk.j())) {
            arrayList.add(new ImageCaptureFailedForSpecificCombinationQuirk());
        }
        if (n2Var.a(PreviewGreenTintQuirk.class, PreviewGreenTintQuirk.h())) {
            arrayList.add(PreviewGreenTintQuirk.f3409a);
        }
        return arrayList;
    }
}
