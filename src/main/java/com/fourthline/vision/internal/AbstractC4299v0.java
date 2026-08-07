package com.fourthline.vision.internal;

import android.renderscript.RenderScript;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import com.fourthline.core.location.LocationProvider;

/* JADX INFO: renamed from: com.fourthline.vision.internal.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4299v0 {

    /* JADX INFO: renamed from: com.fourthline.vision.internal.v0$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private L f38985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C4297u5 f38986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private o6 f38987c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C4319y f38988d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private A0 f38989e;

        public a a(L l11) {
            this.f38985a = (L) qj0.h.b(l11);
            return this;
        }

        private a() {
        }

        public a a(C4319y c4319y) {
            this.f38988d = (C4319y) qj0.h.b(c4319y);
            return this;
        }

        public C2 a() {
            qj0.h.a(this.f38985a, L.class);
            if (this.f38986b == null) {
                this.f38986b = new C4297u5();
            }
            if (this.f38987c == null) {
                this.f38987c = new o6();
            }
            qj0.h.a(this.f38988d, C4319y.class);
            if (this.f38989e == null) {
                this.f38989e = new A0();
            }
            return new d(this.f38985a, this.f38986b, this.f38987c, this.f38988d, this.f38989e);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.v0$b */
    private static final class b implements InterfaceC4195g2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f38990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C4170d1 f38991b;

        @Override // com.fourthline.vision.internal.InterfaceC4195g2.a
        public InterfaceC4195g2 build() {
            qj0.h.a(this.f38991b, C4170d1.class);
            return new c(this.f38990a, this.f38991b);
        }

        private b(d dVar) {
            this.f38990a = dVar;
        }

        @Override // com.fourthline.vision.internal.InterfaceC4195g2.a
        public b documentModule(C4170d1 c4170d1) {
            this.f38991b = (C4170d1) qj0.h.b(c4170d1);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.v0$c */
    private static final class c implements InterfaceC4195g2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C4170d1 f38992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f38993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f38994c;

        private N0 a() {
            return AbstractC4194g1.a(this.f38992a, AbstractC4177e0.a(this.f38993b.f38995a));
        }

        private Q0 b() {
            return AbstractC4178e1.a(this.f38992a, h(), k(), C4209i0.b(this.f38993b.f38995a));
        }

        private Y0 c() {
            C4170d1 c4170d1 = this.f38992a;
            return AbstractC4210i1.a(c4170d1, AbstractC4314x1.a(c4170d1), u(), H1.a(this.f38992a), this.f38993b.b());
        }

        private C4146a1 d() {
            return AbstractC4217j1.a(this.f38992a, AbstractC4177e0.a(this.f38993b.f38995a));
        }

        private R1 e() {
            C4170d1 c4170d1 = this.f38992a;
            return AbstractC4231l1.a(c4170d1, AbstractC4252o1.a(c4170d1), (InterfaceC4287t2) this.f38993b.f39020z.get(), this.f38993b.c());
        }

        private S1 f() {
            C4170d1 c4170d1 = this.f38992a;
            return AbstractC4245n1.a(c4170d1, AbstractC4238m1.a(c4170d1), AbstractC4177e0.a(this.f38993b.f38995a), (LocationProvider) this.f38993b.f39013s.get(), AbstractC4259p1.a(this.f38992a), AbstractC4266q1.a(this.f38992a), getVisionAnalytics());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private C4155b2 g() {
            return J1.a(this.f38992a, AbstractC4177e0.a(this.f38993b.f38995a), h(), (C4323y3) this.f38993b.f39011q.get());
        }

        private C4179e2 h() {
            C4170d1 c4170d1 = this.f38992a;
            return L1.a(c4170d1, G1.a(c4170d1), i(), n(), o(), c(), x(), v(), w(), m(), this.f38993b.h(), E1.a(this.f38992a), (dy.c) this.f38993b.I.get(), Q.b(this.f38993b.f38995a), C4209i0.b(this.f38993b.f38995a));
        }

        private C4203h2 i() {
            return M1.a(this.f38992a, AbstractC4177e0.a(this.f38993b.f38995a), H1.a(this.f38992a));
        }

        private C4218j2 j() {
            C4170d1 c4170d1 = this.f38992a;
            return AbstractC4272r1.a(c4170d1, AbstractC4252o1.a(c4170d1));
        }

        private C4225k2 k() {
            return AbstractC4279s1.a(this.f38992a, l());
        }

        private C4239m2 l() {
            C4170d1 c4170d1 = this.f38992a;
            return AbstractC4286t1.a(c4170d1, AbstractC4224k1.a(c4170d1), j(), a(), d(), e(), AbstractC4202h1.a(this.f38992a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        private L2 m() {
            C4170d1 c4170d1 = this.f38992a;
            return AbstractC4300v1.a(c4170d1, G1.a(c4170d1), n(), (P3) this.f38993b.J.get(), t(), u(), this.f38993b.c(), this.f38993b.i(), (C4313x0) this.f38993b.f39003i.get());
        }

        private O2 n() {
            return AbstractC4307w1.a(this.f38992a, this.f38993b.i(), G1.a(this.f38992a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        private W2 o() {
            return AbstractC4321y1.a(this.f38992a, (T2) this.f38993b.f39017w.get());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private AbstractC4212i3 p() {
            return N1.a(this.f38992a, (C4323y3) this.f38993b.f39011q.get(), h());
        }

        private InterfaceC4240m3 q() {
            return O1.a(this.f38992a, N.a(this.f38993b.f38995a), this.f38993b.e(), AbstractC4201h0.a(this.f38993b.f38995a), p());
        }

        private E3 r() {
            return A1.a(this.f38992a, this.f38993b.f(), AbstractC4177e0.a(this.f38993b.f38995a), s(), C4161c0.b(this.f38993b.f38995a));
        }

        private F3 s() {
            return B1.a(this.f38992a, p());
        }

        private G3 t() {
            return C1.a(this.f38992a, AbstractC4177e0.a(this.f38993b.f38995a));
        }

        private H3 u() {
            C4170d1 c4170d1 = this.f38992a;
            return D1.a(c4170d1, G1.a(c4170d1));
        }

        /* JADX WARN: Multi-variable type inference failed */
        private C4180e3 v() {
            C4170d1 c4170d1 = this.f38992a;
            return AbstractC4293u1.a(c4170d1, H1.a(c4170d1), this.f38993b.c(), this.f38993b.i(), (W3) this.f38993b.G.get(), (P3) this.f38993b.J.get(), t(), this.f38993b.b());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private C4180e3 w() {
            return AbstractC4328z1.a(this.f38992a, u(), this.f38993b.c(), this.f38993b.i(), (P3) this.f38993b.J.get(), t(), this.f38993b.b());
        }

        private C4262p4 x() {
            return I1.a(this.f38992a, this.f38993b.b());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private InterfaceC4197g4 y() {
            return F1.a(this.f38992a, q(), r(), f(), z(), AbstractC4177e0.a(this.f38993b.f38995a), (LocationProvider) this.f38993b.f39013s.get(), (C4323y3) this.f38993b.f39011q.get(), (Q5) this.f38993b.A.get(), Q.b(this.f38993b.f38995a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        private M5 z() {
            C4170d1 c4170d1 = this.f38992a;
            return K1.a(c4170d1, AbstractC4252o1.a(c4170d1), (K2) this.f38993b.f39010p.get(), (T2) this.f38993b.f39017w.get(), b(), g());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.vision.internal.InterfaceC4195g2, com.fourthline.vision.internal.C6
        public C4284t getCameraFocusManager() {
            return (C4284t) this.f38993b.B.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.vision.internal.InterfaceC4195g2, com.fourthline.vision.internal.C6
        public C4313x0 getDebugConsumer() {
            return (C4313x0) this.f38993b.f39003i.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.vision.internal.InterfaceC4195g2, com.fourthline.vision.internal.C6
        public Y2 getLegacyPreviewCalculator() {
            return (Y2) this.f38993b.E.get();
        }

        @Override // com.fourthline.vision.internal.InterfaceC4195g2, com.fourthline.vision.internal.C6
        public C4196g3 getMediaCodecDataSource() {
            return this.f38993b.d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.vision.internal.InterfaceC4195g2, com.fourthline.vision.internal.C6
        public U3 getPreviewCalculator() {
            return (U3) this.f38993b.D.get();
        }

        @Override // com.fourthline.vision.internal.InterfaceC4195g2, com.fourthline.vision.internal.C6
        public InterfaceC4159b6 getVisionAnalytics() {
            C4170d1 c4170d1 = this.f38992a;
            return AbstractC4186f1.a(c4170d1, AbstractC4259p1.a(c4170d1), AbstractC4266q1.a(this.f38992a), AbstractC4252o1.a(this.f38992a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.vision.internal.InterfaceC4195g2, com.fourthline.vision.internal.C6
        public F6 getVisionViewModel() {
            return P1.a(this.f38992a, (H6) this.f38993b.f39007m.get(), (K2) this.f38993b.f39010p.get(), this.f38993b.i(), y(), (C4284t) this.f38993b.B.get(), C4161c0.b(this.f38993b.f38995a), m());
        }

        private c(d dVar, C4170d1 c4170d1) {
            this.f38994c = this;
            this.f38993b = dVar;
            this.f38992a = c4170d1;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.v0$d */
    private static final class d implements C2 {
        private qj0.i A;
        private qj0.i B;
        private qj0.i C;
        private qj0.i D;
        private qj0.i E;
        private qj0.i F;
        private qj0.i G;
        private qj0.i H;
        private qj0.i I;
        private qj0.i J;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final L f38995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o6 f38996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f38997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private qj0.i f38998d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private qj0.i f38999e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qj0.i f39000f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qj0.i f39001g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private qj0.i f39002h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private qj0.i f39003i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private qj0.i f39004j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private qj0.i f39005k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private qj0.i f39006l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private qj0.i f39007m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private qj0.i f39008n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private qj0.i f39009o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private qj0.i f39010p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private qj0.i f39011q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private qj0.i f39012r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private qj0.i f39013s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private qj0.i f39014t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private qj0.i f39015u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private qj0.i f39016v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private qj0.i f39017w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private qj0.i f39018x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private qj0.i f39019y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private qj0.i f39020z;

        @Override // com.fourthline.vision.internal.C2
        public InterfaceC4195g2.a documentBuilder() {
            return new b(this.f38997c);
        }

        @Override // com.fourthline.vision.internal.C2
        public InterfaceC4276r5.a selfieBuilder() {
            return new e(this.f38997c);
        }

        private d(L l11, C4297u5 c4297u5, o6 o6Var, C4319y c4319y, A0 a11) {
            this.f38997c = this;
            this.f38995a = l11;
            this.f38996b = o6Var;
            a(l11, c4297u5, o6Var, c4319y, a11);
        }

        private I2 a() {
            return U.a(this.f38995a, g(), i());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Q2 b() {
            return W.a(this.f38995a, a(), V.a(this.f38995a), i());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InterfaceC4164c3 c() {
            return X.a(this.f38995a, i());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C4196g3 d() {
            return Y.a(this.f38995a, i(), Z.a(this.f38995a), O.a(this.f38995a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InterfaceC4226k3 e() {
            L l11 = this.f38995a;
            return AbstractC4193g0.a(l11, P.b(l11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MotionDataCollector f() {
            L l11 = this.f38995a;
            return AbstractC4145a0.a(l11, P.b(l11), Q.b(this.f38995a), C4161c0.b(this.f38995a));
        }

        private RenderScript g() {
            L l11 = this.f38995a;
            return AbstractC4153b0.a(l11, P.b(l11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public P5 h() {
            return AbstractC4185f0.a(this.f38995a, (Q5) this.A.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public r6 i() {
            return q6.a(this.f38996b, (C4312x) this.f39002h.get());
        }

        private void a(L l11, C4297u5 c4297u5, o6 o6Var, C4319y c4319y, A0 a11) {
            P pA = P.a(l11);
            this.f38998d = pA;
            this.f38999e = C.a(c4319y, pA);
            this.f39000f = D.a(c4319y, this.f38998d);
            C4161c0 c4161c0A = C4161c0.a(l11);
            this.f39001g = c4161c0A;
            this.f39002h = qj0.d.e(B.a(c4319y, this.f38999e, this.f39000f, c4161c0A));
            this.f39003i = qj0.d.e(C4311w5.a(c4297u5));
            qj0.i iVarE = qj0.d.e(T.a(l11));
            this.f39004j = iVarE;
            qj0.i iVarE2 = qj0.d.e(S.a(l11, iVarE));
            this.f39005k = iVarE2;
            C4326z c4326zA = C4326z.a(c4319y, this.f38999e, iVarE2, this.f39002h);
            this.f39006l = c4326zA;
            this.f39007m = qj0.d.e(p6.a(o6Var, c4326zA));
            this.f39008n = qj0.d.e(C4332z5.a(c4297u5, this.f39002h));
            Q qA = Q.a(l11);
            this.f39009o = qA;
            this.f39010p = qj0.d.e(C4325y5.a(c4297u5, this.f39008n, this.f39005k, qA));
            this.f39011q = qj0.d.e(C5.a(c4297u5));
            M mA = M.a(l11);
            this.f39012r = mA;
            this.f39013s = qj0.d.e(B5.a(c4297u5, this.f38998d, mA));
            C4169d0 c4169d0A = C4169d0.a(l11, this.f38998d);
            this.f39014t = c4169d0A;
            this.f39015u = qj0.d.e(C4318x5.a(c4297u5, this.f39009o, c4169d0A));
            qj0.i iVarE3 = qj0.d.e(C4304v5.a(c4297u5, this.f39009o, this.f39014t));
            this.f39016v = iVarE3;
            this.f39017w = qj0.d.e(A5.a(c4297u5, this.f39009o, this.f39015u, iVarE3));
            this.f39018x = qj0.d.e(D0.a(a11, this.f39001g));
            C4223k0 c4223k0A = C4223k0.a(l11, this.f38998d);
            this.f39019y = c4223k0A;
            this.f39020z = qj0.d.e(C0.a(a11, this.f39018x, c4223k0A));
            this.A = qj0.d.e(D5.a(c4297u5));
            this.B = qj0.d.e(A.a(c4319y, this.f39006l, this.f39009o));
            q6 q6VarA = q6.a(o6Var, this.f39002h);
            this.C = q6VarA;
            this.D = qj0.d.e(C4230l0.a(l11, q6VarA));
            this.E = qj0.d.e(C4216j0.a(l11, this.C));
            qj0.i iVarE4 = qj0.d.e(B0.a(a11));
            this.F = iVarE4;
            this.G = qj0.d.e(F0.a(a11, iVarE4, this.f39019y));
            C4209i0 c4209i0A = C4209i0.a(l11);
            this.H = c4209i0A;
            qj0.i iVarE5 = qj0.d.e(G0.a(a11, c4209i0A));
            this.I = iVarE5;
            this.J = qj0.d.e(E0.a(a11, iVarE5, this.f39019y, this.H));
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.v0$e */
    private static final class e implements InterfaceC4276r5.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f39021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C4324y4 f39022b;

        @Override // com.fourthline.vision.internal.InterfaceC4276r5.a
        public InterfaceC4276r5 build() {
            qj0.h.a(this.f39022b, C4324y4.class);
            return new f(this.f39021a, this.f39022b);
        }

        private e(d dVar) {
            this.f39021a = dVar;
        }

        @Override // com.fourthline.vision.internal.InterfaceC4276r5.a
        public e selfieModule(C4324y4 c4324y4) {
            this.f39022b = (C4324y4) qj0.h.b(c4324y4);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.v0$f */
    private static final class f implements InterfaceC4276r5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C4324y4 f39023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f39024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f f39025c;

        private C4280s2 a() {
            C4324y4 c4324y4 = this.f39023a;
            return A4.a(c4324y4, H4.a(c4324y4), P4.a(this.f39023a), this.f39024b.b());
        }

        private C4315x2 b() {
            C4324y4 c4324y4 = this.f39023a;
            return D4.a(c4324y4, O4.a(c4324y4));
        }

        private C4322y2 c() {
            C4324y4 c4324y4 = this.f39023a;
            return E4.a(c4324y4, O4.a(c4324y4));
        }

        private C4329z2 d() {
            C4324y4 c4324y4 = this.f39023a;
            return F4.a(c4324y4, O4.a(c4324y4));
        }

        /* JADX WARN: Multi-variable type inference failed */
        private M2 e() {
            C4324y4 c4324y4 = this.f39023a;
            return G4.a(c4324y4, V4.a(c4324y4), (C4313x0) this.f39024b.f39003i.get(), (InterfaceC4287t2) this.f39024b.f39020z.get(), this.f39024b.c());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private V2 f() {
            return I4.a(this.f39023a, (T2) this.f39024b.f39017w.get());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private AbstractC4212i3 g() {
            return AbstractC4190f5.a(this.f39023a, (C4323y3) this.f39024b.f39011q.get(), V4.a(this.f39023a));
        }

        private InterfaceC4240m3 h() {
            return AbstractC4198g5.a(this.f39023a, N.a(this.f39024b.f38995a), this.f39024b.e(), AbstractC4201h0.a(this.f39024b.f38995a), g());
        }

        private E3 i() {
            return K4.a(this.f39023a, this.f39024b.f(), AbstractC4177e0.a(this.f39024b.f38995a), j(), C4161c0.b(this.f39024b.f38995a));
        }

        private F3 j() {
            return L4.a(this.f39023a, g());
        }

        private J5 k() {
            return S4.a(this.f39023a, f(), X4.a(this.f39023a), C4.a(this.f39023a), M4.a(this.f39023a), b(), d(), c(), t(), a(), e());
        }

        private J5 l() {
            return AbstractC4158b5.a(this.f39023a, t(), AbstractC4166c5.a(this.f39023a), a(), B4.a(this.f39023a), M4.a(this.f39023a), e());
        }

        private J5 m() {
            return AbstractC4174d5.a(this.f39023a, t(), AbstractC4182e5.a(this.f39023a), a(), B4.a(this.f39023a), M4.a(this.f39023a), e());
        }

        private J5 n() {
            return N4.a(this.f39023a, t(), J4.a(this.f39023a), a(), B4.a(this.f39023a), M4.a(this.f39023a), e());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private InterfaceC4197g4 o() {
            return Q4.a(this.f39023a, h(), i(), q(), s(), AbstractC4177e0.a(this.f39024b.f38995a), (LocationProvider) this.f39024b.f39013s.get(), (C4323y3) this.f39024b.f39011q.get(), (Q5) this.f39024b.A.get(), Q.b(this.f39024b.f38995a));
        }

        private C4303v4 p() {
            return AbstractC4331z4.a(this.f39023a, r());
        }

        private C4214i5 q() {
            C4324y4 c4324y4 = this.f39023a;
            return U4.a(c4324y4, T4.a(c4324y4), W4.a(this.f39023a), getVisionAnalytics(), (LocationProvider) this.f39024b.f39013s.get());
        }

        private C4270q5 r() {
            C4324y4 c4324y4 = this.f39023a;
            return Z4.a(c4324y4, V4.a(c4324y4), k(), l(), m(), n());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private M5 s() {
            return Y4.a(this.f39023a, (K2) this.f39024b.f39010p.get(), (T2) this.f39024b.f39017w.get(), p());
        }

        private O5 t() {
            return AbstractC4150a5.a(this.f39023a, AbstractC4177e0.a(this.f39024b.f38995a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.vision.internal.InterfaceC4276r5, com.fourthline.vision.internal.C6
        public C4284t getCameraFocusManager() {
            return (C4284t) this.f39024b.B.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.vision.internal.InterfaceC4276r5, com.fourthline.vision.internal.C6
        public C4313x0 getDebugConsumer() {
            return (C4313x0) this.f39024b.f39003i.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.vision.internal.InterfaceC4276r5, com.fourthline.vision.internal.C6
        public Y2 getLegacyPreviewCalculator() {
            return (Y2) this.f39024b.E.get();
        }

        @Override // com.fourthline.vision.internal.InterfaceC4276r5, com.fourthline.vision.internal.C6
        public C4196g3 getMediaCodecDataSource() {
            return this.f39024b.d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.vision.internal.InterfaceC4276r5, com.fourthline.vision.internal.C6
        public U3 getPreviewCalculator() {
            return (U3) this.f39024b.D.get();
        }

        @Override // com.fourthline.vision.internal.InterfaceC4276r5, com.fourthline.vision.internal.C6
        public InterfaceC4159b6 getVisionAnalytics() {
            C4324y4 c4324y4 = this.f39023a;
            return R4.a(c4324y4, V4.a(c4324y4), W4.a(this.f39023a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.vision.internal.InterfaceC4276r5, com.fourthline.vision.internal.C6
        public F6 getVisionViewModel() {
            return AbstractC4206h5.a(this.f39023a, (H6) this.f39024b.f39007m.get(), (K2) this.f39024b.f39010p.get(), this.f39024b.i(), o(), (C4284t) this.f39024b.B.get(), C4161c0.b(this.f39024b.f38995a), e());
        }

        private f(d dVar, C4324y4 c4324y4) {
            this.f39025c = this;
            this.f39024b = dVar;
            this.f39023a = c4324y4;
        }
    }

    public static a a() {
        return new a();
    }
}
