package com.fourthline.core.mrz.internal.parsing.mrtd;

import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends d {
    private static final a M = new a(null);
    private static final bo0.j N = bo0.n.w(48, 59);
    private final bo0.j A;
    private final bo0.j B;
    private final bo0.j C;
    private final bo0.j D;
    private final bo0.j E;
    private final int F;
    private final int G;
    private final bo0.j H;
    private final bo0.j I;
    private final bo0.j J;
    private final bo0.j K;
    private final String L;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f24274y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Lazy f24275z;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String mrzText) {
        super(mrzText);
        p013kotlin.jvm.internal.s.k(mrzText, "mrzText");
        this.f24274y = mrzText;
        this.f24275z = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.b0
            @Override // wn0.a
            public final Object invoke() {
                return f.a(this.f24238a);
            }
        });
        this.A = bo0.n.w(60, 90);
        this.B = bo0.n.w(45, 48);
        this.C = bo0.n.w(30, 36);
        this.D = bo0.n.w(38, 44);
        this.E = new bo0.j(37, 37);
        int iMax = Math.max(n().e().c() + 1, 15);
        this.F = iMax;
        int i11 = C() ? 28 : 29;
        this.G = i11;
        this.H = new bo0.j(iMax, i11);
        this.I = new bo0.j(36, 36);
        this.J = new bo0.j(44, 44);
        this.K = new bo0.j(59, 59);
        this.L = com.fourthline.core.mrz.internal.transformation.f.g(p013kotlin.text.t.n1(mrzText, new bo0.j(5, 30))) + p013kotlin.text.t.n1(mrzText, new bo0.j(31, 36)) + p013kotlin.text.t.n1(mrzText, new bo0.j(38, 44)) + p013kotlin.text.t.n1(mrzText, N);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e a(f fVar) {
        return new e(fVar.f24274y, true);
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    public boolean A() {
        return !com.fourthline.core.mrz.internal.transformation.f.d(p013kotlin.text.t.n1(this.f24274y, bo0.n.w(0, 90)));
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j c() {
        return this.I;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j d() {
        return this.C;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j i() {
        return this.J;
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
        return (c) this.f24275z.getValue();
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
        return this.H;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected String x() {
        return this.L;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.d
    protected bo0.j z() {
        return this.K;
    }

    private final boolean C() {
        return p013kotlin.jvm.internal.s.f(f(), "NLD") && p013kotlin.jvm.internal.s.f(g(), "I");
    }
}
