package t0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.c2;
import androidx.camera.core.impl.d2;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.p3;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
class g implements o3.b<f, h, g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f111980a;

    g() {
        this(d2.c0());
    }

    @Override // androidx.camera.core.impl.o3.b
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h d() {
        return new h(i2.b0(this.f111980a));
    }

    @Override // c0.d0
    @NonNull
    public c2 b() {
        return this.f111980a;
    }

    @NonNull
    public g c(@NonNull p3.b bVar) {
        b().K(o3.C, bVar);
        return this;
    }

    @NonNull
    public g e(@NonNull Class<f> cls) {
        b().K(k0.k.I, cls);
        if (b().d(k0.k.H, null) == null) {
            f(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    @NonNull
    public g f(@NonNull String str) {
        b().K(k0.k.H, str);
        return this;
    }

    g(@NonNull d2 d2Var) {
        this.f111980a = d2Var;
        Class cls = (Class) d2Var.d(k0.k.I, null);
        if (cls == null || cls.equals(f.class)) {
            c(p3.b.STREAM_SHARING);
            e(f.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
