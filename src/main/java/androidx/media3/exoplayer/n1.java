package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final androidx.media3.exoplayer.source.r.b f10580a = new androidx.media3.exoplayer.source.r.b(new Object());

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a8.o2 f10581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p7.r0 f10582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.r.b f10583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f10584d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f10585e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f10586f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f10587g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f10588h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f10589i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f10590j;

        public a(a8.o2 o2Var, p7.r0 r0Var, androidx.media3.exoplayer.source.r.b bVar, long j11, long j12, float f11, boolean z11, boolean z12, long j13, long j14) {
            this.f10581a = o2Var;
            this.f10582b = r0Var;
            this.f10583c = bVar;
            this.f10584d = j11;
            this.f10585e = j12;
            this.f10586f = f11;
            this.f10587g = z11;
            this.f10588h = z12;
            this.f10589i = j13;
            this.f10590j = j14;
        }
    }

    @Deprecated
    default void a() {
        throw new IllegalStateException("onPrepared not implemented");
    }

    @Deprecated
    default void b() {
        throw new IllegalStateException("onStopped not implemented");
    }

    @Deprecated
    default boolean c() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    @Deprecated
    default boolean d(long j11, long j12, float f11) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    @Deprecated
    default long e() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    @Deprecated
    default boolean f(long j11, float f11, boolean z11, long j12) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    s8.b g();

    default long h(a8.o2 o2Var) {
        return e();
    }

    @Deprecated
    default boolean i(p7.r0 r0Var, androidx.media3.exoplayer.source.r.b bVar, long j11, float f11, boolean z11, long j12) {
        return f(j11, f11, z11, j12);
    }

    default boolean j(a aVar) {
        return d(aVar.f10584d, aVar.f10585e, aVar.f10586f);
    }

    default boolean k(a aVar) {
        return i(aVar.f10582b, aVar.f10583c, aVar.f10585e, aVar.f10586f, aVar.f10588h, aVar.f10589i);
    }

    default boolean l(a8.o2 o2Var) {
        return c();
    }

    default void m(a8.o2 o2Var) {
        a();
    }

    default boolean n(p7.r0 r0Var, androidx.media3.exoplayer.source.r.b bVar, long j11) {
        s7.t.i("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default void o(a8.o2 o2Var) {
        b();
    }

    @Deprecated
    default void onReleased() {
        throw new IllegalStateException("onReleased not implemented");
    }

    default void p(a8.o2 o2Var) {
        onReleased();
    }

    default void q(a aVar, n8.y yVar, r8.t[] tVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }
}
