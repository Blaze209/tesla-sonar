package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface l2 extends j2.b {

    public interface a {
        void a();

        void b();
    }

    void G(p7.r0 r0Var);

    void I(int i11, a8.o2 o2Var, s7.j jVar);

    default void K() {
    }

    default long M(long j11, long j12) {
        if (getState() == 1) {
            return (isReady() || a()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    void N(p7.u[] uVarArr, n8.s sVar, long j11, long j12, androidx.media3.exoplayer.source.r.b bVar);

    void P(z7.y yVar, p7.u[] uVarArr, n8.s sVar, long j11, boolean z11, boolean z12, long j12, long j13, androidx.media3.exoplayer.source.r.b bVar);

    boolean a();

    int c();

    void d(long j11, long j12);

    void disable();

    n8.s f();

    String getName();

    int getState();

    boolean h();

    boolean isReady();

    boolean l();

    long n();

    void o(long j11);

    z7.w p();

    default void release() {
    }

    void reset();

    void start();

    void stop();

    void t();

    void w();

    m2 x();

    default void z(float f11, float f12) {
    }
}
