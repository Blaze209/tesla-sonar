package cg;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class k implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f19270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bg.b f19271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bg.o<PointF, PointF> f19272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bg.b f19273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bg.b f19274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final bg.b f19275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final bg.b f19276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final bg.b f19277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f19278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f19279k;

    public enum a {
        STAR(1),
        POLYGON(2);

        private final int value;

        a(int i11) {
            this.value = i11;
        }

        public static a forValue(int i11) {
            for (a aVar : values()) {
                if (aVar.value == i11) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public k(String str, a aVar, bg.b bVar, bg.o<PointF, PointF> oVar, bg.b bVar2, bg.b bVar3, bg.b bVar4, bg.b bVar5, bg.b bVar6, boolean z11, boolean z12) {
        this.f19269a = str;
        this.f19270b = aVar;
        this.f19271c = bVar;
        this.f19272d = oVar;
        this.f19273e = bVar2;
        this.f19274f = bVar3;
        this.f19275g = bVar4;
        this.f19276h = bVar5;
        this.f19277i = bVar6;
        this.f19278j = z11;
        this.f19279k = z12;
    }

    @Override // cg.c
    public vf.c a(com.airbnb.lottie.p pVar, tf.i iVar, dg.b bVar) {
        return new vf.n(pVar, bVar, this);
    }

    public bg.b b() {
        return this.f19274f;
    }

    public bg.b c() {
        return this.f19276h;
    }

    public String d() {
        return this.f19269a;
    }

    public bg.b e() {
        return this.f19275g;
    }

    public bg.b f() {
        return this.f19277i;
    }

    public bg.b g() {
        return this.f19271c;
    }

    public bg.o<PointF, PointF> h() {
        return this.f19272d;
    }

    public bg.b i() {
        return this.f19273e;
    }

    public a j() {
        return this.f19270b;
    }

    public boolean k() {
        return this.f19278j;
    }

    public boolean l() {
        return this.f19279k;
    }
}
