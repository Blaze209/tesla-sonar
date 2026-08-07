package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface z2 {

    public interface a {
        default void a(int i11) {
        }

        default void b(long j11, int i11, @NonNull z zVar) {
        }

        default void c(int i11) {
        }

        default void d(int i11, long j11) {
        }

        default void e(int i11) {
        }

        default void onCaptureProcessProgressed(int i11) {
        }

        default void onCaptureSequenceAborted(int i11) {
        }
    }

    void a();

    void b(@NonNull t2 t2Var);

    int c(@NonNull g3 g3Var, @NonNull a aVar);

    void d();

    void e();

    @NonNull
    default Map<Integer, List<Size>> f(@NonNull Size size) {
        return Collections.EMPTY_MAP;
    }

    void g(@NonNull x0 x0Var);

    default int h(@NonNull x0 x0Var, @NonNull g3 g3Var, @NonNull a aVar) {
        return -1;
    }

    @NonNull
    default Set<Integer> i() {
        return Collections.EMPTY_SET;
    }

    int j(boolean z11, @NonNull g3 g3Var, @NonNull a aVar);

    @NonNull
    x2 k(@NonNull c0.n nVar, @NonNull k2 k2Var);
}
