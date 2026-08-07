package h1;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.j1;
import f1.k;

/* JADX INFO: loaded from: classes.dex */
public class c {
    @NonNull
    public static j1.c a(@NonNull j1.c cVar, @NonNull Size size, @NonNull Range<Integer> range) {
        return j1.c.a(cVar.e(), cVar.i(), k.e(cVar.c(), cVar.b(), cVar.b(), cVar.f(), cVar.f(), size.getWidth(), cVar.k(), size.getHeight(), cVar.h(), range), cVar.f(), size.getWidth(), size.getHeight(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    public static j1.c b(j1 j1Var) {
        if (j1Var == null || j1Var.e().isEmpty()) {
            return null;
        }
        return j1Var.e().get(0);
    }
}
