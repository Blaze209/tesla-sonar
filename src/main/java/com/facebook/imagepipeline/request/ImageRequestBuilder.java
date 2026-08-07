package com.facebook.imagepipeline.request;

import an.b;
import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import om.c;
import om.f;
import om.g;
import pk.k;
import pm.n;
import pm.u;
import wm.e;

/* JADX INFO: loaded from: classes3.dex */
public class ImageRequestBuilder {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set<String> f22054t = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f22068n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f22072r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f22055a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a.c f22056b = a.c.FULL_FETCH;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22057c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f22058d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f22059e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f22060f = c.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a.b f22061g = a.b.DEFAULT;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22062h = u.J().getIsProgressiveRenderingEnabled();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22063i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f22064j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private om.e f22065k = om.e.HIGH;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f22066l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f22067m = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private om.b f22069o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f22070p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private n f22071q = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f22073s = null;

    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private ImageRequestBuilder() {
    }

    private ImageRequestBuilder B(int i11) {
        this.f22057c = i11;
        if (this.f22061g != a.b.DYNAMIC) {
            this.f22073s = null;
        }
        return this;
    }

    public static ImageRequestBuilder b(a aVar) {
        return x(aVar.v()).F(aVar.h()).z(aVar.b()).A(aVar.c()).H(aVar.j()).G(aVar.i()).I(aVar.k()).B(aVar.d()).J(aVar.l()).K(aVar.p()).M(aVar.o()).N(aVar.r()).L(aVar.q()).P(aVar.t()).Q(aVar.z()).C(aVar.e()).D(aVar.f()).E(aVar.g()).O(aVar.s());
    }

    public static boolean s(Uri uri) {
        Set<String> set = f22054t;
        if (set != null && uri != null) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                if (it.next().equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ImageRequestBuilder x(Uri uri) {
        return new ImageRequestBuilder().R(uri);
    }

    public ImageRequestBuilder A(a.b bVar) {
        this.f22061g = bVar;
        return this;
    }

    public ImageRequestBuilder C(int i11) {
        this.f22072r = i11;
        return this;
    }

    public ImageRequestBuilder D(String str) {
        this.f22073s = str;
        return this;
    }

    public ImageRequestBuilder E(n nVar) {
        this.f22071q = nVar;
        return this;
    }

    public ImageRequestBuilder F(c cVar) {
        this.f22060f = cVar;
        return this;
    }

    public ImageRequestBuilder G(boolean z11) {
        this.f22064j = z11;
        return this;
    }

    public ImageRequestBuilder H(boolean z11) {
        this.f22063i = z11;
        return this;
    }

    public ImageRequestBuilder I(a.c cVar) {
        this.f22056b = cVar;
        return this;
    }

    public ImageRequestBuilder J(b bVar) {
        this.f22066l = bVar;
        return this;
    }

    public ImageRequestBuilder K(boolean z11) {
        this.f22062h = z11;
        return this;
    }

    public ImageRequestBuilder L(e eVar) {
        this.f22068n = eVar;
        return this;
    }

    public ImageRequestBuilder M(om.e eVar) {
        this.f22065k = eVar;
        return this;
    }

    public ImageRequestBuilder N(f fVar) {
        this.f22058d = fVar;
        return this;
    }

    public ImageRequestBuilder O(Boolean bool) {
        this.f22070p = bool;
        return this;
    }

    public ImageRequestBuilder P(g gVar) {
        this.f22059e = gVar;
        return this;
    }

    public ImageRequestBuilder Q(Boolean bool) {
        this.f22067m = bool;
        return this;
    }

    public ImageRequestBuilder R(Uri uri) {
        k.g(uri);
        this.f22055a = uri;
        return this;
    }

    public Boolean S() {
        return this.f22067m;
    }

    protected void T() {
        Uri uri = this.f22055a;
        if (uri == null) {
            throw new BuilderException("Source must be set!");
        }
        if (xk.e.n(uri)) {
            if (!this.f22055a.isAbsolute()) {
                throw new BuilderException("Resource URI path must be absolute.");
            }
            if (this.f22055a.getPath().isEmpty()) {
                throw new BuilderException("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f22055a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new BuilderException("Resource URI path must be a resource id.");
            }
        }
        if (xk.e.i(this.f22055a) && !this.f22055a.isAbsolute()) {
            throw new BuilderException("Asset URI path must be absolute.");
        }
    }

    public a a() {
        T();
        return new a(this);
    }

    public om.b c() {
        return this.f22069o;
    }

    public a.b d() {
        return this.f22061g;
    }

    public int e() {
        return this.f22057c;
    }

    public int f() {
        return this.f22072r;
    }

    public String g() {
        return this.f22073s;
    }

    public n h() {
        return this.f22071q;
    }

    public c i() {
        return this.f22060f;
    }

    public boolean j() {
        return this.f22064j;
    }

    public a.c k() {
        return this.f22056b;
    }

    public b l() {
        return this.f22066l;
    }

    public e m() {
        return this.f22068n;
    }

    public om.e n() {
        return this.f22065k;
    }

    public f o() {
        return this.f22058d;
    }

    public Boolean p() {
        return this.f22070p;
    }

    public g q() {
        return this.f22059e;
    }

    public Uri r() {
        return this.f22055a;
    }

    public boolean t() {
        if ((this.f22057c & 48) == 0) {
            return xk.e.o(this.f22055a) || s(this.f22055a);
        }
        return false;
    }

    public boolean u() {
        return this.f22063i;
    }

    public boolean v() {
        return (this.f22057c & 15) == 0;
    }

    public boolean w() {
        return this.f22062h;
    }

    @Deprecated
    public ImageRequestBuilder y(boolean z11) {
        return z11 ? P(g.d()) : P(g.g());
    }

    public ImageRequestBuilder z(om.b bVar) {
        this.f22069o = bVar;
        return this;
    }
}
