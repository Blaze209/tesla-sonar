package n0;

import androidx.annotation.NonNull;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import c0.a2;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageCaptureFailedForSpecificCombinationQuirk f92627a = (ImageCaptureFailedForSpecificCombinationQuirk) androidx.camera.core.internal.compat.quirk.a.b(ImageCaptureFailedForSpecificCombinationQuirk.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PreviewGreenTintQuirk f92628b = (PreviewGreenTintQuirk) androidx.camera.core.internal.compat.quirk.a.b(PreviewGreenTintQuirk.class);

    public boolean a(@NonNull String str, @NonNull Collection<a2> collection) {
        ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk = this.f92627a;
        if (imageCaptureFailedForSpecificCombinationQuirk != null) {
            return imageCaptureFailedForSpecificCombinationQuirk.k(str, collection);
        }
        if (this.f92628b != null) {
            return PreviewGreenTintQuirk.i(str, collection);
        }
        return false;
    }
}
