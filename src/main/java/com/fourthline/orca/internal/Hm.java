package com.fourthline.orca.internal;

import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Hm implements Do {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Km f26123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3353hn f26124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f26126d;

    static final class a implements wn0.r {
        a() {
        }

        public final void a(p015o1.b screenComposable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(screenComposable, "$this$screenComposable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(-1151617290, i11, -1, "com.fourthline.orca.kyc.internal.flow.nfc.NfcFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (NfcFlow.kt:43)");
            }
            InterfaceC3353hn interfaceC3353hn = Hm.this.f26124b;
            if (interfaceC3353hn == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                interfaceC3353hn = null;
            }
            Rg.a(interfaceC3353hn, lVar, 0);
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

    static final class b implements wn0.r {
        b() {
        }

        public final void a(p015o1.b screenComposable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(screenComposable, "$this$screenComposable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(1261124333, i11, -1, "com.fourthline.orca.kyc.internal.flow.nfc.NfcFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (NfcFlow.kt:47)");
            }
            InterfaceC3353hn interfaceC3353hn = Hm.this.f26124b;
            if (interfaceC3353hn == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                interfaceC3353hn = null;
            }
            Rg.b(interfaceC3353hn, lVar, 0);
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

    static final class c implements wn0.r {
        c() {
        }

        public final void a(p015o1.b screenComposable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(screenComposable, "$this$screenComposable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(376388526, i11, -1, "com.fourthline.orca.kyc.internal.flow.nfc.NfcFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (NfcFlow.kt:51)");
            }
            InterfaceC3353hn interfaceC3353hn = Hm.this.f26124b;
            if (interfaceC3353hn == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                interfaceC3353hn = null;
            }
            Rg.a(interfaceC3353hn, it, lVar, i11 & 112);
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

    public Hm(Km flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f26123a = flowConfig;
        this.f26125c = "NavigationDestination.NfcFlow::class.java";
        this.f26126d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.wd0
            @Override // wn0.a
            public final Object invoke() {
                return Hm.b(this.f36423a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Do
    public Sf b() {
        return (Sf) this.f26126d.getValue();
    }

    @Override // com.fourthline.orca.internal.Do
    public String e() {
        return this.f26125c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Lm b(Hm hm2) {
        InterfaceC3353hn interfaceC3353hn = hm2.f26124b;
        if (interfaceC3353hn == null) {
            p013kotlin.jvm.internal.s.B("subComponent");
            interfaceC3353hn = null;
        }
        return interfaceC3353hn.e();
    }

    @Override // com.fourthline.orca.internal.Do
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Km c() {
        return this.f26123a;
    }

    @Override // com.fourthline.orca.internal.Do
    public wn0.l d() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.vd0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Hm.a(this.f36079a, (p011ja.u) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Do
    public void a(InterfaceC3654op orcaSubcomponent) {
        p013kotlin.jvm.internal.s.k(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof Lf) {
            this.f26124b = ((Lf) orcaSubcomponent).r().a(new Qm(c())).build();
        } else {
            AbstractC3989wg.a("Nfc is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Hm hm2, p011ja.u uVar) {
        p013kotlin.jvm.internal.s.k(uVar, "<this>");
        AbstractC3993wk.a(uVar, new InterfaceC3949vk.s.b(null, 1, null).a(), null, null, null, null, null, null, z2.c.c(-1151617290, true, hm2.new a()), 126, null);
        AbstractC3993wk.a(uVar, new InterfaceC3949vk.s.c(null, 1, null).a(), null, null, null, null, null, null, z2.c.c(1261124333, true, hm2.new b()), 126, null);
        AbstractC3993wk.a(uVar, new InterfaceC3949vk.s.d(null, 1, null).a(), null, null, null, null, null, null, z2.c.c(376388526, true, hm2.new c()), 126, null);
        return jn0.h0.f84049a;
    }
}
