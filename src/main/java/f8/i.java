package f8;

import android.util.SparseArray;
import s7.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<i0> f64558a = new SparseArray<>();

    public i0 a(int i11) {
        i0 i0Var = this.f64558a.get(i11);
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0(9223372036854775806L);
        this.f64558a.put(i11, i0Var2);
        return i0Var2;
    }

    public void b() {
        this.f64558a.clear();
    }
}
