package il;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import java.util.concurrent.Executor;
import pk.g;
import pk.i;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T, INFO> implements ol.a, hl.a.InterfaceC1536a, nl.a.InterfaceC2028a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Map<String, Object> f78226w = g.of("component_tag", "drawee");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map<String, Object> f78227x = g.of("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Class<?> f78228y = a.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hl.a f78230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f78231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private hl.d f78232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private nl.a f78233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected d<INFO> f78234f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ol.c f78236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f78237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f78238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Object f78239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f78240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f78241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f78242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f78243o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f78244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f78245q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.facebook.datasource.c<T> f78246r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private T f78247s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected Drawable f78250v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hl.c f78229a = hl.c.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected bm.d<INFO> f78235g = new bm.d<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f78248t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f78249u = false;

    /* JADX INFO: renamed from: il.a$a, reason: collision with other inner class name */
    class C1660a extends com.facebook.datasource.b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f78251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f78252b;

        C1660a(String str, boolean z11) {
            this.f78251a = str;
            this.f78252b = z11;
        }

        @Override // com.facebook.datasource.b
        public void onFailureImpl(com.facebook.datasource.c<T> cVar) {
            a.this.L(this.f78251a, cVar, cVar.b(), true);
        }

        @Override // com.facebook.datasource.b
        public void onNewResultImpl(com.facebook.datasource.c<T> cVar) {
            boolean zIsFinished = cVar.isFinished();
            boolean zD = cVar.d();
            float progress = cVar.getProgress();
            T result = cVar.getResult();
            if (result != null) {
                a.this.N(this.f78251a, cVar, result, progress, zIsFinished, this.f78252b, zD);
            } else if (zIsFinished) {
                a.this.L(this.f78251a, cVar, new NullPointerException(), true);
            }
        }

        @Override // com.facebook.datasource.b, com.facebook.datasource.e
        public void onProgressUpdate(com.facebook.datasource.c<T> cVar) {
            boolean zIsFinished = cVar.isFinished();
            a.this.O(this.f78251a, cVar, cVar.getProgress(), zIsFinished);
        }
    }

    private static class b<INFO> extends f<INFO> {
        private b() {
        }

        public static <INFO> b<INFO> g(d<? super INFO> dVar, d<? super INFO> dVar2) {
            if (bn.b.d()) {
                bn.b.a("AbstractDraweeController#createInternal");
            }
            b<INFO> bVar = new b<>();
            bVar.a(dVar);
            bVar.a(dVar2);
            if (bn.b.d()) {
                bn.b.b();
            }
            return bVar;
        }
    }

    public a(hl.a aVar, Executor executor, String str, Object obj) {
        this.f78230b = aVar;
        this.f78231c = executor;
        C(str, obj);
    }

    private ol.c B() {
        ol.c cVar = this.f78236h;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.f78239k);
    }

    private synchronized void C(String str, Object obj) {
        hl.a aVar;
        try {
            if (bn.b.d()) {
                bn.b.a("AbstractDraweeController#init");
            }
            this.f78229a.b(hl.c.a.ON_INIT_CONTROLLER);
            if (!this.f78248t && (aVar = this.f78230b) != null) {
                aVar.a(this);
            }
            this.f78240l = false;
            this.f78242n = false;
            Q();
            this.f78244p = false;
            hl.d dVar = this.f78232d;
            if (dVar != null) {
                dVar.a();
            }
            nl.a aVar2 = this.f78233e;
            if (aVar2 != null) {
                aVar2.a();
                this.f78233e.f(this);
            }
            d<INFO> dVar2 = this.f78234f;
            if (dVar2 instanceof b) {
                ((b) dVar2).b();
            } else {
                this.f78234f = null;
            }
            ol.c cVar = this.f78236h;
            if (cVar != null) {
                cVar.reset();
                this.f78236h.c(null);
                this.f78236h = null;
            }
            this.f78237i = null;
            if (qk.a.w(2)) {
                qk.a.A(f78228y, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f78238j, str);
            }
            this.f78238j = str;
            this.f78239k = obj;
            if (bn.b.d()) {
                bn.b.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private boolean E(String str, com.facebook.datasource.c<T> cVar) {
        if (cVar == null && this.f78246r == null) {
            return true;
        }
        return str.equals(this.f78238j) && cVar == this.f78246r && this.f78241m;
    }

    private void G(String str, Throwable th2) {
        if (qk.a.w(2)) {
            qk.a.B(f78228y, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f78238j, str, th2);
        }
    }

    private void H(String str, T t11) {
        if (qk.a.w(2)) {
            qk.a.C(f78228y, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f78238j, str, w(t11), Integer.valueOf(x(t11)));
        }
    }

    private bm.b.a I(com.facebook.datasource.c<T> cVar, INFO info, Uri uri) {
        return J(cVar == null ? null : cVar.getExtras(), K(info), uri);
    }

    private bm.b.a J(Map<String, Object> map, Map<String, Object> map2, Uri uri) {
        String str;
        PointF pointFM;
        ol.c cVar = this.f78236h;
        if (cVar instanceof ml.a) {
            ml.a aVar = (ml.a) cVar;
            String strValueOf = String.valueOf(aVar.n());
            pointFM = aVar.m();
            str = strValueOf;
        } else {
            str = null;
            pointFM = null;
        }
        return am.b.a(f78226w, f78227x, map, null, t(), str, pointFM, map2, o(), F(), uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(String str, com.facebook.datasource.c<T> cVar, Throwable th2, boolean z11) {
        Drawable drawable;
        if (bn.b.d()) {
            bn.b.a("AbstractDraweeController#onFailureInternal");
        }
        if (!E(str, cVar)) {
            G("ignore_old_datasource @ onFailure", th2);
            cVar.close();
            if (bn.b.d()) {
                bn.b.b();
                return;
            }
            return;
        }
        this.f78229a.b(z11 ? hl.c.a.ON_DATASOURCE_FAILURE : hl.c.a.ON_DATASOURCE_FAILURE_INT);
        if (z11) {
            G("final_failed @ onFailure", th2);
            this.f78246r = null;
            this.f78243o = true;
            ol.c cVar2 = this.f78236h;
            if (cVar2 != null) {
                if (this.f78244p && (drawable = this.f78250v) != null) {
                    cVar2.f(drawable, 1.0f, true);
                } else if (h0()) {
                    cVar2.a(th2);
                } else {
                    cVar2.d(th2);
                }
            }
            U(th2, cVar);
        } else {
            G("intermediate_failed @ onFailure", th2);
            V(th2);
        }
        if (bn.b.d()) {
            bn.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(String str, com.facebook.datasource.c<T> cVar, T t11, float f11, boolean z11, boolean z12, boolean z13) {
        try {
            if (bn.b.d()) {
                bn.b.a("AbstractDraweeController#onNewResultInternal");
            }
            if (!E(str, cVar)) {
                H("ignore_old_datasource @ onNewResult", t11);
                R(t11);
                cVar.close();
                if (bn.b.d()) {
                    bn.b.b();
                    return;
                }
                return;
            }
            this.f78229a.b(z11 ? hl.c.a.ON_DATASOURCE_RESULT : hl.c.a.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable drawableL = l(t11);
                T t12 = this.f78247s;
                Drawable drawable = this.f78250v;
                this.f78247s = t11;
                this.f78250v = drawableL;
                try {
                    if (z11) {
                        H("set_final_result @ onNewResult", t11);
                        this.f78246r = null;
                        B().f(drawableL, 1.0f, z12);
                        Z(str, t11, cVar);
                    } else if (z13) {
                        H("set_temporary_result @ onNewResult", t11);
                        B().f(drawableL, 1.0f, z12);
                        Z(str, t11, cVar);
                    } else {
                        H("set_intermediate_result @ onNewResult", t11);
                        B().f(drawableL, f11, z12);
                        W(str, t11);
                    }
                    if (drawable != null && drawable != drawableL) {
                        P(drawable);
                    }
                    if (t12 != null && t12 != t11) {
                        H("release_previous_result @ onNewResult", t12);
                        R(t12);
                    }
                    if (bn.b.d()) {
                        bn.b.b();
                    }
                } catch (Throwable th2) {
                    if (drawable != null && drawable != drawableL) {
                        P(drawable);
                    }
                    if (t12 != null && t12 != t11) {
                        H("release_previous_result @ onNewResult", t12);
                        R(t12);
                    }
                    throw th2;
                }
            } catch (Exception e11) {
                H("drawable_failed @ onNewResult", t11);
                R(t11);
                L(str, cVar, e11, z11);
                if (bn.b.d()) {
                    bn.b.b();
                }
            }
        } catch (Throwable th3) {
            if (bn.b.d()) {
                bn.b.b();
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(String str, com.facebook.datasource.c<T> cVar, float f11, boolean z11) {
        if (!E(str, cVar)) {
            G("ignore_old_datasource @ onProgress", null);
            cVar.close();
        } else {
            if (z11) {
                return;
            }
            this.f78236h.e(f11, false);
        }
    }

    private void Q() {
        Map<String, Object> extras;
        boolean z11 = this.f78241m;
        this.f78241m = false;
        this.f78243o = false;
        com.facebook.datasource.c<T> cVar = this.f78246r;
        Map<String, Object> map = null;
        if (cVar != null) {
            extras = cVar.getExtras();
            this.f78246r.close();
            this.f78246r = null;
        } else {
            extras = null;
        }
        Drawable drawable = this.f78250v;
        if (drawable != null) {
            P(drawable);
        }
        if (this.f78245q != null) {
            this.f78245q = null;
        }
        this.f78250v = null;
        T t11 = this.f78247s;
        if (t11 != null) {
            Map<String, Object> mapK = K(y(t11));
            H("release", this.f78247s);
            R(this.f78247s);
            this.f78247s = null;
            map = mapK;
        }
        if (z11) {
            X(extras, map);
        }
    }

    private void U(Throwable th2, com.facebook.datasource.c<T> cVar) {
        bm.b.a aVarI = I(cVar, null, null);
        p().n(this.f78238j, th2);
        q().B(this.f78238j, th2, aVarI);
    }

    private void V(Throwable th2) {
        p().r(this.f78238j, th2);
        q().n(this.f78238j);
    }

    private void W(String str, T t11) {
        INFO infoY = y(t11);
        p().c(str, infoY);
        q().c(str, infoY);
    }

    private void X(Map<String, Object> map, Map<String, Object> map2) {
        p().e(this.f78238j);
        q().t(this.f78238j, J(map, map2, null));
    }

    private void Z(String str, T t11, com.facebook.datasource.c<T> cVar) {
        INFO infoY = y(t11);
        p().p(str, infoY, m());
        q().p(str, infoY, I(cVar, infoY, null));
    }

    private boolean h0() {
        hl.d dVar;
        return this.f78243o && (dVar = this.f78232d) != null && dVar.e();
    }

    private Rect t() {
        ol.c cVar = this.f78236h;
        if (cVar == null) {
            return null;
        }
        return cVar.getBounds();
    }

    protected hl.d A() {
        if (this.f78232d == null) {
            this.f78232d = new hl.d();
        }
        return this.f78232d;
    }

    protected void D(String str, Object obj) {
        C(str, obj);
        this.f78248t = false;
        this.f78249u = false;
    }

    protected boolean F() {
        return this.f78249u;
    }

    public abstract Map<String, Object> K(INFO info);

    protected abstract void P(Drawable drawable);

    protected abstract void R(T t11);

    public void S(d<? super INFO> dVar) {
        k.g(dVar);
        d<INFO> dVar2 = this.f78234f;
        if (dVar2 instanceof b) {
            ((b) dVar2).f(dVar);
        } else if (dVar2 == dVar) {
            this.f78234f = null;
        }
    }

    public void T(bm.b<INFO> bVar) {
        this.f78235g.I(bVar);
    }

    protected void Y(com.facebook.datasource.c<T> cVar, INFO info) {
        p().l(this.f78238j, this.f78239k);
        q().C(this.f78238j, this.f78239k, I(cVar, info, z()));
    }

    @Override // nl.a.InterfaceC2028a
    public boolean a() {
        if (qk.a.w(2)) {
            qk.a.z(f78228y, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f78238j);
        }
        if (!h0()) {
            return false;
        }
        this.f78232d.b();
        this.f78236h.reset();
        i0();
        return true;
    }

    public void a0(String str) {
        this.f78245q = str;
    }

    @Override // ol.a
    public void b() {
        if (bn.b.d()) {
            bn.b.a("AbstractDraweeController#onAttach");
        }
        if (qk.a.w(2)) {
            qk.a.A(f78228y, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f78238j, this.f78241m ? "request already submitted" : "request needs submit");
        }
        this.f78229a.b(hl.c.a.ON_ATTACH_CONTROLLER);
        k.g(this.f78236h);
        this.f78230b.a(this);
        this.f78240l = true;
        if (!this.f78241m) {
            i0();
        }
        if (bn.b.d()) {
            bn.b.b();
        }
    }

    protected void b0(Drawable drawable) {
        this.f78237i = drawable;
        ol.c cVar = this.f78236h;
        if (cVar != null) {
            cVar.c(drawable);
        }
    }

    @Override // ol.a
    public boolean c(MotionEvent motionEvent) {
        if (qk.a.w(2)) {
            qk.a.A(f78228y, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f78238j, motionEvent);
        }
        nl.a aVar = this.f78233e;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b() && !g0()) {
            return false;
        }
        this.f78233e.d(motionEvent);
        return true;
    }

    @Override // ol.a
    public void d() {
        if (bn.b.d()) {
            bn.b.a("AbstractDraweeController#onDetach");
        }
        if (qk.a.w(2)) {
            qk.a.z(f78228y, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f78238j);
        }
        this.f78229a.b(hl.c.a.ON_DETACH_CONTROLLER);
        this.f78240l = false;
        this.f78230b.d(this);
        if (bn.b.d()) {
            bn.b.b();
        }
    }

    protected void d0(nl.a aVar) {
        this.f78233e = aVar;
        if (aVar != null) {
            aVar.f(this);
        }
    }

    @Override // ol.a
    public void e(ol.b bVar) {
        if (qk.a.w(2)) {
            qk.a.A(f78228y, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f78238j, bVar);
        }
        this.f78229a.b(bVar != null ? hl.c.a.ON_SET_HIERARCHY : hl.c.a.ON_CLEAR_HIERARCHY);
        if (this.f78241m) {
            this.f78230b.a(this);
            release();
        }
        ol.c cVar = this.f78236h;
        if (cVar != null) {
            cVar.c(null);
            this.f78236h = null;
        }
        if (bVar != null) {
            k.b(Boolean.valueOf(bVar instanceof ol.c));
            ol.c cVar2 = (ol.c) bVar;
            this.f78236h = cVar2;
            cVar2.c(this.f78237i);
        }
    }

    protected void e0(boolean z11) {
        this.f78249u = z11;
    }

    @Override // ol.a
    public ol.b f() {
        return this.f78236h;
    }

    protected void f0(boolean z11) {
        this.f78244p = z11;
    }

    protected boolean g0() {
        return h0();
    }

    protected void i0() {
        if (bn.b.d()) {
            bn.b.a("AbstractDraweeController#submitRequest");
        }
        T tN = n();
        if (tN != null) {
            if (bn.b.d()) {
                bn.b.a("AbstractDraweeController#submitRequest->cache");
            }
            this.f78246r = null;
            this.f78241m = true;
            this.f78243o = false;
            this.f78229a.b(hl.c.a.ON_SUBMIT_CACHE_HIT);
            Y(this.f78246r, y(tN));
            M(this.f78238j, tN);
            N(this.f78238j, this.f78246r, tN, 1.0f, true, true, true);
            if (bn.b.d()) {
                bn.b.b();
            }
            if (bn.b.d()) {
                bn.b.b();
                return;
            }
            return;
        }
        this.f78229a.b(hl.c.a.ON_DATASOURCE_SUBMIT);
        this.f78236h.e(BitmapDescriptorFactory.HUE_RED, true);
        this.f78241m = true;
        this.f78243o = false;
        com.facebook.datasource.c<T> cVarS = s();
        this.f78246r = cVarS;
        Y(cVarS, null);
        if (qk.a.w(2)) {
            qk.a.A(f78228y, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f78238j, Integer.valueOf(System.identityHashCode(this.f78246r)));
        }
        this.f78246r.c(new C1660a(this.f78238j, this.f78246r.a()), this.f78231c);
        if (bn.b.d()) {
            bn.b.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(d<? super INFO> dVar) {
        k.g(dVar);
        d<INFO> dVar2 = this.f78234f;
        if (dVar2 instanceof b) {
            ((b) dVar2).a(dVar);
        } else if (dVar2 != null) {
            this.f78234f = b.g(dVar2, dVar);
        } else {
            this.f78234f = dVar;
        }
    }

    public void k(bm.b<INFO> bVar) {
        this.f78235g.H(bVar);
    }

    protected abstract Drawable l(T t11);

    public Animatable m() {
        Object obj = this.f78250v;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    protected T n() {
        return null;
    }

    public Object o() {
        return this.f78239k;
    }

    protected d<INFO> p() {
        d<INFO> dVar = this.f78234f;
        return dVar == null ? c.a() : dVar;
    }

    protected bm.b<INFO> q() {
        return this.f78235g;
    }

    protected Drawable r() {
        return this.f78237i;
    }

    @Override // hl.a.InterfaceC1536a
    public void release() {
        this.f78229a.b(hl.c.a.ON_RELEASE_CONTROLLER);
        hl.d dVar = this.f78232d;
        if (dVar != null) {
            dVar.c();
        }
        nl.a aVar = this.f78233e;
        if (aVar != null) {
            aVar.e();
        }
        ol.c cVar = this.f78236h;
        if (cVar != null) {
            cVar.reset();
        }
        Q();
    }

    protected abstract com.facebook.datasource.c<T> s();

    public String toString() {
        return i.b(this).c("isAttached", this.f78240l).c("isRequestSubmitted", this.f78241m).c("hasFetchFailed", this.f78243o).a("fetchedImage", x(this.f78247s)).b("events", this.f78229a.toString()).toString();
    }

    protected nl.a u() {
        return this.f78233e;
    }

    public String v() {
        return this.f78238j;
    }

    protected String w(T t11) {
        return t11 != null ? t11.getClass().getSimpleName() : "<null>";
    }

    protected int x(T t11) {
        return System.identityHashCode(t11);
    }

    protected abstract INFO y(T t11);

    protected Uri z() {
        return null;
    }

    public void c0(e eVar) {
    }

    protected void M(String str, T t11) {
    }
}
