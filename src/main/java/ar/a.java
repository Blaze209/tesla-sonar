package ar;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.HashMap;
import nq.f;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray<f> f14950a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<f, Integer> f14951b;

    static {
        HashMap<f, Integer> map = new HashMap<>();
        f14951b = map;
        map.put(f.DEFAULT, 0);
        f14951b.put(f.VERY_LOW, 1);
        f14951b.put(f.HIGHEST, 2);
        for (f fVar : f14951b.keySet()) {
            f14950a.append(f14951b.get(fVar).intValue(), fVar);
        }
    }

    public static int a(@NonNull f fVar) {
        Integer num = f14951b.get(fVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + fVar);
    }

    @NonNull
    public static f b(int i11) {
        f fVar = f14950a.get(i11);
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i11);
    }
}
