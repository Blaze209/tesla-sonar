package n0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.v0;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.n;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public boolean a() {
        ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (ImageCaptureRotationOptionQuirk) androidx.camera.core.internal.compat.quirk.a.b(ImageCaptureRotationOptionQuirk.class);
        return imageCaptureRotationOptionQuirk == null || imageCaptureRotationOptionQuirk.k(v0.f3311i);
    }

    public boolean b(@NonNull n nVar) {
        return a() && ImageUtil.j(nVar.getFormat());
    }
}
