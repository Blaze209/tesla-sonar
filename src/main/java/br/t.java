package br;

import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.z1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final es.j f17944a = new es.j(new Object());

    void a();

    void b();

    boolean c();

    boolean d(long j11, long j12, float f11);

    long e();

    @Deprecated
    default boolean f(long j11, float f11, boolean z11, long j12) {
        return h(f2.f39911a, f17944a, j11, f11, z11, j12);
    }

    ss.b g();

    default boolean h(f2 f2Var, es.j jVar, long j11, float f11, boolean z11, long j12) {
        return f(j11, f11, z11, j12);
    }

    default void i(f2 f2Var, es.j jVar, z1[] z1VarArr, es.w wVar, qs.r[] rVarArr) {
        j(z1VarArr, wVar, rVarArr);
    }

    @Deprecated
    default void j(z1[] z1VarArr, es.w wVar, qs.r[] rVarArr) {
        i(f2.f39911a, f17944a, z1VarArr, wVar, rVarArr);
    }

    void onReleased();
}
