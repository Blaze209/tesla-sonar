package t0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.o3;
import c0.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static b0 a(@NonNull List<b0> list) {
        if (list.isEmpty()) {
            return null;
        }
        b0 b0Var = list.get(0);
        Integer numValueOf = Integer.valueOf(b0Var.b());
        Integer numValueOf2 = Integer.valueOf(b0Var.a());
        for (int i11 = 1; i11 < list.size(); i11++) {
            b0 b0Var2 = list.get(i11);
            numValueOf = c(numValueOf, Integer.valueOf(b0Var2.b()));
            numValueOf2 = b(numValueOf2, Integer.valueOf(b0Var2.a()));
            if (numValueOf == null || numValueOf2 == null) {
                return null;
            }
        }
        return new b0(numValueOf.intValue(), numValueOf2.intValue());
    }

    private static Integer b(@NonNull Integer num, @NonNull Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0) || num.equals(num2)) {
            return num;
        }
        return null;
    }

    private static Integer c(@NonNull Integer num, @NonNull Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (!num2.equals(0)) {
            if (num.equals(2) && !num2.equals(1)) {
                return num2;
            }
            if ((!num2.equals(2) || num.equals(1)) && !num.equals(num2)) {
                return null;
            }
        }
        return num;
    }

    public static b0 d(@NonNull Set<o3<?>> set) {
        ArrayList arrayList = new ArrayList();
        Iterator<o3<?>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().w());
        }
        return a(arrayList);
    }
}
