package cg;

import android.graphics.Path;

/* JADX INFO: loaded from: classes3.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f19239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path.FillType f19240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bg.c f19241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bg.d f19242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bg.f f19243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bg.f f19244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final bg.b f19246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final bg.b f19247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f19248j;

    public e(String str, g gVar, Path.FillType fillType, bg.c cVar, bg.d dVar, bg.f fVar, bg.f fVar2, bg.b bVar, bg.b bVar2, boolean z11) {
        this.f19239a = gVar;
        this.f19240b = fillType;
        this.f19241c = cVar;
        this.f19242d = dVar;
        this.f19243e = fVar;
        this.f19244f = fVar2;
        this.f19245g = str;
        this.f19246h = bVar;
        this.f19247i = bVar2;
        this.f19248j = z11;
    }

    @Override // cg.c
    public vf.c a(com.airbnb.lottie.p pVar, tf.i iVar, dg.b bVar) {
        return new vf.h(pVar, iVar, bVar, this);
    }

    public bg.f b() {
        return this.f19244f;
    }

    public Path.FillType c() {
        return this.f19240b;
    }

    public bg.c d() {
        return this.f19241c;
    }

    public g e() {
        return this.f19239a;
    }

    public String f() {
        return this.f19245g;
    }

    public bg.d g() {
        return this.f19242d;
    }

    public bg.f h() {
        return this.f19243e;
    }

    public boolean i() {
        return this.f19248j;
    }
}
