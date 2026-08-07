package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class W5 {

    private static final class a implements InterfaceC3370i3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f29402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f29403b;

        @Override // com.fourthline.orca.internal.InterfaceC3370i3.a
        public InterfaceC3370i3 build() {
            return new b(this.f29402a, this.f29403b, new C3156d3(), new C3028a3());
        }

        private a(d dVar, f fVar) {
            this.f29402a = dVar;
            this.f29403b = fVar;
        }
    }

    private static final class b implements InterfaceC3370i3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f29404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f29405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f29406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private qj0.i f29407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private qj0.i f29408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qj0.i f29409f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qj0.i f29410g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private qj0.i f29411h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private qj0.i f29412i;

        private void a(C3156d3 c3156d3, C3028a3 c3028a3) {
            f fVar = this.f29405b;
            this.f29407d = qj0.d.e(C3284g3.a(c3156d3, fVar.f29449x, fVar.f29450y));
            this.f29408e = qj0.d.e(C3071b3.a(c3028a3, this.f29405b.f29444s));
            qj0.i iVarE = qj0.d.e(C3113c3.a(c3028a3, this.f29405b.f29450y));
            this.f29409f = iVarE;
            qj0.i iVar = this.f29408e;
            f fVar2 = this.f29405b;
            this.f29410g = qj0.d.e(C3198e3.a(c3156d3, iVar, fVar2.f29451z, iVarE, fVar2.A, fVar2.f29436k));
            qj0.i iVarE2 = qj0.d.e(C3241f3.a(c3156d3, this.f29404a.f29420f));
            this.f29411h = iVarE2;
            f fVar3 = this.f29405b;
            this.f29412i = qj0.d.e(C3327h3.a(c3156d3, fVar3.f29446u, fVar3.f29444s, fVar3.f29447v, this.f29407d, this.f29410g, iVarE2, fVar3.f29436k));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.InterfaceC3370i3
        public C3834sy d() {
            return (C3834sy) this.f29412i.get();
        }

        private b(d dVar, f fVar, C3156d3 c3156d3, C3028a3 c3028a3) {
            this.f29406c = this;
            this.f29404a = dVar;
            this.f29405b = fVar;
            a(c3156d3, c3028a3);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3370i3
        public androidx.p003lifecycle.f1 a() {
            return (androidx.p003lifecycle.f1) this.f29405b.f29435j.get();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C3662ox f29413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C3494l0 f29414b;

        public c a(C3662ox c3662ox) {
            this.f29413a = (C3662ox) qj0.h.b(c3662ox);
            return this;
        }

        private c() {
        }

        public InterfaceC3355hp a() {
            qj0.h.a(this.f29413a, C3662ox.class);
            if (this.f29414b == null) {
                this.f29414b = new C3494l0();
            }
            return new d(this.f29413a, this.f29414b);
        }
    }

    private static final class d implements InterfaceC3355hp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f29415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private qj0.i f29416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private qj0.i f29417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private qj0.i f29418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private qj0.i f29419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qj0.i f29420f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qj0.i f29421g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private qj0.i f29422h;

        private d(C3662ox c3662ox, C3494l0 c3494l0) {
            this.f29415a = this;
            a(c3662ox, c3494l0);
        }

        private void a(C3662ox c3662ox, C3494l0 c3494l0) {
            this.f29416b = qj0.d.e(C3705px.a(c3662ox));
            this.f29417c = qj0.d.e(C3833sx.a(c3662ox));
            this.f29418d = qj0.d.e(C3748qx.a(c3662ox));
            qj0.i iVarE = qj0.d.e(C3537m0.a(c3494l0));
            this.f29419e = iVarE;
            qj0.i iVarE2 = qj0.d.e(C3623o0.a(c3494l0, iVarE));
            this.f29420f = iVarE2;
            this.f29421g = qj0.d.e(C3580n0.a(c3494l0, iVarE2));
            this.f29422h = qj0.d.e(C3790rx.a(c3662ox));
        }

        @Override // com.fourthline.orca.internal.InterfaceC3910uo
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC3920uy.a b() {
            return new e(this.f29415a);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3910uo
        public InterfaceC3051ak a() {
            return (InterfaceC3051ak) this.f29416b.get();
        }
    }

    private static final class e implements InterfaceC3920uy.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f29423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C3152d f29424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C4079yk f29425c;

        @Override // com.fourthline.orca.internal.InterfaceC3697pp
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(C3152d c3152d) {
            this.f29424b = (C3152d) qj0.h.b(c3152d);
            return this;
        }

        private e(d dVar) {
            this.f29423a = dVar;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3697pp
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(C4079yk c4079yk) {
            this.f29425c = (C4079yk) qj0.h.b(c4079yk);
            return this;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3697pp
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC3920uy build() {
            qj0.h.a(this.f29424b, C3152d.class);
            qj0.h.a(this.f29425c, C4079yk.class);
            return new f(this.f29423a, this.f29424b, new C2977Ve(), new Y5(), new Jw(), this.f29425c, new Yx());
        }
    }

    private static final class f implements InterfaceC3920uy {
        private qj0.i A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f29426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f29427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private qj0.i f29428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private qj0.i f29429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private qj0.i f29430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qj0.i f29431f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qj0.i f29432g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private qj0.i f29433h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private qj0.i f29434i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private qj0.i f29435j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private qj0.i f29436k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private qj0.i f29437l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private qj0.i f29438m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private qj0.i f29439n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private qj0.i f29440o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private qj0.i f29441p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private qj0.i f29442q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private qj0.i f29443r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private qj0.i f29444s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private qj0.i f29445t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private qj0.i f29446u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private qj0.i f29447v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private qj0.i f29448w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private qj0.i f29449x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private qj0.i f29450y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private qj0.i f29451z;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.InterfaceC3654op
        public p011ja.w C() {
            return (p011ja.w) this.f29430e.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.InterfaceC3654op
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public Xx a() {
            return (Xx) this.f29426a.f29417c.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.InterfaceC3654op
        public Wf o() {
            return (Wf) this.f29426a.f29422h.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.InterfaceC3654op
        public Ew p() {
            return (Ew) this.f29442q.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.InterfaceC3654op
        public Zj q() {
            return (Zj) this.f29434i.get();
        }

        @Override // com.fourthline.orca.internal.InterfaceC3654op
        public Zk v() {
            return (Zk) this.f29439n.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.InterfaceC3654op
        public Es y() {
            return (Es) this.f29437l.get();
        }

        @Override // com.fourthline.orca.internal.InterfaceC3920uy
        public InterfaceC3370i3.a z() {
            return new a(this.f29426a, this.f29427b);
        }

        private f(d dVar, C3152d c3152d, C2977Ve c2977Ve, Y5 y11, Jw jw2, C4079yk c4079yk, Yx yx2) {
            this.f29427b = this;
            this.f29426a = dVar;
            a(c3152d, c2977Ve, y11, jw2, c4079yk, yx2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.InterfaceC3920uy
        public Oy b() {
            return (Oy) this.f29444s.get();
        }

        @Override // com.fourthline.orca.internal.InterfaceC3654op
        public InterfaceC3955vp d() {
            return (InterfaceC3955vp) this.f29428c.get();
        }

        @Override // com.fourthline.orca.internal.InterfaceC3654op
        public HA i() {
            return (HA) this.f29433h.get();
        }

        private void a(C3152d c3152d, C2977Ve c2977Ve, Y5 y11, Jw jw2, C4079yk c4079yk, Yx yx2) {
            this.f29428c = qj0.d.e(C3922v.a(c3152d, this.f29426a.f29416b));
            this.f29429d = qj0.d.e(C3793s.a(c3152d, this.f29426a.f29418d));
            qj0.i iVarE = qj0.d.e(Bk.a(c4079yk));
            this.f29430e = iVarE;
            this.f29431f = qj0.d.e(C4122zk.a(c4079yk, iVarE));
            qj0.i iVarE2 = qj0.d.e(Ek.a(c4079yk));
            this.f29432g = iVarE2;
            qj0.i iVarE3 = qj0.d.e(Dk.a(c4079yk, iVarE2));
            this.f29433h = iVarE3;
            d dVar = this.f29426a;
            this.f29434i = qj0.d.e(Ak.a(c4079yk, dVar.f29416b, this.f29429d, this.f29431f, iVarE3, dVar.f29421g));
            qj0.i iVarE4 = qj0.d.e(C4009x.a(c3152d));
            this.f29435j = iVarE4;
            qj0.i iVarE5 = qj0.d.e(C3450k.a(c3152d, iVarE4));
            this.f29436k = iVarE5;
            this.f29437l = qj0.d.e(C3023Ze.a(c2977Ve, iVarE5));
            qj0.i iVarE6 = qj0.d.e(C3407j.a(c3152d));
            this.f29438m = iVarE6;
            this.f29439n = qj0.d.e(C3708q.a(c3152d, iVarE6, this.f29429d, this.f29436k));
            this.f29440o = qj0.d.e(Z5.a(y11, this.f29438m, this.f29436k));
            qj0.i iVarE7 = qj0.d.e(C3031a6.a(y11));
            this.f29441p = iVarE7;
            this.f29442q = qj0.d.e(C3373i6.a(y11, this.f29440o, iVarE7, this.f29426a.f29416b, this.f29436k));
            qj0.i iVarE8 = qj0.d.e(Ck.a(c4079yk, this.f29434i, this.f29436k));
            this.f29443r = iVarE8;
            this.f29444s = qj0.d.e(Zx.a(yx2, iVarE8));
            qj0.i iVarE9 = qj0.d.e(C3330h6.a(y11, this.f29426a.f29416b));
            this.f29445t = iVarE9;
            this.f29446u = qj0.d.e(C3065ay.a(yx2, this.f29426a.f29417c, this.f29441p, iVarE9));
            this.f29447v = qj0.d.e(C3150cy.a(yx2));
            qj0.i iVarE10 = qj0.d.e(Nw.a(jw2, this.f29426a.f29416b));
            this.f29448w = iVarE10;
            this.f29449x = qj0.d.e(Lw.a(jw2, this.f29438m, iVarE10));
            this.f29450y = qj0.d.e(Kw.a(jw2, this.f29438m, this.f29448w));
            this.f29451z = qj0.d.e(C3008We.a(c2977Ve));
            this.A = qj0.d.e(C3013Xe.a(c2977Ve, this.f29426a.f29420f));
        }
    }

    public static c a() {
        return new c();
    }
}
