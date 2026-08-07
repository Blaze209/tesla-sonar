package com.fourthline.orca.internal;

import com.plaid.internal.EnumC4419g;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.tx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3876tx implements Do {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4006wx f35759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Jx f35760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f35762d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.tx$a */
    static final class a implements wn0.r {
        a() {
        }

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(-630960798, i11, -1, "com.fourthline.orca.kyc.internal.flow.selfie.SelfieFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (SelfieFlow.kt:44)");
            }
            Jx jx2 = C3876tx.this.f35760b;
            if (jx2 == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                jx2 = null;
            }
            Ug.a(jx2, it, lVar, i11 & 112);
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

    /* JADX INFO: renamed from: com.fourthline.orca.internal.tx$b */
    static final class b implements wn0.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Lazy f35764a;

        b(Lazy lazy) {
            this.f35764a = lazy;
        }

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(-379203445, i11, -1, "com.fourthline.orca.kyc.internal.flow.selfie.SelfieFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (SelfieFlow.kt:48)");
            }
            Ug.a(C3876tx.b(this.f35764a), it, lVar, i11 & 112);
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

    /* JADX INFO: renamed from: com.fourthline.orca.internal.tx$c */
    static final class c implements wn0.r {
        c() {
        }

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(-1241507606, i11, -1, "com.fourthline.orca.kyc.internal.flow.selfie.SelfieFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (SelfieFlow.kt:52)");
            }
            Jx jx2 = C3876tx.this.f35760b;
            if (jx2 == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                jx2 = null;
            }
            Ug.b(jx2, it, lVar, i11 & 112);
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

    public C3876tx(C4006wx flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f35759a = flowConfig;
        this.f35761c = "NavigationDestination.SelfieFlow::class.java";
        this.f35762d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.oe1
            @Override // wn0.a
            public final Object invoke() {
                return C3876tx.c(this.f34222a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Do
    public Sf b() {
        return (Sf) this.f35762d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3370i3 b(C3876tx c3876tx) {
        Jx jx2 = c3876tx.f35760b;
        if (jx2 == null) {
            p013kotlin.jvm.internal.s.B("subComponent");
            jx2 = null;
        }
        return jx2.a().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4092yx c(C3876tx c3876tx) {
        Jx jx2 = c3876tx.f35760b;
        if (jx2 == null) {
            p013kotlin.jvm.internal.s.B("subComponent");
            jx2 = null;
        }
        return jx2.d();
    }

    @Override // com.fourthline.orca.internal.Do
    public wn0.l d() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.pe1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3876tx.a(this.f34514a, (p011ja.u) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Do
    public String e() {
        return this.f35761c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3370i3 b(Lazy lazy) {
        return (InterfaceC3370i3) lazy.getValue();
    }

    @Override // com.fourthline.orca.internal.Do
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4006wx c() {
        return this.f35759a;
    }

    @Override // com.fourthline.orca.internal.Do
    public void a(InterfaceC3654op orcaSubcomponent) {
        p013kotlin.jvm.internal.s.k(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof Lf) {
            this.f35760b = ((Lf) orcaSubcomponent).m().a(new Ax(c())).build();
        } else {
            AbstractC3989wg.a("Selfie is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(final C3876tx c3876tx, p011ja.u uVar) {
        p013kotlin.jvm.internal.s.k(uVar, "<this>");
        Lazy lazyB = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.ne1
            @Override // wn0.a
            public final Object invoke() {
                return C3876tx.b(this.f33927a);
            }
        });
        ka.k.c(uVar, InterfaceC3949vk.x.b.f36233b.a(), null, null, null, null, null, null, null, z2.c.c(-630960798, true, c3876tx.new a()), EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        ka.k.c(uVar, new InterfaceC3949vk.x.c(null, 1, null).a(), null, null, null, null, null, null, null, z2.c.c(-379203445, true, new b(lazyB)), EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        ka.k.c(uVar, new InterfaceC3949vk.x.d(null, 1, null).a(), null, null, null, null, null, null, null, z2.c.c(-1241507606, true, c3876tx.new c()), EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        return jn0.h0.f84049a;
    }
}
