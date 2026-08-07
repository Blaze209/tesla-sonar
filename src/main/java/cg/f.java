package cg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f19250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bg.c f19251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bg.d f19252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bg.f f19253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bg.f f19254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final bg.b f19255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s.a f19256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s.b f19257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f19258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<bg.b> f19259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final bg.b f19260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f19261m;

    public f(String str, g gVar, bg.c cVar, bg.d dVar, bg.f fVar, bg.f fVar2, bg.b bVar, s.a aVar, s.b bVar2, float f11, List<bg.b> list, bg.b bVar3, boolean z11) {
        this.f19249a = str;
        this.f19250b = gVar;
        this.f19251c = cVar;
        this.f19252d = dVar;
        this.f19253e = fVar;
        this.f19254f = fVar2;
        this.f19255g = bVar;
        this.f19256h = aVar;
        this.f19257i = bVar2;
        this.f19258j = f11;
        this.f19259k = list;
        this.f19260l = bVar3;
        this.f19261m = z11;
    }

    @Override // cg.c
    public vf.c a(com.airbnb.lottie.p pVar, tf.i iVar, dg.b bVar) {
        return new vf.i(pVar, bVar, this);
    }

    public s.a b() {
        return this.f19256h;
    }

    public bg.b c() {
        return this.f19260l;
    }

    public bg.f d() {
        return this.f19254f;
    }

    public bg.c e() {
        return this.f19251c;
    }

    public g f() {
        return this.f19250b;
    }

    public s.b g() {
        return this.f19257i;
    }

    public List<bg.b> h() {
        return this.f19259k;
    }

    public float i() {
        return this.f19258j;
    }

    public String j() {
        return this.f19249a;
    }

    public bg.d k() {
        return this.f19252d;
    }

    public bg.f l() {
        return this.f19253e;
    }

    public bg.b m() {
        return this.f19255g;
    }

    public boolean n() {
        return this.f19261m;
    }
}
