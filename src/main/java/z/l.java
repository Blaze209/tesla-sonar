package z;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.impl.e3;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExtraCroppingQuirk f126040a;

    public l() {
        this((ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraCroppingQuirk.class));
    }

    @NonNull
    public Size a(@NonNull Size size) {
        Size sizeG;
        ExtraCroppingQuirk extraCroppingQuirk = this.f126040a;
        return (extraCroppingQuirk == null || (sizeG = extraCroppingQuirk.g(e3.b.PRIV)) == null || sizeG.getWidth() * sizeG.getHeight() <= size.getWidth() * size.getHeight()) ? size : sizeG;
    }

    l(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f126040a = extraCroppingQuirk;
    }
}
