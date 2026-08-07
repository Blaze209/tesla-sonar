package com.fourthline.orca.internal;

import com.plaid.internal.EnumC4419g;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3881u1 implements Do {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4011x1 f35782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private X1 f35783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f35785d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.u1$a */
    static final class a implements wn0.r {
        a() {
        }

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(-1831236876, i11, -1, "com.fourthline.orca.bav.internal.BavFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (BavFlow.kt:44)");
            }
            X1 x11 = C3881u1.this.f35783b;
            if (x11 == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                x11 = null;
            }
            Ig.b(x11, it, lVar, i11 & 112);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((p015o1.b) obj, (p011ja.k) obj2, (p020r2.l) obj3, ((Number) obj4).intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.u1$b */
    static final class b implements wn0.r {
        b() {
        }

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(1838003805, i11, -1, "com.fourthline.orca.bav.internal.BavFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (BavFlow.kt:48)");
            }
            X1 x11 = C3881u1.this.f35783b;
            if (x11 == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                x11 = null;
            }
            Ig.d(x11, it, lVar, i11 & 112);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((p015o1.b) obj, (p011ja.k) obj2, (p020r2.l) obj3, ((Number) obj4).intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.u1$c */
    static final class c implements wn0.r {
        c() {
        }

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(1176414332, i11, -1, "com.fourthline.orca.bav.internal.BavFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (BavFlow.kt:52)");
            }
            X1 x11 = C3881u1.this.f35783b;
            if (x11 == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                x11 = null;
            }
            Ig.a(x11, it, lVar, i11 & 112);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((p015o1.b) obj, (p011ja.k) obj2, (p020r2.l) obj3, ((Number) obj4).intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.u1$d */
    static final class d implements wn0.r {
        d() {
        }

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(514824859, i11, -1, "com.fourthline.orca.bav.internal.BavFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (BavFlow.kt:56)");
            }
            X1 x11 = C3881u1.this.f35783b;
            if (x11 == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                x11 = null;
            }
            Ig.c(x11, it, lVar, i11 & 112);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((p015o1.b) obj, (p011ja.k) obj2, (p020r2.l) obj3, ((Number) obj4).intValue());
            return jn0.h0.f84049a;
        }
    }

    public C3881u1(C4011x1 flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f35782a = flowConfig;
        this.f35784c = "NavigationDestination.BavFlow::class.java";
        this.f35785d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.te1
            @Override // wn0.a
            public final Object invoke() {
                return C3881u1.b(this.f35663a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Do
    public wn0.l d() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.se1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3881u1.a(this.f35302a, (p011ja.u) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Do
    public String e() {
        return this.f35784c;
    }

    @Override // com.fourthline.orca.internal.Do
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4011x1 c() {
        return this.f35782a;
    }

    @Override // com.fourthline.orca.internal.Do
    public Sf b() {
        return (Sf) this.f35785d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4054y1 b(C3881u1 c3881u1) {
        X1 x11 = c3881u1.f35783b;
        if (x11 == null) {
            p013kotlin.jvm.internal.s.B("subComponent");
            x11 = null;
        }
        return x11.b();
    }

    @Override // com.fourthline.orca.internal.Do
    public void a(InterfaceC3654op orcaSubcomponent) {
        p013kotlin.jvm.internal.s.k(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof Lf) {
            this.f35783b = Mf.a((Lf) orcaSubcomponent).a(new C4097z1(c())).build();
        } else {
            AbstractC3989wg.a("Bav is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3881u1 c3881u1, p011ja.u uVar) {
        p013kotlin.jvm.internal.s.k(uVar, "<this>");
        ka.k.c(uVar, InterfaceC3949vk.c.C0623c.f36134b.a(), null, null, null, null, null, null, null, z2.c.c(-1831236876, true, c3881u1.new a()), EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        ka.k.c(uVar, InterfaceC3949vk.c.e.f36138b.a(), null, null, null, null, null, null, null, z2.c.c(1838003805, true, c3881u1.new b()), EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        ka.k.c(uVar, InterfaceC3949vk.c.a.f36132b.a(), null, null, null, null, null, null, null, z2.c.c(1176414332, true, c3881u1.new c()), EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        ka.k.c(uVar, InterfaceC3949vk.c.d.f36136b.a(), null, null, null, null, null, null, null, z2.c.c(514824859, true, c3881u1.new d()), EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        return jn0.h0.f84049a;
    }
}
