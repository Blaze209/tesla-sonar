package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class h<R> implements com.bumptech.glide.load.engine.f.a, Runnable, Comparable<h<?>>, yj.a.f {
    private dj.a A;
    private com.bumptech.glide.load.data.d<?> B;
    private volatile com.bumptech.glide.load.engine.f C;
    private volatile boolean D;
    private volatile boolean E;
    private boolean F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f20607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u5.f<h<?>> f20608e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.e f20611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private dj.e f20612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.h f20613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private m f20614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20616m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private fj.a f20617n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private dj.h f20618o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b<R> f20619p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20620q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private EnumC0418h f20621r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private g f20622s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f20623t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f20624u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f20625v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Thread f20626w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private dj.e f20627x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private dj.e f20628y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Object f20629z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.g<R> f20604a = new com.bumptech.glide.load.engine.g<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Throwable> f20605b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yj.c f20606c = yj.c.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d<?> f20609f = new d<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f20610g = new f();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f20631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f20632c;

        static {
            int[] iArr = new int[dj.c.values().length];
            f20632c = iArr;
            try {
                iArr[dj.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20632c[dj.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0418h.values().length];
            f20631b = iArr2;
            try {
                iArr2[EnumC0418h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20631b[EnumC0418h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20631b[EnumC0418h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20631b[EnumC0418h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20631b[EnumC0418h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f20630a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20630a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20630a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    interface b<R> {
        void b(GlideException glideException);

        void c(fj.c<R> cVar, dj.a aVar, boolean z11);

        void d(h<?> hVar);
    }

    private final class c<Z> implements i.a<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dj.a f20633a;

        c(dj.a aVar) {
            this.f20633a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.i.a
        @NonNull
        public fj.c<Z> a(@NonNull fj.c<Z> cVar) {
            return h.this.v(this.f20633a, cVar);
        }
    }

    private static class d<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private dj.e f20635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private dj.k<Z> f20636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private r<Z> f20637c;

        d() {
        }

        void a() {
            this.f20635a = null;
            this.f20636b = null;
            this.f20637c = null;
        }

        void b(e eVar, dj.h hVar) {
            yj.b.a("DecodeJob.encode");
            try {
                eVar.a().b(this.f20635a, new com.bumptech.glide.load.engine.e(this.f20636b, this.f20637c, hVar));
            } finally {
                this.f20637c.f();
                yj.b.e();
            }
        }

        boolean c() {
            return this.f20637c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(dj.e eVar, dj.k<X> kVar, r<X> rVar) {
            this.f20635a = eVar;
            this.f20636b = kVar;
            this.f20637c = rVar;
        }
    }

    interface e {
        hj.a a();
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f20638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f20639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f20640c;

        f() {
        }

        private boolean a(boolean z11) {
            return (this.f20640c || z11 || this.f20639b) && this.f20638a;
        }

        synchronized boolean b() {
            this.f20639b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f20640c = true;
            return a(false);
        }

        synchronized boolean d(boolean z11) {
            this.f20638a = true;
            return a(z11);
        }

        synchronized void e() {
            this.f20639b = false;
            this.f20638a = false;
            this.f20640c = false;
        }
    }

    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$h, reason: collision with other inner class name */
    private enum EnumC0418h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, u5.f<h<?>> fVar) {
        this.f20607d = eVar;
        this.f20608e = fVar;
    }

    private <Data, ResourceType> fj.c<R> A(Data data, dj.a aVar, q<Data, ResourceType, R> qVar) {
        dj.h hVarL = l(aVar);
        com.bumptech.glide.load.data.e<Data> eVarL = this.f20611h.i().l(data);
        try {
            return qVar.a(eVarL, hVarL, this.f20615l, this.f20616m, new c(aVar));
        } finally {
            eVarL.b();
        }
    }

    private void B() {
        int i11 = a.f20630a[this.f20622s.ordinal()];
        if (i11 == 1) {
            this.f20621r = k(EnumC0418h.INITIALIZE);
            this.C = j();
            z();
        } else if (i11 == 2) {
            z();
        } else {
            if (i11 == 3) {
                i();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f20622s);
        }
    }

    private void C() {
        Throwable th2;
        this.f20606c.c();
        if (!this.D) {
            this.D = true;
            return;
        }
        if (this.f20605b.isEmpty()) {
            th2 = null;
        } else {
            List<Throwable> list = this.f20605b;
            th2 = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }

    private <Data> fj.c<R> g(com.bumptech.glide.load.data.d<?> dVar, Data data, dj.a aVar) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            long jB = xj.g.b();
            fj.c<R> cVarH = h(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                o("Decoded result " + cVarH, jB);
            }
            return cVarH;
        } finally {
            dVar.b();
        }
    }

    private <Data> fj.c<R> h(Data data, dj.a aVar) {
        return A(data, aVar, this.f20604a.h(data.getClass()));
    }

    private void i() {
        fj.c<R> cVarG;
        if (Log.isLoggable("DecodeJob", 2)) {
            p("Retrieved data", this.f20623t, "data: " + this.f20629z + ", cache key: " + this.f20627x + ", fetcher: " + this.B);
        }
        try {
            cVarG = g(this.B, this.f20629z, this.A);
        } catch (GlideException e11) {
            e11.i(this.f20628y, this.A);
            this.f20605b.add(e11);
            cVarG = null;
        }
        if (cVarG != null) {
            r(cVarG, this.A, this.F);
        } else {
            z();
        }
    }

    private com.bumptech.glide.load.engine.f j() {
        int i11 = a.f20631b[this.f20621r.ordinal()];
        if (i11 == 1) {
            return new s(this.f20604a, this);
        }
        if (i11 == 2) {
            return new com.bumptech.glide.load.engine.c(this.f20604a, this);
        }
        if (i11 == 3) {
            return new v(this.f20604a, this);
        }
        if (i11 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f20621r);
    }

    private EnumC0418h k(EnumC0418h enumC0418h) {
        int i11 = a.f20631b[enumC0418h.ordinal()];
        if (i11 == 1) {
            return this.f20617n.a() ? EnumC0418h.DATA_CACHE : k(EnumC0418h.DATA_CACHE);
        }
        if (i11 == 2) {
            return this.f20624u ? EnumC0418h.FINISHED : EnumC0418h.SOURCE;
        }
        if (i11 == 3 || i11 == 4) {
            return EnumC0418h.FINISHED;
        }
        if (i11 == 5) {
            return this.f20617n.b() ? EnumC0418h.RESOURCE_CACHE : k(EnumC0418h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0418h);
    }

    @NonNull
    private dj.h l(dj.a aVar) {
        dj.h hVar = this.f20618o;
        if (Build.VERSION.SDK_INT < 26) {
            return hVar;
        }
        boolean z11 = aVar == dj.a.RESOURCE_DISK_CACHE || this.f20604a.x();
        dj.g<Boolean> gVar = com.bumptech.glide.load.resource.bitmap.q.f20824j;
        Boolean bool = (Boolean) hVar.c(gVar);
        if (bool != null && (!bool.booleanValue() || z11)) {
            return hVar;
        }
        dj.h hVar2 = new dj.h();
        hVar2.d(this.f20618o);
        hVar2.f(gVar, Boolean.valueOf(z11));
        return hVar2;
    }

    private int m() {
        return this.f20613j.ordinal();
    }

    private void o(String str, long j11) {
        p(str, j11, null);
    }

    private void p(String str, long j11, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(xj.g.a(j11));
        sb2.append(", load key: ");
        sb2.append(this.f20614k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    private void q(fj.c<R> cVar, dj.a aVar, boolean z11) {
        C();
        this.f20619p.c(cVar, aVar, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void r(fj.c<R> cVar, dj.a aVar, boolean z11) {
        r rVar;
        yj.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (cVar instanceof fj.b) {
                ((fj.b) cVar).initialize();
            }
            if (this.f20609f.c()) {
                cVar = r.c(cVar);
                rVar = cVar;
            } else {
                rVar = 0;
            }
            q(cVar, aVar, z11);
            this.f20621r = EnumC0418h.ENCODE;
            try {
                if (this.f20609f.c()) {
                    this.f20609f.b(this.f20607d, this.f20618o);
                }
                if (rVar != 0) {
                    rVar.f();
                }
                t();
                yj.b.e();
            } catch (Throwable th2) {
                if (rVar != 0) {
                    rVar.f();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            yj.b.e();
            throw th3;
        }
    }

    private void s() {
        C();
        this.f20619p.b(new GlideException("Failed to load resource", new ArrayList(this.f20605b)));
        u();
    }

    private void t() {
        if (this.f20610g.b()) {
            x();
        }
    }

    private void u() {
        if (this.f20610g.c()) {
            x();
        }
    }

    private void x() {
        this.f20610g.e();
        this.f20609f.a();
        this.f20604a.a();
        this.D = false;
        this.f20611h = null;
        this.f20612i = null;
        this.f20618o = null;
        this.f20613j = null;
        this.f20614k = null;
        this.f20619p = null;
        this.f20621r = null;
        this.C = null;
        this.f20626w = null;
        this.f20627x = null;
        this.f20629z = null;
        this.A = null;
        this.B = null;
        this.f20623t = 0L;
        this.E = false;
        this.f20625v = null;
        this.f20605b.clear();
        this.f20608e.a(this);
    }

    private void y(g gVar) {
        this.f20622s = gVar;
        this.f20619p.d(this);
    }

    private void z() {
        this.f20626w = Thread.currentThread();
        this.f20623t = xj.g.b();
        boolean zB = false;
        while (!this.E && this.C != null && !(zB = this.C.b())) {
            this.f20621r = k(this.f20621r);
            this.C = j();
            if (this.f20621r == EnumC0418h.SOURCE) {
                y(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f20621r == EnumC0418h.FINISHED || this.E) && !zB) {
            s();
        }
    }

    boolean D() {
        EnumC0418h enumC0418hK = k(EnumC0418h.INITIALIZE);
        return enumC0418hK == EnumC0418h.RESOURCE_CACHE || enumC0418hK == EnumC0418h.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(dj.e eVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, dj.a aVar, dj.e eVar2) {
        this.f20627x = eVar;
        this.f20629z = obj;
        this.B = dVar;
        this.A = aVar;
        this.f20628y = eVar2;
        this.F = eVar != this.f20604a.c().get(0);
        if (Thread.currentThread() != this.f20626w) {
            y(g.DECODE_DATA);
            return;
        }
        yj.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            i();
        } finally {
            yj.b.e();
        }
    }

    public void b() {
        this.E = true;
        com.bumptech.glide.load.engine.f fVar = this.C;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void c(dj.e eVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, dj.a aVar) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.j(eVar, aVar, dVar.a());
        this.f20605b.add(glideException);
        if (Thread.currentThread() != this.f20626w) {
            y(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            z();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void d() {
        y(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // yj.a.f
    @NonNull
    public yj.c e() {
        return this.f20606c;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull h<?> hVar) {
        int iM = m() - hVar.m();
        return iM == 0 ? this.f20620q - hVar.f20620q : iM;
    }

    h<R> n(com.bumptech.glide.e eVar, Object obj, m mVar, dj.e eVar2, int i11, int i12, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, fj.a aVar, Map<Class<?>, dj.l<?>> map, boolean z11, boolean z12, boolean z13, dj.h hVar2, b<R> bVar, int i13) {
        this.f20604a.v(eVar, obj, eVar2, i11, i12, aVar, cls, cls2, hVar, hVar2, map, z11, z12, this.f20607d);
        this.f20611h = eVar;
        this.f20612i = eVar2;
        this.f20613j = hVar;
        this.f20614k = mVar;
        this.f20615l = i11;
        this.f20616m = i12;
        this.f20617n = aVar;
        this.f20624u = z13;
        this.f20618o = hVar2;
        this.f20619p = bVar;
        this.f20620q = i13;
        this.f20622s = g.INITIALIZE;
        this.f20625v = obj;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        yj.b.c("DecodeJob#run(reason=%s, model=%s)", this.f20622s, this.f20625v);
        com.bumptech.glide.load.data.d<?> dVar = this.B;
        try {
            try {
                if (this.E) {
                    s();
                    if (dVar != null) {
                        dVar.b();
                    }
                    yj.b.e();
                    return;
                }
                B();
                if (dVar != null) {
                    dVar.b();
                }
                yj.b.e();
            } catch (Throwable th2) {
                if (dVar != null) {
                    dVar.b();
                }
                yj.b.e();
                throw th2;
            }
        } catch (com.bumptech.glide.load.engine.b e11) {
            throw e11;
        } catch (Throwable th3) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.E + ", stage: " + this.f20621r, th3);
            }
            if (this.f20621r != EnumC0418h.ENCODE) {
                this.f20605b.add(th3);
                s();
            }
            if (!this.E) {
                throw th3;
            }
            throw th3;
        }
    }

    @NonNull
    <Z> fj.c<Z> v(dj.a aVar, @NonNull fj.c<Z> cVar) {
        fj.c<Z> cVarA;
        dj.l<Z> lVar;
        dj.c cVarA2;
        dj.e dVar;
        Class<?> cls = cVar.get().getClass();
        dj.k<Z> kVarN = null;
        if (aVar != dj.a.RESOURCE_DISK_CACHE) {
            dj.l<Z> lVarS = this.f20604a.s(cls);
            lVar = lVarS;
            cVarA = lVarS.a(this.f20611h, cVar, this.f20615l, this.f20616m);
        } else {
            cVarA = cVar;
            lVar = null;
        }
        if (!cVar.equals(cVarA)) {
            cVar.recycle();
        }
        if (this.f20604a.w(cVarA)) {
            kVarN = this.f20604a.n(cVarA);
            cVarA2 = kVarN.a(this.f20618o);
        } else {
            cVarA2 = dj.c.NONE;
        }
        dj.k kVar = kVarN;
        if (!this.f20617n.d(!this.f20604a.y(this.f20627x), aVar, cVarA2)) {
            return cVarA;
        }
        if (kVar == null) {
            throw new Registry.NoResultEncoderAvailableException(cVarA.get().getClass());
        }
        int i11 = a.f20632c[cVarA2.ordinal()];
        if (i11 == 1) {
            dVar = new com.bumptech.glide.load.engine.d(this.f20627x, this.f20612i);
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVarA2);
            }
            dVar = new t(this.f20604a.b(), this.f20627x, this.f20612i, this.f20615l, this.f20616m, lVar, cls, this.f20618o);
        }
        r rVarC = r.c(cVarA);
        this.f20609f.d(dVar, kVar, rVarC);
        return rVarC;
    }

    void w(boolean z11) {
        if (this.f20610g.d(z11)) {
            x();
        }
    }
}
