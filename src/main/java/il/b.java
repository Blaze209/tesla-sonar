package il;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.datasource.h;
import il.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import pk.i;
import pk.k;
import pk.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<BUILDER extends b<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements ol.d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final d<Object> f78254q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final NullPointerException f78255r = new NullPointerException("No image request was specified!");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final AtomicLong f78256s = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f78257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<d> f78258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<bm.b> f78259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f78260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private REQUEST f78261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private REQUEST f78262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private REQUEST[] f78263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f78264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n<com.facebook.datasource.c<IMAGE>> f78265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d<? super INFO> f78266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f78267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f78268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f78269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f78270n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f78271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ol.a f78272p;

    class a extends il.c<Object> {
        a() {
        }

        @Override // il.c, il.d
        public void p(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX INFO: renamed from: il.b$b, reason: collision with other inner class name */
    class C1661b implements n<com.facebook.datasource.c<IMAGE>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ol.a f78273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f78274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f78275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f78276d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f78277e;

        C1661b(ol.a aVar, String str, Object obj, Object obj2, c cVar) {
            this.f78273a = aVar;
            this.f78274b = str;
            this.f78275c = obj;
            this.f78276d = obj2;
            this.f78277e = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pk.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.facebook.datasource.c<IMAGE> get() {
            return b.this.i(this.f78273a, this.f78274b, this.f78275c, this.f78276d, this.f78277e);
        }

        public String toString() {
            return i.b(this).b("request", this.f78275c.toString()).toString();
        }
    }

    public enum c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    protected b(Context context, Set<d> set, Set<bm.b> set2) {
        this.f78257a = context;
        this.f78258b = set;
        this.f78259c = set2;
        s();
    }

    protected static String e() {
        return String.valueOf(f78256s.getAndIncrement());
    }

    private void s() {
        this.f78260d = null;
        this.f78261e = null;
        this.f78262f = null;
        this.f78263g = null;
        this.f78264h = true;
        this.f78266j = null;
        this.f78267k = false;
        this.f78268l = false;
        this.f78270n = false;
        this.f78272p = null;
        this.f78271o = null;
    }

    public BUILDER A(boolean z11) {
        this.f78268l = z11;
        return (BUILDER) r();
    }

    public BUILDER B(Object obj) {
        this.f78260d = obj;
        return (BUILDER) r();
    }

    public BUILDER C(d<? super INFO> dVar) {
        this.f78266j = dVar;
        return (BUILDER) r();
    }

    public BUILDER D(REQUEST request) {
        this.f78261e = request;
        return (BUILDER) r();
    }

    public BUILDER E(REQUEST request) {
        this.f78262f = request;
        return (BUILDER) r();
    }

    @Override // ol.d
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BUILDER a(ol.a aVar) {
        this.f78272p = aVar;
        return (BUILDER) r();
    }

    protected void G() {
        boolean z11 = true;
        k.j(this.f78263g == null || this.f78261e == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f78265i != null && (this.f78263g != null || this.f78261e != null || this.f78262f != null)) {
            z11 = false;
        }
        k.j(z11, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    @Override // ol.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public il.a build() {
        REQUEST request;
        G();
        if (this.f78261e == null && this.f78263g == null && (request = this.f78262f) != null) {
            this.f78261e = request;
            this.f78262f = null;
        }
        return d();
    }

    protected il.a d() {
        if (bn.b.d()) {
            bn.b.a("AbstractDraweeControllerBuilder#buildController");
        }
        il.a aVarX = x();
        aVarX.e0(t());
        aVarX.f0(q());
        aVarX.a0(g());
        h();
        aVarX.c0(null);
        w(aVarX);
        u(aVarX);
        if (bn.b.d()) {
            bn.b.b();
        }
        return aVarX;
    }

    public Object f() {
        return this.f78260d;
    }

    public String g() {
        return this.f78271o;
    }

    public e h() {
        return null;
    }

    protected abstract com.facebook.datasource.c<IMAGE> i(ol.a aVar, String str, REQUEST request, Object obj, c cVar);

    protected n<com.facebook.datasource.c<IMAGE>> j(ol.a aVar, String str, REQUEST request) {
        return k(aVar, str, request, c.FULL_FETCH);
    }

    protected n<com.facebook.datasource.c<IMAGE>> k(ol.a aVar, String str, REQUEST request, c cVar) {
        return new C1661b(aVar, str, request, f(), cVar);
    }

    protected n<com.facebook.datasource.c<IMAGE>> l(ol.a aVar, String str, REQUEST[] requestArr, boolean z11) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z11) {
            for (REQUEST request : requestArr) {
                arrayList.add(k(aVar, str, request, c.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST request2 : requestArr) {
            arrayList.add(j(aVar, str, request2));
        }
        return com.facebook.datasource.f.b(arrayList);
    }

    public REQUEST[] m() {
        return this.f78263g;
    }

    public REQUEST n() {
        return this.f78261e;
    }

    public REQUEST o() {
        return this.f78262f;
    }

    public ol.a p() {
        return this.f78272p;
    }

    public boolean q() {
        return this.f78269m;
    }

    public boolean t() {
        return this.f78270n;
    }

    protected void u(il.a aVar) {
        Set<d> set = this.f78258b;
        if (set != null) {
            Iterator<d> it = set.iterator();
            while (it.hasNext()) {
                aVar.j(it.next());
            }
        }
        Set<bm.b> set2 = this.f78259c;
        if (set2 != null) {
            Iterator<bm.b> it2 = set2.iterator();
            while (it2.hasNext()) {
                aVar.k(it2.next());
            }
        }
        d<? super INFO> dVar = this.f78266j;
        if (dVar != null) {
            aVar.j(dVar);
        }
        if (this.f78268l) {
            aVar.j(f78254q);
        }
    }

    protected void v(il.a aVar) {
        if (aVar.u() == null) {
            aVar.d0(nl.a.c(this.f78257a));
        }
    }

    protected void w(il.a aVar) {
        if (this.f78267k) {
            aVar.A().d(this.f78267k);
            v(aVar);
        }
    }

    protected abstract il.a x();

    protected n<com.facebook.datasource.c<IMAGE>> y(ol.a aVar, String str) {
        n<com.facebook.datasource.c<IMAGE>> nVarL;
        n<com.facebook.datasource.c<IMAGE>> nVar = this.f78265i;
        if (nVar != null) {
            return nVar;
        }
        REQUEST request = this.f78261e;
        if (request != null) {
            nVarL = j(aVar, str, request);
        } else {
            REQUEST[] requestArr = this.f78263g;
            nVarL = requestArr != null ? l(aVar, str, requestArr, this.f78264h) : null;
        }
        if (nVarL != null && this.f78262f != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(nVarL);
            arrayList.add(j(aVar, str, this.f78262f));
            nVarL = h.c(arrayList, false);
        }
        return nVarL == null ? com.facebook.datasource.d.a(f78255r) : nVarL;
    }

    public BUILDER z() {
        s();
        return (BUILDER) r();
    }

    protected final BUILDER r() {
        return this;
    }
}
