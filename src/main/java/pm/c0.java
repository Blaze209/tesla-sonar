package pm;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.e1;
import com.facebook.imagepipeline.producers.g1;
import com.facebook.imagepipeline.producers.j1;
import com.facebook.imagepipeline.producers.k1;
import com.facebook.imagepipeline.producers.l1;
import com.facebook.imagepipeline.producers.n1;
import com.facebook.imagepipeline.producers.p1;
import com.facebook.imagepipeline.producers.q1;
import com.facebook.imagepipeline.producers.w0;
import com.facebook.imagepipeline.producers.x0;
import com.facebook.imagepipeline.producers.z0;

/* JADX INFO: loaded from: classes3.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ContentResolver f103212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Resources f103213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected AssetManager f103214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final sk.a f103215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final sm.b f103216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final sm.d f103217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final n f103218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final boolean f103219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final boolean f103220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final p f103221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final sk.h f103222k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final pk.n<c> f103223l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final nm.x<jk.d, PooledByteBuffer> f103224m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final nm.x<jk.d, um.e> f103225n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final nm.k f103226o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final nm.d<jk.d> f103227p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final nm.d<jk.d> f103228q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final mm.d f103229r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final int f103230s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final int f103231t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f103232u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final a f103233v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected final int f103234w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final boolean f103235x;

    public c0(Context context, sk.a aVar, sm.b bVar, sm.d dVar, n nVar, boolean z11, boolean z12, p pVar, sk.h hVar, nm.x<jk.d, um.e> xVar, nm.x<jk.d, PooledByteBuffer> xVar2, pk.n<c> nVar2, nm.k kVar, mm.d dVar2, int i11, int i12, boolean z13, int i13, a aVar2, boolean z14, int i14) {
        this.f103212a = context.getApplicationContext().getContentResolver();
        this.f103213b = context.getApplicationContext().getResources();
        this.f103214c = context.getApplicationContext().getAssets();
        this.f103215d = aVar;
        this.f103216e = bVar;
        this.f103217f = dVar;
        this.f103218g = nVar;
        this.f103219h = z11;
        this.f103220i = z12;
        this.f103221j = pVar;
        this.f103222k = hVar;
        this.f103225n = xVar;
        this.f103224m = xVar2;
        this.f103223l = nVar2;
        this.f103226o = kVar;
        this.f103229r = dVar2;
        this.f103227p = new nm.d<>(i14);
        this.f103228q = new nm.d<>(i14);
        this.f103230s = i11;
        this.f103231t = i12;
        this.f103232u = z13;
        this.f103234w = i13;
        this.f103233v = aVar2;
        this.f103235x = z14;
    }

    public static com.facebook.imagepipeline.producers.a a(z0<um.k> z0Var) {
        return new com.facebook.imagepipeline.producers.a(z0Var);
    }

    public static com.facebook.imagepipeline.producers.l h(z0<um.k> z0Var, z0<um.k> z0Var2) {
        return new com.facebook.imagepipeline.producers.l(z0Var, z0Var2);
    }

    public w0 A(z0<tk.a<um.e>> z0Var) {
        return new w0(this.f103225n, this.f103226o, z0Var);
    }

    public x0 B(z0<tk.a<um.e>> z0Var) {
        return new x0(z0Var, this.f103229r, this.f103221j.getBackgroundExecutor());
    }

    public e1 C() {
        return new e1(this.f103221j.getIoBoundExecutor(), this.f103222k, this.f103212a);
    }

    public g1 D(z0<um.k> z0Var, boolean z11, cn.d dVar) {
        return new g1(this.f103221j.getBackgroundExecutor(), this.f103222k, z0Var, z11, dVar);
    }

    public <T> j1<T> E(z0<T> z0Var) {
        return new j1<>(z0Var);
    }

    public <T> n1<T> F(z0<T> z0Var) {
        return new n1<>(5, this.f103221j.getLightWeightBackgroundExecutor(), z0Var);
    }

    public p1 G(q1<um.k>[] q1VarArr) {
        return new p1(q1VarArr);
    }

    public <T> z0<T> b(z0<T> z0Var, l1 l1Var) {
        return new k1(z0Var, l1Var);
    }

    public com.facebook.imagepipeline.producers.g c(z0<tk.a<um.e>> z0Var) {
        return new com.facebook.imagepipeline.producers.g(this.f103225n, this.f103226o, z0Var);
    }

    public com.facebook.imagepipeline.producers.h d(z0<tk.a<um.e>> z0Var) {
        return new com.facebook.imagepipeline.producers.h(this.f103226o, z0Var);
    }

    public com.facebook.imagepipeline.producers.i e(z0<tk.a<um.e>> z0Var) {
        return new com.facebook.imagepipeline.producers.i(this.f103225n, this.f103226o, z0Var);
    }

    public com.facebook.imagepipeline.producers.j f(z0<tk.a<um.e>> z0Var) {
        return new com.facebook.imagepipeline.producers.j(z0Var, this.f103230s, this.f103231t, this.f103232u);
    }

    public com.facebook.imagepipeline.producers.k g(z0<tk.a<um.e>> z0Var) {
        return new com.facebook.imagepipeline.producers.k(this.f103224m, this.f103223l, this.f103226o, this.f103227p, this.f103228q, z0Var);
    }

    public com.facebook.imagepipeline.producers.p i() {
        return new com.facebook.imagepipeline.producers.p(this.f103222k);
    }

    public com.facebook.imagepipeline.producers.q j(z0<um.k> z0Var) {
        return new com.facebook.imagepipeline.producers.q(this.f103215d, this.f103221j.getDecodeExecutor(), this.f103216e, this.f103217f, this.f103218g, this.f103219h, this.f103220i, z0Var, this.f103234w, this.f103233v, null, pk.o.f103136b);
    }

    public com.facebook.imagepipeline.producers.t k(z0<tk.a<um.e>> z0Var) {
        return new com.facebook.imagepipeline.producers.t(z0Var, this.f103221j.getBackgroundScheduledExecutorService());
    }

    public com.facebook.imagepipeline.producers.v l(z0<um.k> z0Var) {
        return new com.facebook.imagepipeline.producers.v(this.f103223l, this.f103226o, z0Var);
    }

    public com.facebook.imagepipeline.producers.w m(z0<um.k> z0Var) {
        return new com.facebook.imagepipeline.producers.w(this.f103223l, this.f103226o, z0Var);
    }

    public com.facebook.imagepipeline.producers.y n(z0<um.k> z0Var) {
        return new com.facebook.imagepipeline.producers.y(this.f103226o, this.f103235x, z0Var);
    }

    public z0<um.k> o(z0<um.k> z0Var) {
        return new com.facebook.imagepipeline.producers.z(this.f103224m, this.f103226o, z0Var);
    }

    public com.facebook.imagepipeline.producers.a0 p(z0<um.k> z0Var) {
        return new com.facebook.imagepipeline.producers.a0(this.f103223l, this.f103226o, this.f103227p, this.f103228q, z0Var);
    }

    public com.facebook.imagepipeline.producers.h0 q() {
        return new com.facebook.imagepipeline.producers.h0(this.f103221j.getIoBoundExecutor(), this.f103222k, this.f103214c);
    }

    public com.facebook.imagepipeline.producers.i0 r() {
        return new com.facebook.imagepipeline.producers.i0(this.f103221j.getIoBoundExecutor(), this.f103222k, this.f103212a);
    }

    public com.facebook.imagepipeline.producers.j0 s() {
        return new com.facebook.imagepipeline.producers.j0(this.f103221j.getIoBoundExecutor(), this.f103222k, this.f103212a);
    }

    public LocalExifThumbnailProducer t() {
        return new LocalExifThumbnailProducer(this.f103221j.d(), this.f103222k, this.f103212a);
    }

    public com.facebook.imagepipeline.producers.m0 u() {
        return new com.facebook.imagepipeline.producers.m0(this.f103221j.getIoBoundExecutor(), this.f103222k);
    }

    public com.facebook.imagepipeline.producers.n0 v() {
        return new com.facebook.imagepipeline.producers.n0(this.f103221j.getIoBoundExecutor(), this.f103222k, this.f103213b);
    }

    public com.facebook.imagepipeline.producers.o0 w() {
        return new com.facebook.imagepipeline.producers.o0(this.f103221j.getBackgroundExecutor(), this.f103212a);
    }

    public com.facebook.imagepipeline.producers.p0 x() {
        return new com.facebook.imagepipeline.producers.p0(this.f103221j.getIoBoundExecutor(), this.f103212a);
    }

    public z0<um.k> y(com.facebook.imagepipeline.producers.t0 t0Var) {
        return new com.facebook.imagepipeline.producers.s0(this.f103222k, this.f103215d, t0Var);
    }

    public com.facebook.imagepipeline.producers.u0 z(z0<um.k> z0Var) {
        return new com.facebook.imagepipeline.producers.u0(this.f103223l, this.f103226o, this.f103222k, this.f103215d, z0Var);
    }
}
