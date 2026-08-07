package z;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.impl.e3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExtraCroppingQuirk f126056a;

    public u() {
        this((ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraCroppingQuirk.class));
    }

    @NonNull
    public List<Size> a(@NonNull e3.b bVar, @NonNull List<Size> list) {
        Size sizeG;
        ExtraCroppingQuirk extraCroppingQuirk = this.f126056a;
        if (extraCroppingQuirk == null || (sizeG = extraCroppingQuirk.g(bVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(sizeG);
        for (Size size : list) {
            if (!size.equals(sizeG)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    u(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f126056a = extraCroppingQuirk;
    }
}
