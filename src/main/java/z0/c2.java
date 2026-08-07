package z0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.g2;
import androidx.camera.core.impl.h3;

/* JADX INFO: loaded from: classes.dex */
public interface c2 {

    public enum a {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    void a(@NonNull c0.z1 z1Var);

    default void b(@NonNull c0.z1 z1Var, @NonNull h3 h3Var) {
        a(z1Var);
    }

    @NonNull
    default g2<s> c() {
        return androidx.camera.core.impl.z0.f(null);
    }

    @NonNull
    default j1 d(@NonNull c0.n nVar) {
        return j1.f126162a;
    }

    @NonNull
    default g2<i1> e() {
        return i1.f126157c;
    }

    @NonNull
    default g2<Boolean> g() {
        return androidx.camera.core.impl.z0.f(Boolean.FALSE);
    }

    default void f(@NonNull a aVar) {
    }
}
