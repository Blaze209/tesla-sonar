package h0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.z2;
import c0.e0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static e0 a(z2 z2Var, @NonNull e0 e0Var) {
        boolean z11;
        if (z2Var == null) {
            return e0Var;
        }
        e0.a aVar = new e0.a(e0Var);
        boolean z12 = true;
        if (e0Var.c().isEmpty() || b(z2Var, 1, 2)) {
            z11 = false;
        } else {
            aVar.d(1);
            z11 = true;
        }
        if (!e0Var.b().isEmpty() && !b(z2Var, 3)) {
            aVar.d(2);
            z11 = true;
        }
        if (e0Var.d().isEmpty() || b(z2Var, 4)) {
            z12 = z11;
        } else {
            aVar.d(4);
        }
        if (!z12) {
            return e0Var;
        }
        e0 e0VarB = aVar.b();
        if (e0VarB.c().isEmpty() && e0VarB.b().isEmpty() && e0VarB.d().isEmpty()) {
            return null;
        }
        return aVar.b();
    }

    public static boolean b(z2 z2Var, @NonNull int... iArr) {
        if (z2Var == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i11 : iArr) {
            arrayList.add(Integer.valueOf(i11));
        }
        return z2Var.i().containsAll(arrayList);
    }
}
