package com.fourthline.core.mrz.internal.parsing.mrtd;

import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends d {
    private final bo0.j A;
    private final bo0.j B;
    private final bo0.j C;
    private final bo0.j D;
    private final bo0.j E;
    private final bo0.j F;
    private final bo0.j G;
    private final bo0.j H;
    private final bo0.j I;
    private final String J;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f24282y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Lazy f24283z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String mrzText) {
        super(mrzText);
        p013kotlin.jvm.internal.s.k(mrzText, "mrzText");
        this.f24282y = mrzText;
        this.f24283z = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.d0
            @Override // wn0.a
            public final Object invoke() {
                return j.a(this.f24271a);
            }
        });
        this.A = bo0.n.w(5, 44);
        this.B = bo0.n.w(54, 57);
        this.C = bo0.n.w(57, 63);
        this.D = bo0.n.w(65, 71);
        this.E = new bo0.j(64, 64);
        this.F = new bo0.j(72, 85);
        this.G = new bo0.j(63, 63);
        this.H = new bo0.j(71, 71);
        this.I = new bo0.j(87, 87);
        this.J = com.fourthline.core.mrz.internal.transformation.f.g(p013kotlin.text.t.n1(mrzText, bo0.n.w(44, 54))) + e() + b() + k() + h() + com.fourthline.core.mrz.internal.transformation.f.g(p013kotlin.text.t.n1(mrzText, bo0.n.w(72, 87)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i a(j jVar) {
        return new i(jVar.f24282y, !p013kotlin.jvm.internal.s.f(jVar.f(), "NLD"));
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    public boolean A() {
        return !com.fourthline.core.mrz.internal.transformation.f.d(p013kotlin.text.t.n1(this.f24282y, bo0.n.w(0, 44)));
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j c() {
        return this.G;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j d() {
        return this.C;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j i() {
        return this.H;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j j() {
        return this.D;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j l() {
        return this.E;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    public c n() {
        return (c) this.f24283z.getValue();
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j p() {
        return this.A;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j r() {
        return this.B;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j t() {
        return this.F;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected String x() {
        return this.J;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j z() {
        return this.I;
    }
}
