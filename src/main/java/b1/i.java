package b1;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.j1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements j1 {
    @NonNull
    public static i h(int i11, int i12, @NonNull List<j1.a> list, @NonNull List<j1.c> list2) {
        u5.h.b(!list2.isEmpty(), "Should contain at least one VideoProfile.");
        return new a(i11, i12, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)), !list.isEmpty() ? list.get(0) : null, list2.get(0));
    }

    @NonNull
    public static i i(@NonNull j1 j1Var) {
        return h(j1Var.d(), j1Var.b(), j1Var.c(), j1Var.e());
    }

    public abstract j1.a j();

    @NonNull
    public abstract j1.c k();
}
