package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface z1 extends w1.b {

    public interface a {
        void a();

        void b();
    }

    void C(br.j0 j0Var, u0[] u0VarArr, es.q qVar, long j11, boolean z11, boolean z12, long j12, long j13);

    void D(u0[] u0VarArr, es.q qVar, long j11, long j12);

    void F(int i11, cr.q1 q1Var);

    boolean a();

    int c();

    void d(long j11, long j12);

    void disable();

    es.q f();

    String getName();

    int getState();

    boolean h();

    boolean isReady();

    boolean l();

    long n();

    void o(long j11);

    ts.w p();

    default void release() {
    }

    void reset();

    void start();

    void stop();

    void t();

    void w();

    a2 x();

    default void z(float f11, float f12) {
    }
}
