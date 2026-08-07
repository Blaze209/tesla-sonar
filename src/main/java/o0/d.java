package o0;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.r1;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static void a(@NonNull o3.b<?, ?, ?> bVar, int i11) {
        Size sizeC;
        r1 r1Var = (r1) bVar.d();
        int iU = r1Var.u(-1);
        if (iU == -1 || iU != i11) {
            ((r1.a) bVar).a(i11);
        }
        if (iU == -1 || i11 == -1 || iU == i11) {
            return;
        }
        if (Math.abs(h0.c.b(i11) - h0.c.b(iU)) % 180 != 90 || (sizeC = r1Var.C(null)) == null) {
            return;
        }
        ((r1.a) bVar).c(new Size(sizeC.getHeight(), sizeC.getWidth()));
    }
}
