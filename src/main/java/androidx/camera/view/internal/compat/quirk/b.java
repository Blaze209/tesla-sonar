package androidx.camera.view.internal.compat.quirk;

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
        if (n2Var.a(SurfaceViewStretchedQuirk.class, SurfaceViewStretchedQuirk.j())) {
            arrayList.add(new SurfaceViewStretchedQuirk());
        }
        if (n2Var.a(SurfaceViewNotCroppedByParentQuirk.class, SurfaceViewNotCroppedByParentQuirk.g())) {
            arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
        }
        return arrayList;
    }
}
