package com.fourthline.orca.internal;

import com.fourthline.core.internal.TimestampProvider;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class V5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final qj0.i f28959a = qj0.f.a(ou.m.a());

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private F7 f28960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C3253fF f28961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private YE f28962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C3494l0 f28963d;

        public a a(F7 f11) {
            this.f28960a = (F7) qj0.h.b(f11);
            return this;
        }

        private a() {
        }

        public InterfaceC4040xo a() {
            qj0.h.a(this.f28960a, F7.class);
            if (this.f28961b == null) {
                this.f28961b = new C3253fF();
            }
            if (this.f28962c == null) {
                this.f28962c = new YE();
            }
            if (this.f28963d == null) {
                this.f28963d = new C3494l0();
            }
            return new f(this.f28960a, this.f28961b, this.f28962c, this.f28963d);
        }
    }

    private static final class b implements InterfaceC2917Pa.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f28964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f28965b;

        @Override // com.fourthline.orca.internal.InterfaceC2917Pa.a
        public InterfaceC2917Pa build() {
            return new c(this.f28964a, this.f28965b, new C2877Ha(), new Z6(), new C3965vz());
        }

        private b(f fVar, e eVar) {
            this.f28964a = fVar;
            this.f28965b = eVar;
        }
    }

    private static final class c implements InterfaceC2917Pa {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C2877Ha f28966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C3965vz f28967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Z6 f28968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final f f28969d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final e f28970e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final c f28971f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qj0.i f28972g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private qj0.i f28973h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private qj0.i f28974i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private qj0.i f28975j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private qj0.i f28976k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private qj0.i f28977l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private qj0.i f28978m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private qj0.i f28979n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private qj0.i f28980o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private qj0.i f28981p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private qj0.i f28982q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private qj0.i f28983r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private qj0.i f28984s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private qj0.i f28985t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private qj0.i f28986u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private qj0.i f28987v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private qj0.i f28988w;

        private void a(C2877Ha c2877Ha, Z6 z11, C3965vz c3965vz) {
            qj0.i iVarA = V5.a();
            this.f28972g = iVarA;
            this.f28973h = C4008wz.a(c3965vz, iVarA);
            qj0.i iVarA2 = g.a(this.f28970e.I);
            this.f28974i = iVarA2;
            this.f28975j = C3117c7.a(z11, iVarA2);
            e eVar = this.f28970e;
            C4069ya c4069yaA = C4069ya.a(eVar.f28992a, eVar.f29016y);
            this.f28976k = c4069yaA;
            this.f28977l = qj0.d.e(C4137zz.a(c3965vz, c4069yaA));
            qj0.i iVarA3 = V5.a();
            this.f28978m = iVarA3;
            e eVar2 = this.f28970e;
            Cz czA = Cz.a(c3965vz, eVar2.J, this.f28976k, iVarA3, eVar2.C, this.f28969d.f29031n);
            this.f28979n = czA;
            this.f28980o = C3032a7.a(z11, this.f28970e.C, czA);
            this.f28981p = C4051xz.a(c3965vz, this.f28970e.C, this.f28975j);
            qj0.i iVarA4 = g.a(this.f28970e.K);
            this.f28982q = iVarA4;
            C3501l7 c3501l7A = C3501l7.a(z11, iVarA4);
            this.f28983r = c3501l7A;
            this.f28984s = Bz.a(c3965vz, c3501l7A);
            C2912Oa c2912OaA = C2912Oa.a(c2877Ha);
            this.f28985t = c2912OaA;
            e eVar3 = this.f28970e;
            C3331h7 c3331h7A = C3331h7.a(z11, eVar3.N, c2912OaA, eVar3.C, eVar3.O, eVar3.H, this.f28976k);
            this.f28986u = c3331h7A;
            this.f28987v = Dz.a(c3965vz, this.f28975j, this.f28977l, this.f28980o, this.f28981p, this.f28984s, c3331h7A, this.f28972g, this.f28969d.f29025h);
            this.f28988w = C4094yz.a(c3965vz, this.f28977l, this.f28979n);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private P6 c() {
            return AbstractC3075b7.a(this.f28968c, (C3438jo) this.f28969d.f29025h.get());
        }

        private W6 d() {
            e eVar = this.f28970e;
            return C4069ya.a(eVar.f28992a, ou.m.d((W6) eVar.f29014w.get()));
        }

        private Y6 e() {
            return AbstractC3160d7.a(this.f28968c, (wn0.a) this.f28970e.J.get(), (InterfaceC3212eb) this.f28970e.C.get(), w(), x());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private InterfaceC3544m7 f() {
            return AbstractC3202e7.a(this.f28968c, i(), d(), (Kp) this.f28970e.R.get());
        }

        private InterfaceC4044xs g() {
            return AbstractC3245f7.a(this.f28968c, (InterfaceC3212eb) this.f28970e.C.get(), this.f28970e.H(), C2912Oa.b(this.f28966a), this.f28970e.x(), (InterfaceC3732qh) this.f28970e.H.get(), d());
        }

        private C3801s7 h() {
            return AbstractC3288g7.a(this.f28968c, (Uj) this.f28970e.G.get(), (InterfaceC3732qh) this.f28970e.H.get());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private DocumentAnalysisConfig i() {
            return C3117c7.a(this.f28968c, ou.m.d((DocumentAnalysisConfig) this.f28970e.I.get()));
        }

        private List j() {
            return C3501l7.a(this.f28968c, ou.m.d((List) this.f28970e.K.get()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        private C2932Sa k() {
            return AbstractC2897La.a(this.f28966a, (C3438jo) this.f28969d.f29025h.get(), (InterfaceC3212eb) this.f28970e.C.get());
        }

        private C3425jb l() {
            return AbstractC2902Ma.a(this.f28966a, (InterfaceC3212eb) this.f28970e.C.get(), (InterfaceC3554mb) this.f28970e.E.get(), m(), (Uj) this.f28970e.G.get(), (InterfaceC3732qh) this.f28970e.H.get());
        }

        private InterfaceC3511lb m() {
            return AbstractC2836Aa.a(this.f28970e.f28994c, ou.m.a());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private InterfaceC2931Re n() {
            return AbstractC2882Ia.a(this.f28966a, o(), (Bs) this.f28970e.L.get(), s(), (C3046af) this.f28970e.P.get(), (CoroutineScope) this.f28970e.f29006o.get());
        }

        private InterfaceC3131cf o() {
            return AbstractC2887Ja.a(this.f28966a, p(), q(), r());
        }

        private InterfaceC3131cf p() {
            e eVar = this.f28970e;
            return AbstractC2842Ba.a(eVar.f28994c, eVar.x(), ou.m.a());
        }

        private InterfaceC3131cf q() {
            e eVar = this.f28970e;
            return AbstractC2854Da.a(eVar.f28994c, eVar.x(), ou.m.a());
        }

        private InterfaceC3131cf r() {
            e eVar = this.f28970e;
            return AbstractC2866Fa.a(eVar.f28994c, eVar.x(), ou.m.a());
        }

        private InterfaceC3216ef s() {
            return AbstractC2892Ka.a(this.f28966a, t(), u(), v());
        }

        private InterfaceC3216ef t() {
            return AbstractC2848Ca.a(this.f28970e.f28994c, ou.m.a(), (InterfaceC3732qh) this.f28970e.H.get());
        }

        private InterfaceC3216ef u() {
            e eVar = this.f28970e;
            return AbstractC2860Ea.a(eVar.f28994c, (InterfaceC3212eb) eVar.C.get(), ou.m.a(), (InterfaceC3732qh) this.f28970e.H.get());
        }

        private InterfaceC3216ef v() {
            return AbstractC2872Ga.a(this.f28970e.f28994c, ou.m.a(), (InterfaceC3732qh) this.f28970e.H.get());
        }

        private Dg w() {
            return AbstractC3458k7.a(this.f28968c, d(), this.f28969d.d());
        }

        private InterfaceC3974w7 x() {
            return AbstractC3374i7.a(this.f28968c, (TimestampProvider) this.f28970e.Q.get(), j(), (InterfaceC3212eb) this.f28970e.C.get());
        }

        private InterfaceC3921uz y() {
            return Az.a(this.f28967b, (InterfaceC3212eb) this.f28970e.C.get(), this.f28973h, this.f28987v, this.f28988w);
        }

        @Override // com.fourthline.orca.internal.InterfaceC2917Pa
        public C4060y7 b() {
            return AbstractC3415j7.a(this.f28968c, this.f28970e.x(), h(), g(), (CoroutineScope) this.f28970e.f29006o.get(), c(), e(), f());
        }

        private c(f fVar, e eVar, C2877Ha c2877Ha, Z6 z11, C3965vz c3965vz) {
            this.f28971f = this;
            this.f28969d = fVar;
            this.f28970e = eVar;
            this.f28966a = c2877Ha;
            this.f28967b = c3965vz;
            this.f28968c = z11;
            a(c2877Ha, z11, c3965vz);
        }

        @Override // com.fourthline.orca.internal.InterfaceC2917Pa
        public C3640ob a() {
            return AbstractC2907Na.a(this.f28966a, (InterfaceC3212eb) this.f28970e.C.get(), (InterfaceC3298gb) this.f28970e.C.get(), this.f28970e.x(), this.f28970e.F(), l(), y(), ou.m.a(), ou.m.a(), n(), k(), (InterfaceC3732qh) this.f28970e.H.get(), (Uj) this.f28970e.G.get(), this.f28970e.H(), (CoroutineScope) this.f28970e.f29006o.get());
        }
    }

    private static final class d implements InterfaceC3005Wb.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f28989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C3152d f28990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C4079yk f28991c;

        @Override // com.fourthline.orca.internal.InterfaceC3697pp
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(C3152d c3152d) {
            this.f28990b = (C3152d) qj0.h.b(c3152d);
            return this;
        }

        private d(f fVar) {
            this.f28989a = fVar;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3697pp
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(C4079yk c4079yk) {
            this.f28991c = (C4079yk) qj0.h.b(c4079yk);
            return this;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3697pp
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC3005Wb build() {
            qj0.h.a(this.f28990b, C3152d.class);
            qj0.h.a(this.f28991c, C4079yk.class);
            return new e(this.f28989a, this.f28990b, new C4130zs(), new C3712q3(), new C2977Ve(), new Y5(), new Jw(), this.f28991c, new C9(), new C4026xa(), new C4112za());
        }
    }

    private static final class e implements InterfaceC3005Wb {
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
        private qj0.i K;
        private qj0.i L;
        private qj0.i M;
        private qj0.i N;
        private qj0.i O;
        private qj0.i P;
        private qj0.i Q;
        private qj0.i R;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C4026xa f28992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C9 f28993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C4112za f28994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final C4130zs f28995d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final f f28996e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final e f28997f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qj0.i f28998g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private qj0.i f28999h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private qj0.i f29000i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private qj0.i f29001j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private qj0.i f29002k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private qj0.i f29003l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private qj0.i f29004m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private qj0.i f29005n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private qj0.i f29006o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private qj0.i f29007p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private qj0.i f29008q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private qj0.i f29009r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private qj0.i f29010s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private qj0.i f29011t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private qj0.i f29012u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private qj0.i f29013v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private qj0.i f29014w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private qj0.i f29015x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private qj0.i f29016y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private qj0.i f29017z;

        private W6 E() {
            return C4069ya.a(this.f28992a, ou.m.d((W6) this.f29014w.get()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public ED F() {
            return H9.a(this.f28993b, (C3383ia) this.D.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public C4087ys H() {
            return As.a(this.f28995d, (Bs) this.L.get(), (C3785rs) this.M.get(), (CoroutineScope) this.f29006o.get());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.InterfaceC3654op
        public p011ja.w C() {
            return (p011ja.w) this.f29000i.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.InterfaceC3654op
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public A9 a() {
            return (A9) this.f28996e.f29022e.get();
        }

        @Override // com.fourthline.orca.internal.InterfaceC3654op
        public Zk v() {
            return (Zk) this.f29009r.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.InterfaceC3005Wb
        public My x() {
            return new My((InterfaceC3863tk) this.f29013v.get(), E(), (C3392ik) this.f29015x.get());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.InterfaceC3654op
        public Es y() {
            return (Es) this.f29007p.get();
        }

        private e(f fVar, C3152d c3152d, C4130zs c4130zs, C3712q3 c3712q3, C2977Ve c2977Ve, Y5 y11, Jw jw2, C4079yk c4079yk, C9 c11, C4026xa c4026xa, C4112za c4112za) {
            this.f28997f = this;
            this.f28996e = fVar;
            this.f28992a = c4026xa;
            this.f28993b = c11;
            this.f28994c = c4112za;
            this.f28995d = c4130zs;
            a(c3152d, c4130zs, c3712q3, c2977Ve, y11, jw2, c4079yk, c11, c4026xa, c4112za);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3005Wb
        public InterfaceC2917Pa.a c() {
            return new b(this.f28996e, this.f28997f);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3654op
        public InterfaceC3955vp d() {
            return (InterfaceC3955vp) this.f28998g.get();
        }

        @Override // com.fourthline.orca.internal.InterfaceC3654op
        public HA i() {
            return (HA) this.f29003l.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.InterfaceC3654op
        public Wf o() {
            return (Wf) this.f28996e.f29027j.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.InterfaceC3654op
        public Ew p() {
            return (Ew) this.f29012u.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.InterfaceC3654op
        public Zj q() {
            return (Zj) this.f29004m.get();
        }

        private void a(C3152d c3152d, C4130zs c4130zs, C3712q3 c3712q3, C2977Ve c2977Ve, Y5 y11, Jw jw2, C4079yk c4079yk, C9 c11, C4026xa c4026xa, C4112za c4112za) {
            this.f28998g = qj0.d.e(C3922v.a(c3152d, this.f28996e.f29021d));
            this.f28999h = qj0.d.e(C3793s.a(c3152d, this.f28996e.f29023f));
            qj0.i iVarE = qj0.d.e(Bk.a(c4079yk));
            this.f29000i = iVarE;
            this.f29001j = qj0.d.e(C4122zk.a(c4079yk, iVarE));
            qj0.i iVarE2 = qj0.d.e(Ek.a(c4079yk));
            this.f29002k = iVarE2;
            qj0.i iVarE3 = qj0.d.e(Dk.a(c4079yk, iVarE2));
            this.f29003l = iVarE3;
            f fVar = this.f28996e;
            this.f29004m = qj0.d.e(Ak.a(c4079yk, fVar.f29021d, this.f28999h, this.f29001j, iVarE3, fVar.f29026i));
            qj0.i iVarE4 = qj0.d.e(C4009x.a(c3152d));
            this.f29005n = iVarE4;
            qj0.i iVarE5 = qj0.d.e(C3450k.a(c3152d, iVarE4));
            this.f29006o = iVarE5;
            this.f29007p = qj0.d.e(C3023Ze.a(c2977Ve, iVarE5));
            qj0.i iVarE6 = qj0.d.e(C3407j.a(c3152d));
            this.f29008q = iVarE6;
            this.f29009r = qj0.d.e(C3708q.a(c3152d, iVarE6, this.f28999h, this.f29006o));
            this.f29010s = qj0.d.e(Z5.a(y11, this.f29008q, this.f29006o));
            qj0.i iVarE7 = qj0.d.e(C3031a6.a(y11));
            this.f29011t = iVarE7;
            this.f29012u = qj0.d.e(C3373i6.a(y11, this.f29010s, iVarE7, this.f28996e.f29021d, this.f29006o));
            this.f29013v = qj0.d.e(Ck.a(c4079yk, this.f29004m, this.f29006o));
            this.f29014w = qj0.d.e(E9.a(c11));
            this.f29015x = qj0.d.e(F9.a(c11));
            qj0.i iVarA = g.a(this.f29014w);
            this.f29016y = iVarA;
            this.f29017z = C4069ya.a(c4026xa, iVarA);
            this.A = qj0.d.e(C3323h.a(c3152d));
            qj0.i iVarE8 = qj0.d.e(C3330h6.a(y11, this.f28996e.f29021d));
            this.B = iVarE8;
            qj0.i iVarE9 = qj0.d.e(G9.a(c11, this.f29017z, this.f29011t, this.f28996e.f29022e, this.A, iVarE8));
            this.C = iVarE9;
            this.D = qj0.d.e(I9.a(c11, this.f28996e.f29021d, iVarE9));
            this.E = qj0.d.e(J9.a(c11));
            qj0.i iVarE10 = qj0.d.e(Nw.a(jw2, this.f28996e.f29021d));
            this.F = iVarE10;
            this.G = qj0.d.e(Lw.a(jw2, this.f29008q, iVarE10));
            this.H = qj0.d.e(Kw.a(jw2, this.f29008q, this.F));
            this.I = qj0.d.e(D9.a(c11, this.f28996e.f29022e));
            this.J = qj0.d.e(L9.a(c11, this.f28996e.f29021d));
            this.K = qj0.d.e(K9.a(c11, this.f28996e.f29022e));
            this.L = qj0.d.e(C3008We.a(c2977Ve));
            qj0.i iVarE11 = qj0.d.e(C3018Ye.a(c2977Ve, this.f28996e.f29025h));
            this.M = iVarE11;
            this.N = As.a(c4130zs, this.L, iVarE11, this.f29006o);
            this.O = Ny.a(this.f29013v, this.f29017z, this.f29015x);
            this.P = qj0.d.e(C3013Xe.a(c2977Ve, this.f28996e.f29025h));
            this.Q = qj0.d.e(C3966w.a(c3152d));
            this.R = qj0.d.e(C4056y3.a(c3712q3));
        }
    }

    private static final class f implements InterfaceC4040xo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final YE f29018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C3253fF f29019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f f29020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private qj0.i f29021d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private qj0.i f29022e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qj0.i f29023f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qj0.i f29024g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private qj0.i f29025h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private qj0.i f29026i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private qj0.i f29027j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private qj0.i f29028k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private qj0.i f29029l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private qj0.i f29030m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private qj0.i f29031n;

        private f(F7 f11, C3253fF c3253fF, YE ye2, C3494l0 c3494l0) {
            this.f29020c = this;
            this.f29018a = ye2;
            this.f29019b = c3253fF;
            a(f11, c3253fF, ye2, c3494l0);
        }

        private void a(F7 f11, C3253fF c3253fF, YE ye2, C3494l0 c3494l0) {
            this.f29021d = qj0.d.e(H7.a(f11));
            this.f29022e = qj0.d.e(G7.a(f11));
            this.f29023f = qj0.d.e(I7.a(f11));
            qj0.i iVarE = qj0.d.e(C3537m0.a(c3494l0));
            this.f29024g = iVarE;
            qj0.i iVarE2 = qj0.d.e(C3623o0.a(c3494l0, iVarE));
            this.f29025h = iVarE2;
            this.f29026i = qj0.d.e(C3580n0.a(c3494l0, iVarE2));
            this.f29027j = qj0.d.e(J7.a(f11));
            qj0.i iVarE3 = qj0.d.e(C3339hF.a(c3253fF, this.f29021d));
            this.f29028k = iVarE3;
            this.f29029l = qj0.d.e(C3168dF.a(ye2, iVarE3));
            C3296gF c3296gFA = C3296gF.a(c3253fF, this.f29021d);
            this.f29030m = c3296gFA;
            this.f29031n = C3083bF.a(ye2, this.f29029l, c3296gFA, this.f29025h);
        }

        private wn0.a c() {
            return C3296gF.a(this.f29019b, (InterfaceC3051ak) this.f29021d.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public Gl d() {
            return C3083bF.a(this.f29018a, (Gl) this.f29029l.get(), c(), (C3438jo) this.f29025h.get());
        }

        @Override // com.fourthline.orca.internal.InterfaceC3910uo
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InterfaceC3005Wb.a b() {
            return new d(this.f29020c);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3910uo
        public InterfaceC3051ak a() {
            return (InterfaceC3051ak) this.f29021d.get();
        }
    }

    private static final class g implements qj0.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qj0.i f29032a;

        private g(qj0.i iVar) {
            this.f29032a = (qj0.i) qj0.h.b(iVar);
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ou.m get() {
            return ou.m.d(this.f29032a.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static qj0.i a(qj0.i iVar) {
            return new g(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static qj0.i a() {
        return f28959a;
    }

    public static a b() {
        return new a();
    }
}
