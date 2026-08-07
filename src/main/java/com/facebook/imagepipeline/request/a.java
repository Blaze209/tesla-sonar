package com.facebook.imagepipeline.request;

import android.net.Uri;
import android.os.Build;
import java.io.File;
import jk.d;
import om.f;
import om.g;
import pk.e;
import pk.i;
import pk.k;
import pm.n;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static final e<a, Uri> A = new C0442a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static boolean f22074y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static boolean f22075z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f22077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f22078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f22080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f22081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f22082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f22083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final om.c f22084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f22085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g f22086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final om.b f22087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final om.e f22088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c f22089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f22090o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f22091p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f22092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Boolean f22093r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final an.b f22094s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final wm.e f22095t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Boolean f22096u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final n f22097v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f22098w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f22099x;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.request.a$a, reason: collision with other inner class name */
    class C0442a implements e<a, Uri> {
        C0442a() {
        }

        @Override // pk.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Uri apply(a aVar) {
            if (aVar != null) {
                return aVar.v();
            }
            return null;
        }
    }

    public enum b {
        SMALL,
        DEFAULT,
        DYNAMIC
    }

    public enum c {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);

        private int mValue;

        c(int i11) {
            this.mValue = i11;
        }

        public static c getMax(c cVar, c cVar2) {
            return cVar.getValue() > cVar2.getValue() ? cVar : cVar2;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    protected a(ImageRequestBuilder imageRequestBuilder) {
        this.f22077b = imageRequestBuilder.d();
        Uri uriR = imageRequestBuilder.r();
        this.f22078c = uriR;
        this.f22079d = x(uriR);
        this.f22081f = imageRequestBuilder.w();
        this.f22082g = imageRequestBuilder.u();
        this.f22083h = imageRequestBuilder.j();
        this.f22084i = imageRequestBuilder.i();
        this.f22085j = imageRequestBuilder.o();
        this.f22086k = imageRequestBuilder.q() == null ? g.d() : imageRequestBuilder.q();
        this.f22087l = imageRequestBuilder.c();
        this.f22088m = imageRequestBuilder.n();
        this.f22089n = imageRequestBuilder.k();
        boolean zT = imageRequestBuilder.t();
        this.f22091p = zT;
        int iE = imageRequestBuilder.e();
        this.f22090o = zT ? iE : iE | 48;
        this.f22092q = imageRequestBuilder.v();
        this.f22093r = imageRequestBuilder.S();
        this.f22094s = imageRequestBuilder.l();
        this.f22095t = imageRequestBuilder.m();
        this.f22096u = imageRequestBuilder.p();
        this.f22097v = imageRequestBuilder.h();
        this.f22099x = imageRequestBuilder.f();
        this.f22098w = imageRequestBuilder.g();
    }

    public static a a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.x(uri).a();
    }

    private static int x(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (xk.e.o(uri)) {
            return 0;
        }
        if (uri.getPath() != null && xk.e.m(uri)) {
            return rk.a.c(rk.a.b(uri.getPath())) ? 2 : 3;
        }
        if (xk.e.l(uri)) {
            return 4;
        }
        if (xk.e.i(uri)) {
            return 5;
        }
        if (xk.e.n(uri)) {
            return 6;
        }
        if (xk.e.h(uri)) {
            return 7;
        }
        return xk.e.p(uri) ? 8 : -1;
    }

    public om.b b() {
        return this.f22087l;
    }

    public b c() {
        return this.f22077b;
    }

    public int d() {
        return this.f22090o;
    }

    public int e() {
        return this.f22099x;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (f22074y) {
            int i11 = this.f22076a;
            int i12 = aVar.f22076a;
            if (i11 != 0 && i12 != 0 && i11 != i12) {
                return false;
            }
        }
        if (this.f22082g == aVar.f22082g && this.f22091p == aVar.f22091p && this.f22092q == aVar.f22092q && i.a(this.f22078c, aVar.f22078c) && i.a(this.f22077b, aVar.f22077b) && i.a(this.f22098w, aVar.f22098w) && i.a(this.f22080e, aVar.f22080e) && i.a(this.f22087l, aVar.f22087l) && i.a(this.f22084i, aVar.f22084i) && i.a(this.f22085j, aVar.f22085j) && i.a(this.f22088m, aVar.f22088m) && i.a(this.f22089n, aVar.f22089n) && i.a(Integer.valueOf(this.f22090o), Integer.valueOf(aVar.f22090o)) && i.a(this.f22093r, aVar.f22093r) && i.a(this.f22096u, aVar.f22096u) && i.a(this.f22097v, aVar.f22097v) && i.a(this.f22086k, aVar.f22086k) && this.f22083h == aVar.f22083h) {
            an.b bVar = this.f22094s;
            d dVarA = bVar != null ? bVar.a() : null;
            an.b bVar2 = aVar.f22094s;
            if (i.a(dVarA, bVar2 != null ? bVar2.a() : null) && this.f22099x == aVar.f22099x) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f22098w;
    }

    public n g() {
        return this.f22097v;
    }

    public om.c h() {
        return this.f22084i;
    }

    public int hashCode() {
        boolean z11 = f22075z;
        int i11 = z11 ? this.f22076a : 0;
        if (i11 != 0) {
            return i11;
        }
        an.b bVar = this.f22094s;
        int iA = hn.a.a(hn.a.a(hn.a.a(hn.a.a(hn.a.a(hn.a.a(hn.a.a(hn.a.a(hn.a.a(hn.a.a(hn.a.a(hn.a.a(hn.a.a(hn.a.a(hn.a.a(hn.a.a(hn.a.a(hn.a.a(0, this.f22077b), this.f22078c), Boolean.valueOf(this.f22082g)), this.f22087l), this.f22088m), this.f22089n), Integer.valueOf(this.f22090o)), Boolean.valueOf(this.f22091p)), Boolean.valueOf(this.f22092q)), this.f22084i), this.f22093r), this.f22085j), this.f22086k), bVar != null ? bVar.a() : null), this.f22096u), this.f22097v), Integer.valueOf(this.f22099x)), Boolean.valueOf(this.f22083h));
        if (z11) {
            this.f22076a = iA;
        }
        return iA;
    }

    public boolean i() {
        return Build.VERSION.SDK_INT >= 29 && this.f22083h;
    }

    public boolean j() {
        return this.f22082g;
    }

    public c k() {
        return this.f22089n;
    }

    public an.b l() {
        return this.f22094s;
    }

    public int m() {
        f fVar = this.f22085j;
        if (fVar != null) {
            return fVar.com.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String;
        }
        return 2048;
    }

    public int n() {
        f fVar = this.f22085j;
        if (fVar != null) {
            return fVar.com.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String;
        }
        return 2048;
    }

    public om.e o() {
        return this.f22088m;
    }

    public boolean p() {
        return this.f22081f;
    }

    public wm.e q() {
        return this.f22095t;
    }

    public f r() {
        return this.f22085j;
    }

    public Boolean s() {
        return this.f22096u;
    }

    public g t() {
        return this.f22086k;
    }

    public String toString() {
        return i.b(this).b("uri", this.f22078c).b("cacheChoice", this.f22077b).b("decodeOptions", this.f22084i).b("postprocessor", this.f22094s).b("priority", this.f22088m).b("resizeOptions", this.f22085j).b("rotationOptions", this.f22086k).b("bytesRange", this.f22087l).b("resizingAllowedOverride", this.f22096u).b("downsampleOverride", this.f22097v).c("progressiveRenderingEnabled", this.f22081f).c("localThumbnailPreviewsEnabled", this.f22082g).c("loadThumbnailOnly", this.f22083h).b("lowestPermittedRequestLevel", this.f22089n).a("cachesDisabled", this.f22090o).c("isDiskCacheEnabled", this.f22091p).c("isMemoryCacheEnabled", this.f22092q).b("decodePrefetches", this.f22093r).a("delayMs", this.f22099x).toString();
    }

    public synchronized File u() {
        try {
            if (this.f22080e == null) {
                k.g(this.f22078c.getPath());
                this.f22080e = new File(this.f22078c.getPath());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f22080e;
    }

    public Uri v() {
        return this.f22078c;
    }

    public int w() {
        return this.f22079d;
    }

    public boolean y(int i11) {
        return (i11 & d()) == 0;
    }

    public Boolean z() {
        return this.f22093r;
    }
}
