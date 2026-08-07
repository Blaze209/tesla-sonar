package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import com.fourthline.orca.Orca;

/* JADX INFO: loaded from: classes4.dex */
public abstract class X5 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Qy f29658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C3423jF f29659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private YE f29660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C3494l0 f29661d;

        public a a(Qy qy2) {
            this.f29658a = (Qy) qj0.h.b(qy2);
            return this;
        }

        private a() {
        }

        public Py a() {
            qj0.h.a(this.f29658a, Qy.class);
            if (this.f29659b == null) {
                this.f29659b = new C3423jF();
            }
            if (this.f29660c == null) {
                this.f29660c = new YE();
            }
            if (this.f29661d == null) {
                this.f29661d = new C3494l0();
            }
            return new b(this.f29658a, this.f29659b, this.f29660c, this.f29661d);
        }
    }

    private static final class b implements Py {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final YE f29662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f29663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private qj0.i f29664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private qj0.i f29665d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private qj0.i f29666e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qj0.i f29667f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qj0.i f29668g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private qj0.i f29669h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private qj0.i f29670i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private qj0.i f29671j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private qj0.i f29672k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private qj0.i f29673l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private qj0.i f29674m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private qj0.i f29675n;

        private b(Qy qy2, C3423jF c3423jF, YE ye2, C3494l0 c3494l0) {
            this.f29663b = this;
            this.f29662a = ye2;
            a(qy2, c3423jF, ye2, c3494l0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public Gl a() {
            return C3083bF.a(this.f29662a, (Gl) this.f29670i.get(), (wn0.a) this.f29671j.get(), (C3438jo) this.f29666e.get());
        }

        @Override // com.fourthline.orca.internal.Py
        public Zy.a b() {
            return new c(this.f29663b);
        }

        private void a(Qy qy2, C3423jF c3423jF, YE ye2, C3494l0 c3494l0) {
            this.f29664c = qj0.d.e(Ry.a(qy2));
            qj0.i iVarE = qj0.d.e(C3537m0.a(c3494l0));
            this.f29665d = iVarE;
            this.f29666e = qj0.d.e(C3623o0.a(c3494l0, iVarE));
            qj0.i iVarE2 = qj0.d.e(Ty.a(qy2));
            this.f29667f = iVarE2;
            this.f29668g = qj0.d.e(C3040aF.a(ye2, iVarE2, this.f29666e));
            this.f29669h = qj0.d.e(Uy.a(qy2));
            this.f29670i = qj0.d.e(C3168dF.a(ye2, this.f29667f));
            this.f29671j = qj0.d.e(C3466kF.a(c3423jF, this.f29669h));
            this.f29672k = qj0.d.e(Sy.a(qy2));
            qj0.i iVarE3 = qj0.d.e(C3509lF.a(c3423jF, this.f29669h));
            this.f29673l = iVarE3;
            this.f29674m = C3125cF.a(ye2, this.f29670i, iVarE3, this.f29666e);
            this.f29675n = C3083bF.a(ye2, this.f29670i, this.f29671j, this.f29666e);
        }
    }

    private static final class c implements Zy.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f29676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C4015x5 f29677b;

        @Override // com.fourthline.orca.internal.Zy.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(C4015x5 c4015x5) {
            this.f29677b = (C4015x5) qj0.h.b(c4015x5);
            return this;
        }

        @Override // com.fourthline.orca.internal.Zy.a
        public Zy build() {
            qj0.h.a(this.f29677b, C4015x5.class);
            return new d(this.f29676a, new Y5(), this.f29677b, new C3066az(), new C3676pA(), new C4025xF(), new AA(), new Vy());
        }

        private c(b bVar) {
            this.f29676a = bVar;
        }
    }

    private static final class d implements Zy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Vy f29678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C4015x5 f29679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C3066az f29680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f29681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final d f29682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qj0.i f29683f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qj0.i f29684g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private qj0.i f29685h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private qj0.i f29686i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private qj0.i f29687j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private qj0.i f29688k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private qj0.i f29689l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private qj0.i f29690m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private qj0.i f29691n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private qj0.i f29692o;

        private void a(Y5 y11, C4015x5 c4015x5, C3066az c3066az, C3676pA c3676pA, C4025xF c4025xF, AA aa2, Vy vy2) {
            C4058y5 c4058y5A = C4058y5.a(c4015x5);
            this.f29683f = c4058y5A;
            qj0.i iVarE = qj0.d.e(C3287g6.a(y11, c4058y5A));
            this.f29684g = iVarE;
            this.f29685h = qj0.d.e(AF.a(c4025xF, this.f29681d.f29668g, iVarE));
            this.f29686i = C3804sA.a(c3676pA);
            this.f29687j = C3761rA.a(c3676pA, this.f29683f);
            BA baA = BA.a(aa2);
            this.f29688k = baA;
            b bVar = this.f29681d;
            this.f29689l = qj0.d.e(C4068yF.a(c4025xF, bVar.f29667f, bVar.f29674m, baA));
            this.f29690m = C3719qA.a(c3676pA);
            qj0.c cVar = new qj0.c();
            this.f29691n = cVar;
            b bVar2 = this.f29681d;
            qj0.c.a(cVar, C3193dz.a(c3066az, bVar2.f29667f, bVar2.f29675n, cVar));
            qj0.c cVar2 = new qj0.c();
            this.f29692o = cVar2;
            b bVar3 = this.f29681d;
            qj0.c.a(cVar2, C3236ez.a(c3066az, bVar3.f29667f, bVar3.f29675n, cVar2));
        }

        private InterfaceC3625o2 c() {
            return C3108bz.a(this.f29680c, (NetworkEnvironment) this.f29681d.f29667f.get(), this.f29681d.a(), this.f29690m);
        }

        private InterfaceC4018x8 d() {
            return C3193dz.a(this.f29680c, (NetworkEnvironment) this.f29681d.f29667f.get(), this.f29681d.a(), this.f29691n);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Xk e() {
            return Yy.a(this.f29678a, (C3765rE) this.f29681d.f29669h.get());
        }

        private InterfaceC4049xx f() {
            return C3236ez.a(this.f29680c, (NetworkEnvironment) this.f29681d.f29667f.get(), this.f29681d.a(), this.f29692o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private InterfaceC3508lE g() {
            return C3279fz.a(this.f29680c, (NetworkEnvironment) this.f29681d.f29667f.get(), this.f29681d.a(), this.f29687j, (Orca.a) this.f29681d.f29672k.get(), (C3438jo) this.f29681d.f29666e.get());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private QE h() {
            return Wy.a(this.f29678a, C4058y5.b(this.f29679b), (X3) this.f29685h.get(), e(), i(), g(), (InterfaceC3852tF) this.f29689l.get(), c(), (NetworkEnvironment) this.f29681d.f29667f.get(), (C3438jo) this.f29681d.f29666e.get());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private InterfaceC3681pF i() {
            return C3365hz.a(this.f29680c, (NetworkEnvironment) this.f29681d.f29667f.get(), (Gl) this.f29681d.f29670i.get(), (C3438jo) this.f29681d.f29666e.get(), this.f29686i);
        }

        @Override // com.fourthline.orca.internal.Zy
        public Gg b() {
            return Xy.a(this.f29678a, h(), d(), f());
        }

        private d(b bVar, Y5 y11, C4015x5 c4015x5, C3066az c3066az, C3676pA c3676pA, C4025xF c4025xF, AA aa2, Vy vy2) {
            this.f29682e = this;
            this.f29681d = bVar;
            this.f29678a = vy2;
            this.f29679b = c4015x5;
            this.f29680c = c3066az;
            a(y11, c4015x5, c3066az, c3676pA, c4025xF, aa2, vy2);
        }

        @Override // com.fourthline.orca.internal.Zy
        public InterfaceC3457k6 a() {
            return C3151cz.a(this.f29680c, (NetworkEnvironment) this.f29681d.f29667f.get(), this.f29681d.a());
        }
    }

    public static a a() {
        return new a();
    }
}
