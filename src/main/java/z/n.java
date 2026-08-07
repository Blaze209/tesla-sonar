package z;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import c0.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f126042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExtraSupportedOutputSizeQuirk f126043b = (ExtraSupportedOutputSizeQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraSupportedOutputSizeQuirk.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f126044c;

    public n(@NonNull String str) {
        this.f126042a = str;
        this.f126044c = new e(str);
    }

    private void a(@NonNull List<Size> list, int i11) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.f126043b;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] sizeArrG = extraSupportedOutputSizeQuirk.g(i11);
        if (sizeArrG.length > 0) {
            list.addAll(Arrays.asList(sizeArrG));
        }
    }

    private void c(@NonNull List<Size> list, int i11) {
        List<Size> listA = this.f126044c.a(i11);
        if (listA.isEmpty()) {
            return;
        }
        list.removeAll(listA);
    }

    @NonNull
    public Size[] b(@NonNull Size[] sizeArr, int i11) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        a(arrayList, i11);
        c(arrayList, i11);
        if (arrayList.isEmpty()) {
            y0.l("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
