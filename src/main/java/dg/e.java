package dg;

import bg.j;
import bg.k;
import bg.n;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<cg.c> f60566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tf.i f60567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f60568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f60569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f60570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f60571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f60572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<cg.i> f60573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n f60574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f60575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f60576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f60577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f60578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f60579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f60580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float f60581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final j f60582q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final k f60583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final bg.b f60584s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List<ig.a<Float>> f60585t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final b f60586u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f60587v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final cg.a f60588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final fg.j f60589x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final cg.h f60590y;

    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<cg.c> list, tf.i iVar, String str, long j11, a aVar, long j12, String str2, List<cg.i> list2, n nVar, int i11, int i12, int i13, float f11, float f12, float f13, float f14, j jVar, k kVar, List<ig.a<Float>> list3, b bVar, bg.b bVar2, boolean z11, cg.a aVar2, fg.j jVar2, cg.h hVar) {
        this.f60566a = list;
        this.f60567b = iVar;
        this.f60568c = str;
        this.f60569d = j11;
        this.f60570e = aVar;
        this.f60571f = j12;
        this.f60572g = str2;
        this.f60573h = list2;
        this.f60574i = nVar;
        this.f60575j = i11;
        this.f60576k = i12;
        this.f60577l = i13;
        this.f60578m = f11;
        this.f60579n = f12;
        this.f60580o = f13;
        this.f60581p = f14;
        this.f60582q = jVar;
        this.f60583r = kVar;
        this.f60585t = list3;
        this.f60586u = bVar;
        this.f60584s = bVar2;
        this.f60587v = z11;
        this.f60588w = aVar2;
        this.f60589x = jVar2;
        this.f60590y = hVar;
    }

    public cg.h a() {
        return this.f60590y;
    }

    public cg.a b() {
        return this.f60588w;
    }

    tf.i c() {
        return this.f60567b;
    }

    public fg.j d() {
        return this.f60589x;
    }

    public long e() {
        return this.f60569d;
    }

    List<ig.a<Float>> f() {
        return this.f60585t;
    }

    public a g() {
        return this.f60570e;
    }

    List<cg.i> h() {
        return this.f60573h;
    }

    b i() {
        return this.f60586u;
    }

    public String j() {
        return this.f60568c;
    }

    long k() {
        return this.f60571f;
    }

    float l() {
        return this.f60581p;
    }

    float m() {
        return this.f60580o;
    }

    public String n() {
        return this.f60572g;
    }

    List<cg.c> o() {
        return this.f60566a;
    }

    int p() {
        return this.f60577l;
    }

    int q() {
        return this.f60576k;
    }

    int r() {
        return this.f60575j;
    }

    float s() {
        return this.f60579n / this.f60567b.e();
    }

    j t() {
        return this.f60582q;
    }

    public String toString() {
        return z("");
    }

    k u() {
        return this.f60583r;
    }

    bg.b v() {
        return this.f60584s;
    }

    float w() {
        return this.f60578m;
    }

    n x() {
        return this.f60574i;
    }

    public boolean y() {
        return this.f60587v;
    }

    public String z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(j());
        sb2.append("\n");
        e eVarU = this.f60567b.u(k());
        if (eVarU != null) {
            sb2.append("\t\tParents: ");
            sb2.append(eVarU.j());
            e eVarU2 = this.f60567b.u(eVarU.k());
            while (eVarU2 != null) {
                sb2.append("->");
                sb2.append(eVarU2.j());
                eVarU2 = this.f60567b.u(eVarU2.k());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!h().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(h().size());
            sb2.append("\n");
        }
        if (r() != 0 && q() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.f60566a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (cg.c cVar : this.f60566a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(cVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
