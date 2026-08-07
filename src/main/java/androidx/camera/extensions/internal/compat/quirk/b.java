package androidx.camera.extensions.internal.compat.quirk;

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
        if (n2Var.a(ExtensionDisabledQuirk.class, ExtensionDisabledQuirk.l())) {
            arrayList.add(new ExtensionDisabledQuirk());
        }
        if (n2Var.a(CrashWhenOnDisableTooSoon.class, CrashWhenOnDisableTooSoon.g())) {
            arrayList.add(new CrashWhenOnDisableTooSoon());
        }
        if (n2Var.a(GetAvailableKeysNeedsOnInit.class, GetAvailableKeysNeedsOnInit.g())) {
            arrayList.add(new GetAvailableKeysNeedsOnInit());
        }
        if (n2Var.a(CaptureOutputSurfaceOccupiedQuirk.class, CaptureOutputSurfaceOccupiedQuirk.g())) {
            arrayList.add(new CaptureOutputSurfaceOccupiedQuirk());
        }
        return arrayList;
    }
}
