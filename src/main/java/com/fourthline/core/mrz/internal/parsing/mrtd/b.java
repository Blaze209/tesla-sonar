package com.fourthline.core.mrz.internal.parsing.mrtd;

import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends d {
    public static final a L = new a(null);
    private final Lazy A;
    private final bo0.j B;
    private final bo0.j C;
    private final bo0.j D;
    private final bo0.j E;
    private final String F;
    private final String G;
    private final String H;
    private final String I;
    private final String J;
    private final String K;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f24236y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final c f24237z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String mrzText) {
        super(mrzText);
        p013kotlin.jvm.internal.s.k(mrzText, "mrzText");
        this.f24236y = mrzText;
        this.f24237z = new com.fourthline.core.mrz.internal.parsing.mrtd.a(mrzText);
        this.A = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.k
            @Override // wn0.a
            public final Object invoke() {
                return b.a(this.f24284a);
            }
        });
        this.B = bo0.n.w(63, 69);
        this.C = new bo0.j(70, 70);
        this.D = new bo0.j(69, 69);
        this.E = new bo0.j(71, 71);
        this.F = "FRA";
        this.G = "";
        this.H = "";
        this.I = "IDFRA" + com.fourthline.core.mrz.internal.transformation.f.j(p013kotlin.text.t.n1(mrzText, bo0.n.w(5, 30))) + p013kotlin.text.t.n1(mrzText, bo0.n.w(30, 49)) + com.fourthline.core.mrz.internal.transformation.f.j(p013kotlin.text.t.n1(mrzText, bo0.n.w(49, 63))) + e() + b() + m();
        this.J = com.fourthline.core.mrz.internal.transformation.f.b(p013kotlin.text.t.V(p013kotlin.text.t.n1(mrzText, bo0.n.w(49, 63)), "<<", "<", false, 4, null));
        this.K = com.fourthline.core.mrz.internal.transformation.f.b(p013kotlin.text.t.n1(mrzText, bo0.n.w(5, 30)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(b bVar) {
        return bVar.K + "<<" + bVar.J;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    public boolean A() {
        return (com.fourthline.core.mrz.internal.transformation.f.d(p013kotlin.text.t.n1(p013kotlin.text.t.n1(this.f24236y, bo0.n.w(0, 36)), bo0.n.w(5, 30))) && com.fourthline.core.mrz.internal.transformation.f.d(p013kotlin.text.t.n1(p013kotlin.text.t.n1(this.f24236y, bo0.n.w(36, 72)), bo0.n.w(13, 27)))) ? false : true;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j c() {
        return this.D;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j d() {
        return this.B;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected String h() {
        return this.H;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected String k() {
        return this.G;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j l() {
        return this.C;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    public c n() {
        return this.f24237z;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected String q() {
        return (String) this.A.getValue();
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected String s() {
        return this.F;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected String x() {
        return this.I;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j z() {
        return this.E;
    }
}
