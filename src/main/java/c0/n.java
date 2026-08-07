package c0;

import android.util.Range;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface n {
    @NonNull
    androidx.p003lifecycle.d0<q> a();

    @NonNull
    p c();

    default int f() {
        return -1;
    }

    @NonNull
    default Set<Range<Integer>> g() {
        return Collections.EMPTY_SET;
    }

    int i(int i11);

    default boolean j(@NonNull e0 e0Var) {
        return false;
    }

    @NonNull
    androidx.p003lifecycle.d0<d2> l();

    int m();

    boolean q();

    @NonNull
    androidx.p003lifecycle.d0<Integer> u();

    @NonNull
    c0 v();

    @NonNull
    String x();
}
