package a1;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.x0;
import g1.m1;
import g1.o1;
import java.util.Objects;
import k0.l;
import u5.h;
import z0.c2;
import z0.r1;

/* JADX INFO: loaded from: classes.dex */
public final class a<T extends c2> implements o3<r1<T>>, androidx.camera.core.impl.r1, l {
    public static final x0.a<c2> L = x0.a.a("camerax.video.VideoCapture.videoOutput", c2.class);
    public static final x0.a<r.a<m1, o1>> M = x0.a.a("camerax.video.VideoCapture.videoEncoderInfoFinder", r.a.class);
    public static final x0.a<Boolean> N = x0.a.a("camerax.video.VideoCapture.forceEnableSurfaceProcessing", Boolean.class);
    private final i2 K;

    public a(@NonNull i2 i2Var) {
        h.a(i2Var.e(L));
        this.K = i2Var;
    }

    @NonNull
    public r.a<m1, o1> Z() {
        r.a<m1, o1> aVar = (r.a) a(M);
        Objects.requireNonNull(aVar);
        return aVar;
    }

    @NonNull
    public T a0() {
        c2 c2Var = (c2) a(L);
        Objects.requireNonNull(c2Var);
        return (T) c2Var;
    }

    public boolean b0() {
        Boolean bool = (Boolean) d(N, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    @Override // androidx.camera.core.impl.s2
    @NonNull
    public x0 getConfig() {
        return this.K;
    }

    @Override // androidx.camera.core.impl.q1
    public int getInputFormat() {
        return 34;
    }
}
